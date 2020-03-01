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