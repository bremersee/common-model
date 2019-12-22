/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true).
   */

package org.bremersee.common.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Locale;
import org.springframework.util.StringUtils;

/**
 * ISO 639-1 language codes from Java Locale.
 */
public enum TwoLetterLanguageCode {

  /**
   * Afar (aa).
   */
  AA("aa"),

  /**
   * Abchasisch (ab).
   */
  AB("ab"),

  /**
   * Avestisch (ae).
   */
  AE("ae"),

  /**
   * Afrikaans (af).
   */
  AF("af"),

  /**
   * Akan (ak).
   */
  AK("ak"),

  /**
   * Amharisch (am).
   */
  AM("am"),

  /**
   * Aragonesisch (an).
   */
  AN("an"),

  /**
   * Arabisch (ar).
   */
  AR("ar"),

  /**
   * Assamesisch (as).
   */
  AS("as"),

  /**
   * Awarisch (av).
   */
  AV("av"),

  /**
   * Aymara (ay).
   */
  AY("ay"),

  /**
   * Aserbaidschanisch (az).
   */
  AZ("az"),

  /**
   * Baschkirisch (ba).
   */
  BA("ba"),

  /**
   * Weißrussisch (be).
   */
  BE("be"),

  /**
   * Bulgarisch (bg).
   */
  BG("bg"),

  /**
   * Biharisch (bh).
   */
  BH("bh"),

  /**
   * Bislama (bi).
   */
  BI("bi"),

  /**
   * Bambara (bm).
   */
  BM("bm"),

  /**
   * Bengalisch (bn).
   */
  BN("bn"),

  /**
   * Tibetisch (bo).
   */
  BO("bo"),

  /**
   * Bretonisch (br).
   */
  BR("br"),

  /**
   * Bosnisch (bs).
   */
  BS("bs"),

  /**
   * Katalanisch (ca).
   */
  CA("ca"),

  /**
   * Tschetschenisch (ce).
   */
  CE("ce"),

  /**
   * Chamorro (ch).
   */
  CH("ch"),

  /**
   * Korsisch (co).
   */
  CO("co"),

  /**
   * Cree (cr).
   */
  CR("cr"),

  /**
   * Tschechisch (cs).
   */
  CS("cs"),

  /**
   * Kirchenslawisch (cu).
   */
  CU("cu"),

  /**
   * Tschuwaschisch (cv).
   */
  CV("cv"),

  /**
   * Walisisch (cy).
   */
  CY("cy"),

  /**
   * Dänisch (da).
   */
  DA("da"),

  /**
   * Deutsch (de).
   */
  DE("de"),

  /**
   * Dhivehi (dv).
   */
  DV("dv"),

  /**
   * Dzongkha (dz).
   */
  DZ("dz"),

  /**
   * Ewe (ee).
   */
  EE("ee"),

  /**
   * Griechisch (el).
   */
  EL("el"),

  /**
   * Englisch (en).
   */
  EN("en"),

  /**
   * Esperanto (eo).
   */
  EO("eo"),

  /**
   * Spanisch (es).
   */
  ES("es"),

  /**
   * Estnisch (et).
   */
  ET("et"),

  /**
   * Baskisch (eu).
   */
  EU("eu"),

  /**
   * Persisch (fa).
   */
  FA("fa"),

  /**
   * Ful (ff).
   */
  FF("ff"),

  /**
   * Finnisch (fi).
   */
  FI("fi"),

  /**
   * Fidschi (fj).
   */
  FJ("fj"),

  /**
   * Färöisch (fo).
   */
  FO("fo"),

  /**
   * Französisch (fr).
   */
  FR("fr"),

  /**
   * Westfriesisch (fy).
   */
  FY("fy"),

  /**
   * Irisch (ga).
   */
  GA("ga"),

  /**
   * Schottisches Gälisch (gd).
   */
  GD("gd"),

  /**
   * Galicisch (gl).
   */
  GL("gl"),

  /**
   * Guaraní (gn).
   */
  GN("gn"),

  /**
   * Gujarati (gu).
   */
  GU("gu"),

  /**
   * Manx (gv).
   */
  GV("gv"),

  /**
   * Haussa (ha).
   */
  HA("ha"),

  /**
   * Hebräisch (he).
   */
  HE("he"),

  /**
   * Hindi (hi).
   */
  HI("hi"),

  /**
   * Hiri-Motu (ho).
   */
  HO("ho"),

  /**
   * Kroatisch (hr).
   */
  HR("hr"),

  /**
   * Haiti-Kreolisch (ht).
   */
  HT("ht"),

  /**
   * Ungarisch (hu).
   */
  HU("hu"),

  /**
   * Armenisch (hy).
   */
  HY("hy"),

  /**
   * Herero (hz).
   */
  HZ("hz"),

  /**
   * Interlingua (ia).
   */
  IA("ia"),

  /**
   * Indonesisch (id).
   */
  ID("id"),

  /**
   * Interlingue (ie).
   */
  IE("ie"),

  /**
   * Igbo (ig).
   */
  IG("ig"),

  /**
   * Yi (ii).
   */
  II("ii"),

  /**
   * Inupiak (ik).
   */
  IK("ik"),

  /**
   * Indonesisch (in).
   */
  IN("in"),

  /**
   * Ido (io).
   */
  IO("io"),

  /**
   * Isländisch (is).
   */
  IS("is"),

  /**
   * Italienisch (it).
   */
  IT("it"),

  /**
   * Inuktitut (iu).
   */
  IU("iu"),

  /**
   * Hebräisch (iw).
   */
  IW("iw"),

  /**
   * Japanisch (ja).
   */
  JA("ja"),

  /**
   * Jiddish (ji).
   */
  JI("ji"),

  /**
   * Javanisch (jv).
   */
  JV("jv"),

  /**
   * Georgisch (ka).
   */
  KA("ka"),

  /**
   * Kongolesisch (kg).
   */
  KG("kg"),

  /**
   * Kikuyu (ki).
   */
  KI("ki"),

  /**
   * Kwanyama (kj).
   */
  KJ("kj"),

  /**
   * Kasachisch (kk).
   */
  KK("kk"),

  /**
   * Grönländisch (kl).
   */
  KL("kl"),

  /**
   * Khmer (km).
   */
  KM("km"),

  /**
   * Kannada (kn).
   */
  KN("kn"),

  /**
   * Koreanisch (ko).
   */
  KO("ko"),

  /**
   * Kanuri (kr).
   */
  KR("kr"),

  /**
   * Kaschmiri (ks).
   */
  KS("ks"),

  /**
   * Kurdisch (ku).
   */
  KU("ku"),

  /**
   * Komi (kv).
   */
  KV("kv"),

  /**
   * Kornisch (kw).
   */
  KW("kw"),

  /**
   * Kirgisisch (ky).
   */
  KY("ky"),

  /**
   * Latein (la).
   */
  LA("la"),

  /**
   * Luxemburgisch (lb).
   */
  LB("lb"),

  /**
   * Ganda (lg).
   */
  LG("lg"),

  /**
   * Limburgisch (li).
   */
  LI("li"),

  /**
   * Lingala (ln).
   */
  LN("ln"),

  /**
   * Laotisch (lo).
   */
  LO("lo"),

  /**
   * Litauisch (lt).
   */
  LT("lt"),

  /**
   * Luba-Katanga (lu).
   */
  LU("lu"),

  /**
   * Lettisch (lv).
   */
  LV("lv"),

  /**
   * Madagassisch (mg).
   */
  MG("mg"),

  /**
   * Marschallesisch (mh).
   */
  MH("mh"),

  /**
   * Maori (mi).
   */
  MI("mi"),

  /**
   * Mazedonisch (mk).
   */
  MK("mk"),

  /**
   * Malayalam (ml).
   */
  ML("ml"),

  /**
   * Mongolisch (mn).
   */
  MN("mn"),

  /**
   * Moldavisch (mo).
   */
  MO("mo"),

  /**
   * Marathi (mr).
   */
  MR("mr"),

  /**
   * Malaiisch (ms).
   */
  MS("ms"),

  /**
   * Maltesisch (mt).
   */
  MT("mt"),

  /**
   * Birmanisch (my).
   */
  MY("my"),

  /**
   * Nauruisch (na).
   */
  NA("na"),

  /**
   * Norwegisch Bokmål (nb).
   */
  NB("nb"),

  /**
   * Nord-Ndebele (nd).
   */
  ND("nd"),

  /**
   * Nepalesisch (ne).
   */
  NE("ne"),

  /**
   * Ndonga (ng).
   */
  NG("ng"),

  /**
   * Niederländisch (nl).
   */
  NL("nl"),

  /**
   * Norwegisch Nynorsk (nn).
   */
  NN("nn"),

  /**
   * Norwegisch (no).
   */
  NO("no"),

  /**
   * Süd-Ndebele (nr).
   */
  NR("nr"),

  /**
   * Navajo (nv).
   */
  NV("nv"),

  /**
   * Nyanja (ny).
   */
  NY("ny"),

  /**
   * Okzitanisch (oc).
   */
  OC("oc"),

  /**
   * Ojibwa (oj).
   */
  OJ("oj"),

  /**
   * Oromo (om).
   */
  OM("om"),

  /**
   * Oriya (or).
   */
  OR("or"),

  /**
   * Ossetisch (os).
   */
  OS("os"),

  /**
   * Punjabi (pa).
   */
  PA("pa"),

  /**
   * Pali (pi).
   */
  PI("pi"),

  /**
   * Polnisch (pl).
   */
  PL("pl"),

  /**
   * Paschtu (ps).
   */
  PS("ps"),

  /**
   * Portugiesisch (pt).
   */
  PT("pt"),

  /**
   * Quechua (qu).
   */
  QU("qu"),

  /**
   * Rätoromanisch (rm).
   */
  RM("rm"),

  /**
   * Rundi (rn).
   */
  RN("rn"),

  /**
   * Rumänisch (ro).
   */
  RO("ro"),

  /**
   * Russisch (ru).
   */
  RU("ru"),

  /**
   * Kinyarwanda (rw).
   */
  RW("rw"),

  /**
   * Sanskrit (sa).
   */
  SA("sa"),

  /**
   * Sardisch (sc).
   */
  SC("sc"),

  /**
   * Sindhi (sd).
   */
  SD("sd"),

  /**
   * Nordsamisch (se).
   */
  SE("se"),

  /**
   * Sango (sg).
   */
  SG("sg"),

  /**
   * Singhalesisch (si).
   */
  SI("si"),

  /**
   * Slowakisch (sk).
   */
  SK("sk"),

  /**
   * Slowenisch (sl).
   */
  SL("sl"),

  /**
   * Samoanisch (sm).
   */
  SM("sm"),

  /**
   * Shona (sn).
   */
  SN("sn"),

  /**
   * Somali (so).
   */
  SO("so"),

  /**
   * Albanisch (sq).
   */
  SQ("sq"),

  /**
   * Serbisch (sr).
   */
  SR("sr"),

  /**
   * Swazi (ss).
   */
  SS("ss"),

  /**
   * Süd-Sotho (st).
   */
  ST("st"),

  /**
   * Sundanesisch (su).
   */
  SU("su"),

  /**
   * Schwedisch (sv).
   */
  SV("sv"),

  /**
   * Suaheli (sw).
   */
  SW("sw"),

  /**
   * Tamil (ta).
   */
  TA("ta"),

  /**
   * Telugu (te).
   */
  TE("te"),

  /**
   * Tadschikisch (tg).
   */
  TG("tg"),

  /**
   * Thailändisch (th).
   */
  TH("th"),

  /**
   * Tigrinya (ti).
   */
  TI("ti"),

  /**
   * Turkmenisch (tk).
   */
  TK("tk"),

  /**
   * Tagalog (tl).
   */
  TL("tl"),

  /**
   * Tswana (tn).
   */
  TN("tn"),

  /**
   * Tongaisch (to).
   */
  TO("to"),

  /**
   * Türkisch (tr).
   */
  TR("tr"),

  /**
   * Tsonga (ts).
   */
  TS("ts"),

  /**
   * Tatarisch (tt).
   */
  TT("tt"),

  /**
   * Twi (tw).
   */
  TW("tw"),

  /**
   * Tahitisch (ty).
   */
  TY("ty"),

  /**
   * Uigurisch (ug).
   */
  UG("ug"),

  /**
   * Ukrainisch (uk).
   */
  UK("uk"),

  /**
   * Urdu (ur).
   */
  UR("ur"),

  /**
   * Usbekisch (uz).
   */
  UZ("uz"),

  /**
   * Venda (ve).
   */
  VE("ve"),

  /**
   * Vietnamesisch (vi).
   */
  VI("vi"),

  /**
   * Volapük (vo).
   */
  VO("vo"),

  /**
   * Wallonisch (wa).
   */
  WA("wa"),

  /**
   * Wolof (wo).
   */
  WO("wo"),

  /**
   * Xhosa (xh).
   */
  XH("xh"),

  /**
   * Jiddish (yi).
   */
  YI("yi"),

  /**
   * Yoruba (yo).
   */
  YO("yo"),

  /**
   * Zhuang (za).
   */
  ZA("za"),

  /**
   * Chinesisch (zh).
   */
  ZH("zh"),

  /**
   * Zulu (zu).
   */
  ZU("zu");

  private final String value;

  TwoLetterLanguageCode(final String value) {
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
    return new Locale(value);
  }

  /**
   * From two letter language code.
   *
   * @param text the text
   * @return the two letter language code
   */
  @JsonCreator
  public static TwoLetterLanguageCode fromValue(final String text) {
    return fromValue(text, null);
  }

  /**
   * From value two letter language code.
   *
   * @param text        the text
   * @param defaultCode the default code
   * @return the two letter language code
   */
  @SuppressWarnings("DuplicatedCode")
  public static TwoLetterLanguageCode fromValue(
      final String text,
      final TwoLetterLanguageCode defaultCode) {

    String source = text != null ? text.trim().toLowerCase() : null;
    if (source == null || source.length() < 2) {
      return defaultCode;
    }
    source = source.replace("-", "_");
    int index = source.indexOf('_');
    if (index > -1) {
      source = source.substring(0, index).trim();
    }
    if (source.length() < 2) {
      return defaultCode;
    }
    if (source.length() > 2) {
      ThreeLetterLanguageCode threeLetterLanguageCode = ThreeLetterLanguageCode.fromValue(text);
      if (threeLetterLanguageCode != null && threeLetterLanguageCode.hasTwoLetterCode()) {
        return threeLetterLanguageCode.getTwoLetterLanguageCode();
      } else {
        return defaultCode;
      }
    }
    for (TwoLetterLanguageCode b : TwoLetterLanguageCode.values()) {
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
   * @return the two letter language code
   */
  public static TwoLetterLanguageCode fromLocale(final Locale locale) {
    return fromLocale(locale, null);
  }

  /**
   * From locale.
   *
   * @param locale      the locale
   * @param defaultCode the default code
   * @return the two letter language code
   */
  public static TwoLetterLanguageCode fromLocale(
      final Locale locale,
      final TwoLetterLanguageCode defaultCode) {
    if (locale == null || !StringUtils.hasText(locale.getLanguage())) {
      return defaultCode;
    }
    return fromValue(locale.getLanguage(), defaultCode);
  }

}

