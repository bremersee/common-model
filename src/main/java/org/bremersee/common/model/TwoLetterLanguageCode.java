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
 * ISO 639-1 language codes from Java Locale.
 */
public enum TwoLetterLanguageCode {

  /**
   * Afar (aa)
   */
  AA("aa"),

  /**
   * Abkhazian (ab)
   */
  AB("ab"),

  /**
   * Avestan (ae)
   */
  AE("ae"),

  /**
   * Afrikaans (af)
   */
  AF("af"),

  /**
   * Akan (ak)
   */
  AK("ak"),

  /**
   * Amharic (am)
   */
  AM("am"),

  /**
   * Aragonese (an)
   */
  AN("an"),

  /**
   * Arabic (ar)
   */
  AR("ar"),

  /**
   * Assamese (as)
   */
  AS("as"),

  /**
   * Avaric (av)
   */
  AV("av"),

  /**
   * Aymara (ay)
   */
  AY("ay"),

  /**
   * Azerbaijani (az)
   */
  AZ("az"),

  /**
   * Bashkir (ba)
   */
  BA("ba"),

  /**
   * Belarusian (be)
   */
  BE("be"),

  /**
   * Bulgarian (bg)
   */
  BG("bg"),

  /**
   * Bihari (bh)
   */
  BH("bh"),

  /**
   * Bislama (bi)
   */
  BI("bi"),

  /**
   * Bambara (bm)
   */
  BM("bm"),

  /**
   * Bengali (bn)
   */
  BN("bn"),

  /**
   * Tibetan (bo)
   */
  BO("bo"),

  /**
   * Breton (br)
   */
  BR("br"),

  /**
   * Bosnian (bs)
   */
  BS("bs"),

  /**
   * Catalan (ca)
   */
  CA("ca"),

  /**
   * Chechen (ce)
   */
  CE("ce"),

  /**
   * Chamorro (ch)
   */
  CH("ch"),

  /**
   * Corsican (co)
   */
  CO("co"),

  /**
   * Cree (cr)
   */
  CR("cr"),

  /**
   * Czech (cs)
   */
  CS("cs"),

  /**
   * Church Slavic (cu)
   */
  CU("cu"),

  /**
   * Chuvash (cv)
   */
  CV("cv"),

  /**
   * Welsh (cy)
   */
  CY("cy"),

  /**
   * Danish (da)
   */
  DA("da"),

  /**
   * German (de)
   */
  DE("de"),

  /**
   * Divehi (dv)
   */
  DV("dv"),

  /**
   * Dzongkha (dz)
   */
  DZ("dz"),

  /**
   * Ewe (ee)
   */
  EE("ee"),

  /**
   * Greek (el)
   */
  EL("el"),

  /**
   * English (en)
   */
  EN("en"),

  /**
   * Esperanto (eo)
   */
  EO("eo"),

  /**
   * Spanish (es)
   */
  ES("es"),

  /**
   * Estonian (et)
   */
  ET("et"),

  /**
   * Basque (eu)
   */
  EU("eu"),

  /**
   * Persian (fa)
   */
  FA("fa"),

  /**
   * Fulah (ff)
   */
  FF("ff"),

  /**
   * Finnish (fi)
   */
  FI("fi"),

  /**
   * Fijian (fj)
   */
  FJ("fj"),

  /**
   * Faroese (fo)
   */
  FO("fo"),

  /**
   * French (fr)
   */
  FR("fr"),

  /**
   * Frisian (fy)
   */
  FY("fy"),

  /**
   * Irish (ga)
   */
  GA("ga"),

  /**
   * Scottish Gaelic (gd)
   */
  GD("gd"),

  /**
   * Gallegan (gl)
   */
  GL("gl"),

  /**
   * Guarani (gn)
   */
  GN("gn"),

  /**
   * Gujarati (gu)
   */
  GU("gu"),

  /**
   * Manx (gv)
   */
  GV("gv"),

  /**
   * Hausa (ha)
   */
  HA("ha"),

  /**
   * Hebrew (he)
   */
  HE("he"),

  /**
   * Hindi (hi)
   */
  HI("hi"),

  /**
   * Hiri Motu (ho)
   */
  HO("ho"),

  /**
   * Croatian (hr)
   */
  HR("hr"),

  /**
   * Haitian (ht)
   */
  HT("ht"),

  /**
   * Hungarian (hu)
   */
  HU("hu"),

  /**
   * Armenian (hy)
   */
  HY("hy"),

  /**
   * Herero (hz)
   */
  HZ("hz"),

  /**
   * Interlingua (ia)
   */
  IA("ia"),

  /**
   * Indonesian (id)
   */
  ID("id"),

  /**
   * Interlingue (ie)
   */
  IE("ie"),

  /**
   * Igbo (ig)
   */
  IG("ig"),

  /**
   * Sichuan Yi (ii)
   */
  II("ii"),

  /**
   * Inupiaq (ik)
   */
  IK("ik"),

  /**
   * Indonesian (in)
   */
  IN("in"),

  /**
   * Ido (io)
   */
  IO("io"),

  /**
   * Icelandic (is)
   */
  IS("is"),

  /**
   * Italian (it)
   */
  IT("it"),

  /**
   * Inuktitut (iu)
   */
  IU("iu"),

  /**
   * Hebrew (iw)
   */
  IW("iw"),

  /**
   * Japanese (ja)
   */
  JA("ja"),

  /**
   * Yiddish (ji)
   */
  JI("ji"),

  /**
   * Javanese (jv)
   */
  JV("jv"),

  /**
   * Georgian (ka)
   */
  KA("ka"),

  /**
   * Kongo (kg)
   */
  KG("kg"),

  /**
   * Kikuyu (ki)
   */
  KI("ki"),

  /**
   * Kwanyama (kj)
   */
  KJ("kj"),

  /**
   * Kazakh (kk)
   */
  KK("kk"),

  /**
   * Greenlandic (kl)
   */
  KL("kl"),

  /**
   * Khmer (km)
   */
  KM("km"),

  /**
   * Kannada (kn)
   */
  KN("kn"),

  /**
   * Korean (ko)
   */
  KO("ko"),

  /**
   * Kanuri (kr)
   */
  KR("kr"),

  /**
   * Kashmiri (ks)
   */
  KS("ks"),

  /**
   * Kurdish (ku)
   */
  KU("ku"),

  /**
   * Komi (kv)
   */
  KV("kv"),

  /**
   * Cornish (kw)
   */
  KW("kw"),

  /**
   * Kirghiz (ky)
   */
  KY("ky"),

  /**
   * Latin (la)
   */
  LA("la"),

  /**
   * Luxembourgish (lb)
   */
  LB("lb"),

  /**
   * Ganda (lg)
   */
  LG("lg"),

  /**
   * Limburgish (li)
   */
  LI("li"),

  /**
   * Lingala (ln)
   */
  LN("ln"),

  /**
   * Lao (lo)
   */
  LO("lo"),

  /**
   * Lithuanian (lt)
   */
  LT("lt"),

  /**
   * Luba-Katanga (lu)
   */
  LU("lu"),

  /**
   * Latvian (lv)
   */
  LV("lv"),

  /**
   * Malagasy (mg)
   */
  MG("mg"),

  /**
   * Marshallese (mh)
   */
  MH("mh"),

  /**
   * Maori (mi)
   */
  MI("mi"),

  /**
   * Macedonian (mk)
   */
  MK("mk"),

  /**
   * Malayalam (ml)
   */
  ML("ml"),

  /**
   * Mongolian (mn)
   */
  MN("mn"),

  /**
   * Moldavian (mo)
   */
  MO("mo"),

  /**
   * Marathi (mr)
   */
  MR("mr"),

  /**
   * Malay (ms)
   */
  MS("ms"),

  /**
   * Maltese (mt)
   */
  MT("mt"),

  /**
   * Burmese (my)
   */
  MY("my"),

  /**
   * Nauru (na)
   */
  NA("na"),

  /**
   * Norwegian Bokmål (nb)
   */
  NB("nb"),

  /**
   * North Ndebele (nd)
   */
  ND("nd"),

  /**
   * Nepali (ne)
   */
  NE("ne"),

  /**
   * Ndonga (ng)
   */
  NG("ng"),

  /**
   * Dutch (nl)
   */
  NL("nl"),

  /**
   * Norwegian Nynorsk (nn)
   */
  NN("nn"),

  /**
   * Norwegian (no)
   */
  NO("no"),

  /**
   * South Ndebele (nr)
   */
  NR("nr"),

  /**
   * Navajo (nv)
   */
  NV("nv"),

  /**
   * Nyanja (ny)
   */
  NY("ny"),

  /**
   * Occitan (oc)
   */
  OC("oc"),

  /**
   * Ojibwa (oj)
   */
  OJ("oj"),

  /**
   * Oromo (om)
   */
  OM("om"),

  /**
   * Oriya (or)
   */
  OR("or"),

  /**
   * Ossetian (os)
   */
  OS("os"),

  /**
   * Panjabi (pa)
   */
  PA("pa"),

  /**
   * Pali (pi)
   */
  PI("pi"),

  /**
   * Polish (pl)
   */
  PL("pl"),

  /**
   * Pushto (ps)
   */
  PS("ps"),

  /**
   * Portuguese (pt)
   */
  PT("pt"),

  /**
   * Quechua (qu)
   */
  QU("qu"),

  /**
   * Raeto-Romance (rm)
   */
  RM("rm"),

  /**
   * Rundi (rn)
   */
  RN("rn"),

  /**
   * Romanian (ro)
   */
  RO("ro"),

  /**
   * Russian (ru)
   */
  RU("ru"),

  /**
   * Kinyarwanda (rw)
   */
  RW("rw"),

  /**
   * Sanskrit (sa)
   */
  SA("sa"),

  /**
   * Sardinian (sc)
   */
  SC("sc"),

  /**
   * Sindhi (sd)
   */
  SD("sd"),

  /**
   * Northern Sami (se)
   */
  SE("se"),

  /**
   * Sango (sg)
   */
  SG("sg"),

  /**
   * Sinhalese (si)
   */
  SI("si"),

  /**
   * Slovak (sk)
   */
  SK("sk"),

  /**
   * Slovenian (sl)
   */
  SL("sl"),

  /**
   * Samoan (sm)
   */
  SM("sm"),

  /**
   * Shona (sn)
   */
  SN("sn"),

  /**
   * Somali (so)
   */
  SO("so"),

  /**
   * Albanian (sq)
   */
  SQ("sq"),

  /**
   * Serbian (sr)
   */
  SR("sr"),

  /**
   * Swati (ss)
   */
  SS("ss"),

  /**
   * Southern Sotho (st)
   */
  ST("st"),

  /**
   * Sundanese (su)
   */
  SU("su"),

  /**
   * Swedish (sv)
   */
  SV("sv"),

  /**
   * Swahili (sw)
   */
  SW("sw"),

  /**
   * Tamil (ta)
   */
  TA("ta"),

  /**
   * Telugu (te)
   */
  TE("te"),

  /**
   * Tajik (tg)
   */
  TG("tg"),

  /**
   * Thai (th)
   */
  TH("th"),

  /**
   * Tigrinya (ti)
   */
  TI("ti"),

  /**
   * Turkmen (tk)
   */
  TK("tk"),

  /**
   * Tagalog (tl)
   */
  TL("tl"),

  /**
   * Tswana (tn)
   */
  TN("tn"),

  /**
   * Tonga (to)
   */
  TO("to"),

  /**
   * Turkish (tr)
   */
  TR("tr"),

  /**
   * Tsonga (ts)
   */
  TS("ts"),

  /**
   * Tatar (tt)
   */
  TT("tt"),

  /**
   * Twi (tw)
   */
  TW("tw"),

  /**
   * Tahitian (ty)
   */
  TY("ty"),

  /**
   * Uighur (ug)
   */
  UG("ug"),

  /**
   * Ukrainian (uk)
   */
  UK("uk"),

  /**
   * Urdu (ur)
   */
  UR("ur"),

  /**
   * Uzbek (uz)
   */
  UZ("uz"),

  /**
   * Venda (ve)
   */
  VE("ve"),

  /**
   * Vietnamese (vi)
   */
  VI("vi"),

  /**
   * Volapük (vo)
   */
  VO("vo"),

  /**
   * Walloon (wa)
   */
  WA("wa"),

  /**
   * Wolof (wo)
   */
  WO("wo"),

  /**
   * Xhosa (xh)
   */
  XH("xh"),

  /**
   * Yiddish (yi)
   */
  YI("yi"),

  /**
   * Yoruba (yo)
   */
  YO("yo"),

  /**
   * Zhuang (za)
   */
  ZA("za"),

  /**
   * Chinese (zh)
   */
  ZH("zh"),

  /**
   * Zulu (zu)
   */
  ZU("zu");

  private String value;

  TwoLetterLanguageCode(String value) {
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
  public static TwoLetterLanguageCode fromValue(String text) {
    return fromValue(text, null);
  }

  /**
   * From value two letter language code.
   *
   * @param text        the text
   * @param defaultCode the default code
   * @return the two letter language code
   */
  public static TwoLetterLanguageCode fromValue(String text, TwoLetterLanguageCode defaultCode) {
    String source = text != null ? text.trim() : null;
    if (source == null || source.length() < 2) {
      return defaultCode;
    }
    source = source.replace("-", "_");
    int index = source.indexOf('_');
    if (source.length() == 3 && index < 0) {
      ThreeLetterLanguageCode threeLetter = ThreeLetterLanguageCode.fromValue(text);
      if (threeLetter != null) {
        return fromLocale(threeLetter.toLocale(), defaultCode);
      }
    }
    if (index >= 0) {
      String[] parts = source.split(Pattern.quote("_"));
      if (parts.length > 0) {
        return fromValue(parts[0], defaultCode);
      }
    }
    source = source.substring(0, 2).toLowerCase();
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
  public static TwoLetterLanguageCode fromLocale(Locale locale) {
    return fromLocale(locale, null);
  }

  /**
   * From locale.
   *
   * @param locale      the locale
   * @param defaultCode the default code
   * @return the two letter language code
   */
  public static TwoLetterLanguageCode fromLocale(Locale locale, TwoLetterLanguageCode defaultCode) {
    if (locale == null || !StringUtils.hasText(locale.getLanguage())) {
      return defaultCode;
    }
    return fromValue(locale.getLanguage(), defaultCode);
  }

}

