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
 * The multi point test.
 *
 * @author Christian Bremer
 */
class MultiPointTest {

  /**
   * Gets coordinates.
   */
  @Test
  void getCoordinates() {
    List<Position> value = Arrays.asList(
        new Position(BigDecimal.ZERO, BigDecimal.ZERO),
        new Position(BigDecimal.ONE, BigDecimal.ONE));
    MultiPoint model = new MultiPoint();
    model.setCoordinates(value);
    assertEquals(value, model.getCoordinates());

    model = MultiPoint.builder().coordinates(value).build();
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
    MultiPoint model = new MultiPoint();
    assertEquals("MultiPoint", model.getType().toString());
  }

  /**
   * Gets bbox.
   */
  @Test
  void getBbox() {
    BoundingBox value = new BoundingBox(
        Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.ONE));
    MultiPoint model = new MultiPoint();
    model.setBbox(value);
    assertEquals(value, model.getBbox());

    model = MultiPoint.builder().bbox(value).build();
    assertEquals(value, model.getBbox());

    assertEquals(model, model.toBuilder().bbox(value).build());
    assertEquals(model, new MultiPoint(value, null));
  }

}