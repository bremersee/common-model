package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * The link test.
 *
 * @author Christian Bremer
 */
class LinkTest {

  /**
   * Gets href.
   */
  @Test
  void getHref() {
    Link model = new Link();
    model.setHref("value");
    assertEquals("value", model.getHref());

    model = Link.builder().href("value").build();
    assertEquals("value", model.getHref());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().href("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets type.
   */
  @Test
  void getType() {
    Link model = new Link();
    model.setType("value");
    assertEquals("value", model.getType());

    model = Link.builder().type("value").build();
    assertEquals("value", model.getType());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().type("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets text.
   */
  @Test
  void getText() {
    Link model = new Link();
    model.setText("value");
    assertEquals("value", model.getText());

    model = Link.builder().text("value").build();
    assertEquals("value", model.getText());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().text("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets description.
   */
  @Test
  void getDescription() {
    Link model = new Link();
    model.setDescription("value");
    assertEquals("value", model.getDescription());

    model = Link.builder().description("value").build();
    assertEquals("value", model.getDescription());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().description("value").build());

    assertTrue(model.toString().contains("value"));
  }
}