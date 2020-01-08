package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

/**
 * The two letter language code test.
 *
 * @author Christian Bremer
 */
class TwoLetterLanguageCodeTest {

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
      sb.append("  /**\n");
      sb.append("   * ")
          .append(locale.getDisplayLanguage(Locale.ENGLISH))
          .append(" (")
          .append(iso)
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
      if (StringUtils.hasText(locale.getLanguage())) {
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
  void fromTwoLetterValue() {
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
  void fromThreeLetterValue() {
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
  void fromLocaleValue() {
    for (Locale locale : Locale.getAvailableLocales()) {
      if (StringUtils.hasText(locale.getLanguage())) {
        TwoLetterLanguageCode code = TwoLetterLanguageCode.fromValue(locale.toString());
        assertNotNull(code);
        assertEquals(locale.getLanguage(), code.toString());
      }
    }
  }

}