/*
 * Copyright 2022 the original author or authors.
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

package org.bremersee.converter.jackson;

import java.util.Locale;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * The jackson string to locale converter test.
 *
 * @author Christian Bremer
 */
@ExtendWith({SoftAssertionsExtension.class})
class JacksonStringToLocaleConverterTest {

  /**
   * Convert.
   *
   * @param softly the soft assertions
   */
  @Test
  void convert(SoftAssertions softly) {
    JacksonStringToLocaleConverter target = new JacksonStringToLocaleConverter();
    softly.assertThat(target.convert("de"))
        .isEqualTo(Locale.GERMAN);
    softly.assertThat(target.convert("de-DE"))
        .isEqualTo(Locale.GERMANY);
    softly.assertThat(target.convert("en"))
        .isEqualTo(Locale.ENGLISH);
    softly.assertThat(target.convert("en-GB"))
        .isEqualTo(Locale.UK);
  }
}