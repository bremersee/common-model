package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * The java locale descriptions test.
 *
 * @author Christian Bremer
 */
class JavaLocaleDescriptionsTest {

  /**
   * Gets entries.
   */
  @Test
  void getEntries() {
    JavaLocaleDescriptions model = new JavaLocaleDescriptions(null);
    assertNotNull(model.getEntries());
    assertTrue(model.getEntries().isEmpty());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new JavaLocaleDescriptions(new ArrayList<>()));

    assertTrue(model.toString().length() > 0);

    JavaLocaleDescription value = JavaLocaleDescription.builder()
        .locale("de")
        .description("german")
        .build();
    model = new JavaLocaleDescriptions();
    model.setEntries(Collections.singletonList(value));
    assertEquals(model.getEntries().get(0), value);
    assertEquals(model, new JavaLocaleDescriptions(Collections.singletonList(value)));

    assertTrue(model.toString().contains(value.toString()));
  }
}