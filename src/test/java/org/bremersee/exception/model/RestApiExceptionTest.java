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

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;

/**
 * The rest api exception test.
 *
 * @author Christian Bremer
 */
class RestApiExceptionTest {

  /**
   * Gets id.
   */
  @Test
  void getId() {
    RestApiException model = new RestApiException();
    model.setId("value");
    assertEquals("value", model.getId());

    model = RestApiException.builder().id("value").build();
    assertEquals("value", model.getId());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().id("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets timestamp.
   */
  @Test
  void getTimestamp() {
    OffsetDateTime value = OffsetDateTime.now();
    RestApiException model = new RestApiException();
    model.setTimestamp(value);
    assertEquals(value, model.getTimestamp());

    model = RestApiException.builder().timestamp(value).build();
    assertEquals(value, model.getTimestamp());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().timestamp(value).build());

    assertTrue(model.toString().contains(value.toString()));
  }

  /**
   * Gets message.
   */
  @Test
  void getMessage() {
    RestApiException model = new RestApiException();
    model.setMessage("value");
    assertEquals("value", model.getMessage());

    model = RestApiException.builder().message("value").build();
    assertEquals("value", model.getMessage());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().message("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets error code.
   */
  @Test
  void getErrorCode() {
    RestApiException model = new RestApiException();
    model.setErrorCode("value");
    assertEquals("value", model.getErrorCode());

    model = RestApiException.builder().errorCode("value").build();
    assertEquals("value", model.getErrorCode());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().errorCode("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets error code inherited.
   */
  @Test
  void getErrorCodeInherited() {
    Boolean value = Boolean.TRUE;
    RestApiException model = new RestApiException();

    model.setErrorCodeInherited(null);
    assertEquals(Boolean.FALSE, model.getErrorCodeInherited());

    model.setErrorCodeInherited(value);
    assertEquals(value, model.getErrorCodeInherited());

    model = RestApiException.builder().errorCodeInherited(value).build();
    assertEquals(value, model.getErrorCodeInherited());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().errorCodeInherited(value).build());

    assertTrue(model.toString().contains(value.toString()));
  }

  /**
   * Gets class name.
   */
  @Test
  void getClassName() {
    RestApiException model = new RestApiException();
    model.setClassName("value");
    assertEquals("value", model.getClassName());

    model = RestApiException.builder().className("value").build();
    assertEquals("value", model.getClassName());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().className("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets application.
   */
  @Test
  void getApplication() {
    RestApiException model = new RestApiException();
    model.setApplication("value");
    assertEquals("value", model.getApplication());

    model = RestApiException.builder().application("value").build();
    assertEquals("value", model.getApplication());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().application("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets path.
   */
  @Test
  void getPath() {
    RestApiException model = new RestApiException();
    model.setPath("value");
    assertEquals("value", model.getPath());

    model = RestApiException.builder().path("value").build();
    assertEquals("value", model.getPath());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().path("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets stack trace.
   */
  @Test
  void getStackTrace() {
    List<StackTraceItem> value = Collections.singletonList(StackTraceItem.builder()
        .fileName("filename")
        .lineNumber(123)
        .methodName("someMethod")
        .build());
    RestApiException model = new RestApiException();
    model.setStackTrace(value);
    assertEquals(value, model.getStackTrace());

    model = RestApiException.builder().stackTrace(value).build();
    assertEquals(value, model.getStackTrace());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().stackTrace(value).build());

    assertTrue(model.toString().contains(value.toString()));
  }

  /**
   * Gets cause.
   */
  @Test
  void getCause() {
    RestApiException value = RestApiException.builder()
        .id(UUID.randomUUID().toString())
        .application("test")
        .path("/api/somewhere")
        .message("value")
        .errorCode("1234")
        .errorCodeInherited(Boolean.FALSE)
        .build();
    RestApiException model = new RestApiException();
    model.setCause(value);
    assertEquals(value, model.getCause());

    model = RestApiException.builder().cause(value).build();
    assertEquals(value, model.getCause());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().cause(value).build());

    assertTrue(model.toString().contains(value.toString()));
  }

  /**
   * Gets handler.
   */
  @Test
  void getHandler() {
    Handler value = Handler.builder()
        .className("org.example.FooBar")
        .methodName("getFooBar")
        .build();
    RestApiException model = new RestApiException();
    model.setHandler(value);
    assertEquals(value, model.getHandler());

    model = RestApiException.builder().handler(value).build();
    assertEquals(value, model.getHandler());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().handler(value).build());

    assertTrue(model.toString().contains(value.toString()));
  }

}