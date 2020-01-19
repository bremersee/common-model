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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;

/**
 * The time zone id test.
 *
 * @author Christian Bremer
 */
class TimeZoneIdTest {

  /**
   * To time zone.
   */
  @Test
  void toTimeZone() {
    TimeZoneId model = TimeZoneId.fromValue("Europe/Berlin");
    assertNotNull(model);
    TimeZone timeZone = model.toTimeZone();
    assertNotNull(timeZone);
    assertEquals("Europe/Berlin", timeZone.getID());
  }

  /**
   * To string url encoded.
   *
   * @throws UnsupportedEncodingException the unsupported encoding exception
   */
  @Test
  void toStringUrlEncoded() throws UnsupportedEncodingException {
    String expected = URLEncoder.encode("Europe/Berlin", StandardCharsets.UTF_8.name());
    String actual = TimeZoneId.EUROPE_BERLIN.toString(true);
    assertNotNull(actual);
    assertEquals(expected, actual);
  }

  /**
   * From value.
   *
   * @throws UnsupportedEncodingException the unsupported encoding exception
   */
  @Test
  void fromValue() throws UnsupportedEncodingException {
    TimeZoneId model = TimeZoneId.fromValue("Europe/Berlin");
    assertNotNull(model);
    assertEquals(TimeZoneId.EUROPE_BERLIN, model);
    assertEquals("Europe/Berlin", model.toString());

    model = TimeZoneId.fromValue(URLEncoder.encode("Europe/Berlin", StandardCharsets.UTF_8.name()));
    assertNotNull(model);
    assertEquals(TimeZoneId.EUROPE_BERLIN, model);
    assertEquals("Europe/Berlin", model.toString());

    model = TimeZoneId.fromValue("GMT");
    assertNotNull(model);
    assertEquals(TimeZoneId.GMT, model);
    assertEquals("GMT", model.toString());

    model = TimeZoneId.fromValue("Zulu");
    assertNotNull(model);
    assertEquals(TimeZoneId.ZULU, model);
    assertEquals("Zulu", model.toString());

    assertNull(TimeZoneId.fromValue(null));
    assertNull(TimeZoneId.fromValue(""));
  }

  /**
   * From time zone.
   */
  @Test
  void fromTimeZone() {
    TimeZoneId model = TimeZoneId.fromTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
    assertNotNull(model);
    assertEquals(TimeZone.getTimeZone("Europe/Berlin"), model.toTimeZone());

    assertNull(TimeZoneId.fromTimeZone(null));
  }
}