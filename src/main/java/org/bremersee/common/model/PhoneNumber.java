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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * A phone number.
 *
 * @author Christian Bremer
 */
@ApiModel(description = "A phone number.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class PhoneNumber implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty(value = "value", required = true)
  private String value;

  @JsonProperty("category")
  private String category;

  @Builder(toBuilder = true)
  @SuppressWarnings("unused")
  public PhoneNumber(String value, String category) {
    this.value = value;
    this.category = category;
  }

  /**
   * The phone number.
   *
   * @return value value
   */
  @ApiModelProperty(required = true, value = "The phone number")
  @NotNull
  public String getValue() {
    return value;
  }

  /**
   * Sets value.
   *
   * @param value the value
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The category.
   *
   * @return category category
   */
  @ApiModelProperty(value = "The category.")
  public String getCategory() {
    return category;
  }

  /**
   * Sets category.
   *
   * @param category the category
   */
  public void setCategory(String category) {
    this.category = category;
  }

}

