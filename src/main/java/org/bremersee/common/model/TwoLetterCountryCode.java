/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true).
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
   * Andorra (AD).
   */
  AD("AD"),

  /**
   * Vereinigte Arabische Emirate (AE).
   */
  AE("AE"),

  /**
   * Afghanistan (AF).
   */
  AF("AF"),

  /**
   * Antigua und Barbuda (AG).
   */
  AG("AG"),

  /**
   * Anguilla (AI).
   */
  AI("AI"),

  /**
   * Albanien (AL).
   */
  AL("AL"),

  /**
   * Armenien (AM).
   */
  AM("AM"),

  /**
   * Angola (AO).
   */
  AO("AO"),

  /**
   * Antarktis (AQ).
   */
  AQ("AQ"),

  /**
   * Argentinien (AR).
   */
  AR("AR"),

  /**
   * Amerikanisch-Samoa (AS).
   */
  AS("AS"),

  /**
   * Österreich (AT).
   */
  AT("AT"),

  /**
   * Australien (AU).
   */
  AU("AU"),

  /**
   * Aruba (AW).
   */
  AW("AW"),

  /**
   * Ålandinseln (AX).
   */
  AX("AX"),

  /**
   * Aserbaidschan (AZ).
   */
  AZ("AZ"),

  /**
   * Bosnien und Herzegowina (BA).
   */
  BA("BA"),

  /**
   * Barbados (BB).
   */
  BB("BB"),

  /**
   * Bangladesch (BD).
   */
  BD("BD"),

  /**
   * Belgien (BE).
   */
  BE("BE"),

  /**
   * Burkina Faso (BF).
   */
  BF("BF"),

  /**
   * Bulgarien (BG).
   */
  BG("BG"),

  /**
   * Bahrain (BH).
   */
  BH("BH"),

  /**
   * Burundi (BI).
   */
  BI("BI"),

  /**
   * Benin (BJ).
   */
  BJ("BJ"),

  /**
   * St. Barthélemy (BL).
   */
  BL("BL"),

  /**
   * Bermuda (BM).
   */
  BM("BM"),

  /**
   * Brunei Darussalam (BN).
   */
  BN("BN"),

  /**
   * Bolivien (BO).
   */
  BO("BO"),

  /**
   * Bonaire, Sint Eustatius und Saba (BQ).
   */
  BQ("BQ"),

  /**
   * Brasilien (BR).
   */
  BR("BR"),

  /**
   * Bahamas (BS).
   */
  BS("BS"),

  /**
   * Bhutan (BT).
   */
  BT("BT"),

  /**
   * Bouvetinsel (BV).
   */
  BV("BV"),

  /**
   * Botsuana (BW).
   */
  BW("BW"),

  /**
   * Belarus (BY).
   */
  BY("BY"),

  /**
   * Belize (BZ).
   */
  BZ("BZ"),

  /**
   * Kanada (CA).
   */
  CA("CA"),

  /**
   * Kokosinseln (CC).
   */
  CC("CC"),

  /**
   * Kongo-Kinshasa (CD).
   */
  CD("CD"),

  /**
   * Zentralafrikanische Republik (CF).
   */
  CF("CF"),

  /**
   * Kongo-Brazzaville (CG).
   */
  CG("CG"),

  /**
   * Schweiz (CH).
   */
  CH("CH"),

  /**
   * Côte d’Ivoire (CI).
   */
  CI("CI"),

  /**
   * Cookinseln (CK).
   */
  CK("CK"),

  /**
   * Chile (CL).
   */
  CL("CL"),

  /**
   * Kamerun (CM).
   */
  CM("CM"),

  /**
   * China (CN).
   */
  CN("CN"),

  /**
   * Kolumbien (CO).
   */
  CO("CO"),

  /**
   * Costa Rica (CR).
   */
  CR("CR"),

  /**
   * Serbia and Montenegro (CS).
   */
  CS("CS"),

  /**
   * Kuba (CU).
   */
  CU("CU"),

  /**
   * Cabo Verde (CV).
   */
  CV("CV"),

  /**
   * Curaçao (CW).
   */
  CW("CW"),

  /**
   * Weihnachtsinsel (CX).
   */
  CX("CX"),

  /**
   * Zypern (CY).
   */
  CY("CY"),

  /**
   * Tschechien (CZ).
   */
  CZ("CZ"),

  /**
   * Deutschland (DE).
   */
  DE("DE"),

  /**
   * Diego Garcia (DG).
   */
  DG("DG"),

  /**
   * Dschibuti (DJ).
   */
  DJ("DJ"),

  /**
   * Dänemark (DK).
   */
  DK("DK"),

  /**
   * Dominica (DM).
   */
  DM("DM"),

  /**
   * Dominikanische Republik (DO).
   */
  DO("DO"),

  /**
   * Algerien (DZ).
   */
  DZ("DZ"),

  /**
   * Ceuta &amp; Melilla (EA).
   */
  EA("EA"),

  /**
   * Ecuador (EC).
   */
  EC("EC"),

  /**
   * Estland (EE).
   */
  EE("EE"),

  /**
   * Ägypten (EG).
   */
  EG("EG"),

  /**
   * Westsahara (EH).
   */
  EH("EH"),

  /**
   * Eritrea (ER).
   */
  ER("ER"),

  /**
   * Spanien (ES).
   */
  ES("ES"),

  /**
   * Äthiopien (ET).
   */
  ET("ET"),

  /**
   * Finnland (FI).
   */
  FI("FI"),

  /**
   * Fidschi (FJ).
   */
  FJ("FJ"),

  /**
   * Falklandinseln (FK).
   */
  FK("FK"),

  /**
   * Mikronesien (FM).
   */
  FM("FM"),

  /**
   * Färöer (FO).
   */
  FO("FO"),

  /**
   * Frankreich (FR).
   */
  FR("FR"),

  /**
   * Gabun (GA).
   */
  GA("GA"),

  /**
   * Vereinigtes Königreich (GB).
   */
  GB("GB"),

  /**
   * Grenada (GD).
   */
  GD("GD"),

  /**
   * Georgien (GE).
   */
  GE("GE"),

  /**
   * Französisch-Guayana (GF).
   */
  GF("GF"),

  /**
   * Guernsey (GG).
   */
  GG("GG"),

  /**
   * Ghana (GH).
   */
  GH("GH"),

  /**
   * Gibraltar (GI).
   */
  GI("GI"),

  /**
   * Grönland (GL).
   */
  GL("GL"),

  /**
   * Gambia (GM).
   */
  GM("GM"),

  /**
   * Guinea (GN).
   */
  GN("GN"),

  /**
   * Guadeloupe (GP).
   */
  GP("GP"),

  /**
   * Äquatorialguinea (GQ).
   */
  GQ("GQ"),

  /**
   * Griechenland (GR).
   */
  GR("GR"),

  /**
   * Südgeorgien und die Südlichen Sandwichinseln (GS).
   */
  GS("GS"),

  /**
   * Guatemala (GT).
   */
  GT("GT"),

  /**
   * Guam (GU).
   */
  GU("GU"),

  /**
   * Guinea-Bissau (GW).
   */
  GW("GW"),

  /**
   * Guyana (GY).
   */
  GY("GY"),

  /**
   * Sonderverwaltungsregion Hongkong (HK).
   */
  HK("HK"),

  /**
   * Heard und McDonaldinseln (HM).
   */
  HM("HM"),

  /**
   * Honduras (HN).
   */
  HN("HN"),

  /**
   * Kroatien (HR).
   */
  HR("HR"),

  /**
   * Haiti (HT).
   */
  HT("HT"),

  /**
   * Ungarn (HU).
   */
  HU("HU"),

  /**
   * Canary Islands (IC).
   */
  IC("IC"),

  /**
   * Indonesien (ID).
   */
  ID("ID"),

  /**
   * Irland (IE).
   */
  IE("IE"),

  /**
   * Israel (IL).
   */
  IL("IL"),

  /**
   * Isle of Man (IM).
   */
  IM("IM"),

  /**
   * Indien (IN).
   */
  IN("IN"),

  /**
   * Britisches Territorium im Indischen Ozean (IO).
   */
  IO("IO"),

  /**
   * Irak (IQ).
   */
  IQ("IQ"),

  /**
   * Iran (IR).
   */
  IR("IR"),

  /**
   * Island (IS).
   */
  IS("IS"),

  /**
   * Italien (IT).
   */
  IT("IT"),

  /**
   * Jersey (JE).
   */
  JE("JE"),

  /**
   * Jamaika (JM).
   */
  JM("JM"),

  /**
   * Jordanien (JO).
   */
  JO("JO"),

  /**
   * Japan (JP).
   */
  JP("JP"),

  /**
   * Kenia (KE).
   */
  KE("KE"),

  /**
   * Kirgisistan (KG).
   */
  KG("KG"),

  /**
   * Kambodscha (KH).
   */
  KH("KH"),

  /**
   * Kiribati (KI).
   */
  KI("KI"),

  /**
   * Komoren (KM).
   */
  KM("KM"),

  /**
   * St. Kitts und Nevis (KN).
   */
  KN("KN"),

  /**
   * Nordkorea (KP).
   */
  KP("KP"),

  /**
   * Südkorea (KR).
   */
  KR("KR"),

  /**
   * Kuwait (KW).
   */
  KW("KW"),

  /**
   * Kaimaninseln (KY).
   */
  KY("KY"),

  /**
   * Kasachstan (KZ).
   */
  KZ("KZ"),

  /**
   * Laos (LA).
   */
  LA("LA"),

  /**
   * Libanon (LB).
   */
  LB("LB"),

  /**
   * St. Lucia (LC).
   */
  LC("LC"),

  /**
   * Liechtenstein (LI).
   */
  LI("LI"),

  /**
   * Sri Lanka (LK).
   */
  LK("LK"),

  /**
   * Liberia (LR).
   */
  LR("LR"),

  /**
   * Lesotho (LS).
   */
  LS("LS"),

  /**
   * Litauen (LT).
   */
  LT("LT"),

  /**
   * Luxemburg (LU).
   */
  LU("LU"),

  /**
   * Lettland (LV).
   */
  LV("LV"),

  /**
   * Libyen (LY).
   */
  LY("LY"),

  /**
   * Marokko (MA).
   */
  MA("MA"),

  /**
   * Monaco (MC).
   */
  MC("MC"),

  /**
   * Republik Moldau (MD).
   */
  MD("MD"),

  /**
   * Montenegro (ME).
   */
  ME("ME"),

  /**
   * St. Martin (MF).
   */
  MF("MF"),

  /**
   * Madagaskar (MG).
   */
  MG("MG"),

  /**
   * Marshallinseln (MH).
   */
  MH("MH"),

  /**
   * Nordmazedonien (MK).
   */
  MK("MK"),

  /**
   * Mali (ML).
   */
  ML("ML"),

  /**
   * Myanmar (MM).
   */
  MM("MM"),

  /**
   * Mongolei (MN).
   */
  MN("MN"),

  /**
   * Sonderverwaltungsregion Macau (MO).
   */
  MO("MO"),

  /**
   * Nördliche Marianen (MP).
   */
  MP("MP"),

  /**
   * Martinique (MQ).
   */
  MQ("MQ"),

  /**
   * Mauretanien (MR).
   */
  MR("MR"),

  /**
   * Montserrat (MS).
   */
  MS("MS"),

  /**
   * Malta (MT).
   */
  MT("MT"),

  /**
   * Mauritius (MU).
   */
  MU("MU"),

  /**
   * Malediven (MV).
   */
  MV("MV"),

  /**
   * Malawi (MW).
   */
  MW("MW"),

  /**
   * Mexiko (MX).
   */
  MX("MX"),

  /**
   * Malaysia (MY).
   */
  MY("MY"),

  /**
   * Mosambik (MZ).
   */
  MZ("MZ"),

  /**
   * Namibia (NA).
   */
  NA("NA"),

  /**
   * Neukaledonien (NC).
   */
  NC("NC"),

  /**
   * Niger (NE).
   */
  NE("NE"),

  /**
   * Norfolkinsel (NF).
   */
  NF("NF"),

  /**
   * Nigeria (NG).
   */
  NG("NG"),

  /**
   * Nicaragua (NI).
   */
  NI("NI"),

  /**
   * Niederlande (NL).
   */
  NL("NL"),

  /**
   * Norwegen (NO).
   */
  NO("NO"),

  /**
   * Nepal (NP).
   */
  NP("NP"),

  /**
   * Nauru (NR).
   */
  NR("NR"),

  /**
   * Niue (NU).
   */
  NU("NU"),

  /**
   * Neuseeland (NZ).
   */
  NZ("NZ"),

  /**
   * Oman (OM).
   */
  OM("OM"),

  /**
   * Panama (PA).
   */
  PA("PA"),

  /**
   * Peru (PE).
   */
  PE("PE"),

  /**
   * Französisch-Polynesien (PF).
   */
  PF("PF"),

  /**
   * Papua-Neuguinea (PG).
   */
  PG("PG"),

  /**
   * Philippinen (PH).
   */
  PH("PH"),

  /**
   * Pakistan (PK).
   */
  PK("PK"),

  /**
   * Polen (PL).
   */
  PL("PL"),

  /**
   * St. Pierre und Miquelon (PM).
   */
  PM("PM"),

  /**
   * Pitcairninseln (PN).
   */
  PN("PN"),

  /**
   * Puerto Rico (PR).
   */
  PR("PR"),

  /**
   * Palästinensische Autonomiegebiete (PS).
   */
  PS("PS"),

  /**
   * Portugal (PT).
   */
  PT("PT"),

  /**
   * Palau (PW).
   */
  PW("PW"),

  /**
   * Paraguay (PY).
   */
  PY("PY"),

  /**
   * Katar (QA).
   */
  QA("QA"),

  /**
   * Réunion (RE).
   */
  RE("RE"),

  /**
   * Rumänien (RO).
   */
  RO("RO"),

  /**
   * Serbien (RS).
   */
  RS("RS"),

  /**
   * Russland (RU).
   */
  RU("RU"),

  /**
   * Ruanda (RW).
   */
  RW("RW"),

  /**
   * Saudi-Arabien (SA).
   */
  SA("SA"),

  /**
   * Salomonen (SB).
   */
  SB("SB"),

  /**
   * Seychellen (SC).
   */
  SC("SC"),

  /**
   * Sudan (SD).
   */
  SD("SD"),

  /**
   * Schweden (SE).
   */
  SE("SE"),

  /**
   * Singapur (SG).
   */
  SG("SG"),

  /**
   * St. Helena (SH).
   */
  SH("SH"),

  /**
   * Slowenien (SI).
   */
  SI("SI"),

  /**
   * Spitzbergen und Jan Mayen (SJ).
   */
  SJ("SJ"),

  /**
   * Slowakei (SK).
   */
  SK("SK"),

  /**
   * Sierra Leone (SL).
   */
  SL("SL"),

  /**
   * San Marino (SM).
   */
  SM("SM"),

  /**
   * Senegal (SN).
   */
  SN("SN"),

  /**
   * Somalia (SO).
   */
  SO("SO"),

  /**
   * Suriname (SR).
   */
  SR("SR"),

  /**
   * Südsudan (SS).
   */
  SS("SS"),

  /**
   * São Tomé und Príncipe (ST).
   */
  ST("ST"),

  /**
   * El Salvador (SV).
   */
  SV("SV"),

  /**
   * Sint Maarten (SX).
   */
  SX("SX"),

  /**
   * Syrien (SY).
   */
  SY("SY"),

  /**
   * Swasiland (SZ).
   */
  SZ("SZ"),

  /**
   * Turks- und Caicosinseln (TC).
   */
  TC("TC"),

  /**
   * Tschad (TD).
   */
  TD("TD"),

  /**
   * Französische Süd- und Antarktisgebiete (TF).
   */
  TF("TF"),

  /**
   * Togo (TG).
   */
  TG("TG"),

  /**
   * Thailand (TH).
   */
  TH("TH"),

  /**
   * Tadschikistan (TJ).
   */
  TJ("TJ"),

  /**
   * Tokelau (TK).
   */
  TK("TK"),

  /**
   * Timor-Leste (TL).
   */
  TL("TL"),

  /**
   * Turkmenistan (TM).
   */
  TM("TM"),

  /**
   * Tunesien (TN).
   */
  TN("TN"),

  /**
   * Tonga (TO).
   */
  TO("TO"),

  /**
   * Türkei (TR).
   */
  TR("TR"),

  /**
   * Trinidad und Tobago (TT).
   */
  TT("TT"),

  /**
   * Tuvalu (TV).
   */
  TV("TV"),

  /**
   * Taiwan (TW).
   */
  TW("TW"),

  /**
   * Tansania (TZ).
   */
  TZ("TZ"),

  /**
   * Ukraine (UA).
   */
  UA("UA"),

  /**
   * Uganda (UG).
   */
  UG("UG"),

  /**
   * Amerikanische Überseeinseln (UM).
   */
  UM("UM"),

  /**
   * Vereinigte Staaten (US).
   */
  US("US"),

  /**
   * Uruguay (UY).
   */
  UY("UY"),

  /**
   * Usbekistan (UZ).
   */
  UZ("UZ"),

  /**
   * Vatikanstadt (VA).
   */
  VA("VA"),

  /**
   * St. Vincent und die Grenadinen (VC).
   */
  VC("VC"),

  /**
   * Venezuela (VE).
   */
  VE("VE"),

  /**
   * Britische Jungferninseln (VG).
   */
  VG("VG"),

  /**
   * Amerikanische Jungferninseln (VI).
   */
  VI("VI"),

  /**
   * Vietnam (VN).
   */
  VN("VN"),

  /**
   * Vanuatu (VU).
   */
  VU("VU"),

  /**
   * Wallis und Futuna (WF).
   */
  WF("WF"),

  /**
   * Samoa (WS).
   */
  WS("WS"),

  /**
   * Kosovo (XK).
   */
  XK("XK"),

  /**
   * Jemen (YE).
   */
  YE("YE"),

  /**
   * Mayotte (YT).
   */
  YT("YT"),

  /**
   * Südafrika (ZA).
   */
  ZA("ZA"),

  /**
   * Sambia (ZM).
   */
  ZM("ZM"),

  /**
   * Simbabwe (ZW).
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
  public static TwoLetterCountryCode fromValue(final String text) {
    return fromValue(text, null);
  }

  /**
   * From value two letter country code.
   *
   * @param text the text
   * @param defaultCode the default code
   * @return the two letter country code
   */
  @SuppressWarnings("DuplicatedCode")
  public static TwoLetterCountryCode fromValue(
      final String text,
      final TwoLetterCountryCode defaultCode) {

    String source = text != null ? text.trim().toUpperCase() : null;
    if (source == null || source.length() < 2) {
      return defaultCode;
    }
    source = source.replace("-", "_");
    String[] parts = source.split(Pattern.quote("_"));
    source = parts.length > 1 ? parts[1].trim() : parts[0].trim();
    if (source.length() < 2) {
      return defaultCode;
    }
    if (source.length() > 2) {
      ThreeLetterCountryCode threeLetterCountryCode = ThreeLetterCountryCode.fromValue(source);
      if (threeLetterCountryCode != null && threeLetterCountryCode.hasTwoLetterCountryCode()) {
        return threeLetterCountryCode.getTwoLetterCountryCode();
      } else {
        return defaultCode;
      }
    }
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
  public static TwoLetterCountryCode fromLocale(final Locale locale) {
    return fromLocale(locale, null);
  }

  /**
   * From locale.
   *
   * @param locale the locale
   * @param defaultCode the default code
   * @return the two letter country code
   */
  public static TwoLetterCountryCode fromLocale(
      final Locale locale,
      final TwoLetterCountryCode defaultCode) {

    if (locale == null || !StringUtils.hasText(locale.getCountry())) {
      return defaultCode;
    }
    return fromValue(locale.getCountry(), defaultCode);
  }

}

