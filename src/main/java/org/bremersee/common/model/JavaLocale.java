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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Locale;
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
@ApiModel(description = "A locale representation.")
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
    setLanguage(value);
    if (value != null) {
      String source = value.trim().replace("-", "_");
      String[] parts = source.split(Pattern.quote("_"));
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
  @ApiModelProperty("The two letter language code.")
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
    final TwoLetterLanguageCode code = TwoLetterLanguageCode.fromValue(language);
    this.language = code != null ? code.toString() : null;
  }

  /**
   * Gets country.
   *
   * @return the country
   */
  @ApiModelProperty("The two letter country code.")
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
    final TwoLetterCountryCode code = TwoLetterCountryCode.fromValue(country);
    this.country = code != null ? code.toString() : null;
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

