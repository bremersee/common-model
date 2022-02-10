/*
 * Copyright 2020 the original author or authors.
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Locale;
import java.util.TimeZone;
import javax.validation.constraints.NotNull;
import org.immutables.value.Value;

/**
 * The time zone select option.
 *
 * @author Christian Bremer
 */
@Schema(description = "A time zone select option.")
@Value.Immutable
@JsonDeserialize(builder = ImmutableTimeZoneSelectOption.Builder.class)
public interface TimeZoneSelectOption extends SelectOption<TimeZone> {

  /**
   * The time zone display style.
   */
  enum TimeZoneDisplayStyle {
    /**
     * Short time zone display style.
     */
    SHORT(TimeZone.SHORT),
    /**
     * Long time zone display style.
     */
    LONG(TimeZone.LONG);

    private final int value;

    TimeZoneDisplayStyle(int value) {
      this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public int getValue() {
      return value;
    }
  }

  /**
   * Creates new builder.
   *
   * @return the time zone select option builder
   */
  static ImmutableTimeZoneSelectOption.Builder builder() {
    return ImmutableTimeZoneSelectOption.builder();
  }

  /**
   * Creates a new builder with time zone id and display text pre-set.
   *
   * @param timeZone the time zone
   * @param inLocale the in locale
   * @return the locale select option builder
   */
  static ImmutableTimeZoneSelectOption.Builder from(
      @NotNull TimeZone timeZone,
      @NotNull Locale inLocale) {
    return from(timeZone, false, TimeZoneDisplayStyle.LONG, inLocale);
  }

  /**
   * Creates a new builder with time zone id and display text pre-set.
   *
   * @param timeZone the time zone
   * @param daylight the daylight
   * @param style the style
   * @param inLocale the in locale
   * @return the locale select option builder
   */
  static ImmutableTimeZoneSelectOption.Builder from(
      @NotNull TimeZone timeZone,
      boolean daylight,
      @NotNull TimeZoneDisplayStyle style,
      @NotNull Locale inLocale) {
    return builder()
        .value(timeZone.getID())
        .displayText(timeZone.getDisplayName(daylight, style.getValue(), inLocale));
  }

  /**
   * Gets time zone ID.
   *
   * @return the time zone ID
   */
  @Schema(description = "The time tone ID.", required = true, example = "Europe/Berlin")
  @JsonProperty(required = true)
  @Override
  String getValue();

  /**
   * Gets display text.
   *
   * @return the display text
   */
  @Schema(description = "The display text of the time zone.", required = true)
  @JsonProperty(required = true)
  @Override
  String getDisplayText();

  /**
   * Specifies whether this time zone is selected or not.
   *
   * @return whether this time zone is selected or not
   */
  @Schema(description = "Specifies whether this time zone is selected or not.",
      defaultValue = "false")
  @JsonProperty(value = "selected", defaultValue = "false")
  @Value.Default
  @Override
  default boolean isSelected() {
    return false;
  }

  /**
   * Gets time zone.
   *
   * @return the time zone
   */
  @Schema(hidden = true)
  @JsonIgnore
  @Value.Derived
  @Override
  default TimeZone getConvertedValue() {
    return TimeZone.getTimeZone(getValue());
  }

}
