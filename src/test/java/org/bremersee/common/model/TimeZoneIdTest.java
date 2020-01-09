package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TimeZone;
import org.junit.jupiter.api.Test;

/**
 * The time zone id test.
 *
 * @author Christian Bremer
 */
class TimeZoneIdTest {

  /**
   * To time zone.
   */
  @Test
  void toTimeZone() {
  }

  /**
   * From value.
   */
  @Test
  void fromValue() {
    TimeZoneId model = TimeZoneId.fromValue("GMT");
    assertNotNull(model);
    assertEquals(TimeZoneId.GMT, model);
    assertEquals("GMT", model.toString());

    model = TimeZoneId.fromValue("Zulu");
    assertNotNull(model);
    assertEquals(TimeZoneId.ZULU, model);
    assertEquals("Zulu", model.toString());

    assertNull(TimeZoneId.fromValue(null));
    assertNull(TimeZoneId.fromValue(""));
  }

  /**
   * From time zone.
   */
  @Test
  void fromTimeZone() {
    TimeZoneId model = TimeZoneId.fromTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
    assertNotNull(model);
    assertEquals(TimeZone.getTimeZone("Europe/Berlin"), model.toTimeZone());

    assertNull(TimeZoneId.fromTimeZone(null));
  }
}