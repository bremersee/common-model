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
 * Specifies a permission and who is granted.
 */
@ApiModel(description = "Specifies a permission and who is granted.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings({"unused", "WeakerAccess"})
public class AccessControlEntry implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty(value = "permission", required = true)
  private String permission;

  @JsonProperty("guest")
  private Boolean guest = Boolean.FALSE;

  @JsonProperty("users")
  private List<String> users;

  @JsonProperty("roles")
  private List<String> roles;

  @JsonProperty("groups")
  private List<String> groups;

  /**
   * Instantiates a new access control entry.
   *
   * @param permission the permission
   * @param guest      the guest
   * @param users      the users
   * @param roles      the roles
   * @param groups     the groups
   */
  @Builder
  public AccessControlEntry(
      String permission,
      Boolean guest,
      List<String> users,
      List<String> roles,
      List<String> groups) {
    setPermission(permission);
    setGuest(guest);
    setUsers(users);
    setRoles(roles);
    setGroups(groups);
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
   * @return guest boolean
   */
  @ApiModelProperty(value = "Specifies whether anybody is granted.")
  public Boolean getGuest() {
    if (guest == null) {
      guest = Boolean.FALSE;
    }
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
   * Specifies the granted users.
   *
   * @return users users
   */
  @ApiModelProperty(value = "Specifies the granted users.")
  public List<String> getUsers() {
    return users;
  }

  /**
   * Sets users.
   *
   * @param users the users
   */
  public void setUsers(List<String> users) {
    this.users = users;
  }

  /**
   * Specifies the granted roles.
   *
   * @return roles roles
   */
  @ApiModelProperty(value = "Specifies the granted roles.")
  public List<String> getRoles() {
    return roles;
  }

  /**
   * Sets roles.
   *
   * @param roles the roles
   */
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  /**
   * Specifies the granted groups.
   *
   * @return groups groups
   */
  @ApiModelProperty(value = "Specifies the granted groups.")
  public List<String> getGroups() {
    return groups;
  }

  /**
   * Sets groups.
   *
   * @param groups the groups
   */
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

}

