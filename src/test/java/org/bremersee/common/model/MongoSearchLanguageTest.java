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

import java.util.Locale;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * The mongo search language test.
 *
 * @author Christian Bremer
 */
@ExtendWith(SoftAssertionsExtension.class)
class MongoSearchLanguageTest {

  /**
   * From value.
   *
   * @param softly the soft assertions
   */
  @Test
  void fromValue(SoftAssertions softly) {
    for (MongoSearchLanguage language : MongoSearchLanguage.values()) {
      MongoSearchLanguage actual = MongoSearchLanguage.fromValue(language.name());
      softly.assertThat(actual)
          .isEqualTo(language)
          .extracting(Object::toString)
          .isEqualTo(language.toString());
    }
    softly.assertThat(MongoSearchLanguage.fromValue("", MongoSearchLanguage.NO))
        .isEqualTo(MongoSearchLanguage.NO);
    softly.assertThat(MongoSearchLanguage.fromValue("xxx", MongoSearchLanguage.NO))
        .isEqualTo(MongoSearchLanguage.NO);
  }

  /**
   * From locale.
   *
   * @param softly the soft assertions
   */
  @Test
  void fromLocale(SoftAssertions softly) {
    softly.assertThat(MongoSearchLanguage.fromLocale(null, MongoSearchLanguage.NO))
        .isEqualTo(MongoSearchLanguage.NO);
    softly.assertThat(MongoSearchLanguage.fromLocale(new Locale(""), MongoSearchLanguage.NO))
        .isEqualTo(MongoSearchLanguage.NO);
    softly.assertThat(MongoSearchLanguage.fromLocale(Locale.GERMANY, MongoSearchLanguage.NO))
        .isEqualTo(MongoSearchLanguage.DE);
  }

  /**
   * To locale.
   *
   * @param softly the soft assertions
   */
  @Test
  void toLocale(SoftAssertions softly) {
    for (MongoSearchLanguage language : MongoSearchLanguage.values()) {
      Locale locale = language.toLocale();
      if (MongoSearchLanguage.NONE == language) {
        softly.assertThat(locale).isNull();
      } else {
        softly.assertThat(locale)
            .isNotNull()
            .extracting(Locale::getLanguage)
            .isEqualTo(language.name().toLowerCase());
      }
    }
  }
}