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
 * A link description.
 */
@ApiModel(description = "A link description.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public class Link implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty(value = "href", required = true)
  private String href;

  @JsonProperty("type")
  private String type;

  @JsonProperty("text")
  private String text;

  @JsonProperty("description")
  private String description;

  /**
   * Instantiates a new link.
   *
   * @param href        the href
   * @param type        the type
   * @param text        the text
   * @param description the description
   */
  @Builder
  public Link(String href, String type, String text, String description) {
    this.href = href;
    this.type = type;
    this.text = text;
    this.description = description;
  }

  /**
   * The URI.
   *
   * @return href href
   */
  @ApiModelProperty(required = true, value = "The URI.")
  @NotNull
  public String getHref() {
    return href;
  }

  /**
   * Sets href.
   *
   * @param href the href
   */
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * The type.
   *
   * @return type type
   */
  @ApiModelProperty(value = "The type.")
  public String getType() {
    return type;
  }

  /**
   * Sets type.
   *
   * @param type the type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The link text.
   *
   * @return text text
   */
  @ApiModelProperty(value = "The link text.")
  public String getText() {
    return text;
  }

  /**
   * Sets text.
   *
   * @param text the text
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * A short description.
   *
   * @return description description
   */
  @ApiModelProperty(value = "A short description.")
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

