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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Language tags and their descriptions.
 */
@ApiModel(description = "Language tags and their descriptions.")
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings({"unused", "WeakerAccess"})
public class HttpLanguageTagDescriptions implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("entries")
  private List<HttpLanguageTagDescription> entries = null;

  /**
   * Instantiates a new list of http language tag descriptions.
   *
   * @param entries the entries
   */
  public HttpLanguageTagDescriptions(Collection<? extends HttpLanguageTagDescription> entries) {
    if (entries != null) {
      this.entries = new ArrayList<>(entries);
    }
  }

  /**
   * Get descriptions.
   *
   * @return the descriptions
   */
  @ApiModelProperty(value = "The language tags.")
  public List<HttpLanguageTagDescription> getEntries() {
    return entries;
  }

  /**
   * Sets descriptions.
   *
   * @param entries the descriptions
   */
  public void setEntries(List<HttpLanguageTagDescription> entries) {
    this.entries = entries;
  }

}

