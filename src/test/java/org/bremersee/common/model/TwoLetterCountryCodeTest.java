package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

/**
 * The two letter country code test.
 *
 * @author Christian Bremer
 */
class TwoLetterCountryCodeTest {

  /**
   * From locale.
   */
  @Test
  void fromLocale() {
    for (Locale locale : Locale.getAvailableLocales()) {
      if (StringUtils.hasText(locale.getCountry()) && locale.getCountry().length() == 2) {
        TwoLetterCountryCode code = TwoLetterCountryCode.fromLocale(locale);
        assertNotNull(code);
        assertEquals(locale.getCountry(), code.toString());
        assertEquals(locale.getCountry(), code.toLocale().getCountry());
      }
    }
  }

  /**
   * From two letter value.
   */
  @Test
  void fromTwoLetterValue() {
    for (String text : Locale.getISOCountries()) {
      TwoLetterCountryCode code = TwoLetterCountryCode.fromValue(text);
      assertNotNull(code);
      assertEquals(text, code.toString());
    }
  }

  /**
   * From three letter value.
   */
  @Test
  void fromThreeLetterValue() {
    for (String iso : Locale.getISOCountries()) {
      Locale locale = new Locale("", iso);
      if (locale.getISO3Country() != null) {
        TwoLetterCountryCode code = TwoLetterCountryCode.fromValue(locale.getISO3Country());
        assertNotNull(code);
        assertEquals(locale.getCountry(), code.toString());
      }
    }
  }

  /**
   * From locale value.
   */
  @Test
  void fromLocaleValue() {
    for (Locale locale : Locale.getAvailableLocales()) {
      if (StringUtils.hasText(locale.getCountry()) && locale.getCountry().length() == 2) {
        TwoLetterCountryCode code = TwoLetterCountryCode.fromValue(locale.toString());
        assertNotNull(code);
        assertEquals(locale.getCountry(), code.toString());
      }
    }
  }

}