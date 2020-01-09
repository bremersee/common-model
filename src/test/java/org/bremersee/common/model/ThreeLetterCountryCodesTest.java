package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.Locale;
import org.junit.jupiter.api.Test;

/**
 * The three letter country codes test.
 *
 * @author Christian Bremer
 */
class ThreeLetterCountryCodesTest {

  /**
   * Test model.
   */
  @Test
  void testModel() {
    ThreeLetterCountryCodes model = new ThreeLetterCountryCodes();
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new ThreeLetterCountryCodes());
    assertTrue(model.toString().length() > 0);

    ThreeLetterCountryCode value = ThreeLetterCountryCode.DEU;
    model = new ThreeLetterCountryCodes(Collections.singleton(value));
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(
        model,
        new ThreeLetterCountryCodes(Collections.singleton(value)));
    assertTrue(model.toString().contains(value.toString()));
  }
}