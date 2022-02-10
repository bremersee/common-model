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

import java.util.Locale;
import java.util.TimeZone;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.bremersee.common.model.TimeZoneSelectOption.TimeZoneDisplayStyle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * The time zone select option test.
 *
 * @author Christian Bremer
 */
@ExtendWith(SoftAssertionsExtension.class)
class TimeZoneSelectOptionTest {

  /**
   * Builder.
   */
  @Test
  void builder() {
    assertThat(TimeZoneSelectOption.builder()
        .value("UTC")
        .displayText("Greenwich mean time")
        .build())
        .isEqualTo(TimeZoneSelectOption.builder()
            .value("UTC")
            .displayText("Greenwich mean time")
            .build());
  }

  /**
   * From.
   */
  @Test
  void from() {
    TimeZone tz = TimeZone.getTimeZone("UTC");
    assertThat(
        TimeZoneSelectOption
            .from(tz, Locale.GERMANY)
            .build())
        .isEqualTo(
            TimeZoneSelectOption
                .from(tz, false, TimeZoneDisplayStyle.LONG, Locale.GERMANY)
                .build());


  }

  /**
   * From with daylight and display style.
   *
   * @param softly the soft assertions
   */
  @Test
  void fromWithDaylightAndDisplayStyle(SoftAssertions softly) {
    TimeZone tz = TimeZone.getTimeZone("Europe/Berlin");
    TimeZoneSelectOption actual = TimeZoneSelectOption
        .from(tz, false, TimeZoneDisplayStyle.LONG, Locale.GERMANY)
        .build();
    TimeZoneSelectOption expected = TimeZoneSelectOption
        .builder()
        .value("Europe/Berlin")
        .displayText("Mitteleuropäische Normalzeit")
        .build();
    softly.assertThat(actual)
        .isEqualTo(expected);

    actual = TimeZoneSelectOption
        .from(tz, true, TimeZoneDisplayStyle.SHORT, Locale.GERMANY)
        .build();
    expected = TimeZoneSelectOption
        .builder()
        .value("Europe/Berlin")
        .displayText("MESZ")
        .build();
    softly.assertThat(actual)
        .isEqualTo(expected);
  }

  /**
   * Gets converted value.
   */
  @Test
  void getConvertedValue() {
    TimeZoneSelectOption actual = TimeZoneSelectOption.builder()
        .value("Europe/Berlin")
        .displayText("MESZ")
        .build();
    TimeZone expected = TimeZone.getTimeZone("Europe/Berlin");
    assertThat(actual)
        .extracting(TimeZoneSelectOption::getConvertedValue)
        .isEqualTo(expected);
  }
}