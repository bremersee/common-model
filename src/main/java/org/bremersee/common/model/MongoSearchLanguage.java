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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Locale;
import org.springframework.util.StringUtils;

/**
 * Languages supported by MongoDB.
 *
 * @author Christian Bremer
 * @see <a href="https://docs.mongodb.com/manual/reference/text-search-languages/">Reference</a>
 */
public enum MongoSearchLanguage {

  /**
   * If you specify a language value of {@code none}, then the text search uses simple tokenization
   * with no list of stop words and no stemming.
   */
  NONE("none"),

  /**
   * Danish.
   */
  DA("da"),

  /**
   * German.
   */
  DE("de"),

  /**
   * English.
   */
  EN("en"),

  /**
   * Spanish.
   */
  ES("es"),

  /**
   * Finnish.
   */
  FI("fi"),

  /**
   * French.
   */
  FR("fr"),

  /**
   * Hungarian.
   */
  HU("hu"),

  /**
   * Italian.
   */
  IT("it"),

  /**
   * Dutch.
   */
  NL("nl"),

  /**
   * Norwegian.
   */
  NO("nb"), // normally "no", see https://jira.mongodb.org/browse/SERVER-14879

  /**
   * Portuguese.
   */
  PT("pt"),

  /**
   * Romanian.
   */
  RO("ro"),

  /**
   * Russian.
   */
  RU("ru"),

  /**
   * Swedish.
   */
  SV("sv"),

  /**
   * Turkish.
   */
  TR("tr");

  private String value;

  MongoSearchLanguage(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  /**
   * To locale.
   *
   * @return the locale
   */
  public Locale toLocale() {
    if (NONE == this) {
      return null;
    }
    return new Locale(name().toLowerCase());
  }

  /**
   * From two letter language code.
   *
   * @param text the text
   * @return the two letter language code
   */
  @JsonCreator
  public static MongoSearchLanguage fromValue(String text) {
    return fromValue(text, null);
  }

  /**
   * From two letter language code.
   *
   * @param text the text
   * @param fallback the fallback language
   * @return the two letter language code
   */
  public static MongoSearchLanguage fromValue(String text, MongoSearchLanguage fallback) {
    if (!StringUtils.hasText(text)) {
      return fallback;
    }
    if (NONE.value.equalsIgnoreCase(text)) {
      return NONE;
    }
    String source = text.substring(0, Math.min(text.length(), 2));
    for (MongoSearchLanguage b : MongoSearchLanguage.values()) {
      if (b.value.equalsIgnoreCase(source) || b.name().equalsIgnoreCase(source)) {
        return b;
      }
    }
    return fallback;
  }

  /**
   * From locale.
   *
   * @param locale the locale
   * @param fallback the fallback language
   * @return the two letter language code
   */
  public static MongoSearchLanguage fromLocale(Locale locale, MongoSearchLanguage fallback) {
    if (locale == null || !StringUtils.hasText(locale.getLanguage())) {
      return fallback;
    }
    return fromValue(locale.getLanguage(), fallback);
  }

}

