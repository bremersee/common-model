package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * The access control list test.
 *
 * @author Christian Bremer
 */
class AccessControlListTest {

  /**
   * Gets owner.
   */
  @Test
  void getOwner() {
    AccessControlList model = new AccessControlList();
    assertNull(model.getOwner());
    model.setOwner("value");
    assertEquals("value", model.getOwner());

    model = AccessControlList.builder().owner("value").build();
    assertEquals("value", model.getOwner());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().owner("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets entries.
   */
  @Test
  void getEntries() {
    AccessControlList model = new AccessControlList();
    assertNotNull(model.getEntries());
    assertTrue(model.getEntries().isEmpty());

    AccessControlEntry ace = AccessControlEntry.builder()
        .permission("read")
        .guest(Boolean.TRUE)
        .build();
    model.setEntries(Collections.singletonList(ace));
    assertEquals(ace, model.getEntries().get(0));

    model = AccessControlList.builder()
        .entries(Collections.singletonList(ace))
        .build();
    assertEquals(ace, model.getEntries().get(0));

    assertEquals(model, model.toBuilder().entries(Collections.singletonList(ace)).build());

    assertTrue(model.toString().contains(ace.toString()));
  }
}