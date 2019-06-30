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
 * Java locales and their descriptions.
 */
@ApiModel(description = "Java locales and their descriptions.")
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings({"WeakerAccess", "unused"})
public class JavaLocaleDescriptions implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("entries")
  private List<JavaLocaleDescription> entries = null;

  /**
   * Instantiates a new Java locale descriptions.
   *
   * @param entries the entries
   */
  public JavaLocaleDescriptions(Collection<? extends JavaLocaleDescription> entries) {
    if (entries != null) {
      this.entries = new ArrayList<>(entries);
    }
  }

  /**
   * Get descriptions.
   *
   * @return entries the descriptions
   */
  @ApiModelProperty(value = "The descriptions.")
  public List<JavaLocaleDescription> getEntries() {
    return entries;
  }

  /**
   * Sets descriptions.
   *
   * @param entries the descriptions
   */
  public void setEntries(List<JavaLocaleDescription> entries) {
    this.entries = entries;
  }

}

