/*
 * Copyright 2020 the original author or authors.
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

import static java.util.Objects.nonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * The select options.
 *
 * @param <E> the select option type
 * @author Christian Bremer
 */
@SuppressWarnings("SameNameButDifferent")
@EqualsAndHashCode
@ToString
@Getter
public class SelectOptions<E extends SelectOption<?>> {

  private final List<E> options;

  /**
   * Instantiates new select options.
   *
   * @param options the options
   */
  @JsonCreator
  public SelectOptions(@JsonProperty("options") List<E> options) {
    this.options = nonNull(options) ? List.copyOf(options) : List.of();
  }

}
