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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * The geometry collection test.
 *
 * @author Christian Bremer
 */
class GeometryCollectionTest {

  /**
   * Gets geometries.
   */
  @Test
  void getGeometries() {
    List<Geometry> value = Arrays.asList(
        Point.builder().coordinates(new Position(BigDecimal.ONE, BigDecimal.ONE)).build(),
        Point.builder().coordinates(new Position(BigDecimal.TEN, BigDecimal.ZERO)).build());
    GeometryCollection model = new GeometryCollection();
    model.setGeometries(value);
    assertEquals(value, model.getGeometries());

    model = GeometryCollection.builder().geometries(value).build();
    assertEquals(value, model.getGeometries());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().geometries(value).build());

    assertTrue(model.toString().contains(value.toString()));
  }

  /**
   * Gets type.
   */
  @Test
  void getType() {
    GeometryCollection model = new GeometryCollection();
    assertEquals("GeometryCollection", model.getType().toString());
  }

  /**
   * Gets bbox.
   */
  @Test
  void getBbox() {
    BoundingBox value = new BoundingBox(
        Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.ONE));
    GeometryCollection model = new GeometryCollection();
    model.setBbox(value);
    assertEquals(value, model.getBbox());

    model = GeometryCollection.builder().bbox(value).build();
    assertEquals(value, model.getBbox());

    assertEquals(model, model.toBuilder().bbox(value).build());
    assertEquals(model, new GeometryCollection(value, null));
  }

}