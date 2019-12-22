/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 */
@ApiModel(description = "A locale representation.")
@EqualsAndHashCode
@NoArgsConstructor
@SuppressWarnings({"WeakerAccess", "unused"})
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
  @SuppressWarnings("WeakerAccess")
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
   * @param country  the country
   */
  @Builder
  public JavaLocale(String language, String country) {
    setLanguage(language);
    setCountry(country);
  }

  /**
   * Instantiates a new java locale.
   *
   * @param language the language
   * @param country  the country
   */
  public JavaLocale(TwoLetterLanguageCode language, TwoLetterCountryCode country) {
    this.language = language != null ? language.toString() : null;
    this.country = country != null ? country.toString() : null;
  }

  /**
   * Instantiates a new java locale.
   *
   * @param language the language
   * @param country  the country
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
    JavaLocale javaLocale = new JavaLocale(value);
    if (StringUtils.hasText(javaLocale.getLanguage())
        || StringUtils.hasText(javaLocale.getCountry())) {
      return javaLocale;
    }
    return null;
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

