package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * The two letter language codes test.
 *
 * @author Christian Bremer
 */
class TwoLetterLanguageCodesTest {

  /**
   * Test model.
   */
  @Test
  void testModel() {
    TwoLetterLanguageCodes model = new TwoLetterLanguageCodes();
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new TwoLetterLanguageCodes());
    assertTrue(model.toString().length() > 0);

    TwoLetterLanguageCode value = TwoLetterLanguageCode.DE;
    model = new TwoLetterLanguageCodes(Collections.singleton(value));
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(
        model,
        new TwoLetterLanguageCodes(Collections.singleton(value)));
    assertTrue(model.toString().contains(value.toString()));
  }
}