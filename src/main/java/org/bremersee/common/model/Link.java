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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.immutables.value.Value;

/**
 * The interface Link.
 *
 * @author Christian Bremer
 */
@Schema(description = "A link description.")
@Valid
@Value.Immutable
@JsonDeserialize(builder = ImmutableLink.Builder.class)
public interface Link {

  /**
   * Builder immutable link . builder.
   *
   * @return the immutable link . builder
   */
  static ImmutableLink.Builder builder() {
    return ImmutableLink.builder();
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  @Schema(description = "The ID.", accessMode = AccessMode.READ_ONLY)
  @Nullable
  String getId();

  /**
   * The URI.
   *
   * @return the href
   */
  @Schema(description = "The URI.", required = true)
  @JsonProperty(required = true)
  @NotBlank
  String getHref();

  /**
   * The type.
   *
   * @return the type
   */
  @Schema(description = "The type.")
  @Nullable
  String getType();

  /**
   * Specified whether to open the link in a blank target (default is {@code false}).
   *
   * @return whether to open the link in a blank target
   */
  @Schema(
      description = "Specified whether to open the link in a blank target (default is false).",
      defaultValue = "false")
  @JsonProperty(value = "blank", defaultValue = "false")
  @Value.Default
  @NotNull
  default boolean isBlank() {
    return false;
  }

  /**
   * The link text.
   *
   * @return the text
   */
  @Schema(description = "The link text.")
  @Nullable
  String getText();

  /**
   * A short description.
   *
   * @return the description
   */
  @Schema(description = "A short description.")
  @Nullable
  String getDescription();

}
