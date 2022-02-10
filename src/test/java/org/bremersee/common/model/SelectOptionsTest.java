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
import static org.assertj.core.api.InstanceOfAssertFactories.list;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * The select options test.
 *
 * @author Christian Bremer
 */
@ExtendWith(SoftAssertionsExtension.class)
class SelectOptionsTest {

  /**
   * Json.
   *
   * @throws Exception the exception
   */
  @Test
  void json() throws Exception {
    String json = "{\"options\": [{"
        + "\"value\": \"de\","
        + "\"displayText\": \"German\","
        + "\"selected\": true"
        + "}]}";
    ObjectMapper om = new ObjectMapper();
    SelectOptions<LocaleSelectOption> actual = om.readValue(json, new TypeReference<>() {
    });
    assertThat(actual)
        .isNotNull()
        .extracting(SelectOptions::getOptions, list(LocaleSelectOption.class))
        .containsExactly(LocaleSelectOption.builder()
            .value("de")
            .displayText("German")
            .isSelected(true)
            .build());
  }

  /**
   * Test equals and hash code.
   *
   * @param softly the soft assertions
   */
  @Test
  void testEqualsAndHashCode(SoftAssertions softly) {
    LocaleSelectOption option = LocaleSelectOption.builder()
        .value("de")
        .displayText("German")
        .isSelected(true)
        .build();
    SelectOptions<LocaleSelectOption> actual = new SelectOptions<>(List.of(option));
    SelectOptions<LocaleSelectOption> expected = new SelectOptions<>(List.of(option));
    softly.assertThat(actual).isEqualTo(expected);
    softly.assertThat(actual.hashCode()).isEqualTo(expected.hashCode());
    softly.assertThat(actual).isEqualTo(actual);
    softly.assertThat(actual).isNotEqualTo(null);
    softly.assertThat(actual).isNotEqualTo(new Object());
  }

  /**
   * Test to string.
   */
  @Test
  void testToString() {
    LocaleSelectOption option = LocaleSelectOption.builder()
        .value("de")
        .displayText("German")
        .isSelected(true)
        .build();
    SelectOptions<LocaleSelectOption> actual = new SelectOptions<>(List.of(option));
    assertThat(actual.toString()).contains("German");
  }
}