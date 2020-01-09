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
import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * The bounding box test.
 *
 * @author Christian Bremer
 */
class BoundingBoxTest {

  /**
   * Test model.
   */
  @Test
  void testModel() {
    BoundingBox model = new BoundingBox();
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new BoundingBox());
    assertTrue(model.toString().length() > 0);

    BigDecimal value = new BigDecimal("123.4");
    model = new BoundingBox(Collections.singleton(value));
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(
        model,
        new BoundingBox(Collections.singleton(value)));
    assertTrue(model.toString().contains(value.toString()));
  }

}