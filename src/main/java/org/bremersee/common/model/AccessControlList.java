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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Specifies permissions and who is granted.
 *
 * @author Christian Bremer
 */
@Schema(description = "Specifies permissions and who is granted.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class AccessControlList implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("entries")
  private List<AccessControlEntry> entries;

  /**
   * Instantiates a new access control list.
   *
   * @param owner the owner
   * @param entries the entries
   */
  @Builder(toBuilder = true)
  @SuppressWarnings("unused")
  public AccessControlList(
      String owner,
      List<AccessControlEntry> entries) {
    this.owner = owner;
    this.entries = entries;
  }

  /**
   * The owner is always granted and can only be changed by the owner.
   *
   * @return owner owner
   */
  @Schema(description = "The owner is always granted and can only be changed by the owner.")
  public String getOwner() {
    return owner;
  }

  /**
   * Sets owner.
   *
   * @param owner the owner
   */
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * Get entries.
   *
   * @return entries entries
   */
  @Schema(description = "The access control entries.")
  public List<AccessControlEntry> getEntries() {
    if (entries == null) {
      entries = new ArrayList<>();
    }
    return entries;
  }

  /**
   * Sets entries.
   *
   * @param entries the entries
   */
  public void setEntries(List<AccessControlEntry> entries) {
    this.entries = entries;
  }


}

