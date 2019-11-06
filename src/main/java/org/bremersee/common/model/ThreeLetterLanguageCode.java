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
 * ISO 639-2 language codes from Java Locale.
 */
public enum ThreeLetterLanguageCode {

  /**
   * Ara three letter language code.
   */
  ARA("ara"),

  /**
   * Bel three letter language code.
   */
  BEL("bel"),

  /**
   * Bul three letter language code.
   */
  BUL("bul"),

  /**
   * Cat three letter language code.
   */
  CAT("cat"),

  /**
   * Ces three letter language code.
   */
  CES("ces"),

  /**
   * Dan three letter language code.
   */
  DAN("dan"),

  /**
   * Deu three letter language code.
   */
  DEU("deu"),

  /**
   * Ell three letter language code.
   */
  ELL("ell"),

  /**
   * Eng three letter language code.
   */
  ENG("eng"),

  /**
   * Est three letter language code.
   */
  EST("est"),

  /**
   * Fin three letter language code.
   */
  FIN("fin"),

  /**
   * Fra three letter language code.
   */
  FRA("fra"),

  /**
   * Gle three letter language code.
   */
  GLE("gle"),

  /**
   * Heb three letter language code.
   */
  HEB("heb"),

  /**
   * Hin three letter language code.
   */
  HIN("hin"),

  /**
   * Hrv three letter language code.
   */
  HRV("hrv"),

  /**
   * Hun three letter language code.
   */
  HUN("hun"),

  /**
   * Ind three letter language code.
   */
  IND("ind"),

  /**
   * Isl three letter language code.
   */
  ISL("isl"),

  /**
   * Ita three letter language code.
   */
  ITA("ita"),

  /**
   * Jpn three letter language code.
   */
  JPN("jpn"),

  /**
   * Kor three letter language code.
   */
  KOR("kor"),

  /**
   * Lav three letter language code.
   */
  LAV("lav"),

  /**
   * Lit three letter language code.
   */
  LIT("lit"),

  /**
   * Mkd three letter language code.
   */
  MKD("mkd"),

  /**
   * Mlt three letter language code.
   */
  MLT("mlt"),

  /**
   * Msa three letter language code.
   */
  MSA("msa"),

  /**
   * Nld three letter language code.
   */
  NLD("nld"),

  /**
   * Nor three letter language code.
   */
  NOR("nor"),

  /**
   * Pol three letter language code.
   */
  POL("pol"),

  /**
   * Por three letter language code.
   */
  POR("por"),

  /**
   * Ron three letter language code.
   */
  RON("ron"),

  /**
   * Rus three letter language code.
   */
  RUS("rus"),

  /**
   * Slk three letter language code.
   */
  SLK("slk"),

  /**
   * Slv three letter language code.
   */
  SLV("slv"),

  /**
   * Spa three letter language code.
   */
  SPA("spa"),

  /**
   * Sqi three letter language code.
   */
  SQI("sqi"),

  /**
   * Srp three letter language code.
   */
  SRP("srp"),

  /**
   * Swe three letter language code.
   */
  SWE("swe"),

  /**
   * Tha three letter language code.
   */
  THA("tha"),

  /**
   * Tur three letter language code.
   */
  TUR("tur"),

  /**
   * Ukr three letter language code.
   */
  UKR("ukr"),

  /**
   * Vie three letter language code.
   */
  VIE("vie"),

  /**
   * Zho three letter language code.
   */
  ZHO("zho");

  private String value;

  ThreeLetterLanguageCode(String value) {
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
        .filter(locale -> value.equalsIgnoreCase(locale.getISO3Language()))
        .findAny()
        .map(locale -> new Locale(locale.getLanguage()))
        .orElse(null);
  }

  /**
   * From three letter language code.
   *
   * @param text the text
   * @return the three letter language code
   */
  @JsonCreator
  public static ThreeLetterLanguageCode fromValue(String text) {
    if (!StringUtils.hasText(text)) {
      return null;
    }
    for (ThreeLetterLanguageCode b : ThreeLetterLanguageCode.values()) {
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
   * @return the three letter language code
   */
  public static ThreeLetterLanguageCode fromLocale(Locale locale) {
    if (locale == null || !StringUtils.hasText(locale.getISO3Language())) {
      return null;
    }
    return fromValue(locale.getISO3Language());
  }

}

