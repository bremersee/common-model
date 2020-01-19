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