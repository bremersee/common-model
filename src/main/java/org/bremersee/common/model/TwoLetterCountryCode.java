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
 * ISO 3166-1 ALPHA-2 country codes from Java Locale.
 */
public enum TwoLetterCountryCode {

  /**
   * Ae two letter country code.
   */
  AE("AE"),

  /**
   * Al two letter country code.
   */
  AL("AL"),

  /**
   * Ar two letter country code.
   */
  AR("AR"),

  /**
   * At two letter country code.
   */
  AT("AT"),

  /**
   * Au two letter country code.
   */
  AU("AU"),

  /**
   * Ba two letter country code.
   */
  BA("BA"),

  /**
   * Be two letter country code.
   */
  BE("BE"),

  /**
   * Bg two letter country code.
   */
  BG("BG"),

  /**
   * Bh two letter country code.
   */
  BH("BH"),

  /**
   * Bo two letter country code.
   */
  BO("BO"),

  /**
   * Br two letter country code.
   */
  BR("BR"),

  /**
   * By two letter country code.
   */
  BY("BY"),

  /**
   * Ca two letter country code.
   */
  CA("CA"),

  /**
   * Ch two letter country code.
   */
  CH("CH"),

  /**
   * Cl two letter country code.
   */
  CL("CL"),

  /**
   * Cn two letter country code.
   */
  CN("CN"),

  /**
   * Co two letter country code.
   */
  CO("CO"),

  /**
   * Cr two letter country code.
   */
  CR("CR"),

  /**
   * Cu two letter country code.
   */
  CU("CU"),

  /**
   * Cy two letter country code.
   */
  CY("CY"),

  /**
   * Cz two letter country code.
   */
  CZ("CZ"),

  /**
   * De two letter country code.
   */
  DE("DE"),

  /**
   * Dk two letter country code.
   */
  DK("DK"),

  /**
   * Do two letter country code.
   */
  DO("DO"),

  /**
   * Dz two letter country code.
   */
  DZ("DZ"),

  /**
   * Ec two letter country code.
   */
  EC("EC"),

  /**
   * Ee two letter country code.
   */
  EE("EE"),

  /**
   * Eg two letter country code.
   */
  EG("EG"),

  /**
   * Es two letter country code.
   */
  ES("ES"),

  /**
   * Fi two letter country code.
   */
  FI("FI"),

  /**
   * Fr two letter country code.
   */
  FR("FR"),

  /**
   * Gb two letter country code.
   */
  GB("GB"),

  /**
   * Gr two letter country code.
   */
  GR("GR"),

  /**
   * Gt two letter country code.
   */
  GT("GT"),

  /**
   * Hk two letter country code.
   */
  HK("HK"),

  /**
   * Hn two letter country code.
   */
  HN("HN"),

  /**
   * Hr two letter country code.
   */
  HR("HR"),

  /**
   * Hu two letter country code.
   */
  HU("HU"),

  /**
   * Id two letter country code.
   */
  ID("ID"),

  /**
   * Ie two letter country code.
   */
  IE("IE"),

  /**
   * Il two letter country code.
   */
  IL("IL"),

  /**
   * In two letter country code.
   */
  IN("IN"),

  /**
   * Iq two letter country code.
   */
  IQ("IQ"),

  /**
   * Is two letter country code.
   */
  IS("IS"),

  /**
   * It two letter country code.
   */
  IT("IT"),

  /**
   * Jo two letter country code.
   */
  JO("JO"),

  /**
   * Jp two letter country code.
   */
  JP("JP"),

  /**
   * Kr two letter country code.
   */
  KR("KR"),

  /**
   * Kw two letter country code.
   */
  KW("KW"),

  /**
   * Lb two letter country code.
   */
  LB("LB"),

  /**
   * Lt two letter country code.
   */
  LT("LT"),

  /**
   * Lu two letter country code.
   */
  LU("LU"),

  /**
   * Lv two letter country code.
   */
  LV("LV"),

  /**
   * Ly two letter country code.
   */
  LY("LY"),

  /**
   * Ma two letter country code.
   */
  MA("MA"),

  /**
   * Me two letter country code.
   */
  ME("ME"),

  /**
   * Mk two letter country code.
   */
  MK("MK"),

  /**
   * Mt two letter country code.
   */
  MT("MT"),

  /**
   * Mx two letter country code.
   */
  MX("MX"),

  /**
   * My two letter country code.
   */
  MY("MY"),

  /**
   * Ni two letter country code.
   */
  NI("NI"),

  /**
   * Nl two letter country code.
   */
  NL("NL"),

  /**
   * No two letter country code.
   */
  NO("NO"),

  /**
   * Nz two letter country code.
   */
  NZ("NZ"),

  /**
   * Om two letter country code.
   */
  OM("OM"),

  /**
   * Pa two letter country code.
   */
  PA("PA"),

  /**
   * Pe two letter country code.
   */
  PE("PE"),

  /**
   * Ph two letter country code.
   */
  PH("PH"),

  /**
   * Pl two letter country code.
   */
  PL("PL"),

  /**
   * Pr two letter country code.
   */
  PR("PR"),

  /**
   * Pt two letter country code.
   */
  PT("PT"),

  /**
   * Py two letter country code.
   */
  PY("PY"),

  /**
   * Qa two letter country code.
   */
  QA("QA"),

  /**
   * Ro two letter country code.
   */
  RO("RO"),

  /**
   * Rs two letter country code.
   */
  RS("RS"),

  /**
   * Ru two letter country code.
   */
  RU("RU"),

  /**
   * Sa two letter country code.
   */
  SA("SA"),

  /**
   * Sd two letter country code.
   */
  SD("SD"),

  /**
   * Se two letter country code.
   */
  SE("SE"),

  /**
   * Sg two letter country code.
   */
  SG("SG"),

  /**
   * Si two letter country code.
   */
  SI("SI"),

  /**
   * Sk two letter country code.
   */
  SK("SK"),

  /**
   * Sv two letter country code.
   */
  SV("SV"),

  /**
   * Sy two letter country code.
   */
  SY("SY"),

  /**
   * Th two letter country code.
   */
  TH("TH"),

  /**
   * Tn two letter country code.
   */
  TN("TN"),

  /**
   * Tr two letter country code.
   */
  TR("TR"),

  /**
   * Tw two letter country code.
   */
  TW("TW"),

  /**
   * Ua two letter country code.
   */
  UA("UA"),

  /**
   * Us two letter country code.
   */
  US("US"),

  /**
   * Uy two letter country code.
   */
  UY("UY"),

  /**
   * Ve two letter country code.
   */
  VE("VE"),

  /**
   * Vn two letter country code.
   */
  VN("VN"),

  /**
   * Ye two letter country code.
   */
  YE("YE"),

  /**
   * Za two letter country code.
   */
  ZA("ZA");

  private String value;

  TwoLetterCountryCode(String value) {
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
        .filter(locale -> value.equalsIgnoreCase(locale.getCountry()))
        .findAny()
        .map(locale -> new Locale("", locale.getCountry()))
        .orElse(null);
  }

  /**
   * From two letter country code.
   *
   * @param text the text
   * @return the two letter country code
   */
  @JsonCreator
  public static TwoLetterCountryCode fromValue(String text) {
    if (!StringUtils.hasText(text)) {
      return null;
    }
    for (TwoLetterCountryCode b : TwoLetterCountryCode.values()) {
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
   * @return the two letter country code
   */
  public static TwoLetterCountryCode fromLocale(Locale locale) {
    if (locale == null || !StringUtils.hasText(locale.getCountry())) {
      return null;
    }
    return fromValue(locale.getCountry());
  }

}

