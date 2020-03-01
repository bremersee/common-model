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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * A java locale and it&#39;s description.
 *
 * @author Christian Bremer
 */
@Schema(description = "A java locale and it's description.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class JavaLocaleDescription implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty(value = "locale", required = true)
  private String locale;

  @JsonProperty(value = "description", required = true)
  private String description;

  /**
   * Instantiates a new java locale description.
   *
   * @param locale the locale
   * @param description the description
   */
  @Builder(toBuilder = true)
  @SuppressWarnings("unused")
  public JavaLocaleDescription(String locale, String description) {
    this.locale = locale;
    this.description = description;
  }

  /**
   * Get the locale.
   *
   * @return the locale
   */
  @Schema(description = "The locale.", required = true, example = "de")
  @NotNull
  public String getLocale() {
    return locale;
  }

  /**
   * Sets locale.
   *
   * @param locale the locale
   */
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * The description of the locale.
   *
   * @return description description
   */
  @Schema(description = "The description of the locale.", required = true, example = "German")
  @NotNull
  public String getDescription() {
    return description;
  }

  /**
   * Sets description.
   *
   * @param description the description
   */
  public void setDescription(String description) {
    this.description = description;
  }

}

