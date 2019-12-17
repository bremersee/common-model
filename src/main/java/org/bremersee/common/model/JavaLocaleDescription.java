/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
 * A java locale and it&#39;s description.
 */
@ApiModel(description = "A java locale and it's description.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public class JavaLocaleDescription implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty(value = "locale", required = true)
  private String locale;

  @JsonProperty(value = "description", required = true)
  @JacksonXmlProperty(localName = "description")
  private String description;

  /**
   * Instantiates a new java locale description.
   *
   * @param locale      the locale
   * @param description the description
   */
  @Builder
  public JavaLocaleDescription(String locale, String description) {
    this.locale = locale;
    this.description = description;
  }

  /**
   * Get the locale.
   *
   * @return the locale
   */
  @ApiModelProperty(required = true, value = "The locale.")
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
  @ApiModelProperty(required = true, value = "The description of the locale.")
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

