/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.geojson.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * The line string test.
 *
 * @author Christian Bremer
 */
class LineStringTest {

  /**
   * Gets coordinates.
   */
  @Test
  void getCoordinates() {
    List<Position> value = Arrays.asList(
        new Position(BigDecimal.ZERO, BigDecimal.ZERO),
        new Position(BigDecimal.ONE, BigDecimal.ONE));
    LineString model = new LineString();
    model.setCoordinates(value);
    assertEquals(value, model.getCoordinates());

    model = LineString.builder().coordinates(value).build();
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
    LineString model = new LineString();
    assertEquals("LineString", model.getType().toString());
  }

  /**
   * Gets bbox.
   */
  @Test
  void getBbox() {
    BoundingBox value = new BoundingBox(
        Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.ONE));
    LineString model = new LineString();
    model.setBbox(value);
    assertEquals(value, model.getBbox());

    model = LineString.builder().bbox(value).build();
    assertEquals(value, model.getBbox());

    assertEquals(model, model.toBuilder().bbox(value).build());
    assertEquals(model, new LineString(value, null));
  }

}