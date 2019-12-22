package org.bremersee.common.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Locale;
import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * The two letter country code test.
 *
 * @author Christian Bremer
 */
public class TwoLetterCountryCodeTest {

  /**
   * From locale.
   */
  @Test
  public void fromLocale() {
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
  public void fromTwoLetterValue() {
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
  public void fromThreeLetterValue() {
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
  public void fromLocaleValue() {
    for (Locale locale : Locale.getAvailableLocales()) {
      if (StringUtils.hasText(locale.getCountry()) && locale.getCountry().length() == 2) {
        TwoLetterCountryCode code = TwoLetterCountryCode.fromValue(locale.toString());
        assertNotNull(code);
        assertEquals(locale.getCountry(), code.toString());
      }
    }
  }

}