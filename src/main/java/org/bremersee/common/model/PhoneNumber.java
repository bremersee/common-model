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
import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import org.immutables.value.Value;

/**
 * A phone number.
 *
 * @author Christian Bremer
 */
@Schema(description = "A phone number.")
@Valid
@Value.Immutable
@JsonDeserialize(builder = ImmutablePhoneNumber.Builder.class)
public interface PhoneNumber {

  /**
   * Creates new phone number builder.
   *
   * @return the phone number builder
   */
  static ImmutablePhoneNumber.Builder builder() {
    return ImmutablePhoneNumber.builder();
  }

  /**
   * The phone number.
   *
   * @return the phone number
   */
  @Schema(description = "The phone number", required = true, example = "00490325092901")
  @JsonProperty(required = true)
  @NotBlank
  String getValue();

  /**
   * The category.
   *
   * @return the category
   */
  @Schema(description = "The category.")
  @Nullable
  String getCategory();

}
