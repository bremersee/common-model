/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.geojson.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.UUID;
import org.junit.jupiter.api.Test;

/**
 * The geometry test.
 *
 * @author Christian Bremer
 */
class GeometryTest {

  /**
   * Test type.
   */
  @Test
  void testType() {
    for (Geometry.TypeEnum t : Geometry.TypeEnum.values()) {
      Geometry.TypeEnum a = Geometry.TypeEnum.fromValue(t.toString());
      assertNotNull(a);
      assertEquals(t, a);
    }
    assertNull(Geometry.TypeEnum.fromValue(UUID.randomUUID().toString()));
  }
}