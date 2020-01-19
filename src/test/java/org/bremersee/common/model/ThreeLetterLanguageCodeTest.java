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
import java.util.MissingResourceException;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

/**
 * The three letter language code test.
 *
 * @author Christian Bremer
 */
class ThreeLetterLanguageCodeTest {

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
        // ignored
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
        // ignored
      }
    }
  }

}