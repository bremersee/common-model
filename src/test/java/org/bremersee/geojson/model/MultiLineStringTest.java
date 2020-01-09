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
 * The multi line string test.
 *
 * @author Christian Bremer
 */
class MultiLineStringTest {

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
    MultiLineString model = new MultiLineString();
    model.setCoordinates(value);
    assertEquals(value, model.getCoordinates());

    model = MultiLineString.builder().coordinates(value).build();
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
    MultiLineString model = new MultiLineString();
    assertEquals("MultiLineString", model.getType().toString());
  }

  /**
   * Gets bbox.
   */
  @Test
  void getBbox() {
    BoundingBox value = new BoundingBox(
        Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.TEN, BigDecimal.TEN));
    MultiLineString model = new MultiLineString();
    model.setBbox(value);
    assertEquals(value, model.getBbox());

    model = MultiLineString.builder().bbox(value).build();
    assertEquals(value, model.getBbox());

    assertEquals(model, model.toBuilder().bbox(value).build());
    assertEquals(model, new MultiLineString(value, null));
  }

}