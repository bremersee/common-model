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

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * A list of ISO 3166-1 ALPHA-3 country codes.
 *
 * @author Christian Bremer
 */
@Schema(description = "A list of ISO 3166-1 ALPHA-3 country codes.")
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class ThreeLetterCountryCodes extends ArrayList<ThreeLetterCountryCode>
    implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new list of three letter country codes.
   *
   * @param countryCodes the country codes
   */
  public ThreeLetterCountryCodes(
      Collection<? extends ThreeLetterCountryCode> countryCodes) {
    super(countryCodes);
  }

}