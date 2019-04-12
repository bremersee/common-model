/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bremersee.xml;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ServiceLoader;
import javax.xml.bind.JAXBException;
import org.bremersee.xml.model1.Person;
import org.bremersee.xml.model2.Vehicle;
import org.bremersee.xml.model3.Company;
import org.bremersee.xml.model4.Address;
import org.bremersee.xml.provider.ExampleJaxbContextDataProvider;
import org.junit.Assert;
import org.junit.Test;

/**
 * The jaxb context builder test.
 *
 * @author Christian Bremer
 */
public class JaxbContextBuilderTest {

  /**
   * Test jaxb context builder.
   *
   * @throws Exception the exception
   */
  @Test
  public void testJaxbContextBuilder() throws Exception {

    JaxbContextBuilder jaxbContextBuilder = JaxbContextBuilder
        .builder()
        .processAll(ServiceLoader.load(JaxbContextDataProvider.class));

    String contextPath = jaxbContextBuilder.buildContextPath();
    Assert.assertNotNull(contextPath);
    Assert.assertTrue(
        contextPath.contains(org.bremersee.xml.model1.ObjectFactory.class.getPackage().getName()));
    Assert.assertTrue(
        contextPath.contains(org.bremersee.xml.model2.ObjectFactory.class.getPackage().getName()));
    Assert.assertTrue(
        contextPath.contains(org.bremersee.xml.model3.ObjectFactory.class.getPackage().getName()));
    Assert.assertTrue(
        contextPath.contains(org.bremersee.xml.model4.ObjectFactory.class.getPackage().getName()));

    contextPath = jaxbContextBuilder.buildContextPath("");
    Assert.assertFalse(
        contextPath.contains(org.bremersee.xml.model1.ObjectFactory.class.getPackage().getName()));
    Assert.assertFalse(
        contextPath.contains(org.bremersee.xml.model2.ObjectFactory.class.getPackage().getName()));
    Assert.assertTrue(
        contextPath.contains(org.bremersee.xml.model3.ObjectFactory.class.getPackage().getName()));
    Assert.assertTrue(
        contextPath.contains(org.bremersee.xml.model4.ObjectFactory.class.getPackage().getName()));

    contextPath = jaxbContextBuilder
        .buildContextPath("http://bremersee.org/xmlschemas/common-xml-test-model-1");
    Assert.assertTrue(
        contextPath.contains(org.bremersee.xml.model1.ObjectFactory.class.getPackage().getName()));
    Assert.assertFalse(
        contextPath.contains(org.bremersee.xml.model2.ObjectFactory.class.getPackage().getName()));
    Assert.assertFalse(
        contextPath.contains(org.bremersee.xml.model3.ObjectFactory.class.getPackage().getName()));
    Assert.assertFalse(
        contextPath.contains(org.bremersee.xml.model4.ObjectFactory.class.getPackage().getName()));

    jaxbContextBuilder = jaxbContextBuilder
        .addAll(new ExampleJaxbContextDataProvider().getJaxbContextData());

    String schemaLocation = jaxbContextBuilder.buildSchemaLocation();
    Assert.assertNotNull(schemaLocation);
    Assert.assertTrue(
        schemaLocation.contains("http://bremersee.org/xmlschemas/common-xml-test-model-1 "
            + "http://bremersee.github.io/xmlschemas/common-xml-test-model-1.xsd"));
    Assert.assertTrue(
        schemaLocation.contains("http://bremersee.org/xmlschemas/common-xml-test-model-2 "
            + "http://bremersee.github.io/xmlschemas/common-xml-test-model-2.xsd"));

    schemaLocation = jaxbContextBuilder
        .buildSchemaLocation("http://bremersee.org/xmlschemas/common-xml-test-model-2");
    Assert.assertFalse(
        schemaLocation.contains("http://bremersee.org/xmlschemas/common-xml-test-model-1 "
            + "http://bremersee.github.io/xmlschemas/common-xml-test-model-1.xsd"));
    Assert.assertTrue(
        schemaLocation.contains("http://bremersee.org/xmlschemas/common-xml-test-model-2 "
            + "http://bremersee.github.io/xmlschemas/common-xml-test-model-2.xsd"));

    Assert.assertTrue(jaxbContextBuilder.supports(Person.class));
    Assert.assertTrue(jaxbContextBuilder.supports(Vehicle.class));
    Assert.assertTrue(jaxbContextBuilder.supports(Company.class));
    Assert.assertTrue(jaxbContextBuilder.supports(Address.class));

    Assert.assertFalse(jaxbContextBuilder.supports(JaxbContextData.class));

    Assert.assertFalse(jaxbContextBuilder.supports(
        Person.class,
        "http://bremersee.org/xmlschemas/common-xml-test-model-2"));

    final BufferSchemaOutputResolver res = new BufferSchemaOutputResolver();
    jaxbContextBuilder.buildJaxbContext().generateSchema(res);
    System.out.print(res);

    System.out.println("OK\n");
  }

  /**
   * Write and read xml.
   *
   * @throws Exception the exception
   */
  @Test
  public void writeAndReadXml() throws Exception {

    Vehicle vehicle = new Vehicle();
    vehicle.setBrand("A brand");
    vehicle.setModel("A model");

    JaxbContextBuilder jaxbContextBuilder = JaxbContextBuilder
        .builder()
        .formattedOutput(true)
        .process(new ExampleJaxbContextDataProvider());

    StringWriter sw = new StringWriter();
    jaxbContextBuilder
        .buildMarshaller("http://bremersee.org/xmlschemas/common-xml-test-model-2")
        .marshal(vehicle, sw);

    String xml = sw.toString();
    System.out.println(xml);
    System.out.print("\n");

    Vehicle readVehicle = (Vehicle) jaxbContextBuilder
        .buildUnmarshaller()
        .unmarshal(new StringReader(xml));

    Assert.assertEquals(vehicle, readVehicle);
  }

  /**
   * Write xml but read fails.
   *
   * @throws Exception the exception
   */
  @Test(expected = JAXBException.class)
  public void writeXmlButReadFails() throws Exception {

    Company company = new Company();
    company.setName("XML Generator Service");

    JaxbContextBuilder jaxbContextBuilder = JaxbContextBuilder
        .builder()
        .formattedOutput(true)
        .add(new JaxbContextData(org.bremersee.xml.model1.ObjectFactory.class.getPackage()))
        .add(new JaxbContextData(org.bremersee.xml.model3.ObjectFactory.class.getPackage()
            .getName()));

    StringWriter sw = new StringWriter();
    jaxbContextBuilder
        .buildMarshaller()
        .marshal(company, sw);

    String xml = sw.toString();
    System.out.println(xml);
    System.out.print("\n");

    jaxbContextBuilder
        .buildUnmarshaller("http://bremersee.org/xmlschemas/common-xml-test-model-1")
        .unmarshal(new StringReader(xml));
  }

}
