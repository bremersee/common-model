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
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Specifies modifications of an access control list.
 *
 * @author Christian Bremer
 */
@Schema(description = "Specifies modifications of an access control list.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class AccessControlListModifications implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("newOwner")
  private String newOwner;

  @JsonProperty("entries")
  private List<AccessControlEntryModifications> entries;

  /**
   * Instantiates new access control list modifications.
   *
   * @param newOwner the new owner
   * @param entries the modification entries
   */
  @Builder(toBuilder = true)
  @SuppressWarnings("unused")
  public AccessControlListModifications(
      String newOwner,
      List<AccessControlEntryModifications> entries) {
    this.newOwner = newOwner;
    this.entries = entries;
  }

  /**
   * The owner is always granted and can only be changed by the owner.
   *
   * @return newOwner new owner
   */
  @Schema(description = "The owner is always granted and can only be changed by the owner.")
  public String getNewOwner() {
    return newOwner;
  }

  /**
   * Sets new owner.
   *
   * @param newOwner the new owner
   */
  public void setNewOwner(String newOwner) {
    this.newOwner = newOwner;
  }

  /**
   * Get modification entries.
   *
   * @return the modification entries
   */
  @Schema(description = "The access control entries.")
  public List<AccessControlEntryModifications> getEntries() {
    if (entries == null) {
      entries = new ArrayList<>();
    }
    return entries;
  }

  /**
   * Sets modification entries.
   *
   * @param entries the modification entries
   */
  public void setEntries(List<AccessControlEntryModifications> entries) {
    this.entries = entries;
  }

}

