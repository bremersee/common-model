package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * The three letter language codes test.
 *
 * @author Christian Bremer
 */
class ThreeLetterLanguageCodesTest {

  /**
   * Test model.
   */
  @Test
  void testModel() {
    ThreeLetterLanguageCodes model = new ThreeLetterLanguageCodes();
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new ThreeLetterLanguageCodes());
    assertTrue(model.toString().length() > 0);

    ThreeLetterLanguageCode value = ThreeLetterLanguageCode.DEU;
    model = new ThreeLetterLanguageCodes(Collections.singleton(value));
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(
        model,
        new ThreeLetterLanguageCodes(Collections.singleton(value)));
    assertTrue(model.toString().contains(value.toString()));
  }
}