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

package org.bremersee.geojson.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;

/**
 * The first two elements are longitude and latitude.
 *
 * @author Christian Bremer
 */
@SuppressWarnings("SameNameButDifferent")
@Schema(description = "The first two elements are longitude and latitude.")
@Validated
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Position extends ArrayList<BigDecimal> implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new empty (illegal) position.
   */
  public Position() {
    super(3);
  }

  /**
   * Instantiates a new position.
   *
   * @param x the x (aka longitude)
   * @param y the y (aka latitude)
   */
  public Position(BigDecimal x, BigDecimal y) {
    this(x, y, null);
  }

  /**
   * Instantiates a new position.
   *
   * @param x the x (aka longitude)
   * @param y the y (aka latitude)
   * @param z the z (the z coordinate)
   */
  public Position(BigDecimal x, BigDecimal y, BigDecimal z) {
    super(Objects.isNull(z) ? 2 : 3);
    Assert.notNull(x, "X (longitude) must not be null.");
    Assert.notNull(y, "Y (latitude) must not be null.");
    add(x);
    add(y);
    if (!Objects.isNull(z)) {
      add(z);
    }
  }

}

