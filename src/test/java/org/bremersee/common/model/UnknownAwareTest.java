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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.Test;

/**
 * Test unknown aware class.
 *
 * @author Christian Bremer
 */
class UnknownAwareTest {

  /**
   * Test model.
   */
  @Test
  void testModel() {
    ConcreteUnknown model = new ConcreteUnknown();
    assertNull(model.unknown());
    assertFalse(model.hasUnknown());
    assertFalse(model.findUnknown("something", Object.class).isPresent());
    assertFalse(model.findUnknownList("something", Object.class).isPresent());
    assertFalse(model.findUnknownMap("something").isPresent());

    assertTrue(model.toString().length() > 0);

    model.unknown(null);
    assertNull(model.unknown());
    assertFalse(model.hasUnknown());

    model.unknown(Collections.emptyMap());
    assertNull(model.unknown());
    assertFalse(model.hasUnknown());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, new ConcreteUnknown());

    model.unknown(Collections.singletonMap("something", "value"));
    assertNotNull(model.unknown());
    assertTrue(model.hasUnknown());

    model = new ConcreteUnknown();
    model.unknown(null, "value");
    assertNull(model.unknown());
    assertFalse(model.hasUnknown());

    model.unknown("", "value");
    assertNull(model.unknown());
    assertFalse(model.hasUnknown());

    model.unknown("something", "value");
    assertNotNull(model.unknown());
    assertTrue(model.hasUnknown());

    assertEquals(model, new ConcreteUnknown(Collections.singletonMap("something", "value")));

    assertTrue(model.toString().contains("something"));
  }

  /**
   * Find from root.
   */
  @Test
  void findFromRoot() {
    ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", "expected");
    Optional<String> actual = unknown.findUnknown("$.test", String.class);
    assertTrue(actual.isPresent());
    assertEquals("expected", actual.get());
  }

  /**
   * Find not from root.
   */
  @Test
  void findNotFromRoot() {
    ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", "expected");
    Optional<String> actual = unknown.findUnknown("$.foo", String.class);
    assertFalse(actual.isPresent());
  }

  /**
   * Find not from root class cast exception.
   */
  @Test
  void findNotFromRootClassCastException() {
    ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", "expected");
    Optional<Integer> actual = unknown.findUnknown("$.test", Integer.class);
    assertFalse(actual.isPresent());
  }

  /**
   * Find map from root.
   */
  @Test
  void findMapFromRoot() {
    Map<String, Object> expected = new LinkedHashMap<>();
    expected.put("sub", "expected");

    ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", expected);

    Optional<Map<String, Object>> actualMap = unknown.findUnknownMap("$.test");
    assertTrue(actualMap.isPresent());
    assertEquals(expected, actualMap.get());
    assertEquals("expected", actualMap.get().get("sub"));

    Optional<String> actual = unknown.findUnknown("$.test.sub", String.class);
    assertTrue(actual.isPresent());
    assertEquals("expected", actual.get());

    assertFalse(unknown.findUnknown("$.test.foo", Map.class).isPresent());
    assertFalse(unknown.findUnknown("$.test.sub.foo", Map.class).isPresent());

    assertFalse(unknown.findUnknown("$.test", String.class).isPresent());
  }

  /**
   * Find list from root.
   */
  @Test
  void findListFromRoot() {
    List<String> expected = Arrays.asList("one", "two");

    ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", expected);

    Optional<List<String>> actualList = unknown.findUnknownList("$.test", String.class);
    assertTrue(actualList.isPresent());
    assertEquals(expected, actualList.get());
    assertEquals("one", actualList.get().get(0));
    assertEquals("two", actualList.get().get(1));
  }

  /**
   * Find bad list from root.
   */
  @Test
  void findBadListFromRoot() {
    assertThrows(ClassCastException.class, () -> {
      List<String> expected = Arrays.asList("one", "two");

      ConcreteUnknown unknown = new ConcreteUnknown();
      unknown.unknown("test", expected);

      Optional<List<Integer>> actualList = unknown.findUnknownList("$.test", Integer.class);
      assertTrue(actualList.isPresent());
      System.out.println(actualList.get().get(0).getClass().getName());
    });
  }

  private static class ConcreteUnknown extends UnknownAware {

    /**
     * Instantiates a new Concrete unknown.
     */
    public ConcreteUnknown() {
    }

    /**
     * Instantiates a new Concrete unknown.
     *
     * @param unknown the unknown
     */
    public ConcreteUnknown(Map<String, Object> unknown) {
      super(unknown);
    }
  }

}
