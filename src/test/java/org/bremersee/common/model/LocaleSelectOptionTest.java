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

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Locale;
import org.assertj.core.api.InstanceOfAssertFactories;
import org.junit.jupiter.api.Test;

/**
 * The link test.
 *
 * @author Christian Bremer
 */
class LocaleSelectOptionTest {

  /**
   * Json.
   *
   * @throws Exception the exception
   */
  @Test
  void json() throws Exception {
    String json = "{\"value\": \"de\", \"displayText\": \"German\"}";
    ObjectMapper om = new ObjectMapper();
    LocaleSelectOption actual = om.readValue(json, LocaleSelectOption.class);
    assertThat(actual)
        .isEqualTo(
            LocaleSelectOption.builder()
                .value("de")
                .displayText("German")
                .build())
        .extracting(LocaleSelectOption::isSelected, InstanceOfAssertFactories.BOOLEAN)
        .isFalse();
  }

  /**
   * From.
   */
  @Test
  void from() {
    assertThat(LocaleSelectOption.from(Locale.CANADA_FRENCH, Locale.GERMANY).build())
        .isEqualTo(LocaleSelectOption.from(Locale.CANADA_FRENCH, Locale.GERMANY).build());
  }

  /**
   * Compare to.
   */
  @Test
  void compareTo() {
    LocaleSelectOption a = LocaleSelectOption.builder()
        .value("de")
        .displayText("German")
        .build();
    LocaleSelectOption b = LocaleSelectOption.builder()
        .value("en")
        .displayText("English")
        .build();
    assertThat(a.compareTo(b)).isGreaterThan(0);
  }

}