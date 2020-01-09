/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.geojson.model;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

/**
 * The position test.
 *
 * @author Christian Bremer
 */
class PositionTest {

  /**
   * Test model.
   */
  @Test
  void testModel() {
    Position model = new Position();
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new Position());
    assertTrue(model.toString().length() > 0);

    BigDecimal x = new BigDecimal("123.4");
    BigDecimal y = new BigDecimal("567.8");
    model = new Position(x, y);
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(
        model,
        new Position(x, y));
    assertTrue(model.toString().contains(x.toString()));
  }

  /**
   * Test constructors.
   */
  @Test
  void testConstructors() {
    assertThrows(IllegalArgumentException.class, () -> new Position(BigDecimal.ONE, null));
    assertThrows(IllegalArgumentException.class, () -> new Position(null, BigDecimal.ONE));
    assertThrows(
        IllegalArgumentException.class,
        () -> new Position(BigDecimal.ZERO, BigDecimal.ONE, null));
    assertDoesNotThrow(() -> new Position(BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN));
  }
}