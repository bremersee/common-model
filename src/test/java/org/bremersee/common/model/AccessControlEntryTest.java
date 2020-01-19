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

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
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
    AccessControlEntry ace = new AccessControlEntry();
    ace.setPermission("read");
    assertEquals("read", ace.getPermission());

    ace = AccessControlEntry.builder()
        .permission("write")
        .build();
    assertEquals("write", ace.getPermission());

    assertNotEquals(ace, null);
    assertNotEquals(ace, new Object());
    assertEquals(ace, ace);
    assertEquals(ace, AccessControlEntry.builder().permission("write").build());

    assertTrue(ace.toString().contains("write"));
  }

  /**
   * Gets guest.
   */
  @Test
  void getGuest() {
    AccessControlEntry ace = new AccessControlEntry();
    ace.setGuest(Boolean.TRUE);
    assertEquals(Boolean.TRUE, ace.getGuest());
    ace.setGuest(Boolean.FALSE);
    assertEquals(Boolean.FALSE, ace.getGuest());
    ace.setGuest(null);
    assertEquals(Boolean.FALSE, ace.getGuest());

    ace = AccessControlEntry.builder()
        .guest(Boolean.TRUE)
        .build();
    assertEquals(Boolean.TRUE, ace.getGuest());

    assertEquals(ace, AccessControlEntry.builder().guest(Boolean.TRUE).build());

    assertTrue(ace.toString().contains("true"));
  }

  /**
   * Gets users.
   */
  @Test
  void getUsers() {
    AccessControlEntry ace = new AccessControlEntry();
    assertNull(ace.getUsers());
    ace.setUsers(Collections.singletonList("anna"));
    assertNotNull(ace.getUsers());
    assertFalse(ace.getUsers().isEmpty());
    assertEquals("anna", ace.getUsers().get(0));

    ace = AccessControlEntry.builder()
        .users(Collections.singletonList("anna"))
        .build();
    assertNotNull(ace.getUsers());
    assertFalse(ace.getUsers().isEmpty());
    assertEquals("anna", ace.getUsers().get(0));

    assertEquals(
        ace,
        AccessControlEntry.builder().users(Collections.singletonList("anna")).build());

    assertTrue(ace.toString().contains("anna"));
  }

  /**
   * Gets roles.
   */
  @Test
  void getRoles() {
    AccessControlEntry ace = new AccessControlEntry();
    assertNull(ace.getRoles());
    ace.setRoles(Collections.singletonList("ROLE_USER"));
    assertNotNull(ace.getRoles());
    assertFalse(ace.getRoles().isEmpty());
    assertEquals("ROLE_USER", ace.getRoles().get(0));

    ace = AccessControlEntry.builder()
        .roles(Collections.singletonList("ROLE_USER"))
        .build();
    assertNotNull(ace.getRoles());
    assertFalse(ace.getRoles().isEmpty());
    assertEquals("ROLE_USER", ace.getRoles().get(0));

    assertEquals(
        ace,
        ace.toBuilder().roles(Collections.singletonList("ROLE_USER")).build());

    assertTrue(ace.toString().contains("ROLE_USER"));
  }

  /**
   * Gets groups.
   */
  @Test
  void getGroups() {
    AccessControlEntry ace = new AccessControlEntry();
    assertNull(ace.getGroups());
    ace.setGroups(Collections.singletonList("developers"));
    assertNotNull(ace.getGroups());
    assertFalse(ace.getGroups().isEmpty());
    assertEquals("developers", ace.getGroups().get(0));

    ace = AccessControlEntry.builder()
        .groups(Collections.singletonList("developers"))
        .build();
    assertNotNull(ace.getGroups());
    assertFalse(ace.getGroups().isEmpty());
    assertEquals("developers", ace.getGroups().get(0));

    assertEquals(
        ace,
        ace.toBuilder().groups(Collections.singletonList("developers")).build());

    assertTrue(ace.toString().contains("developers"));
  }

}