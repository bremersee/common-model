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
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Specifies modifications of an access control list.
 */
@ApiModel(description = "Specifies modifications of an access control list.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
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
   * @param entries  the entries
   */
  @Builder
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
  @ApiModelProperty(value = "The owner is always granted and can only be changed by the owner.")
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
   * Get entries.
   *
   * @return entries entries
   */
  @ApiModelProperty(value = "The access control entries.")
  public List<AccessControlEntryModifications> getEntries() {
    return entries;
  }

  /**
   * Sets entries.
   *
   * @param entries the entries
   */
  public void setEntries(List<AccessControlEntryModifications> entries) {
    this.entries = entries;
  }

}

