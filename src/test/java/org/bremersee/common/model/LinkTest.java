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

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.InstanceOfAssertFactories;
import org.junit.jupiter.api.Test;

/**
 * The link test.
 *
 * @author Christian Bremer
 */
class LinkTest {

  /**
   * Json.
   *
   * @throws Exception the exception
   */
  @Test
  void json() throws Exception {
    ObjectMapper om = new ObjectMapper();
    Link actual = om.readValue("{\"href\": \"https://example.net\"}", Link.class);
    assertThat(actual)
        .isEqualTo(
            Link.builder()
                .href("https://example.net")
                .build())
        .extracting(Link::isBlank, InstanceOfAssertFactories.BOOLEAN)
        .isFalse();
  }

}