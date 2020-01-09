package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * The access control entry modifications test.
 *
 * @author Christian Bremer
 */
class AccessControlEntryModificationsTest {

  /**
   * Gets permission.
   */
  @Test
  void getPermission() {
    AccessControlEntryModifications ace = new AccessControlEntryModifications();
    ace.setPermission("read");
    assertEquals("read", ace.getPermission());

    ace = AccessControlEntryModifications.builder()
        .permission("write")
        .build();
    assertEquals("write", ace.getPermission());

    assertNotEquals(ace, null);
    assertNotEquals(ace, new Object());
    assertEquals(ace, ace);
    assertEquals(ace, ace.toBuilder().permission("write").build());

    assertTrue(ace.toString().contains("write"));
  }

  /**
   * Gets guest.
   */
  @Test
  void getGuest() {
    AccessControlEntryModifications ace = new AccessControlEntryModifications();
    ace.setGuest(Boolean.TRUE);
    assertEquals(Boolean.TRUE, ace.getGuest());
    ace.setGuest(Boolean.FALSE);
    assertEquals(Boolean.FALSE, ace.getGuest());
    ace.setGuest(null);
    assertEquals(Boolean.FALSE, ace.getGuest());

    ace = AccessControlEntryModifications.builder()
        .guest(Boolean.TRUE)
        .build();
    assertEquals(Boolean.TRUE, ace.getGuest());

    assertEquals(ace, ace.toBuilder().guest(Boolean.TRUE).build());

    assertTrue(ace.toString().contains("true"));
  }

  /**
   * Gets add users.
   */
  @Test
  void getAddUsers() {
    AccessControlEntryModifications ace = new AccessControlEntryModifications();
    assertNull(ace.getAddUsers());
    ace.setAddUsers(Collections.singletonList("value"));
    assertNotNull(ace.getAddUsers());
    assertFalse(ace.getAddUsers().isEmpty());
    assertEquals("value", ace.getAddUsers().get(0));

    ace = AccessControlEntryModifications.builder()
        .addUsers(Collections.singletonList("value"))
        .build();
    assertNotNull(ace.getAddUsers());
    assertFalse(ace.getAddUsers().isEmpty());
    assertEquals("value", ace.getAddUsers().get(0));

    assertEquals(
        ace,
        ace.toBuilder().addUsers(Collections.singletonList("value")).build());

    assertTrue(ace.toString().contains("value"));
  }

  /**
   * Gets remove users.
   */
  @Test
  void getRemoveUsers() {
    AccessControlEntryModifications ace = new AccessControlEntryModifications();
    assertNull(ace.getRemoveUsers());
    ace.setRemoveUsers(Collections.singletonList("value"));
    assertNotNull(ace.getRemoveUsers());
    assertFalse(ace.getRemoveUsers().isEmpty());
    assertEquals("value", ace.getRemoveUsers().get(0));

    ace = AccessControlEntryModifications.builder()
        .removeUsers(Collections.singletonList("value"))
        .build();
    assertNotNull(ace.getRemoveUsers());
    assertFalse(ace.getRemoveUsers().isEmpty());
    assertEquals("value", ace.getRemoveUsers().get(0));

    assertEquals(
        ace,
        ace.toBuilder().removeUsers(Collections.singletonList("value")).build());

    assertTrue(ace.toString().contains("value"));
  }

  /**
   * Gets add roles.
   */
  @Test
  void getAddRoles() {
    AccessControlEntryModifications ace = new AccessControlEntryModifications();
    assertNull(ace.getAddRoles());
    ace.setAddRoles(Collections.singletonList("value"));
    assertNotNull(ace.getAddRoles());
    assertFalse(ace.getAddRoles().isEmpty());
    assertEquals("value", ace.getAddRoles().get(0));

    ace = AccessControlEntryModifications.builder()
        .addRoles(Collections.singletonList("value"))
        .build();
    assertNotNull(ace.getAddRoles());
    assertFalse(ace.getAddRoles().isEmpty());
    assertEquals("value", ace.getAddRoles().get(0));

    assertEquals(
        ace,
        ace.toBuilder().addRoles(Collections.singletonList("value")).build());

    assertTrue(ace.toString().contains("value"));
  }

  /**
   * Gets remove roles.
   */
  @Test
  void getRemoveRoles() {
    AccessControlEntryModifications ace = new AccessControlEntryModifications();
    assertNull(ace.getRemoveRoles());
    ace.setRemoveRoles(Collections.singletonList("value"));
    assertNotNull(ace.getRemoveRoles());
    assertFalse(ace.getRemoveRoles().isEmpty());
    assertEquals("value", ace.getRemoveRoles().get(0));

    ace = AccessControlEntryModifications.builder()
        .removeRoles(Collections.singletonList("value"))
        .build();
    assertNotNull(ace.getRemoveRoles());
    assertFalse(ace.getRemoveRoles().isEmpty());
    assertEquals("value", ace.getRemoveRoles().get(0));

    assertEquals(
        ace,
        ace.toBuilder().removeRoles(Collections.singletonList("value")).build());

    assertTrue(ace.toString().contains("value"));
  }

  /**
   * Gets add groups.
   */
  @Test
  void getAddGroups() {
    AccessControlEntryModifications ace = new AccessControlEntryModifications();
    assertNull(ace.getAddGroups());
    ace.setAddGroups(Collections.singletonList("value"));
    assertNotNull(ace.getAddGroups());
    assertFalse(ace.getAddGroups().isEmpty());
    assertEquals("value", ace.getAddGroups().get(0));

    ace = AccessControlEntryModifications.builder()
        .addGroups(Collections.singletonList("value"))
        .build();
    assertNotNull(ace.getAddGroups());
    assertFalse(ace.getAddGroups().isEmpty());
    assertEquals("value", ace.getAddGroups().get(0));

    assertEquals(
        ace,
        ace.toBuilder().addGroups(Collections.singletonList("value")).build());

    assertTrue(ace.toString().contains("value"));
  }

  /**
   * Gets remove groups.
   */
  @Test
  void getRemoveGroups() {
    AccessControlEntryModifications ace = new AccessControlEntryModifications();
    assertNull(ace.getRemoveGroups());
    ace.setRemoveGroups(Collections.singletonList("value"));
    assertNotNull(ace.getRemoveGroups());
    assertFalse(ace.getRemoveGroups().isEmpty());
    assertEquals("value", ace.getRemoveGroups().get(0));

    ace = AccessControlEntryModifications.builder()
        .removeGroups(Collections.singletonList("value"))
        .build();
    assertNotNull(ace.getRemoveGroups());
    assertFalse(ace.getRemoveGroups().isEmpty());
    assertEquals("value", ace.getRemoveGroups().get(0));

    assertEquals(
        ace,
        ace.toBuilder().removeGroups(Collections.singletonList("value")).build());

    assertTrue(ace.toString().contains("value"));
  }
}