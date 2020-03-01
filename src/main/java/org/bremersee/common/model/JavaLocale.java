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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * Java locale model.
 *
 * @author Christian Bremer
 */
@Schema(description = "A locale representation.")
@EqualsAndHashCode
@NoArgsConstructor
public class JavaLocale implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonIgnore
  private String language;

  @JsonIgnore
  private String country;

  /**
   * Instantiates a new java locale.
   *
   * @param value the value
   */
  protected JavaLocale(String value) {
    if (value == null || value.trim().length() < 2) {
      setLanguage(null);
      setCountry(null);
    } else {
      String source = value.trim().replace("-", "_");
      String[] parts = source.split(Pattern.quote("_"));
      setLanguage(parts[0]);
      if (parts.length > 1) {
        setCountry(parts[1]);
      }
    }
  }

  /**
   * Instantiates a new java locale.
   *
   * @param language the language
   * @param country the country
   */
  @Builder(toBuilder = true)
  public JavaLocale(String language, String country) {
    setLanguage(language);
    setCountry(country);
  }

  /**
   * Instantiates a new java locale.
   *
   * @param language the language
   * @param country the country
   */
  public JavaLocale(TwoLetterLanguageCode language, TwoLetterCountryCode country) {
    this.language = language != null ? language.toString() : null;
    this.country = country != null ? country.toString() : null;
  }

  /**
   * Instantiates a new java locale.
   *
   * @param language the language
   * @param country the country
   */
  public JavaLocale(ThreeLetterLanguageCode language, ThreeLetterCountryCode country) {
    this.language = language != null ? language.toLocale().getLanguage() : null;
    this.country = country != null ? country.toLocale().getCountry() : null;
  }

  /**
   * Gets language.
   *
   * @return the language
   */
  @Schema(description = "The two letter language code.", example = "de")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  /**
   * Sets language.
   *
   * @param language the language
   */
  @JsonProperty("language")
  public void setLanguage(String language) {
    if (StringUtils.hasText(language)) {
      for (Locale l : Locale.getAvailableLocales()) {
        try {
          if (l.getLanguage().equalsIgnoreCase(language)
              || (l.getISO3Language() != null && l.getISO3Language().equalsIgnoreCase(language))) {
            this.language = l.getLanguage();
            return;
          }
        } catch (MissingResourceException ignored) {
          // ignored
        }
      }
      if (Arrays.stream(Locale.getISOLanguages()).anyMatch(iso -> iso.equalsIgnoreCase(language))) {
        this.language = language.toLowerCase();
        return;
      }
    }
    this.language = null;
  }

  /**
   * Gets country.
   *
   * @return the country
   */
  @Schema(description = "The two letter country code.", example = "DE")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  /**
   * Sets country.
   *
   * @param country the country
   */
  @JsonProperty("country")
  public void setCountry(String country) {
    if (StringUtils.hasText(country)) {
      for (Locale l : Locale.getAvailableLocales()) {
        try {
          if (l.getCountry().equalsIgnoreCase(country)
              || (l.getISO3Country() != null && l.getISO3Country().equalsIgnoreCase(country))) {
            this.country = l.getCountry();
            return;
          }
        } catch (MissingResourceException ignored) {
          // ignored
        }
      }
      if (Arrays.stream(Locale.getISOCountries()).anyMatch(iso -> iso.equalsIgnoreCase(country))) {
        this.country = country.toUpperCase();
        return;
      }
    }
    this.country = null;
  }

  @Override
  public String toString() {
    return toString(Separator.HYPHEN);
  }

  /**
   * To string with separator.
   *
   * @param separator the separator
   * @return the locale string
   */
  public String toString(Separator separator) {
    StringBuilder sb = new StringBuilder();
    if (StringUtils.hasText(getLanguage())) {
      sb.append(getLanguage());
      if (StringUtils.hasText(getCountry())) {
        sb.append(Separator.fromNullable(separator).toString());
        sb.append(getCountry());
      }
    }
    return sb.toString();
  }

  /**
   * To locale.
   *
   * @return the locale
   */
  public Locale toLocale() {
    return toLocale(null);
  }

  /**
   * To locale.
   *
   * @param defaultLocale the default locale
   * @return the locale
   */
  public Locale toLocale(Locale defaultLocale) {
    if (!StringUtils.hasText(getLanguage()) && !StringUtils.hasText(getCountry())) {
      return defaultLocale;
    }
    String language = getLanguage() == null ? "" : getLanguage();
    String country = getCountry() == null ? "" : getCountry();
    return new Locale(language, country);
  }

  /**
   * From value.
   *
   * @param value the value
   * @return the java locale
   */
  public static JavaLocale fromValue(String value) {
    return new JavaLocale(value);
  }

  /**
   * From locale.
   *
   * @param locale the locale
   * @return the java locale
   */
  public static JavaLocale fromLocale(Locale locale) {
    return locale == null ? null : fromValue(locale.toString());
  }

  /**
   * The enum Separator.
   */
  public enum Separator {

    /**
     * Hyphen separator ({@literal -}).
     */
    HYPHEN("-"),

    /**
     * Underscore separator ({@literal _}).
     */
    UNDERSCORE("_");

    private String value;

    Separator(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return value;
    }

    /**
     * From nullable separator.
     *
     * @param separator the separator
     * @return the separator
     */
    public static Separator fromNullable(Separator separator) {
      return separator == null ? HYPHEN : separator;
    }
  }

}

