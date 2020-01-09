package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * The java locale description test.
 *
 * @author Christian Bremer
 */
class JavaLocaleDescriptionTest {

  /**
   * Gets locale.
   */
  @Test
  void getLocale() {
    JavaLocaleDescription model = new JavaLocaleDescription();
    model.setLocale("value");
    assertEquals("value", model.getLocale());

    model = JavaLocaleDescription.builder().locale("value").build();
    assertEquals("value", model.getLocale());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().locale("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets description.
   */
  @Test
  void getDescription() {
    JavaLocaleDescription model = new JavaLocaleDescription();
    model.setDescription("value");
    assertEquals("value", model.getDescription());

    model = JavaLocaleDescription.builder().description("value").build();
    assertEquals("value", model.getDescription());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().description("value").build());

    assertTrue(model.toString().contains("value"));
  }
}