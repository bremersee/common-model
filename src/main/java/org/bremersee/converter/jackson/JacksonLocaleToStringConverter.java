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

package org.bremersee.converter.jackson;

import com.fasterxml.jackson.databind.util.StdConverter;
import java.util.Locale;
import org.springframework.util.ObjectUtils;

/**
 * The jackson locale to string converter.
 *
 * @author Christian Bremer
 */
public class JacksonLocaleToStringConverter extends StdConverter<Locale, String> {

  @Override
  public String convert(Locale value) {
    return ObjectUtils.isEmpty(value) ? null : value.toLanguageTag();
  }
}