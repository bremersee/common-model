package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;
import java.util.MissingResourceException;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

/**
 * The three letter language code test.
 *
 * @author Christian Bremer
 */
class ThreeLetterLanguageCodeTest {

  /**
   * Source code creator.
   */
  @Ignore
  @Test
  void sourceCodeCreator() {
    String[] isos = Locale.getISOLanguages();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < isos.length; i++) {
      String iso = isos[i];
      Locale locale = new Locale(iso);
      if (StringUtils.hasText(locale.getISO3Language())) {
        String iso3 = locale.getISO3Language();
        sb.append("  /**\n");
        sb.append("   * ")
            .append(locale.getDisplayLanguage(Locale.ENGLISH))
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
        if (StringUtils.hasText(locale.getISO3Language())) {
          ThreeLetterLanguageCode code = ThreeLetterLanguageCode.fromLocale(locale);
          assertNotNull(code);
          assertEquals(locale.getISO3Language(), code.toString());
          assertEquals(locale.getISO3Language(), code.toLocale().getISO3Language());
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
  void fromThreeLetterValue() {
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
  void fromLocaleValue() {
    for (Locale locale : Locale.getAvailableLocales()) {
      try {
        if (StringUtils.hasText(locale.getISO3Language())) {
          ThreeLetterLanguageCode code = ThreeLetterLanguageCode.fromValue(locale.toString());
          assertNotNull(code);
          assertEquals(locale.getISO3Language(), code.toString());
        }
      } catch (MissingResourceException e) {
        System.out.println(e.getMessage());
      }
    }
  }

}