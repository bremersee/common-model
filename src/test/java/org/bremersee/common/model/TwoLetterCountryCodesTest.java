package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * The two letter country codes test.
 *
 * @author Christian Bremer
 */
class TwoLetterCountryCodesTest {

  /**
   * Test model.
   */
  @Test
  void testModel() {
    TwoLetterCountryCodes model = new TwoLetterCountryCodes();
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new TwoLetterCountryCodes());
    assertTrue(model.toString().length() > 0);

    TwoLetterCountryCode value = TwoLetterCountryCode.DE;
    model = new TwoLetterCountryCodes(Collections.singleton(value));
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(
        model,
        new TwoLetterCountryCodes(Collections.singleton(value)));
    assertTrue(model.toString().contains(value.toString()));
  }
}