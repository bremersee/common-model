package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Locale;
import java.util.MissingResourceException;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

/**
 * The three letter country code test.
 *
 * @author Christian Bremer
 */
class ThreeLetterCountryCodeTest {

  /**
   * From locale.
   */
  @Test
  void fromLocale() {
    for (Locale locale : Locale.getAvailableLocales()) {
      try {
        if (StringUtils.hasText(locale.getISO3Country())) {
          ThreeLetterCountryCode code = ThreeLetterCountryCode.fromLocale(locale);
          assertNotNull(code);
          assertEquals(locale.getISO3Country(), code.toString());
          assertEquals(locale.getISO3Country(), code.toLocale().getISO3Country());
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
  void fromTwoLetterValue() {
    for (String iso : Locale.getISOCountries()) {
      ThreeLetterCountryCode code = ThreeLetterCountryCode.fromValue(iso);
      assertNotNull(code);
      assertEquals(code.toLocale().getISO3Country(), code.toString());
    }
  }

  /**
   * From three letter value.
   */
  @Test
  void fromThreeLetterValue() {
    for (String iso : Locale.getISOCountries()) {
      Locale locale = new Locale("", iso);
      ThreeLetterCountryCode code = ThreeLetterCountryCode.fromValue(locale.getISO3Country());
      assertNotNull(code);
      assertEquals(locale.getISO3Country(), code.toString());
    }
  }

  /**
   * From locale value.
   */
  @Test
  void fromLocaleValue() {
    for (Locale locale : Locale.getAvailableLocales()) {
      try {
        if (StringUtils.hasText(locale.getISO3Country())) {
          ThreeLetterCountryCode code = ThreeLetterCountryCode.fromValue(locale.toString());
          assertNotNull(code);
          assertEquals(locale.getISO3Country(), code.toString());
        }
      } catch (MissingResourceException e) {
        // ignored
      }
    }
  }

}