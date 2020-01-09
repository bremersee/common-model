/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.exception.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * The type Stack trace item test.
 *
 * @author Christian Bremer
 */
class StackTraceItemTest {

  /**
   * Gets declaring class.
   */
  @Test
  void getDeclaringClass() {
    String value = "value";
    StackTraceItem model = new StackTraceItem();
    model.setDeclaringClass(value);
    assertEquals(value, model.getDeclaringClass());

    model = StackTraceItem.builder().declaringClass(value).build();
    assertEquals(value, model.getDeclaringClass());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().declaringClass(value).build());

    assertTrue(model.toString().contains(value));
  }

  /**
   * Gets method name.
   */
  @Test
  void getMethodName() {
    String value = "value";
    StackTraceItem model = new StackTraceItem();
    model.setMethodName(value);
    assertEquals(value, model.getMethodName());

    model = StackTraceItem.builder().methodName(value).build();
    assertEquals(value, model.getMethodName());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().methodName(value).build());

    assertTrue(model.toString().contains(value));
  }

  /**
   * Gets file name.
   */
  @Test
  void getFileName() {
    String value = "value";
    StackTraceItem model = new StackTraceItem();
    model.setFileName(value);
    assertEquals(value, model.getFileName());

    model = StackTraceItem.builder().fileName(value).build();
    assertEquals(value, model.getFileName());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().fileName(value).build());

    assertTrue(model.toString().contains(value));
  }

  /**
   * Gets line number.
   */
  @Test
  void getLineNumber() {
    Integer value = 1234;
    StackTraceItem model = new StackTraceItem();
    model.setLineNumber(value);
    assertEquals(value, model.getLineNumber());

    model = StackTraceItem.builder().lineNumber(value).build();
    assertEquals(value, model.getLineNumber());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().lineNumber(value).build());

    assertTrue(model.toString().contains(value.toString()));
  }
}