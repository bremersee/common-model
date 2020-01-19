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