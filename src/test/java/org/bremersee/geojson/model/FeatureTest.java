/*
 * Copyright 2018-2020 the original author or authors.
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

package org.bremersee.geojson.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.UUID;
import org.bremersee.geojson.model.Feature.TypeEnum;
import org.junit.jupiter.api.Test;

/**
 * The feature test.
 *
 * @author Christian Bremer
 */
class FeatureTest {

  /**
   * Gets type.
   */
  @Test
  void getType() {
    Feature model = new Feature();
    model.setType(TypeEnum.FEATURE);
    assertEquals(TypeEnum.FEATURE, model.getType());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new Feature());

    assertTrue(model.toString().contains(TypeEnum.FEATURE.toString()));
  }

  /**
   * Gets id.
   */
  @Test
  void getId() {
    Feature model = new Feature();
    model.setId("value");
    assertEquals("value", model.getId());

    model = Feature.builder().id("value").build();
    assertEquals("value", model.getId());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().id("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets bbox.
   */
  @Test
  void getBbox() {
    BoundingBox value = new BoundingBox(
        Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO));
    Feature model = new Feature();
    model.setBbox(value);
    assertEquals(value, model.getBbox());

    model = Feature.builder().bbox(value).build();
    assertEquals(value, model.getBbox());

    assertEquals(model, model.toBuilder().bbox(value).build());
  }

  /**
   * Gets geometry.
   */
  @Test
  void getGeometry() {
    Geometry value = Point.builder()
        .coordinates(new Position(BigDecimal.ONE, BigDecimal.ZERO))
        .build();
    Feature model = new Feature();
    model.setGeometry(value);
    assertEquals(value, model.getGeometry());

    model = Feature.builder().geometry(value).build();
    assertEquals(value, model.getGeometry());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().geometry(value).build());

    assertTrue(model.toString().contains(value.toString()));
  }

  /**
   * Gets properties.
   */
  @Test
  void getProperties() {
    Feature model = new Feature();
    model.setProperties("value");
    assertEquals("value", model.getProperties());

    model = Feature.builder().properties("value").build();
    assertEquals("value", model.getProperties());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().properties("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Test type.
   */
  @Test
  void testType() {
    for (TypeEnum t : TypeEnum.values()) {
      TypeEnum a = TypeEnum.fromValue(t.toString());
      assertNotNull(a);
      assertEquals(t, a);
    }
    assertNull(TypeEnum.fromValue(UUID.randomUUID().toString()));
  }
}