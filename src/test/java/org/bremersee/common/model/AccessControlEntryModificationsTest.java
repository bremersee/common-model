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

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * The access control entry modifications test.
 *
 * @author Christian Bremer
 */
@ExtendWith(SoftAssertionsExtension.class)
class AccessControlEntryModificationsTest {

  /**
   * Gets permission.
   *
   * @param softly the soft assertions
   */
  @Test
  void getPermission(SoftAssertions softly) {
    softly
        .assertThat(AccessControlEntryModifications.builder()
            .permission("read")
            .build()
            .getPermission())
        .isEqualTo("read");

    softly
        .assertThat(AccessControlEntryModifications
            .from(AccessControlEntry.builder()
                .permission("write")
                .build())
            .build()
            .getPermission())
        .isEqualTo("write");
  }

  /**
   * Gets guest.
   */
  @Test
  void getGuest() {
    assertThat(
        AccessControlEntryModifications
            .from(AccessControlEntry.builder()
                .permission("write")
                .build())
            .isGuest(true)
            .build()
            .isGuest())
        .isTrue();
  }

  /**
   * Gets add users.
   */
  @Test
  void getAddUsers() {
    List<String> expected = List.of("a", "b", "c");
    assertThat(
        AccessControlEntryModifications
            .from(AccessControlEntry.builder()
                .permission("write")
                .build())
            .addUsers(expected)
            .build()
            .getAddUsers())
        .containsExactlyElementsOf(expected);
  }

  /**
   * Gets remove users.
   */
  @Test
  void getRemoveUsers() {
    List<String> expected = List.of("a", "b", "c");
    assertThat(
        AccessControlEntryModifications
            .from(AccessControlEntry.builder()
                .permission("write")
                .build())
            .removeUsers(expected)
            .build()
            .getRemoveUsers())
        .containsExactlyElementsOf(expected);
  }

  /**
   * Gets add roles.
   */
  @Test
  void getAddRoles() {
    List<String> expected = List.of("a", "b", "c");
    assertThat(
        AccessControlEntryModifications
            .from(AccessControlEntry.builder()
                .permission("write")
                .build())
            .addRoles(expected)
            .build()
            .getAddRoles())
        .containsExactlyElementsOf(expected);
  }

  /**
   * Gets remove roles.
   */
  @Test
  void getRemoveRoles() {
    List<String> expected = List.of("a", "b", "c");
    assertThat(
        AccessControlEntryModifications
            .from(AccessControlEntry.builder()
                .permission("write")
                .build())
            .removeRoles(expected)
            .build()
            .getRemoveRoles())
        .containsExactlyElementsOf(expected);
  }

  /**
   * Gets add groups.
   */
  @Test
  void getAddGroups() {
    List<String> expected = List.of("a", "b", "c");
    assertThat(
        AccessControlEntryModifications
            .from(AccessControlEntry.builder()
                .permission("write")
                .build())
            .addGroups(expected)
            .build()
            .getAddGroups())
        .containsExactlyElementsOf(expected);
  }

  /**
   * Gets remove groups.
   */
  @Test
  void getRemoveGroups() {
    List<String> expected = List.of("a", "b", "c");
    assertThat(
        AccessControlEntryModifications
            .from(AccessControlEntry.builder()
                .permission("write")
                .build())
            .removeGroups(expected)
            .build()
            .getRemoveGroups())
        .containsExactlyElementsOf(expected);
  }
}