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
import java.util.Optional;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import org.immutables.value.Value;

/**
 * The locale select option.
 *
 * @author Christian Bremer
 */
@Schema(description = "A locale select option.")
@Value.Immutable
@JsonDeserialize(builder = ImmutableLocaleSelectOption.Builder.class)
public interface LocaleSelectOption extends SelectOption<Locale> {

  /**
   * Creates new builder.
   *
   * @return the locale select option builder
   */
  static ImmutableLocaleSelectOption.Builder builder() {
    return ImmutableLocaleSelectOption.builder();
  }

  /**
   * Creates a new builder with language tag and the display text pre-set.
   *
   * @param locale the locale
   * @param inLocale the in locale
   * @return the locale select option builder
   */
  static ImmutableLocaleSelectOption.Builder from(
      @NotNull Locale locale,
      @Nullable Locale inLocale) {
    return builder()
        .value(locale.toLanguageTag())
        .displayText(locale.getDisplayName(Optional.ofNullable(inLocale).orElse(locale)));
  }

  /**
   * Gets language tag.
   *
   * @return the language tag
   */
  @Schema(description = "The language tag in format of http Accept-Language header.",
      required = true, example = "de-DE")
  @JsonProperty(required = true)
  @Override
  String getValue();

  /**
   * Gets display text.
   *
   * @return the display text
   */
  @Schema(description = "The display text of the language tag.",
      required = true, example = "Germany")
  @JsonProperty(required = true)
  @Override
  String getDisplayText();

  /**
   * Specifies whether this locale is selected or not.
   *
   * @return the boolean
   */
  @Schema(description = "Specifies whether this locale is selected or not.", defaultValue = "false")
  @JsonProperty(value = "selected", defaultValue = "false")
  @Value.Default
  @Override
  default boolean isSelected() {
    return false;
  }

  /**
   * Gets locale.
   *
   * @return the locale
   */
  @Schema(hidden = true)
  @JsonIgnore
  @Value.Derived
  @Override
  default Locale getConvertedValue() {
    return Locale.forLanguageTag(getValue());
  }

}
