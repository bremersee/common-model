package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

/**
 * The two letter country code test.
 *
 * @author Christian Bremer
 */
class TwoLetterCountryCodeTest {

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
      sb.append("  /**\n");
      sb.append("   * ").append(locale.getDisplayCountry(Locale.ENGLISH)).append(" (").append(iso)
          .append(")\n");
      sb.append("   */\n");
      sb.append("  ").append(iso.toUpperCase()).append("(\"").append(iso).append("\")");
      if (i < isos.length - 1) {
        sb.append(",\n\n");
      } else {
        sb.append(";\n");
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
      if (StringUtils.hasText(locale.getCountry())) {
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
      if (StringUtils.hasText(locale.getCountry())) {
        TwoLetterCountryCode code = TwoLetterCountryCode.fromValue(locale.toString());
        assertNotNull(code);
        assertEquals(locale.getCountry(), code.toString());
      }
    }
  }

}