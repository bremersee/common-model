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