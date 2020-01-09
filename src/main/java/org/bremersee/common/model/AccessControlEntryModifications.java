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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * Specifies modifications of an access control entry.
 */
@ApiModel(description = "Specifies modifications of an access control entry.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public class AccessControlEntryModifications implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty(value = "permission", required = true)
  private String permission;

  @JsonProperty("guest")
  private Boolean guest = Boolean.FALSE;

  @JsonProperty("addUsers")
  private List<String> addUsers;

  @JsonProperty("removeUsers")
  private List<String> removeUsers;

  @JsonProperty("addRoles")
  private List<String> addRoles;

  @JsonProperty("removeRoles")
  private List<String> removeRoles;

  @JsonProperty("addGroups")
  private List<String> addGroups;

  @JsonProperty("removeGroups")
  private List<String> removeGroups;

  /**
   * Instantiates new access control entry modifications.
   *
   * @param permission the permission
   * @param guest the guest
   * @param addUsers the add users
   * @param removeUsers the remove users
   * @param addRoles the add roles
   * @param removeRoles the remove roles
   * @param addGroups the add groups
   * @param removeGroups the remove groups
   */
  @Builder(toBuilder = true)
  public AccessControlEntryModifications(
      String permission,
      Boolean guest,
      List<String> addUsers,
      List<String> removeUsers,
      List<String> addRoles,
      List<String> removeRoles,
      List<String> addGroups,
      List<String> removeGroups) {

    this.permission = permission;
    this.guest = Boolean.TRUE.equals(guest);
    this.addUsers = addUsers;
    this.removeUsers = removeUsers;
    this.addRoles = addRoles;
    this.removeRoles = removeRoles;
    this.addGroups = addGroups;
    this.removeGroups = removeGroups;
  }

  /**
   * Specifies the permission.
   *
   * @return permission permission
   */
  @ApiModelProperty(required = true, value = "Specifies the permission.")
  @NotNull
  @Pattern(regexp = "^[a-z_]+$")
  public String getPermission() {
    return permission;
  }

  /**
   * Sets permission.
   *
   * @param permission the permission
   */
  public void setPermission(String permission) {
    this.permission = permission;
  }

  /**
   * Specifies whether anybody is granted.
   *
   * @return guest guest
   */
  @ApiModelProperty(value = "Specifies whether anybody is granted.")
  public Boolean getGuest() {
    return guest;
  }

  /**
   * Sets guest.
   *
   * @param guest the guest
   */
  public void setGuest(Boolean guest) {
    this.guest = Boolean.TRUE.equals(guest);
  }

  /**
   * Users to be added.
   *
   * @return addUsers add users
   */
  @ApiModelProperty(value = "Users to be added.")
  public List<String> getAddUsers() {
    return addUsers;
  }

  /**
   * Sets add users.
   *
   * @param addUsers the add users
   */
  public void setAddUsers(List<String> addUsers) {
    this.addUsers = addUsers;
  }

  /**
   * Users to be removed.
   *
   * @return removeUsers remove users
   */
  @ApiModelProperty(value = "Users to be removed.")
  public List<String> getRemoveUsers() {
    return removeUsers;
  }

  /**
   * Sets remove users.
   *
   * @param removeUsers the remove users
   */
  public void setRemoveUsers(List<String> removeUsers) {
    this.removeUsers = removeUsers;
  }

  /**
   * Roles to be added.
   *
   * @return addRoles add roles
   */
  @ApiModelProperty(value = "Roles to be added.")
  public List<String> getAddRoles() {
    return addRoles;
  }

  /**
   * Sets add roles.
   *
   * @param addRoles the add roles
   */
  public void setAddRoles(List<String> addRoles) {
    this.addRoles = addRoles;
  }

  /**
   * Roles to be removed.
   *
   * @return removeRoles remove roles
   */
  @ApiModelProperty(value = "Roles to be removed.")
  public List<String> getRemoveRoles() {
    return removeRoles;
  }

  /**
   * Sets remove roles.
   *
   * @param removeRoles the remove roles
   */
  public void setRemoveRoles(List<String> removeRoles) {
    this.removeRoles = removeRoles;
  }

  /**
   * Groups to be added.
   *
   * @return addGroups add groups
   */
  @ApiModelProperty(value = "Groups to be added.")
  public List<String> getAddGroups() {
    return addGroups;
  }

  /**
   * Sets add groups.
   *
   * @param addGroups the add groups
   */
  public void setAddGroups(List<String> addGroups) {
    this.addGroups = addGroups;
  }

  /**
   * Groups to be removed.
   *
   * @return removeGroups remove groups
   */
  @ApiModelProperty(value = "Groups to be removed.")
  public List<String> getRemoveGroups() {
    return removeGroups;
  }

  /**
   * Sets remove groups.
   *
   * @param removeGroups the remove groups
   */
  public void setRemoveGroups(List<String> removeGroups) {
    this.removeGroups = removeGroups;
  }

}

