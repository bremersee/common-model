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