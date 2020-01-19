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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.Locale;
import org.springframework.util.StringUtils;

/**
 * ISO 639-2 language codes from Java Locale.
 *
 * @author Christian Bremer
 */
public enum ThreeLetterLanguageCode {

  /**
   * Afar (aar)
   */
  AAR("aar"),

  /**
   * Abkhazian (abk)
   */
  ABK("abk"),

  /**
   * Avestan (ave)
   */
  AVE("ave"),

  /**
   * Afrikaans (afr)
   */
  AFR("afr"),

  /**
   * Akan (aka)
   */
  AKA("aka"),

  /**
   * Amharic (amh)
   */
  AMH("amh"),

  /**
   * Aragonese (arg)
   */
  ARG("arg"),

  /**
   * Arabic (ara)
   */
  ARA("ara"),

  /**
   * Assamese (asm)
   */
  ASM("asm"),

  /**
   * Avaric (ava)
   */
  AVA("ava"),

  /**
   * Aymara (aym)
   */
  AYM("aym"),

  /**
   * Azerbaijani (aze)
   */
  AZE("aze"),

  /**
   * Bashkir (bak)
   */
  BAK("bak"),

  /**
   * Belarusian (bel)
   */
  BEL("bel"),

  /**
   * Bulgarian (bul)
   */
  BUL("bul"),

  /**
   * Bihari (bih)
   */
  BIH("bih"),

  /**
   * Bislama (bis)
   */
  BIS("bis"),

  /**
   * Bambara (bam)
   */
  BAM("bam"),

  /**
   * Bengali (ben)
   */
  BEN("ben"),

  /**
   * Tibetan (bod)
   */
  BOD("bod"),

  /**
   * Breton (bre)
   */
  BRE("bre"),

  /**
   * Bosnian (bos)
   */
  BOS("bos"),

  /**
   * Catalan (cat)
   */
  CAT("cat"),

  /**
   * Chechen (che)
   */
  CHE("che"),

  /**
   * Chamorro (cha)
   */
  CHA("cha"),

  /**
   * Corsican (cos)
   */
  COS("cos"),

  /**
   * Cree (cre)
   */
  CRE("cre"),

  /**
   * Czech (ces)
   */
  CES("ces"),

  /**
   * Church Slavic (chu)
   */
  CHU("chu"),

  /**
   * Chuvash (chv)
   */
  CHV("chv"),

  /**
   * Welsh (cym)
   */
  CYM("cym"),

  /**
   * Danish (dan)
   */
  DAN("dan"),

  /**
   * German (deu)
   */
  DEU("deu"),

  /**
   * Divehi (div)
   */
  DIV("div"),

  /**
   * Dzongkha (dzo)
   */
  DZO("dzo"),

  /**
   * Ewe (ewe)
   */
  EWE("ewe"),

  /**
   * Greek (ell)
   */
  ELL("ell"),

  /**
   * English (eng)
   */
  ENG("eng"),

  /**
   * Esperanto (epo)
   */
  EPO("epo"),

  /**
   * Spanish (spa)
   */
  SPA("spa"),

  /**
   * Estonian (est)
   */
  EST("est"),

  /**
   * Basque (eus)
   */
  EUS("eus"),

  /**
   * Persian (fas)
   */
  FAS("fas"),

  /**
   * Fulah (ful)
   */
  FUL("ful"),

  /**
   * Finnish (fin)
   */
  FIN("fin"),

  /**
   * Fijian (fij)
   */
  FIJ("fij"),

  /**
   * Faroese (fao)
   */
  FAO("fao"),

  /**
   * French (fra)
   */
  FRA("fra"),

  /**
   * Frisian (fry)
   */
  FRY("fry"),

  /**
   * Irish (gle)
   */
  GLE("gle"),

  /**
   * Scottish Gaelic (gla)
   */
  GLA("gla"),

  /**
   * Gallegan (glg)
   */
  GLG("glg"),

  /**
   * Guarani (grn)
   */
  GRN("grn"),

  /**
   * Gujarati (guj)
   */
  GUJ("guj"),

  /**
   * Manx (glv)
   */
  GLV("glv"),

  /**
   * Hausa (hau)
   */
  HAU("hau"),

  /**
   * Hebrew (heb)
   */
  HEB("heb"),

  /**
   * Hindi (hin)
   */
  HIN("hin"),

  /**
   * Hiri Motu (hmo)
   */
  HMO("hmo"),

  /**
   * Croatian (hrv)
   */
  HRV("hrv"),

  /**
   * Haitian (hat)
   */
  HAT("hat"),

  /**
   * Hungarian (hun)
   */
  HUN("hun"),

  /**
   * Armenian (hye)
   */
  HYE("hye"),

  /**
   * Herero (her)
   */
  HER("her"),

  /**
   * Interlingua (ina)
   */
  INA("ina"),

  /**
   * Indonesian (ind)
   */
  IND("ind"),

  /**
   * Interlingue (ile)
   */
  ILE("ile"),

  /**
   * Igbo (ibo)
   */
  IBO("ibo"),

  /**
   * Sichuan Yi (iii)
   */
  III("iii"),

  /**
   * Inupiaq (ipk)
   */
  IPK("ipk"),

  /**
   * Ido (ido)
   */
  IDO("ido"),

  /**
   * Icelandic (isl)
   */
  ISL("isl"),

  /**
   * Italian (ita)
   */
  ITA("ita"),

  /**
   * Inuktitut (iku)
   */
  IKU("iku"),

  /**
   * Japanese (jpn)
   */
  JPN("jpn"),

  /**
   * Yiddish (yid)
   */
  YID("yid"),

  /**
   * Javanese (jav)
   */
  JAV("jav"),

  /**
   * Georgian (kat)
   */
  KAT("kat"),

  /**
   * Kongo (kon)
   */
  KON("kon"),

  /**
   * Kikuyu (kik)
   */
  KIK("kik"),

  /**
   * Kwanyama (kua)
   */
  KUA("kua"),

  /**
   * Kazakh (kaz)
   */
  KAZ("kaz"),

  /**
   * Greenlandic (kal)
   */
  KAL("kal"),

  /**
   * Khmer (khm)
   */
  KHM("khm"),

  /**
   * Kannada (kan)
   */
  KAN("kan"),

  /**
   * Korean (kor)
   */
  KOR("kor"),

  /**
   * Kanuri (kau)
   */
  KAU("kau"),

  /**
   * Kashmiri (kas)
   */
  KAS("kas"),

  /**
   * Kurdish (kur)
   */
  KUR("kur"),

  /**
   * Komi (kom)
   */
  KOM("kom"),

  /**
   * Cornish (cor)
   */
  COR("cor"),

  /**
   * Kirghiz (kir)
   */
  KIR("kir"),

  /**
   * Latin (lat)
   */
  LAT("lat"),

  /**
   * Luxembourgish (ltz)
   */
  LTZ("ltz"),

  /**
   * Ganda (lug)
   */
  LUG("lug"),

  /**
   * Limburgish (lim)
   */
  LIM("lim"),

  /**
   * Lingala (lin)
   */
  LIN("lin"),

  /**
   * Lao (lao)
   */
  LAO("lao"),

  /**
   * Lithuanian (lit)
   */
  LIT("lit"),

  /**
   * Luba-Katanga (lub)
   */
  LUB("lub"),

  /**
   * Latvian (lav)
   */
  LAV("lav"),

  /**
   * Malagasy (mlg)
   */
  MLG("mlg"),

  /**
   * Marshallese (mah)
   */
  MAH("mah"),

  /**
   * Maori (mri)
   */
  MRI("mri"),

  /**
   * Macedonian (mkd)
   */
  MKD("mkd"),

  /**
   * Malayalam (mal)
   */
  MAL("mal"),

  /**
   * Mongolian (mon)
   */
  MON("mon"),

  /**
   * Moldavian (mol)
   */
  MOL("mol"),

  /**
   * Marathi (mar)
   */
  MAR("mar"),

  /**
   * Malay (msa)
   */
  MSA("msa"),

  /**
   * Maltese (mlt)
   */
  MLT("mlt"),

  /**
   * Burmese (mya)
   */
  MYA("mya"),

  /**
   * Nauru (nau)
   */
  NAU("nau"),

  /**
   * Norwegian Bokmål (nob)
   */
  NOB("nob"),

  /**
   * North Ndebele (nde)
   */
  NDE("nde"),

  /**
   * Nepali (nep)
   */
  NEP("nep"),

  /**
   * Ndonga (ndo)
   */
  NDO("ndo"),

  /**
   * Dutch (nld)
   */
  NLD("nld"),

  /**
   * Norwegian Nynorsk (nno)
   */
  NNO("nno"),

  /**
   * Norwegian (nor)
   */
  NOR("nor"),

  /**
   * South Ndebele (nbl)
   */
  NBL("nbl"),

  /**
   * Navajo (nav)
   */
  NAV("nav"),

  /**
   * Nyanja (nya)
   */
  NYA("nya"),

  /**
   * Occitan (oci)
   */
  OCI("oci"),

  /**
   * Ojibwa (oji)
   */
  OJI("oji"),

  /**
   * Oromo (orm)
   */
  ORM("orm"),

  /**
   * Oriya (ori)
   */
  ORI("ori"),

  /**
   * Ossetian (oss)
   */
  OSS("oss"),

  /**
   * Panjabi (pan)
   */
  PAN("pan"),

  /**
   * Pali (pli)
   */
  PLI("pli"),

  /**
   * Polish (pol)
   */
  POL("pol"),

  /**
   * Pushto (pus)
   */
  PUS("pus"),

  /**
   * Portuguese (por)
   */
  POR("por"),

  /**
   * Quechua (que)
   */
  QUE("que"),

  /**
   * Raeto-Romance (roh)
   */
  ROH("roh"),

  /**
   * Rundi (run)
   */
  RUN("run"),

  /**
   * Romanian (ron)
   */
  RON("ron"),

  /**
   * Russian (rus)
   */
  RUS("rus"),

  /**
   * Kinyarwanda (kin)
   */
  KIN("kin"),

  /**
   * Sanskrit (san)
   */
  SAN("san"),

  /**
   * Sardinian (srd)
   */
  SRD("srd"),

  /**
   * Sindhi (snd)
   */
  SND("snd"),

  /**
   * Northern Sami (sme)
   */
  SME("sme"),

  /**
   * Sango (sag)
   */
  SAG("sag"),

  /**
   * Sinhalese (sin)
   */
  SIN("sin"),

  /**
   * Slovak (slk)
   */
  SLK("slk"),

  /**
   * Slovenian (slv)
   */
  SLV("slv"),

  /**
   * Samoan (smo)
   */
  SMO("smo"),

  /**
   * Shona (sna)
   */
  SNA("sna"),

  /**
   * Somali (som)
   */
  SOM("som"),

  /**
   * Albanian (sqi)
   */
  SQI("sqi"),

  /**
   * Serbian (srp)
   */
  SRP("srp"),

  /**
   * Swati (ssw)
   */
  SSW("ssw"),

  /**
   * Southern Sotho (sot)
   */
  SOT("sot"),

  /**
   * Sundanese (sun)
   */
  SUN("sun"),

  /**
   * Swedish (swe)
   */
  SWE("swe"),

  /**
   * Swahili (swa)
   */
  SWA("swa"),

  /**
   * Tamil (tam)
   */
  TAM("tam"),

  /**
   * Telugu (tel)
   */
  TEL("tel"),

  /**
   * Tajik (tgk)
   */
  TGK("tgk"),

  /**
   * Thai (tha)
   */
  THA("tha"),

  /**
   * Tigrinya (tir)
   */
  TIR("tir"),

  /**
   * Turkmen (tuk)
   */
  TUK("tuk"),

  /**
   * Tagalog (tgl)
   */
  TGL("tgl"),

  /**
   * Tswana (tsn)
   */
  TSN("tsn"),

  /**
   * Tonga (ton)
   */
  TON("ton"),

  /**
   * Turkish (tur)
   */
  TUR("tur"),

  /**
   * Tsonga (tso)
   */
  TSO("tso"),

  /**
   * Tatar (tat)
   */
  TAT("tat"),

  /**
   * Twi (twi)
   */
  TWI("twi"),

  /**
   * Tahitian (tah)
   */
  TAH("tah"),

  /**
   * Uighur (uig)
   */
  UIG("uig"),

  /**
   * Ukrainian (ukr)
   */
  UKR("ukr"),

  /**
   * Urdu (urd)
   */
  URD("urd"),

  /**
   * Uzbek (uzb)
   */
  UZB("uzb"),

  /**
   * Venda (ven)
   */
  VEN("ven"),

  /**
   * Vietnamese (vie)
   */
  VIE("vie"),

  /**
   * Volapük (vol)
   */
  VOL("vol"),

  /**
   * Walloon (wln)
   */
  WLN("wln"),

  /**
   * Wolof (wol)
   */
  WOL("wol"),

  /**
   * Xhosa (xho)
   */
  XHO("xho"),

  /**
   * Yoruba (yor)
   */
  YOR("yor"),

  /**
   * Zhuang (zha)
   */
  ZHA("zha"),

  /**
   * Chinese (zho)
   */
  ZHO("zho"),

  /**
   * Zulu (zul)
   */
  ZUL("zul");

  private String value;

  ThreeLetterLanguageCode(String value) {
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
    return Arrays
        .stream(Locale.getISOLanguages())
        .filter(iso -> value.equalsIgnoreCase(new Locale(iso).getISO3Language()))
        .findAny()
        .map(Locale::new)
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
    String source = text != null ? text.trim() : null;
    if (source == null || source.length() < 2) {
      return null;
    }
    if (source.length() != 3) {
      TwoLetterLanguageCode code = TwoLetterLanguageCode.fromValue(source);
      return code != null ? fromLocale(code.toLocale()) : null;
    }
    source = text.substring(0, 3).toLowerCase();
    for (ThreeLetterLanguageCode b : ThreeLetterLanguageCode.values()) {
      if (b.value.equals(source)) {
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

