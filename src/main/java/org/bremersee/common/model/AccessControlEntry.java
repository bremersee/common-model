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
 *
 * @author Christian Bremer
 */
@Schema(description = "Specifies a permission and who is granted.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
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
   * @param guest the guest
   * @param users the users
   * @param roles the roles
   * @param groups the groups
   */
  @Builder(toBuilder = true)
  @SuppressWarnings("unused")
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
  @Schema(description = "Specifies the permission.", required = true, example = "read")
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
  @Schema(description = "Specifies whether anybody is granted.")
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
   * Specifies the granted users.
   *
   * @return users users
   */
  @Schema(description = "Specifies the granted users.")
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
  @Schema(description = "Specifies the granted roles.")
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
  @Schema(description = "Specifies the granted groups.")
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

