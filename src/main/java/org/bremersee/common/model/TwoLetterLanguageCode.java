/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.common.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.Locale;
import org.springframework.util.StringUtils;

/**
 * ISO 639-1 language codes from Java Locale.
 */
public enum TwoLetterLanguageCode {

  /**
   * Ar two letter language code.
   */
  AR("ar"),

  /**
   * Be two letter language code.
   */
  BE("be"),

  /**
   * Bg two letter language code.
   */
  BG("bg"),

  /**
   * Ca two letter language code.
   */
  CA("ca"),

  /**
   * Cs two letter language code.
   */
  CS("cs"),

  /**
   * Da two letter language code.
   */
  DA("da"),

  /**
   * De two letter language code.
   */
  DE("de"),

  /**
   * El two letter language code.
   */
  EL("el"),

  /**
   * En two letter language code.
   */
  EN("en"),

  /**
   * Es two letter language code.
   */
  ES("es"),

  /**
   * Et two letter language code.
   */
  ET("et"),

  /**
   * Fi two letter language code.
   */
  FI("fi"),

  /**
   * Fr two letter language code.
   */
  FR("fr"),

  /**
   * Ga two letter language code.
   */
  GA("ga"),

  /**
   * Hi two letter language code.
   */
  HI("hi"),

  /**
   * Hr two letter language code.
   */
  HR("hr"),

  /**
   * Hu two letter language code.
   */
  HU("hu"),

  /**
   * In two letter language code.
   */
  IN("in"),

  /**
   * Is two letter language code.
   */
  IS("is"),

  /**
   * It two letter language code.
   */
  IT("it"),

  /**
   * Iw two letter language code.
   */
  IW("iw"),

  /**
   * Ja two letter language code.
   */
  JA("ja"),

  /**
   * Ko two letter language code.
   */
  KO("ko"),

  /**
   * Lt two letter language code.
   */
  LT("lt"),

  /**
   * Lv two letter language code.
   */
  LV("lv"),

  /**
   * Mk two letter language code.
   */
  MK("mk"),

  /**
   * Ms two letter language code.
   */
  MS("ms"),

  /**
   * Mt two letter language code.
   */
  MT("mt"),

  /**
   * Nl two letter language code.
   */
  NL("nl"),

  /**
   * No two letter language code.
   */
  NO("no"),

  /**
   * Pl two letter language code.
   */
  PL("pl"),

  /**
   * Pt two letter language code.
   */
  PT("pt"),

  /**
   * Ro two letter language code.
   */
  RO("ro"),

  /**
   * Ru two letter language code.
   */
  RU("ru"),

  /**
   * Sk two letter language code.
   */
  SK("sk"),

  /**
   * Sl two letter language code.
   */
  SL("sl"),

  /**
   * Sq two letter language code.
   */
  SQ("sq"),

  /**
   * Sr two letter language code.
   */
  SR("sr"),

  /**
   * Sv two letter language code.
   */
  SV("sv"),

  /**
   * Th two letter language code.
   */
  TH("th"),

  /**
   * Tr two letter language code.
   */
  TR("tr"),

  /**
   * Uk two letter language code.
   */
  UK("uk"),

  /**
   * Vi two letter language code.
   */
  VI("vi"),

  /**
   * Zh two letter language code.
   */
  ZH("zh");

  private String value;

  TwoLetterLanguageCode(String value) {
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
    return Arrays
        .stream(Locale.getAvailableLocales())
        .filter(locale -> value.equalsIgnoreCase(locale.getLanguage()))
        .findAny()
        .map(locale -> new Locale(locale.getLanguage()))
        .orElse(null);
  }

  /**
   * From two letter language code.
   *
   * @param text the text
   * @return the two letter language code
   */
  @JsonCreator
  public static TwoLetterLanguageCode fromValue(String text) {
    if (!StringUtils.hasText(text)) {
      return null;
    }
    for (TwoLetterLanguageCode b : TwoLetterLanguageCode.values()) {
      if (String.valueOf(b.value).equalsIgnoreCase(text)) {
        return b;
      }
    }
    return null;
  }

  /**
   * From locale.
   *
   * @param locale the locale
   * @return the two letter language code
   */
  public static TwoLetterLanguageCode fromLocale(Locale locale) {
    if (locale == null || !StringUtils.hasText(locale.getLanguage())) {
      return null;
    }
    return fromValue(locale.getLanguage());
  }

}

