package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * The phone number test.
 *
 * @author Christian Bremer
 */
class PhoneNumberTest {

  /**
   * Gets value.
   */
  @Test
  void getValue() {
    PhoneNumber model = new PhoneNumber();
    model.setValue("value");
    assertEquals("value", model.getValue());

    model = PhoneNumber.builder().value("value").build();
    assertEquals("value", model.getValue());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().value("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets category.
   */
  @Test
  void getCategory() {
    PhoneNumber model = new PhoneNumber();
    model.setCategory("value");
    assertEquals("value", model.getCategory());

    model = PhoneNumber.builder().category("value").build();
    assertEquals("value", model.getCategory());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().category("value").build());

    assertTrue(model.toString().contains("value"));
  }
}