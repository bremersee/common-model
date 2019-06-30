/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
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
 */
@ApiModel(description = "A phone number.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public class PhoneNumber implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty(value = "value", required = true)
  private String value;

  @JsonProperty("category")
  private String category;

  @Builder
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

