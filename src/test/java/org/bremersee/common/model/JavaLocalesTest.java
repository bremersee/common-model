package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.Locale;
import org.junit.jupiter.api.Test;

/**
 * The java locales test.
 *
 * @author Christian Bremer
 */
class JavaLocalesTest {

  /**
   * Test java locales.
   */
  @Test
  void testJavaLocales() {
    JavaLocales model = new JavaLocales();
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new JavaLocales());
    assertTrue(model.toString().length() > 0);

    model = new JavaLocales(Collections.singleton(JavaLocale.fromLocale(Locale.JAPAN)));
    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(
        model,
        new JavaLocales(Collections.singleton(JavaLocale.fromLocale(Locale.JAPAN))));
    assertTrue(model.toString().contains(JavaLocale.fromLocale(Locale.JAPAN).toString()));
  }
}