/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
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