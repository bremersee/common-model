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
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * A link description.
 *
 * @author Christian Bremer
 */
@Schema(description = "A link description.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Link implements Serializable {

  private static final long serialVersionUID = 2L;

  @JsonProperty("id")
  private String id;

  @JsonProperty(value = "href", required = true)
  private String href;

  @JsonProperty("type")
  private String type;

  @JsonProperty("blank")
  private Boolean blank = Boolean.FALSE;

  @JsonProperty("text")
  private String text;

  @JsonProperty("description")
  private String description;

  /**
   * Instantiates a new link.
   *
   * @param id the id
   * @param href the href
   * @param type the type
   * @param blank specified whether to open the link in a blank target (default is false)
   * @param text the text
   * @param description the description
   */
  @Builder(toBuilder = true)
  @SuppressWarnings("unused")
  public Link(String id, String href, String type, Boolean blank, String text, String description) {
    this.id = id;
    this.href = href;
    this.type = type;
    this.blank = Boolean.TRUE.equals(blank);
    this.text = text;
    this.description = description;
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  @Schema(description = "The ID.", accessMode = AccessMode.READ_ONLY)
  public String getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The URI.
   *
   * @return href href
   */
  @Schema(description = "The URI.", required = true)
  @NotBlank
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
  @Schema(description = "The type.")
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
   * Specified whether to open the link in a blank target (default is {@code false}).
   *
   * @return the blank
   */
  @Schema(
      description = "Specified whether to open the link in a blank target (default is false).",
      defaultValue = "false")
  public Boolean getBlank() {
    return blank;
  }

  /**
   * Specified whether to open the link in a blank target (default is {@code false}).
   *
   * @param blank the blank
   */
  public void setBlank(Boolean blank) {
    this.blank = Boolean.TRUE.equals(blank);
  }

  /**
   * The link text.
   *
   * @return text text
   */
  @Schema(description = "The link text.")
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
  @Schema(description = "A short description.")
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

