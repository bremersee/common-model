package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * The time zone ids test.
 *
 * @author Christian Bremer
 */
class TimeZoneIdsTest {

  /**
   * Test model.
   */
  @Test
  void testModel() {
    TimeZoneIds model = new TimeZoneIds();
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new TimeZoneIds());
    assertTrue(model.toString().length() > 0);

    TimeZoneId value = TimeZoneId.GMT;
    model = new TimeZoneIds(Collections.singleton(value));
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(
        model,
        new TimeZoneIds(Collections.singleton(value)));
    assertTrue(model.toString().contains(value.toString()));
  }
}