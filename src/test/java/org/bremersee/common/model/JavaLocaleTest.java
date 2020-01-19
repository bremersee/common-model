/*
 * Copyright 2018-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
 * The java locale test.
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
      assertNotNull(javaLocale);
      if (StringUtils.hasText(locale.toString())) {
        assertEquals(locale.getLanguage(), javaLocale.getLanguage());
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