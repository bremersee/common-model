/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.common.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Locale;
import java.util.regex.Pattern;
import org.springframework.util.StringUtils;

/**
 * ISO 3166-1 ALPHA-2 country codes from Java Locale.
 */
public enum TwoLetterCountryCode {

  /**
   * Andorra (AD)
   */
  AD("AD"),

  /**
   * United Arab Emirates (AE)
   */
  AE("AE"),

  /**
   * Afghanistan (AF)
   */
  AF("AF"),

  /**
   * Antigua and Barbuda (AG)
   */
  AG("AG"),

  /**
   * Anguilla (AI)
   */
  AI("AI"),

  /**
   * Albania (AL)
   */
  AL("AL"),

  /**
   * Armenia (AM)
   */
  AM("AM"),

  /**
   * Netherlands Antilles (AN)
   */
  AN("AN"),

  /**
   * Angola (AO)
   */
  AO("AO"),

  /**
   * Antarctica (AQ)
   */
  AQ("AQ"),

  /**
   * Argentina (AR)
   */
  AR("AR"),

  /**
   * American Samoa (AS)
   */
  AS("AS"),

  /**
   * Austria (AT)
   */
  AT("AT"),

  /**
   * Australia (AU)
   */
  AU("AU"),

  /**
   * Aruba (AW)
   */
  AW("AW"),

  /**
   * Åland Islands (AX)
   */
  AX("AX"),

  /**
   * Azerbaijan (AZ)
   */
  AZ("AZ"),

  /**
   * Bosnia and Herzegovina (BA)
   */
  BA("BA"),

  /**
   * Barbados (BB)
   */
  BB("BB"),

  /**
   * Bangladesh (BD)
   */
  BD("BD"),

  /**
   * Belgium (BE)
   */
  BE("BE"),

  /**
   * Burkina Faso (BF)
   */
  BF("BF"),

  /**
   * Bulgaria (BG)
   */
  BG("BG"),

  /**
   * Bahrain (BH)
   */
  BH("BH"),

  /**
   * Burundi (BI)
   */
  BI("BI"),

  /**
   * Benin (BJ)
   */
  BJ("BJ"),

  /**
   * Saint Barthélemy (BL)
   */
  BL("BL"),

  /**
   * Bermuda (BM)
   */
  BM("BM"),

  /**
   * Brunei (BN)
   */
  BN("BN"),

  /**
   * Bolivia (BO)
   */
  BO("BO"),

  /**
   * Bonaire, Sint Eustatius and Saba (BQ)
   */
  BQ("BQ"),

  /**
   * Brazil (BR)
   */
  BR("BR"),

  /**
   * Bahamas (BS)
   */
  BS("BS"),

  /**
   * Bhutan (BT)
   */
  BT("BT"),

  /**
   * Bouvet Island (BV)
   */
  BV("BV"),

  /**
   * Botswana (BW)
   */
  BW("BW"),

  /**
   * Belarus (BY)
   */
  BY("BY"),

  /**
   * Belize (BZ)
   */
  BZ("BZ"),

  /**
   * Canada (CA)
   */
  CA("CA"),

  /**
   * Cocos Islands (CC)
   */
  CC("CC"),

  /**
   * The Democratic Republic Of Congo (CD)
   */
  CD("CD"),

  /**
   * Central African Republic (CF)
   */
  CF("CF"),

  /**
   * Congo (CG)
   */
  CG("CG"),

  /**
   * Switzerland (CH)
   */
  CH("CH"),

  /**
   * Côte d'Ivoire (CI)
   */
  CI("CI"),

  /**
   * Cook Islands (CK)
   */
  CK("CK"),

  /**
   * Chile (CL)
   */
  CL("CL"),

  /**
   * Cameroon (CM)
   */
  CM("CM"),

  /**
   * China (CN)
   */
  CN("CN"),

  /**
   * Colombia (CO)
   */
  CO("CO"),

  /**
   * Costa Rica (CR)
   */
  CR("CR"),

  /**
   * Serbia and Montenegro (CS)
   */
  CS("CS"),

  /**
   * Cuba (CU)
   */
  CU("CU"),

  /**
   * Cape Verde (CV)
   */
  CV("CV"),

  /**
   * Curaçao (CW)
   */
  CW("CW"),

  /**
   * Christmas Island (CX)
   */
  CX("CX"),

  /**
   * Cyprus (CY)
   */
  CY("CY"),

  /**
   * Czech Republic (CZ)
   */
  CZ("CZ"),

  /**
   * Germany (DE)
   */
  DE("DE"),

  /**
   * Djibouti (DJ)
   */
  DJ("DJ"),

  /**
   * Denmark (DK)
   */
  DK("DK"),

  /**
   * Dominica (DM)
   */
  DM("DM"),

  /**
   * Dominican Republic (DO)
   */
  DO("DO"),

  /**
   * Algeria (DZ)
   */
  DZ("DZ"),

  /**
   * Ecuador (EC)
   */
  EC("EC"),

  /**
   * Estonia (EE)
   */
  EE("EE"),

  /**
   * Egypt (EG)
   */
  EG("EG"),

  /**
   * Western Sahara (EH)
   */
  EH("EH"),

  /**
   * Eritrea (ER)
   */
  ER("ER"),

  /**
   * Spain (ES)
   */
  ES("ES"),

  /**
   * Ethiopia (ET)
   */
  ET("ET"),

  /**
   * Finland (FI)
   */
  FI("FI"),

  /**
   * Fiji (FJ)
   */
  FJ("FJ"),

  /**
   * Falkland Islands (FK)
   */
  FK("FK"),

  /**
   * Micronesia (FM)
   */
  FM("FM"),

  /**
   * Faroe Islands (FO)
   */
  FO("FO"),

  /**
   * France (FR)
   */
  FR("FR"),

  /**
   * Gabon (GA)
   */
  GA("GA"),

  /**
   * United Kingdom (GB)
   */
  GB("GB"),

  /**
   * Grenada (GD)
   */
  GD("GD"),

  /**
   * Georgia (GE)
   */
  GE("GE"),

  /**
   * French Guiana (GF)
   */
  GF("GF"),

  /**
   * Guernsey (GG)
   */
  GG("GG"),

  /**
   * Ghana (GH)
   */
  GH("GH"),

  /**
   * Gibraltar (GI)
   */
  GI("GI"),

  /**
   * Greenland (GL)
   */
  GL("GL"),

  /**
   * Gambia (GM)
   */
  GM("GM"),

  /**
   * Guinea (GN)
   */
  GN("GN"),

  /**
   * Guadeloupe (GP)
   */
  GP("GP"),

  /**
   * Equatorial Guinea (GQ)
   */
  GQ("GQ"),

  /**
   * Greece (GR)
   */
  GR("GR"),

  /**
   * South Georgia And The South Sandwich Islands (GS)
   */
  GS("GS"),

  /**
   * Guatemala (GT)
   */
  GT("GT"),

  /**
   * Guam (GU)
   */
  GU("GU"),

  /**
   * Guinea-Bissau (GW)
   */
  GW("GW"),

  /**
   * Guyana (GY)
   */
  GY("GY"),

  /**
   * Hong Kong (HK)
   */
  HK("HK"),

  /**
   * Heard Island And McDonald Islands (HM)
   */
  HM("HM"),

  /**
   * Honduras (HN)
   */
  HN("HN"),

  /**
   * Croatia (HR)
   */
  HR("HR"),

  /**
   * Haiti (HT)
   */
  HT("HT"),

  /**
   * Hungary (HU)
   */
  HU("HU"),

  /**
   * Indonesia (ID)
   */
  ID("ID"),

  /**
   * Ireland (IE)
   */
  IE("IE"),

  /**
   * Israel (IL)
   */
  IL("IL"),

  /**
   * Isle Of Man (IM)
   */
  IM("IM"),

  /**
   * India (IN)
   */
  IN("IN"),

  /**
   * British Indian Ocean Territory (IO)
   */
  IO("IO"),

  /**
   * Iraq (IQ)
   */
  IQ("IQ"),

  /**
   * Iran (IR)
   */
  IR("IR"),

  /**
   * Iceland (IS)
   */
  IS("IS"),

  /**
   * Italy (IT)
   */
  IT("IT"),

  /**
   * Jersey (JE)
   */
  JE("JE"),

  /**
   * Jamaica (JM)
   */
  JM("JM"),

  /**
   * Jordan (JO)
   */
  JO("JO"),

  /**
   * Japan (JP)
   */
  JP("JP"),

  /**
   * Kenya (KE)
   */
  KE("KE"),

  /**
   * Kyrgyzstan (KG)
   */
  KG("KG"),

  /**
   * Cambodia (KH)
   */
  KH("KH"),

  /**
   * Kiribati (KI)
   */
  KI("KI"),

  /**
   * Comoros (KM)
   */
  KM("KM"),

  /**
   * Saint Kitts And Nevis (KN)
   */
  KN("KN"),

  /**
   * North Korea (KP)
   */
  KP("KP"),

  /**
   * South Korea (KR)
   */
  KR("KR"),

  /**
   * Kuwait (KW)
   */
  KW("KW"),

  /**
   * Cayman Islands (KY)
   */
  KY("KY"),

  /**
   * Kazakhstan (KZ)
   */
  KZ("KZ"),

  /**
   * Laos (LA)
   */
  LA("LA"),

  /**
   * Lebanon (LB)
   */
  LB("LB"),

  /**
   * Saint Lucia (LC)
   */
  LC("LC"),

  /**
   * Liechtenstein (LI)
   */
  LI("LI"),

  /**
   * Sri Lanka (LK)
   */
  LK("LK"),

  /**
   * Liberia (LR)
   */
  LR("LR"),

  /**
   * Lesotho (LS)
   */
  LS("LS"),

  /**
   * Lithuania (LT)
   */
  LT("LT"),

  /**
   * Luxembourg (LU)
   */
  LU("LU"),

  /**
   * Latvia (LV)
   */
  LV("LV"),

  /**
   * Libya (LY)
   */
  LY("LY"),

  /**
   * Morocco (MA)
   */
  MA("MA"),

  /**
   * Monaco (MC)
   */
  MC("MC"),

  /**
   * Moldova (MD)
   */
  MD("MD"),

  /**
   * Montenegro (ME)
   */
  ME("ME"),

  /**
   * Saint Martin (MF)
   */
  MF("MF"),

  /**
   * Madagascar (MG)
   */
  MG("MG"),

  /**
   * Marshall Islands (MH)
   */
  MH("MH"),

  /**
   * Macedonia (MK)
   */
  MK("MK"),

  /**
   * Mali (ML)
   */
  ML("ML"),

  /**
   * Myanmar (MM)
   */
  MM("MM"),

  /**
   * Mongolia (MN)
   */
  MN("MN"),

  /**
   * Macao (MO)
   */
  MO("MO"),

  /**
   * Northern Mariana Islands (MP)
   */
  MP("MP"),

  /**
   * Martinique (MQ)
   */
  MQ("MQ"),

  /**
   * Mauritania (MR)
   */
  MR("MR"),

  /**
   * Montserrat (MS)
   */
  MS("MS"),

  /**
   * Malta (MT)
   */
  MT("MT"),

  /**
   * Mauritius (MU)
   */
  MU("MU"),

  /**
   * Maldives (MV)
   */
  MV("MV"),

  /**
   * Malawi (MW)
   */
  MW("MW"),

  /**
   * Mexico (MX)
   */
  MX("MX"),

  /**
   * Malaysia (MY)
   */
  MY("MY"),

  /**
   * Mozambique (MZ)
   */
  MZ("MZ"),

  /**
   * Namibia (NA)
   */
  NA("NA"),

  /**
   * New Caledonia (NC)
   */
  NC("NC"),

  /**
   * Niger (NE)
   */
  NE("NE"),

  /**
   * Norfolk Island (NF)
   */
  NF("NF"),

  /**
   * Nigeria (NG)
   */
  NG("NG"),

  /**
   * Nicaragua (NI)
   */
  NI("NI"),

  /**
   * Netherlands (NL)
   */
  NL("NL"),

  /**
   * Norway (NO)
   */
  NO("NO"),

  /**
   * Nepal (NP)
   */
  NP("NP"),

  /**
   * Nauru (NR)
   */
  NR("NR"),

  /**
   * Niue (NU)
   */
  NU("NU"),

  /**
   * New Zealand (NZ)
   */
  NZ("NZ"),

  /**
   * Oman (OM)
   */
  OM("OM"),

  /**
   * Panama (PA)
   */
  PA("PA"),

  /**
   * Peru (PE)
   */
  PE("PE"),

  /**
   * French Polynesia (PF)
   */
  PF("PF"),

  /**
   * Papua New Guinea (PG)
   */
  PG("PG"),

  /**
   * Philippines (PH)
   */
  PH("PH"),

  /**
   * Pakistan (PK)
   */
  PK("PK"),

  /**
   * Poland (PL)
   */
  PL("PL"),

  /**
   * Saint Pierre And Miquelon (PM)
   */
  PM("PM"),

  /**
   * Pitcairn (PN)
   */
  PN("PN"),

  /**
   * Puerto Rico (PR)
   */
  PR("PR"),

  /**
   * Palestine (PS)
   */
  PS("PS"),

  /**
   * Portugal (PT)
   */
  PT("PT"),

  /**
   * Palau (PW)
   */
  PW("PW"),

  /**
   * Paraguay (PY)
   */
  PY("PY"),

  /**
   * Qatar (QA)
   */
  QA("QA"),

  /**
   * Reunion (RE)
   */
  RE("RE"),

  /**
   * Romania (RO)
   */
  RO("RO"),

  /**
   * Serbia (RS)
   */
  RS("RS"),

  /**
   * Russia (RU)
   */
  RU("RU"),

  /**
   * Rwanda (RW)
   */
  RW("RW"),

  /**
   * Saudi Arabia (SA)
   */
  SA("SA"),

  /**
   * Solomon Islands (SB)
   */
  SB("SB"),

  /**
   * Seychelles (SC)
   */
  SC("SC"),

  /**
   * Sudan (SD)
   */
  SD("SD"),

  /**
   * Sweden (SE)
   */
  SE("SE"),

  /**
   * Singapore (SG)
   */
  SG("SG"),

  /**
   * Saint Helena (SH)
   */
  SH("SH"),

  /**
   * Slovenia (SI)
   */
  SI("SI"),

  /**
   * Svalbard And Jan Mayen (SJ)
   */
  SJ("SJ"),

  /**
   * Slovakia (SK)
   */
  SK("SK"),

  /**
   * Sierra Leone (SL)
   */
  SL("SL"),

  /**
   * San Marino (SM)
   */
  SM("SM"),

  /**
   * Senegal (SN)
   */
  SN("SN"),

  /**
   * Somalia (SO)
   */
  SO("SO"),

  /**
   * Suriname (SR)
   */
  SR("SR"),

  /**
   * South Sudan (SS)
   */
  SS("SS"),

  /**
   * Sao Tome And Principe (ST)
   */
  ST("ST"),

  /**
   * El Salvador (SV)
   */
  SV("SV"),

  /**
   * Sint Maarten (Dutch part) (SX)
   */
  SX("SX"),

  /**
   * Syria (SY)
   */
  SY("SY"),

  /**
   * Swaziland (SZ)
   */
  SZ("SZ"),

  /**
   * Turks And Caicos Islands (TC)
   */
  TC("TC"),

  /**
   * Chad (TD)
   */
  TD("TD"),

  /**
   * French Southern Territories (TF)
   */
  TF("TF"),

  /**
   * Togo (TG)
   */
  TG("TG"),

  /**
   * Thailand (TH)
   */
  TH("TH"),

  /**
   * Tajikistan (TJ)
   */
  TJ("TJ"),

  /**
   * Tokelau (TK)
   */
  TK("TK"),

  /**
   * Timor-Leste (TL)
   */
  TL("TL"),

  /**
   * Turkmenistan (TM)
   */
  TM("TM"),

  /**
   * Tunisia (TN)
   */
  TN("TN"),

  /**
   * Tonga (TO)
   */
  TO("TO"),

  /**
   * Turkey (TR)
   */
  TR("TR"),

  /**
   * Trinidad and Tobago (TT)
   */
  TT("TT"),

  /**
   * Tuvalu (TV)
   */
  TV("TV"),

  /**
   * Taiwan (TW)
   */
  TW("TW"),

  /**
   * Tanzania (TZ)
   */
  TZ("TZ"),

  /**
   * Ukraine (UA)
   */
  UA("UA"),

  /**
   * Uganda (UG)
   */
  UG("UG"),

  /**
   * United States Minor Outlying Islands (UM)
   */
  UM("UM"),

  /**
   * United States (US)
   */
  US("US"),

  /**
   * Uruguay (UY)
   */
  UY("UY"),

  /**
   * Uzbekistan (UZ)
   */
  UZ("UZ"),

  /**
   * Vatican (VA)
   */
  VA("VA"),

  /**
   * Saint Vincent And The Grenadines (VC)
   */
  VC("VC"),

  /**
   * Venezuela (VE)
   */
  VE("VE"),

  /**
   * British Virgin Islands (VG)
   */
  VG("VG"),

  /**
   * U.S. Virgin Islands (VI)
   */
  VI("VI"),

  /**
   * Vietnam (VN)
   */
  VN("VN"),

  /**
   * Vanuatu (VU)
   */
  VU("VU"),

  /**
   * Wallis And Futuna (WF)
   */
  WF("WF"),

  /**
   * Samoa (WS)
   */
  WS("WS"),

  /**
   * Yemen (YE)
   */
  YE("YE"),

  /**
   * Mayotte (YT)
   */
  YT("YT"),

  /**
   * South Africa (ZA)
   */
  ZA("ZA"),

  /**
   * Zambia (ZM)
   */
  ZM("ZM"),

  /**
   * Zimbabwe (ZW)
   */
  ZW("ZW");

  private String value;

  TwoLetterCountryCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return value;
  }

  /**
   * To locale.
   *
   * @return the locale
   */
  public Locale toLocale() {
    return new Locale("", value);
  }

  /**
   * From two letter country code.
   *
   * @param text the text
   * @return the two letter country code
   */
  @JsonCreator
  public static TwoLetterCountryCode fromValue(String text) {
    return fromValue(text, null);
  }

  /**
   * From value two letter country code.
   *
   * @param text the text
   * @param defaultCode the default code
   * @return the two letter country code
   */
  public static TwoLetterCountryCode fromValue(String text, TwoLetterCountryCode defaultCode) {
    String source = text != null ? text.trim() : null;
    if (source == null || source.length() < 2) {
      return defaultCode;
    }
    source = source.replace("-", "_");
    int index = source.indexOf('_');
    if (source.length() == 3 && index < 0) {
      ThreeLetterCountryCode threeLetter = ThreeLetterCountryCode.fromValue(text);
      if (threeLetter != null) {
        return fromLocale(threeLetter.toLocale(), defaultCode);
      }
    }
    if (index >= 0) {
      String[] parts = source.split(Pattern.quote("_"));
      if (parts.length > 1) {
        return fromValue(parts[1], defaultCode);
      }
    }
    source = source.substring(0, 2).toUpperCase();
    for (TwoLetterCountryCode b : TwoLetterCountryCode.values()) {
      if (b.value.equals(source)) {
        return b;
      }
    }
    return defaultCode;
  }

  /**
   * From locale.
   *
   * @param locale the locale
   * @return the two letter country code
   */
  public static TwoLetterCountryCode fromLocale(Locale locale) {
    return fromLocale(locale, null);
  }

  /**
   * From locale.
   *
   * @param locale the locale
   * @param defaultCode the default code
   * @return the two letter country code
   */
  public static TwoLetterCountryCode fromLocale(Locale locale, TwoLetterCountryCode defaultCode) {
    if (locale == null || !StringUtils.hasText(locale.getCountry())) {
      return defaultCode;
    }
    return fromValue(locale.getCountry(), defaultCode);
  }

}

