package org.bremersee.common.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Locale;
import java.util.MissingResourceException;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * The three letter language code test.
 *
 * @author Christian Bremer
 */
public class ThreeLetterLanguageCodeTest {

  /**
   * From locale.
   */
  @Test
  public void fromLocale() {
    for (Locale locale : Locale.getAvailableLocales()) {
      try {
        if (StringUtils.hasText(locale.getISO3Language())) {
          ThreeLetterLanguageCode code = ThreeLetterLanguageCode.fromLocale(locale);
          assertNotNull(code);
          assertEquals(locale.getISO3Language(), code.toString());
          assertEquals(locale.getISO3Language(), code.toLocale().getISO3Language());
        }
      } catch (MissingResourceException e) {
        // ignored
      }
    }
  }

  /**
   * From two letter value.
   */
  @Test
  public void fromTwoLetterValue() {
    for (String iso : Locale.getISOLanguages()) {
      ThreeLetterLanguageCode code = ThreeLetterLanguageCode.fromValue(iso);
      assertNotNull(code);
      assertEquals(code.toLocale().getISO3Language(), code.toString());
    }
  }

  /**
   * From three letter value.
   */
  @Test
  public void fromThreeLetterValue() {
    for (String iso : Locale.getISOLanguages()) {
      Locale locale = new Locale(iso);
      ThreeLetterLanguageCode code = ThreeLetterLanguageCode.fromValue(locale.getISO3Language());
      assertNotNull(code);
      assertEquals(locale.getISO3Language(), code.toString());
    }
  }

  /**
   * From locale value.
   */
  @Test
  public void fromLocaleValue() {
    for (Locale locale : Locale.getAvailableLocales()) {
      try {
        if (StringUtils.hasText(locale.getISO3Language())) {
          ThreeLetterLanguageCode code = ThreeLetterLanguageCode.fromValue(locale.toString());
          assertNotNull(code);
          assertEquals(locale.getISO3Language(), code.toString());
        }
      } catch (MissingResourceException e) {
        // ignored
      }
    }
  }

}