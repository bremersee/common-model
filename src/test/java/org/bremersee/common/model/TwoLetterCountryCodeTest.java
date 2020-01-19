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
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Locale;
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