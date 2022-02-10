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

package org.bremersee.converter;

import java.util.stream.Stream;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.core.convert.converter.Converter;

/**
 * The converters.
 *
 * @author Christian Bremer
 */
@SuppressWarnings("SameNameButDifferent")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class Converters {

  /**
   * Returns a stream with all converters of this package.
   *
   * @return the stream of converters
   */
  public static Stream<Converter<?, ?>> stream() {
    return Stream.of(
        new LocaleToStringConverter(),
        new StringToLocaleConverter(),
        new StringToMongoSearchLanguageConverter(),
        new StringToTimeZoneConverter(),
        new TimeZoneToStringConverter()
    );
  }

}
