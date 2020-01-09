package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * The access control list modifications test.
 *
 * @author Christian Bremer
 */
class AccessControlListModificationsTest {

  /**
   * Gets new new owner.
   */
  @Test
  void getNewNewOwner() {
    AccessControlListModifications model = new AccessControlListModifications();
    assertNull(model.getNewOwner());
    model.setNewOwner("value");
    assertEquals("value", model.getNewOwner());

    model = AccessControlListModifications.builder().newOwner("value").build();
    assertEquals("value", model.getNewOwner());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().newOwner("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets entries.
   */
  @Test
  void getEntries() {
    AccessControlListModifications model = new AccessControlListModifications();
    assertNotNull(model.getEntries());
    assertTrue(model.getEntries().isEmpty());

    AccessControlEntryModifications ace = AccessControlEntryModifications.builder()
        .permission("read")
        .guest(Boolean.TRUE)
        .build();
    model.setEntries(Collections.singletonList(ace));
    assertEquals(ace, model.getEntries().get(0));

    model = AccessControlListModifications.builder()
        .entries(Collections.singletonList(ace))
        .build();
    assertEquals(ace, model.getEntries().get(0));

    assertEquals(model, model.toBuilder().entries(Collections.singletonList(ace)).build());

    assertTrue(model.toString().contains(ace.toString()));
  }
}