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

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * The line string test.
 *
 * @author Christian Bremer
 */
@ExtendWith(SoftAssertionsExtension.class)
class LineStringTest {

  /**
   * Gets coordinates.
   *
   * @param softly the soft assertions
   */
  @Test
  void getCoordinates(SoftAssertions softly) {
    List<Position> value = Arrays.asList(
        new Position(BigDecimal.ZERO, BigDecimal.ZERO),
        new Position(BigDecimal.ONE, BigDecimal.ONE));
    LineString model = new LineString();
    model.setCoordinates(value);
    softly.assertThat(model.getCoordinates()).isEqualTo(value);

    model = LineString.builder().coordinates(value).build();
    softly.assertThat(model.getCoordinates()).isEqualTo(value);

    softly.assertThat(model.toBuilder().coordinates(value).build()).isEqualTo(model);

    softly.assertThat(model).isNotEqualTo(null);
    softly.assertThat(model).isNotEqualTo(new Object());
    softly.assertThat(model).isEqualTo(model);

    softly.assertThat(model.toString()).contains(value.toString());
  }

  /**
   * Gets type.
   */
  @Test
  void getType() {
    LineString model = new LineString();
    assertThat(model.getType().toString()).isEqualTo("LineString");
  }

  /**
   * Gets bbox.
   *
   * @param softly the soft assertions
   */
  @Test
  void getBbox(SoftAssertions softly) {
    BoundingBox value = new BoundingBox(
        Arrays.asList(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.ONE));
    LineString model = new LineString();
    model.setBbox(value);
    softly.assertThat(model.getBbox()).isEqualTo(value);

    model = LineString.builder().bbox(value).build();
    softly.assertThat(model.getBbox()).isEqualTo(value);

    softly.assertThat(model.toBuilder().bbox(value).build()).isEqualTo(model);
    softly.assertThat(new LineString(value, null)).isEqualTo(model);
  }

}