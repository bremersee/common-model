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
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Locale;
import org.junit.jupiter.api.Test;

/**
 * The mongo search language test.
 *
 * @author Christian Bremer
 */
class MongoSearchLanguageTest {

  /**
   * From value.
   */
  @Test
  void fromValue() {
    for (MongoSearchLanguage language : MongoSearchLanguage.values()) {
      assertEquals(language, MongoSearchLanguage.fromValue(language.name()));
      assertEquals(language, MongoSearchLanguage.fromValue(language.toString()));
    }
  }

  /**
   * To locale.
   */
  @Test
  void toLocale() {
    for (MongoSearchLanguage language : MongoSearchLanguage.values()) {
      Locale locale = language.toLocale();
      if (MongoSearchLanguage.NONE == language) {
        assertNull(locale);
      } else {
        assertNotNull(locale);
        assertEquals(language.name().toLowerCase(), locale.getLanguage());
        assertNotNull(TwoLetterLanguageCode.fromValue(locale.getLanguage()));
      }
    }
  }
}