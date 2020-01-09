package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bremersee.common.model.JavaLocale.Separator;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

/**
 * The type Java locale test.
 *
 * @author Christian Bremer
 */
class JavaLocaleTest {

  /**
   * Test possibilities.
   */
  @Test
  void testPossibilities() {
    Map<String, String> exceptions = new HashMap<>();
    exceptions.put("he", "iw");
    exceptions.put("id", "in");
    exceptions.put("yi", "ji");
    for (TwoLetterLanguageCode languageCode : TwoLetterLanguageCode.values()) {
      for (TwoLetterCountryCode countryCode : TwoLetterCountryCode.values()) {
        String text = languageCode.toString() + "-" + countryCode.toString();
        JavaLocale javaLocale0 = JavaLocale.fromValue(text);
        assertNotNull(javaLocale0);
        JavaLocale javaLocale1 = new JavaLocale(languageCode.toString(), countryCode.toString());
        JavaLocale javaLocale2 = new JavaLocale(languageCode, countryCode);
        assertEquals(javaLocale0, javaLocale1);
        assertEquals(javaLocale1, javaLocale2);

        Locale locale = javaLocale0.toLocale();
        assertNotNull(locale);
        assertEquals(
            exceptions.getOrDefault(languageCode.toString(), languageCode.toString()),
            locale.getLanguage());
        assertEquals(countryCode.toString(), locale.getCountry());

        assertEquals(text, javaLocale0.toString(Separator.HYPHEN));
        assertEquals(
            languageCode.toString() + "_" + countryCode.toString(),
            javaLocale0.toString(Separator.UNDERSCORE));
      }
    }
  }

  /**
   * From locale.
   */
  @Test
  void fromLocale() {
    for (Locale locale : Locale.getAvailableLocales()) {
      JavaLocale javaLocale = JavaLocale.fromLocale(locale);
      if (StringUtils.hasText(locale.toString())) {
        assertNotNull(javaLocale);
        assertEquals(locale.getLanguage(), javaLocale.getLanguage());
      } else {
        assertNull(javaLocale);
      }
    }
  }

  /**
   * From three letter language code and three letter country code.
   */
  @Test
  void fromThreeLetterLanguageCodeAndThreeLetterCountryCode() {
    JavaLocale model = new JavaLocale(ThreeLetterLanguageCode.DEU, ThreeLetterCountryCode.DEU);
    assertEquals("de", model.getLanguage());
    assertEquals("DE", model.getCountry());

    //noinspection RedundantCast
    model = new JavaLocale((ThreeLetterLanguageCode)null, (ThreeLetterCountryCode)null);
    assertNull(model.getLanguage());
    assertNull(model.getCountry());

    assertEquals(Locale.JAPAN, model.toLocale(Locale.JAPAN));
  }

  /**
   * Gets language.
   */
  @Test
  void getLanguage() {
    JavaLocale model = new JavaLocale();
    model.setLanguage("de");
    assertEquals("de", model.getLanguage());

    model = JavaLocale.builder().language("de").build();
    assertEquals("de", model.getLanguage());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().language("de").build());

    assertTrue(model.toString().contains("de"));
  }

  /**
   * Gets country.
   */
  @Test
  void getCountry() {
    JavaLocale model = new JavaLocale();
    model.setCountry("DE");
    assertEquals("DE", model.getCountry());

    model = JavaLocale.builder().country("DE").build();
    assertEquals("DE", model.getCountry());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().country("DE").build());

    model.setLanguage("de");
    assertTrue(model.toString().contains("de-DE"));
  }

}