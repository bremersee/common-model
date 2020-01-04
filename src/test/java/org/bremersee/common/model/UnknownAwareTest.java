/*
 * Copyright 2018 the original author or authors.
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

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test unknown aware class.
 *
 * @author Christian Bremer
 */
public class UnknownAwareTest {

  @Test
  public void findFromRoot() {
    final ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", "expected");
    Optional<String> actual = unknown.findUnknown("$.test", String.class);
    Assert.assertTrue(actual.isPresent());
    Assert.assertEquals("expected", actual.get());
  }

  @Test
  public void findNotFromRoot() {
    final ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", "expected");
    Optional<String> actual = unknown.findUnknown("$.foo", String.class);
    Assert.assertFalse(actual.isPresent());
  }

  @Test
  public void findNotFromRootClassCastException() {
    final ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", "expected");
    Optional<Integer> actual = unknown.findUnknown("$.test", Integer.class);
    Assert.assertFalse(actual.isPresent());
  }

  @Test
  public void findMapFromRoot() {
    final Map<String, Object> expected = new LinkedHashMap<>();
    expected.put("sub", "expected");

    final ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", expected);

    Optional<Map<String, Object>> actualMap = unknown.findUnknownMap("$.test");
    Assert.assertTrue(actualMap.isPresent());
    Assert.assertEquals(expected, actualMap.get());
    Assert.assertEquals("expected", actualMap.get().get("sub"));

    Optional<String> actual = unknown.findUnknown("$.test.sub", String.class);
    Assert.assertTrue(actual.isPresent());
    Assert.assertEquals("expected", actual.get());

    Assert.assertFalse(unknown.findUnknown("$.test.foo", Map.class).isPresent());
    Assert.assertFalse(unknown.findUnknown("$.test.sub.foo", Map.class).isPresent());

    Assert.assertFalse(unknown.findUnknown("$.test", String.class).isPresent());
  }

  @Test
  public void findListFromRoot() {
    final List<String> expected = Arrays.asList("one", "two");

    final ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", expected);

    Optional<List<String>> actualList = unknown.findUnknownList("$.test", String.class);
    Assert.assertTrue(actualList.isPresent());
    Assert.assertEquals(expected, actualList.get());
    Assert.assertEquals("one", actualList.get().get(0));
    Assert.assertEquals("two", actualList.get().get(1));
  }

  @Test(expected = ClassCastException.class)
  public void findBadListFromRoot() {
    final List<String> expected = Arrays.asList("one", "two");

    final ConcreteUnknown unknown = new ConcreteUnknown();
    unknown.unknown("test", expected);

    Optional<List<Integer>> actualList = unknown.findUnknownList("$.test", Integer.class);
    Assert.assertTrue(actualList.isPresent());
    System.out.println(actualList.get().get(0).getClass().getName());
  }

  private static class ConcreteUnknown extends UnknownAware {

  }

}