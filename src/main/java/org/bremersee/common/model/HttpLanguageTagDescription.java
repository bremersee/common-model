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
 * A language tag and it&#39;s description.
 */
@ApiModel(description = "A language tag and it's description.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public class HttpLanguageTagDescription implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty(value = "tag", required = true)
  private HttpLanguageTag tag;

  @JsonProperty(value = "description", required = true)
  private String description;

  /**
   * Instantiates a new http language tag description.
   *
   * @param tag         the tag
   * @param description the description
   */
  @Builder
  public HttpLanguageTagDescription(HttpLanguageTag tag, String description) {
    this.tag = tag;
    this.description = description;
  }

  /**
   * Get language tag.
   *
   * @return the language tag
   */
  @ApiModelProperty(required = true, value = "The language tag.")
  @NotNull
  public HttpLanguageTag getTag() {
    return tag;
  }

  /**
   * Sets language tag.
   *
   * @param tag the language tag
   */
  public void setTag(HttpLanguageTag tag) {
    this.tag = tag;
  }

  /**
   * The description of the language tag.
   *
   * @return description description
   */
  @ApiModelProperty(required = true, value = "The description of the tag.")
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

