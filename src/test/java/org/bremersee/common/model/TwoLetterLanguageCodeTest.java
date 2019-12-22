package org.bremersee.common.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Locale;
import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * The two letter language code test.
 *
 * @author Christian Bremer
 */
public class TwoLetterLanguageCodeTest {

  /**
   * From locale.
   */
  @Test
  public void fromLocale() {
    for (Locale locale : Locale.getAvailableLocales()) {
      if (StringUtils.hasText(locale.getLanguage()) && locale.getLanguage().length() == 2) {
        TwoLetterLanguageCode code = TwoLetterLanguageCode.fromLocale(locale);
        assertNotNull(code);
        assertEquals(locale.getLanguage(), code.toString());
        assertEquals(locale.getLanguage(), code.toLocale().getLanguage());
      }
    }
  }

  /**
   * From two letter value.
   */
  @Test
  public void fromTwoLetterValue() {
    for (String text : Locale.getISOLanguages()) {
      TwoLetterLanguageCode code = TwoLetterLanguageCode.fromValue(text);
      assertNotNull(code);
      assertEquals(text, code.toString());
    }
  }

  /**
   * From three letter value.
   */
  @Test
  public void fromThreeLetterValue() {
    for (String iso : Locale.getISOLanguages()) {
      Locale locale = new Locale(iso);
      if (locale.getISO3Language() != null) {
        TwoLetterLanguageCode code = TwoLetterLanguageCode.fromValue(locale.getISO3Language());
        assertNotNull(code);
        assertEquals(locale.getLanguage(), code.toString());
      }
    }
  }

  /**
   * From locale value.
   */
  @Test
  public void fromLocaleValue() {
    for (Locale locale : Locale.getAvailableLocales()) {
      if (StringUtils.hasText(locale.getLanguage()) && locale.getLanguage().length() == 2) {
        TwoLetterLanguageCode code = TwoLetterLanguageCode.fromValue(locale.toString());
        assertNotNull(code);
        assertEquals(locale.getLanguage(), code.toString());
      }
    }
  }

}