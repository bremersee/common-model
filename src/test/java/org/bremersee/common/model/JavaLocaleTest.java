package org.bremersee.common.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bremersee.common.model.JavaLocale.Separator;
import org.junit.Test;

/**
 * @author Christian Bremer
 */
public class JavaLocaleTest {

  @Test
  public void testPossibilities() {
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
}