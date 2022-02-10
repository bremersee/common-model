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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.annotation.Nullable;
import javax.validation.Valid;
import org.immutables.value.Value;

/**
 * Address data.
 *
 * @author Christian Bremer
 */
@Value.Immutable
@Valid
@Schema(description = "Address data.")
@JsonDeserialize(builder = ImmutableAddress.Builder.class)
public interface Address {

  /**
   * Creates new builder.
   *
   * @return the address builder
   */
  static ImmutableAddress.Builder builder() {
    return ImmutableAddress.builder();
  }

  /**
   * The street number.
   *
   * @return streetNumber street number
   */
  @Schema(description = "The street number.", example = "100")
  @Nullable
  String getStreetNumber();

  /**
   * The street name.
   *
   * @return the street
   */
  @Schema(description = "The street name.", example = "Kurfürstendamm")
  @Nullable
  String getStreet();

  /**
   * The postal code.
   *
   * @return the postal code
   */
  @Schema(description = "The postal code.", example = "10709")
  @Nullable
  String getPostalCode();

  /**
   * The city name.
   *
   * @return the city
   */
  @Schema(description = "The city name.", example = "Berlin")
  @Nullable
  String getCity();

  /**
   * The suburb name.
   *
   * @return the suburb
   */
  @Schema(description = "The suburb name.")
  @Nullable
  String getSuburb();

  /**
   * The state name.
   *
   * @return the state
   */
  @Schema(description = "The state name.")
  @Nullable
  String getState();

  /**
   * The country name.
   *
   * @return the country
   */
  @Schema(description = "The country name.", example = "Germany")
  @Nullable
  String getCountry();

  /**
   * The country code.
   *
   * @return the country code
   */
  @Schema(description = "The country code.", example = "DE")
  @Nullable
  String getCountryCode();

  /**
   * The street number.
   *
   * @return the formatted address
   */
  @Schema(description = "The street number.", example = "Kurfürstendamm 100, 10709 Berlin")
  @Nullable
  String getFormattedAddress();

}
