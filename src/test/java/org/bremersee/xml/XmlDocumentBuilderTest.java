/*
 * Copyright 2019 the original author or authors.
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.util.ServiceLoader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.UnmarshalException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.bremersee.xml.model1.Person;
import org.bremersee.xml.model3.Company;
import org.bremersee.xml.model3.ObjectFactory;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

/**
 * The type Xml document builder test.
 *
 * @author Christian Bremer
 */
class XmlDocumentBuilderTest {

  private JaxbContextBuilder jaxbContextBuilder = JaxbContextBuilder
      .builder()
      .processAll(ServiceLoader.load(JaxbContextDataProvider.class));

  /**
   * Test with namespaces.
   *
   * @throws Exception the exception
   */
  @Test
  void testWithNamespaces() throws Exception {
    Person expected = new Person();
    expected.setFirstName("Anna Livia");
    expected.setLastName("Plurabelle");
    XmlDocumentBuilder builder = XmlDocumentBuilder.builder();
    Document document = builder.buildDocument(expected, jaxbContextBuilder.buildJaxbContext());

    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    Transformer transformer = transformerFactory.newTransformer();
    DOMSource domSource = new DOMSource(document);
    StringWriter sw = new StringWriter();
    StreamResult streamResult = new StreamResult(sw);
    transformer.transform(domSource, streamResult);
    String xml = sw.toString();
    System.out.println(xml);

    Person actual = (Person) jaxbContextBuilder.buildUnmarshaller().unmarshal(document);
    assertEquals(expected, actual);

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    jaxbContextBuilder.buildMarshaller().marshal(expected, out);

    builder = builder.configureFactory(
        null,
        null,
        false,
        false,
        true,
        false,
        null);
    document = builder.buildDocument(new ByteArrayInputStream(out.toByteArray()));

    actual = (Person) jaxbContextBuilder.buildUnmarshaller().unmarshal(document);
    assertEquals(expected, actual);
  }

  /**
   * Test without namespaces and expect error.
   */
  @Test
  void testWithoutNamespacesAndExpectError() {
    assertThrows(UnmarshalException.class, () -> {
      Person expected = new Person();
      expected.setFirstName("Anna Livia");
      expected.setLastName("Plurabelle");
      XmlDocumentBuilder builder = XmlDocumentBuilder.builder();
      Document document = builder.buildDocument(expected, jaxbContextBuilder.buildJaxbContext());

      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);
      StringWriter sw = new StringWriter();
      StreamResult streamResult = new StreamResult(sw);
      transformer.transform(domSource, streamResult);
      String xml = sw.toString();
      System.out.println(xml);

      Person actual = (Person) jaxbContextBuilder.buildUnmarshaller().unmarshal(document);
      assertEquals(expected, actual);

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      jaxbContextBuilder.buildMarshaller().marshal(expected, out);

      builder = builder.configureFactory(
          null,
          null,
          false,
          false,
          false,
          false,
          null);
      document = builder.buildDocument(new ByteArrayInputStream(out.toByteArray()));

      actual = (Person) jaxbContextBuilder.buildUnmarshaller().unmarshal(document);
      assertEquals(expected, actual);
    });
  }

  /**
   * Test without namespaces.
   *
   * @throws Exception the exception
   */
  @Test
  void testWithoutNamespaces() throws Exception {
    JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());

    Company expected = new Company();
    expected.setName("bremersee.org");
    XmlDocumentBuilder builder = XmlDocumentBuilder.builder()
        .configureFactory(
            null,
            null,
            false,
            false,
            false,
            false,
            null);
    Document document = builder.buildDocument(expected, jaxbContext);

    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    Transformer transformer = transformerFactory.newTransformer();
    DOMSource domSource = new DOMSource(document);
    StringWriter sw = new StringWriter();
    StreamResult streamResult = new StreamResult(sw);
    transformer.transform(domSource, streamResult);
    String xml = sw.toString();
    System.out.println(xml);

    Company actual = (Company) jaxbContextBuilder.buildUnmarshaller().unmarshal(document);
    assertEquals(expected, actual);
  }

}
