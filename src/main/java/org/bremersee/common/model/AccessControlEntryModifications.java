/*
 * Copyright 2020 the original author or authors.
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

import static org.bremersee.common.model.AccessControlEntry.GUEST;
import static org.bremersee.common.model.AccessControlEntry.PERMISSION;
import static org.bremersee.common.model.AccessControlEntry.PERMISSION_PATTERN;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.immutables.value.Value;

/**
 * Specifies modifications of an access control entry.
 *
 * @author Christian Bremer
 */
@Value.Immutable
@Valid
@Schema(description = "Specifies modifications of an access control entry.")
@JsonDeserialize(builder = ImmutableAccessControlEntryModifications.Builder.class)
public interface AccessControlEntryModifications {

  /**
   * Creates new builder.
   *
   * @return the access control entry modifications builder
   */
  static ImmutableAccessControlEntryModifications.Builder builder() {
    return ImmutableAccessControlEntryModifications.builder();
  }

  /**
   * Creates new builder from the given access control entry.
   *
   * @param ace the access control entry
   * @return the access control entry modifications builder
   */
  static ImmutableAccessControlEntryModifications.Builder from(@NotNull AccessControlEntry ace) {
    return builder()
        .permission(ace.getPermission())
        .isGuest(ace.isGuest());
  }

  /**
   * Specifies the permission.
   *
   * @return the permission
   */
  @Schema(
      description = "Specifies the permission.",
      required = true,
      pattern = PERMISSION_PATTERN,
      example = "read")
  @JsonProperty(value = PERMISSION, required = true)
  @NotNull
  @Pattern(regexp = PERMISSION_PATTERN)
  String getPermission();

  /**
   * Specifies whether anybody is granted or not.
   *
   * @return whether anybody is granted (true) or not (false)
   */
  @Schema(description = "Specifies whether anybody is granted.", defaultValue = "false")
  @JsonProperty(value = GUEST, defaultValue = "false")
  @Value.Default
  default boolean isGuest() {
    return false;
  }

  /**
   * Users to be added.
   *
   * @return the users to add
   */
  @Schema(description = "Users to be added.")
  @Value.Default
  default List<String> getAddUsers() {
    return List.of();
  }

  /**
   * Users to be removed.
   *
   * @return the users to remove
   */
  @Schema(description = "Users to be removed.")
  @Value.Default
  default List<String> getRemoveUsers() {
    return List.of();
  }

  /**
   * Roles to be added.
   *
   * @return the roles to add
   */
  @Schema(description = "Roles to be added.")
  @Value.Default
  default List<String> getAddRoles() {
    return List.of();
  }

  /**
   * Roles to be removed.
   *
   * @return the roles to remove
   */
  @Schema(description = "Roles to be removed.")
  @Value.Default
  default List<String> getRemoveRoles() {
    return List.of();
  }

  /**
   * Groups to be added.
   *
   * @return the groups to add
   */
  @Schema(description = "Groups to be added.")
  @Value.Default
  default List<String> getAddGroups() {
    return List.of();
  }

  /**
   * Groups to be removed.
   *
   * @return the groups to remove
   */
  @Schema(description = "Groups to be removed.")
  @Value.Default
  default List<String> getRemoveGroups() {
    return List.of();
  }

}
