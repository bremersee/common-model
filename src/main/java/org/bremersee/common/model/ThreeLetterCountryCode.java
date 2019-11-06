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
 * ISO 3166-1 ALPHA-3 country codes from Java Locale.
 */
public enum ThreeLetterCountryCode {

  /**
   * Alb three letter country code.
   */
  ALB("ALB"),

  /**
   * Are three letter country code.
   */
  ARE("ARE"),

  /**
   * Arg three letter country code.
   */
  ARG("ARG"),

  /**
   * Aus three letter country code.
   */
  AUS("AUS"),

  /**
   * Aut three letter country code.
   */
  AUT("AUT"),

  /**
   * Bel three letter country code.
   */
  BEL("BEL"),

  /**
   * Bgr three letter country code.
   */
  BGR("BGR"),

  /**
   * Bhr three letter country code.
   */
  BHR("BHR"),

  /**
   * Bih three letter country code.
   */
  BIH("BIH"),

  /**
   * Blr three letter country code.
   */
  BLR("BLR"),

  /**
   * Bol three letter country code.
   */
  BOL("BOL"),

  /**
   * Bra three letter country code.
   */
  BRA("BRA"),

  /**
   * Can three letter country code.
   */
  CAN("CAN"),

  /**
   * Che three letter country code.
   */
  CHE("CHE"),

  /**
   * Chl three letter country code.
   */
  CHL("CHL"),

  /**
   * Chn three letter country code.
   */
  CHN("CHN"),

  /**
   * Col three letter country code.
   */
  COL("COL"),

  /**
   * Cri three letter country code.
   */
  CRI("CRI"),

  /**
   * Cub three letter country code.
   */
  CUB("CUB"),

  /**
   * Cyp three letter country code.
   */
  CYP("CYP"),

  /**
   * Cze three letter country code.
   */
  CZE("CZE"),

  /**
   * Deu three letter country code.
   */
  DEU("DEU"),

  /**
   * Dnk three letter country code.
   */
  DNK("DNK"),

  /**
   * Dom three letter country code.
   */
  DOM("DOM"),

  /**
   * Dza three letter country code.
   */
  DZA("DZA"),

  /**
   * Ecu three letter country code.
   */
  ECU("ECU"),

  /**
   * Egy three letter country code.
   */
  EGY("EGY"),

  /**
   * Esp three letter country code.
   */
  ESP("ESP"),

  /**
   * Est three letter country code.
   */
  EST("EST"),

  /**
   * Fin three letter country code.
   */
  FIN("FIN"),

  /**
   * Fra three letter country code.
   */
  FRA("FRA"),

  /**
   * Gbr three letter country code.
   */
  GBR("GBR"),

  /**
   * Grc three letter country code.
   */
  GRC("GRC"),

  /**
   * Gtm three letter country code.
   */
  GTM("GTM"),

  /**
   * Hkg three letter country code.
   */
  HKG("HKG"),

  /**
   * Hnd three letter country code.
   */
  HND("HND"),

  /**
   * Hrv three letter country code.
   */
  HRV("HRV"),

  /**
   * Hun three letter country code.
   */
  HUN("HUN"),

  /**
   * Idn three letter country code.
   */
  IDN("IDN"),

  /**
   * Ind three letter country code.
   */
  IND("IND"),

  /**
   * Irl three letter country code.
   */
  IRL("IRL"),

  /**
   * Irq three letter country code.
   */
  IRQ("IRQ"),

  /**
   * Isl three letter country code.
   */
  ISL("ISL"),

  /**
   * Isr three letter country code.
   */
  ISR("ISR"),

  /**
   * Ita three letter country code.
   */
  ITA("ITA"),

  /**
   * Jor three letter country code.
   */
  JOR("JOR"),

  /**
   * Jpn three letter country code.
   */
  JPN("JPN"),

  /**
   * Kor three letter country code.
   */
  KOR("KOR"),

  /**
   * Kwt three letter country code.
   */
  KWT("KWT"),

  /**
   * Lbn three letter country code.
   */
  LBN("LBN"),

  /**
   * Lby three letter country code.
   */
  LBY("LBY"),

  /**
   * Ltu three letter country code.
   */
  LTU("LTU"),

  /**
   * Lux three letter country code.
   */
  LUX("LUX"),

  /**
   * Lva three letter country code.
   */
  LVA("LVA"),

  /**
   * Mar three letter country code.
   */
  MAR("MAR"),

  /**
   * Mex three letter country code.
   */
  MEX("MEX"),

  /**
   * Mkd three letter country code.
   */
  MKD("MKD"),

  /**
   * Mlt three letter country code.
   */
  MLT("MLT"),

  /**
   * Mne three letter country code.
   */
  MNE("MNE"),

  /**
   * Mys three letter country code.
   */
  MYS("MYS"),

  /**
   * Nic three letter country code.
   */
  NIC("NIC"),

  /**
   * Nld three letter country code.
   */
  NLD("NLD"),

  /**
   * Nor three letter country code.
   */
  NOR("NOR"),

  /**
   * Nzl three letter country code.
   */
  NZL("NZL"),

  /**
   * Omn three letter country code.
   */
  OMN("OMN"),

  /**
   * Pan three letter country code.
   */
  PAN("PAN"),

  /**
   * Per three letter country code.
   */
  PER("PER"),

  /**
   * Phl three letter country code.
   */
  PHL("PHL"),

  /**
   * Pol three letter country code.
   */
  POL("POL"),

  /**
   * Pri three letter country code.
   */
  PRI("PRI"),

  /**
   * Prt three letter country code.
   */
  PRT("PRT"),

  /**
   * Pry three letter country code.
   */
  PRY("PRY"),

  /**
   * Qat three letter country code.
   */
  QAT("QAT"),

  /**
   * Rou three letter country code.
   */
  ROU("ROU"),

  /**
   * Rus three letter country code.
   */
  RUS("RUS"),

  /**
   * Sau three letter country code.
   */
  SAU("SAU"),

  /**
   * Sdn three letter country code.
   */
  SDN("SDN"),

  /**
   * Sgp three letter country code.
   */
  SGP("SGP"),

  /**
   * Slv three letter country code.
   */
  SLV("SLV"),

  /**
   * Srb three letter country code.
   */
  SRB("SRB"),

  /**
   * Svk three letter country code.
   */
  SVK("SVK"),

  /**
   * Svn three letter country code.
   */
  SVN("SVN"),

  /**
   * Swe three letter country code.
   */
  SWE("SWE"),

  /**
   * Syr three letter country code.
   */
  SYR("SYR"),

  /**
   * Tha three letter country code.
   */
  THA("THA"),

  /**
   * Tun three letter country code.
   */
  TUN("TUN"),

  /**
   * Tur three letter country code.
   */
  TUR("TUR"),

  /**
   * Twn three letter country code.
   */
  TWN("TWN"),

  /**
   * Ukr three letter country code.
   */
  UKR("UKR"),

  /**
   * Ury three letter country code.
   */
  URY("URY"),

  /**
   * Usa three letter country code.
   */
  USA("USA"),

  /**
   * Ven three letter country code.
   */
  VEN("VEN"),

  /**
   * Vnm three letter country code.
   */
  VNM("VNM"),

  /**
   * Yem three letter country code.
   */
  YEM("YEM"),

  /**
   * Zaf three letter country code.
   */
  ZAF("ZAF");

  private String value;

  ThreeLetterCountryCode(String value) {
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
        .filter(locale -> value.equalsIgnoreCase(locale.getISO3Country()))
        .findAny()
        .map(locale -> new Locale("", locale.getCountry()))
        .orElse(null);
  }

  /**
   * From three letter country code.
   *
   * @param text the text
   * @return the three letter country code
   */
  @JsonCreator
  public static ThreeLetterCountryCode fromValue(String text) {
    if (!StringUtils.hasText(text)) {
      return null;
    }
    for (ThreeLetterCountryCode b : ThreeLetterCountryCode.values()) {
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
   * @return the three letter country code
   */
  public static ThreeLetterCountryCode fromLocale(Locale locale) {
    if (locale == null || !StringUtils.hasText(locale.getISO3Country())) {
      return null;
    }
    return fromValue(locale.getISO3Country());
  }

}

