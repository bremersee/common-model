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
 * The polygon test.
 *
 * @author Christian Bremer
 */
class PolygonTest {

  /**
   * Gets coordinates.
   */
  @Test
  void getCoordinates() {
    List<Position> e0 = Arrays.asList(
        new Position(BigDecimal.ZERO, BigDecimal.ZERO),
        new Position(BigDecimal.ONE, BigDecimal.ONE));
    List<Position> e1 = Arrays.asList(
        new Position(BigDecimal.ONE, BigDecimal.ONE),
        new Position(BigDecimal.TEN, BigDecimal.TEN));
    List<List<Position>> value = Arrays.asList(e0, e1);
    Polygon model = new Polygon();
    model.setCoordinates(value);
    assertEquals(value, model.getCoordinates());

    model = Polygon.builder().coordinates(value).build();
    assertEquals(value, model.getCoordinates());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().coordinates(value).build());

    assertTrue(model.toString().contains(value.toString()));
  }

  /**
   * Gets type.
   */
  @Test
  void getType() {
    Polygon model = new Polygon();
    assertEquals("Polygon", model.getType().toString());
  }

  /**
   * Gets bbox.
   */
  @Test
  void getBbox() {
    BoundingBox value = new BoundingBox(
        Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.TEN, BigDecimal.TEN));
    Polygon model = new Polygon();
    model.setBbox(value);
    assertEquals(value, model.getBbox());

    model = Polygon.builder().bbox(value).build();
    assertEquals(value, model.getBbox());

    assertEquals(model, model.toBuilder().bbox(value).build());
    assertEquals(model, new Polygon(value, null));
  }

}