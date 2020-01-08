package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;
import java.util.MissingResourceException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

/**
 * The three letter country code test.
 *
 * @author Christian Bremer
 */
class ThreeLetterCountryCodeTest {

  /**
   * Source code creator.
   */
  @Disabled
  @Test
  void sourceCodeCreator() {
    String[] isos = Locale.getISOCountries();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < isos.length; i++) {
      String iso = isos[i];
      Locale locale = new Locale("", iso);
      if (StringUtils.hasText(locale.getISO3Country())) {
        String iso3 = locale.getISO3Country();
        sb.append("  /**\n");
        sb.append("   * ")
            .append(locale.getDisplayCountry(Locale.ENGLISH))
            .append(" (")
            .append(iso3)
            .append(")\n");
        sb.append("   */\n");
        sb.append("  ").append(iso3.toUpperCase()).append("(\"").append(iso3).append("\")");
        if (i < isos.length - 1) {
          sb.append(",\n\n");
        } else {
          sb.append(";\n");
        }
      }
    }
    assertTrue(sb.length() > 0);
    System.out.println(sb);
  }

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
        System.out.println(e.getMessage());
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
        System.out.println(e.getMessage());
      }
    }
  }

}