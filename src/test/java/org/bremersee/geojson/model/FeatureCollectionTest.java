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
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.bremersee.geojson.model.FeatureCollection.TypeEnum;
import org.junit.jupiter.api.Test;

/**
 * The feature collection test.
 *
 * @author Christian Bremer
 */
class FeatureCollectionTest {

  /**
   * Gets type.
   */
  @Test
  void getType() {
    FeatureCollection model = new FeatureCollection();
    model.setType(TypeEnum.FEATURECOLLECTION);
    assertEquals(TypeEnum.FEATURECOLLECTION, model.getType());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new FeatureCollection());

    assertTrue(model.toString().contains(TypeEnum.FEATURECOLLECTION.toString()));
  }

  /**
   * Gets bbox.
   */
  @Test
  void getBbox() {
    BoundingBox value = new BoundingBox(
        Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO));
    FeatureCollection model = new FeatureCollection();
    model.setBbox(value);
    assertEquals(value, model.getBbox());

    model = FeatureCollection.builder().bbox(value).build();
    assertEquals(value, model.getBbox());

    assertEquals(model, model.toBuilder().bbox(value).build());
  }

  /**
   * Gets features.
   */
  @Test
  void getFeatures() {
    Geometry geometry = Point.builder()
        .coordinates(new Position(BigDecimal.ONE, BigDecimal.ZERO))
        .build();
    Feature feature = Feature.builder().geometry(geometry).build();
    List<Feature> value = Collections.singletonList(feature);
    FeatureCollection model = new FeatureCollection();
    model.setFeatures(value);
    assertEquals(value, model.getFeatures());

    model = FeatureCollection.builder().features(value).build();
    assertEquals(value, model.getFeatures());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().features(value).build());

    assertTrue(model.toString().contains(value.toString()));
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