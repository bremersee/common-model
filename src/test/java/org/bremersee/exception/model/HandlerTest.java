/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.exception.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * The handler test.
 *
 * @author Christian Bremer
 */
class HandlerTest {

  /**
   * Gets class name.
   */
  @Test
  void getClassName() {
    Handler model = new Handler();
    model.setClassName("value");
    assertEquals("value", model.getClassName());

    model = Handler.builder().className("value").build();
    assertEquals("value", model.getClassName());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().className("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets method name.
   */
  @Test
  void getMethodName() {
    Handler model = new Handler();
    model.setMethodName("value");
    assertEquals("value", model.getMethodName());

    model = Handler.builder().methodName("value").build();
    assertEquals("value", model.getMethodName());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().methodName("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets method parameter types.
   */
  @Test
  void getMethodParameterTypes() {
    List<String> value = Collections.singletonList("value");
    Handler model = new Handler();
    model.setMethodParameterTypes(value);
    assertEquals(value, model.getMethodParameterTypes());

    model = Handler.builder().methodParameterTypes(value).build();
    assertEquals(value, model.getMethodParameterTypes());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().methodParameterTypes(value).build());

    assertTrue(model.toString().contains("value"));
  }
}