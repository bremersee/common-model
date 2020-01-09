/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 */
@ApiModel(description = "Specifies permissions and who is granted.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
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
  @ApiModelProperty(value = "The owner is always granted and can only be changed by the owner.")
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
  @ApiModelProperty(value = "The access control entries.")
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

