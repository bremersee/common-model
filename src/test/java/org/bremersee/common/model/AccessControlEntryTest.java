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
import org.junit.jupiter.api.Test;

/**
 * The access control entry test.
 *
 * @author Christian Bremer
 */
class AccessControlEntryTest {

  /**
   * Gets permission.
   */
  @Test
  void getPermission() {
    assertThat(
        AccessControlEntry.builder()
            .permission("read")
            .build()
            .getPermission())
        .isEqualTo("read");
  }

  /**
   * Gets guest.
   */
  @Test
  void getGuest() {
    assertThat(
        AccessControlEntry.builder()
            .permission("write")
            .build()
            .isGuest())
        .isFalse();
  }

  /**
   * Gets users.
   */
  @Test
  void getUsers() {
    List<String> expected = List.of("a", "b", "c");
    assertThat(
        AccessControlEntry.builder()
            .permission("write")
            .users(expected)
            .build()
            .getUsers())
        .containsExactlyElementsOf(expected);
  }

  /**
   * Gets roles.
   */
  @Test
  void getRoles() {
    List<String> expected = List.of("a", "b", "c");
    assertThat(
        AccessControlEntry.builder()
            .permission("write")
            .roles(expected)
            .build()
            .getRoles())
        .containsExactlyElementsOf(expected);
  }

  /**
   * Gets groups.
   */
  @Test
  void getGroups() {
    List<String> expected = List.of("a", "b", "c");
    assertThat(
        AccessControlEntry.builder()
            .permission("write")
            .groups(expected)
            .build()
            .getGroups())
        .containsExactlyElementsOf(expected);
  }

}