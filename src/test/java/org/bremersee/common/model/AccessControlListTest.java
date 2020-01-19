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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import org.junit.jupiter.api.Test;

/**
 * The access control list test.
 *
 * @author Christian Bremer
 */
class AccessControlListTest {

  /**
   * Gets owner.
   */
  @Test
  void getOwner() {
    AccessControlList model = new AccessControlList();
    assertNull(model.getOwner());
    model.setOwner("value");
    assertEquals("value", model.getOwner());

    model = AccessControlList.builder().owner("value").build();
    assertEquals("value", model.getOwner());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().owner("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets entries.
   */
  @Test
  void getEntries() {
    AccessControlList model = new AccessControlList();
    assertNotNull(model.getEntries());
    assertTrue(model.getEntries().isEmpty());

    AccessControlEntry ace = AccessControlEntry.builder()
        .permission("read")
        .guest(Boolean.TRUE)
        .build();
    model.setEntries(Collections.singletonList(ace));
    assertEquals(ace, model.getEntries().get(0));

    model = AccessControlList.builder()
        .entries(Collections.singletonList(ace))
        .build();
    assertEquals(ace, model.getEntries().get(0));

    assertEquals(model, model.toBuilder().entries(Collections.singletonList(ace)).build());

    assertTrue(model.toString().contains(ace.toString()));
  }
}