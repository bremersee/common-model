/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true).
 */

package org.bremersee.common.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.Locale;
import java.util.MissingResourceException;
import org.springframework.util.StringUtils;

/**
 * ISO 639-2 language codes from Java Locale.
 */
public enum ThreeLetterLanguageCode {

  /**
   * Afar (aar).
   */
  AAR("aar", TwoLetterLanguageCode.AA),

  /**
   * Abchasisch (abk).
   */
  ABK("abk", TwoLetterLanguageCode.AB),

  /**
   * Afrikaans (afr).
   */
  AFR("afr", TwoLetterLanguageCode.AF),

  /**
   * Aghem (Kamerun) (agq).
   */
  AGQ("agq"),

  /**
   * Akan (Ghana) (aka).
   */
  AKA("aka", TwoLetterLanguageCode.AK),

  /**
   * Amharisch (amh).
   */
  AMH("amh", TwoLetterLanguageCode.AM),

  /**
   * Arabisch (Tschad) (ara).
   */
  ARA("ara", TwoLetterLanguageCode.AR),

  /**
   * Aragonesisch (arg).
   */
  ARG("arg", TwoLetterLanguageCode.AN),

  /**
   * Asu (Tansania) (asa).
   */
  ASA("asa"),

  /**
   * Assamesisch (asm).
   */
  ASM("asm", TwoLetterLanguageCode.AS),

  /**
   * Asturianisch (ast).
   */
  AST("ast"),

  /**
   * Awarisch (ava).
   */
  AVA("ava", TwoLetterLanguageCode.AV),

  /**
   * Avestisch (ave).
   */
  AVE("ave", TwoLetterLanguageCode.AE),

  /**
   * Aymara (aym).
   */
  AYM("aym", TwoLetterLanguageCode.AY),

  /**
   * Aserbaidschanisch (aze).
   */
  AZE("aze", TwoLetterLanguageCode.AZ),

  /**
   * Baschkirisch (bak).
   */
  BAK("bak", TwoLetterLanguageCode.BA),

  /**
   * Bambara (Mali) (bam).
   */
  BAM("bam", TwoLetterLanguageCode.BM),

  /**
   * Basaa (Kamerun) (bas).
   */
  BAS("bas"),

  /**
   * Weißrussisch (bel).
   */
  BEL("bel", TwoLetterLanguageCode.BE),

  /**
   * Bemba (bem).
   */
  BEM("bem"),

  /**
   * Bengalisch (ben).
   */
  BEN("ben", TwoLetterLanguageCode.BN),

  /**
   * Bena (Tansania) (bez).
   */
  BEZ("bez"),

  /**
   * Biharisch (bih).
   */
  BIH("bih", TwoLetterLanguageCode.BH),

  /**
   * Bislama (bis).
   */
  BIS("bis", TwoLetterLanguageCode.BI),

  /**
   * Tibetisch (bod).
   */
  BOD("bod", TwoLetterLanguageCode.BO),

  /**
   * Bosnisch (Lateinisch, Bosnien und Herzegowina) (bos).
   */
  BOS("bos", TwoLetterLanguageCode.BS),

  /**
   * Bretonisch (bre).
   */
  BRE("bre", TwoLetterLanguageCode.BR),

  /**
   * Bodo (Indien) (brx).
   */
  BRX("brx"),

  /**
   * Bulgarisch (bul).
   */
  BUL("bul", TwoLetterLanguageCode.BG),

  /**
   * Katalanisch (Frankreich) (cat).
   */
  CAT("cat", TwoLetterLanguageCode.CA),

  /**
   * ccp (ccp).
   */
  CCP("ccp"),

  /**
   * Cebuano (ceb).
   */
  CEB("ceb"),

  /**
   * Tschechisch (ces).
   */
  CES("ces", TwoLetterLanguageCode.CS),

  /**
   * Rukiga (cgg).
   */
  CGG("cgg"),

  /**
   * Chamorro (cha).
   */
  CHA("cha", TwoLetterLanguageCode.CH),

  /**
   * Tschetschenisch (Russland) (che).
   */
  CHE("che", TwoLetterLanguageCode.CE),

  /**
   * Cherokee (chr).
   */
  CHR("chr"),

  /**
   * Kirchenslawisch (Russland) (chu).
   */
  CHU("chu", TwoLetterLanguageCode.CU),

  /**
   * Tschuwaschisch (chv).
   */
  CHV("chv", TwoLetterLanguageCode.CV),

  /**
   * Zentralkurdisch (ckb).
   */
  CKB("ckb"),

  /**
   * Kornisch (Vereinigtes Königreich) (cor).
   */
  COR("cor", TwoLetterLanguageCode.KW),

  /**
   * Korsisch (cos).
   */
  COS("cos", TwoLetterLanguageCode.CO),

  /**
   * Cree (cre).
   */
  CRE("cre", TwoLetterLanguageCode.CR),

  /**
   * Walisisch (cym).
   */
  CYM("cym", TwoLetterLanguageCode.CY),

  /**
   * Dänisch (Dänemark) (dan).
   */
  DAN("dan", TwoLetterLanguageCode.DA),

  /**
   * Taita (dav).
   */
  DAV("dav"),

  /**
   * Deutsch (Italien) (deu).
   */
  DEU("deu", TwoLetterLanguageCode.DE),

  /**
   * Dhivehi (div).
   */
  DIV("div", TwoLetterLanguageCode.DV),

  /**
   * Zarma (Niger) (dje).
   */
  DJE("dje"),

  /**
   * Niedersorbisch (Deutschland) (dsb).
   */
  DSB("dsb"),

  /**
   * Duala (Kamerun) (dua).
   */
  DUA("dua"),

  /**
   * Diola (Senegal) (dyo).
   */
  DYO("dyo"),

  /**
   * Dzongkha (Bhutan) (dzo).
   */
  DZO("dzo", TwoLetterLanguageCode.DZ),

  /**
   * Embu (ebu).
   */
  EBU("ebu"),

  /**
   * Griechisch (ell).
   */
  ELL("ell", TwoLetterLanguageCode.EL),

  /**
   * Englisch (Niue) (eng).
   */
  ENG("eng", TwoLetterLanguageCode.EN),

  /**
   * Esperanto (Welt) (epo).
   */
  EPO("epo", TwoLetterLanguageCode.EO),

  /**
   * Estnisch (Estland) (est).
   */
  EST("est", TwoLetterLanguageCode.ET),

  /**
   * Baskisch (eus).
   */
  EUS("eus", TwoLetterLanguageCode.EU),

  /**
   * Ewe (ewe).
   */
  EWE("ewe", TwoLetterLanguageCode.EE),

  /**
   * Ewondo (ewo).
   */
  EWO("ewo"),

  /**
   * Färöisch (Dänemark) (fao).
   */
  FAO("fao", TwoLetterLanguageCode.FO),

  /**
   * Persisch (fas).
   */
  FAS("fas", TwoLetterLanguageCode.FA),

  /**
   * Fidschi (fij).
   */
  FIJ("fij", TwoLetterLanguageCode.FJ),

  /**
   * Filipino (Philippinen) (fil).
   */
  FIL("fil"),

  /**
   * Finnisch (Finnland) (fin).
   */
  FIN("fin", TwoLetterLanguageCode.FI),

  /**
   * Französisch (St. Pierre und Miquelon) (fra).
   */
  FRA("fra", TwoLetterLanguageCode.FR),

  /**
   * Westfriesisch (Niederlande) (fry).
   */
  FRY("fry", TwoLetterLanguageCode.FY),

  /**
   * Ful (Lateinisch, Mauretanien) (ful).
   */
  FUL("ful", TwoLetterLanguageCode.FF),

  /**
   * Friaulisch (fur).
   */
  FUR("fur"),

  /**
   * Schottisches Gälisch (Vereinigtes Königreich) (gla).
   */
  GLA("gla", TwoLetterLanguageCode.GD),

  /**
   * Irisch (gle).
   */
  GLE("gle", TwoLetterLanguageCode.GA),

  /**
   * Galicisch (glg).
   */
  GLG("glg", TwoLetterLanguageCode.GL),

  /**
   * Manx (Isle of Man) (glv).
   */
  GLV("glv", TwoLetterLanguageCode.GV),

  /**
   * Guaraní (grn).
   */
  GRN("grn", TwoLetterLanguageCode.GN),

  /**
   * Schweizerdeutsch (gsw).
   */
  GSW("gsw"),

  /**
   * Gujarati (guj).
   */
  GUJ("guj", TwoLetterLanguageCode.GU),

  /**
   * Gusii (Kenia) (guz).
   */
  GUZ("guz"),

  /**
   * Haiti-Kreolisch (hat).
   */
  HAT("hat", TwoLetterLanguageCode.HT),

  /**
   * Haussa (hau).
   */
  HAU("hau", TwoLetterLanguageCode.HA),

  /**
   * Hawaiisch (Vereinigte Staaten) (haw).
   */
  HAW("haw"),

  /**
   * Hebräisch (heb).
   */
  HEB("heb", TwoLetterLanguageCode.IW, TwoLetterLanguageCode.HE),

  /**
   * Herero (her).
   */
  HER("her", TwoLetterLanguageCode.HZ),

  /**
   * Hindi (hin).
   */
  HIN("hin", TwoLetterLanguageCode.HI),

  /**
   * Hiri-Motu (hmo).
   */
  HMO("hmo", TwoLetterLanguageCode.HO),

  /**
   * Kroatisch (Kroatien) (hrv).
   */
  HRV("hrv", TwoLetterLanguageCode.HR),

  /**
   * Obersorbisch (hsb).
   */
  HSB("hsb"),

  /**
   * Ungarisch (Ungarn) (hun).
   */
  HUN("hun", TwoLetterLanguageCode.HU),

  /**
   * Armenisch (hye).
   */
  HYE("hye", TwoLetterLanguageCode.HY),

  /**
   * Igbo (ibo).
   */
  IBO("ibo", TwoLetterLanguageCode.IG),

  /**
   * Ido (ido).
   */
  IDO("ido", TwoLetterLanguageCode.IO),

  /**
   * Yi (iii).
   */
  III("iii", TwoLetterLanguageCode.II),

  /**
   * Inuktitut (iku).
   */
  IKU("iku", TwoLetterLanguageCode.IU),

  /**
   * Interlingue (ile).
   */
  ILE("ile", TwoLetterLanguageCode.IE),

  /**
   * Interlingua (Welt) (ina).
   */
  INA("ina", TwoLetterLanguageCode.IA),

  /**
   * Indonesisch (ind).
   */
  IND("ind", TwoLetterLanguageCode.IN, TwoLetterLanguageCode.ID),

  /**
   * Inupiak (ipk).
   */
  IPK("ipk", TwoLetterLanguageCode.IK),

  /**
   * Isländisch (Island) (isl).
   */
  ISL("isl", TwoLetterLanguageCode.IS),

  /**
   * Italienisch (San Marino) (ita).
   */
  ITA("ita", TwoLetterLanguageCode.IT),

  /**
   * Javanisch (jav).
   */
  JAV("jav", TwoLetterLanguageCode.JV),

  /**
   * Ngomba (jgo).
   */
  JGO("jgo"),

  /**
   * Machame (Tansania) (jmc).
   */
  JMC("jmc"),

  /**
   * Japanisch (Japan, JP, Japanischer Kalender) (jpn).
   */
  JPN("jpn", TwoLetterLanguageCode.JA),

  /**
   * Kabylisch (kab).
   */
  KAB("kab"),

  /**
   * Grönländisch (Grönland) (kal).
   */
  KAL("kal", TwoLetterLanguageCode.KL),

  /**
   * Kamba (kam).
   */
  KAM("kam"),

  /**
   * Kannada (Indien) (kan).
   */
  KAN("kan", TwoLetterLanguageCode.KN),

  /**
   * Kaschmiri (Indien) (kas).
   */
  KAS("kas", TwoLetterLanguageCode.KS),

  /**
   * Georgisch (Georgien) (kat).
   */
  KAT("kat", TwoLetterLanguageCode.KA),

  /**
   * Kanuri (kau).
   */
  KAU("kau", TwoLetterLanguageCode.KR),

  /**
   * Kasachisch (kaz).
   */
  KAZ("kaz", TwoLetterLanguageCode.KK),

  /**
   * Makonde (Tansania) (kde).
   */
  KDE("kde"),

  /**
   * Kabuverdianu (Cabo Verde) (kea).
   */
  KEA("kea"),

  /**
   * Khmer (khm).
   */
  KHM("khm", TwoLetterLanguageCode.KM),

  /**
   * Koyra Chiini (khq).
   */
  KHQ("khq"),

  /**
   * Kikuyu (Kenia) (kik).
   */
  KIK("kik", TwoLetterLanguageCode.KI),

  /**
   * Kinyarwanda (kin).
   */
  KIN("kin", TwoLetterLanguageCode.RW),

  /**
   * Kirgisisch (Kirgisistan) (kir).
   */
  KIR("kir", TwoLetterLanguageCode.KY),

  /**
   * Kako (kkj).
   */
  KKJ("kkj"),

  /**
   * Kalenjin (kln).
   */
  KLN("kln"),

  /**
   * Konkani (kok).
   */
  KOK("kok"),

  /**
   * Komi (kom).
   */
  KOM("kom", TwoLetterLanguageCode.KV),

  /**
   * Kongolesisch (kon).
   */
  KON("kon", TwoLetterLanguageCode.KG),

  /**
   * Koreanisch (Nordkorea) (kor).
   */
  KOR("kor", TwoLetterLanguageCode.KO),

  /**
   * Shambala (ksb).
   */
  KSB("ksb"),

  /**
   * Bafia (Kamerun) (ksf).
   */
  KSF("ksf"),

  /**
   * Kölsch (Deutschland) (ksh).
   */
  KSH("ksh"),

  /**
   * Kwanyama (kua).
   */
  KUA("kua", TwoLetterLanguageCode.KJ),

  /**
   * Kurdisch (Türkei) (kur).
   */
  KUR("kur", TwoLetterLanguageCode.KU),

  /**
   * Langi (lag).
   */
  LAG("lag"),

  /**
   * Laotisch (lao).
   */
  LAO("lao", TwoLetterLanguageCode.LO),

  /**
   * Latein (lat).
   */
  LAT("lat", TwoLetterLanguageCode.LA),

  /**
   * Lettisch (lav).
   */
  LAV("lav", TwoLetterLanguageCode.LV),

  /**
   * Limburgisch (lim).
   */
  LIM("lim", TwoLetterLanguageCode.LI),

  /**
   * Lingala (Kongo-Kinshasa) (lin).
   */
  LIN("lin", TwoLetterLanguageCode.LN),

  /**
   * Litauisch (Litauen) (lit).
   */
  LIT("lit", TwoLetterLanguageCode.LT),

  /**
   * Lakota (Vereinigte Staaten) (lkt).
   */
  LKT("lkt"),

  /**
   * Nördliches Luri (Iran) (lrc).
   */
  LRC("lrc"),

  /**
   * Luxemburgisch (Luxemburg) (ltz).
   */
  LTZ("ltz", TwoLetterLanguageCode.LB),

  /**
   * Luba-Katanga (Kongo-Kinshasa) (lub).
   */
  LUB("lub", TwoLetterLanguageCode.LU),

  /**
   * Ganda (Uganda) (lug).
   */
  LUG("lug", TwoLetterLanguageCode.LG),

  /**
   * Luo (luo).
   */
  LUO("luo"),

  /**
   * Luhya (Kenia) (luy).
   */
  LUY("luy"),

  /**
   * Marschallesisch (mah).
   */
  MAH("mah", TwoLetterLanguageCode.MH),

  /**
   * Malayalam (Indien) (mal).
   */
  MAL("mal", TwoLetterLanguageCode.ML),

  /**
   * Marathi (Indien) (mar).
   */
  MAR("mar", TwoLetterLanguageCode.MR),

  /**
   * Massai (Kenia) (mas).
   */
  MAS("mas"),

  /**
   * Meru (Kenia) (mer).
   */
  MER("mer"),

  /**
   * Morisyen (Mauritius) (mfe).
   */
  MFE("mfe"),

  /**
   * Makhuwa-Meetto (mgh).
   */
  MGH("mgh"),

  /**
   * Meta’ (mgo).
   */
  MGO("mgo"),

  /**
   * Mazedonisch (Nordmazedonien) (mkd).
   */
  MKD("mkd", TwoLetterLanguageCode.MK),

  /**
   * Madagassisch (mlg).
   */
  MLG("mlg", TwoLetterLanguageCode.MG),

  /**
   * Maltesisch (mlt).
   */
  MLT("mlt", TwoLetterLanguageCode.MT),

  /**
   * Moldavisch (mol).
   */
  MOL("mol", TwoLetterLanguageCode.MO),

  /**
   * Mongolisch (Mongolei) (mon).
   */
  MON("mon", TwoLetterLanguageCode.MN),

  /**
   * Maori (Neuseeland) (mri).
   */
  MRI("mri", TwoLetterLanguageCode.MI),

  /**
   * Malaiisch (Malaysia) (msa).
   */
  MSA("msa", TwoLetterLanguageCode.MS),

  /**
   * Mundang (mua).
   */
  MUA("mua"),

  /**
   * Birmanisch (Myanmar) (mya).
   */
  MYA("mya", TwoLetterLanguageCode.MY),

  /**
   * Masanderanisch (Iran) (mzn).
   */
  MZN("mzn"),

  /**
   * Nama (naq).
   */
  NAQ("naq"),

  /**
   * Nauruisch (nau).
   */
  NAU("nau", TwoLetterLanguageCode.NA),

  /**
   * Navajo (nav).
   */
  NAV("nav", TwoLetterLanguageCode.NV),

  /**
   * Süd-Ndebele (nbl).
   */
  NBL("nbl", TwoLetterLanguageCode.NR),

  /**
   * Nord-Ndebele (nde).
   */
  NDE("nde", TwoLetterLanguageCode.ND),

  /**
   * Ndonga (ndo).
   */
  NDO("ndo", TwoLetterLanguageCode.NG),

  /**
   * Niederdeutsch (nds).
   */
  NDS("nds"),

  /**
   * Nepalesisch (Indien) (nep).
   */
  NEP("nep", TwoLetterLanguageCode.NE),

  /**
   * Niederländisch (Niederlande) (nld).
   */
  NLD("nld", TwoLetterLanguageCode.NL),

  /**
   * Kwasio (nmg).
   */
  NMG("nmg"),

  /**
   * Ngiemboon (Kamerun) (nnh).
   */
  NNH("nnh"),

  /**
   * Norwegisch Nynorsk (nno).
   */
  NNO("nno", TwoLetterLanguageCode.NN),

  /**
   * Norwegisch Bokmål (Spitzbergen und Jan Mayen) (nob).
   */
  NOB("nob", TwoLetterLanguageCode.NB),

  /**
   * Norwegisch (Norwegen, Nynorsk) (nor).
   */
  NOR("nor", TwoLetterLanguageCode.NO),

  /**
   * Nuer (Südsudan) (nus).
   */
  NUS("nus"),

  /**
   * Nyanja (nya).
   */
  NYA("nya", TwoLetterLanguageCode.NY),

  /**
   * Nyankole (Uganda) (nyn).
   */
  NYN("nyn"),

  /**
   * Okzitanisch (oci).
   */
  OCI("oci", TwoLetterLanguageCode.OC),

  /**
   * Ojibwa (oji).
   */
  OJI("oji", TwoLetterLanguageCode.OJ),

  /**
   * Oriya (Indien) (ori).
   */
  ORI("ori", TwoLetterLanguageCode.OR),

  /**
   * Oromo (Kenia) (orm).
   */
  ORM("orm", TwoLetterLanguageCode.OM),

  /**
   * Ossetisch (oss).
   */
  OSS("oss", TwoLetterLanguageCode.OS),

  /**
   * Punjabi (Gurmukhi, Indien) (pan).
   */
  PAN("pan", TwoLetterLanguageCode.PA),

  /**
   * Pali (pli).
   */
  PLI("pli", TwoLetterLanguageCode.PI),

  /**
   * Polnisch (Polen) (pol).
   */
  POL("pol", TwoLetterLanguageCode.PL),

  /**
   * Portugiesisch (Sonderverwaltungsregion Macau) (por).
   */
  POR("por", TwoLetterLanguageCode.PT),

  /**
   * Altpreußisch (prg).
   */
  PRG("prg"),

  /**
   * Paschtu (pus).
   */
  PUS("pus", TwoLetterLanguageCode.PS),

  /**
   * Quechua (que).
   */
  QUE("que", TwoLetterLanguageCode.QU),

  /**
   * Rombo (Tansania) (rof).
   */
  ROF("rof"),

  /**
   * Rätoromanisch (roh).
   */
  ROH("roh", TwoLetterLanguageCode.RM),

  /**
   * Rumänisch (ron).
   */
  RON("ron", TwoLetterLanguageCode.RO),

  /**
   * Rundi (run).
   */
  RUN("run", TwoLetterLanguageCode.RN),

  /**
   * Russisch (rus).
   */
  RUS("rus", TwoLetterLanguageCode.RU),

  /**
   * Rwa (Tansania) (rwk).
   */
  RWK("rwk"),

  /**
   * Sango (Zentralafrikanische Republik) (sag).
   */
  SAG("sag", TwoLetterLanguageCode.SG),

  /**
   * Jakutisch (sah).
   */
  SAH("sah"),

  /**
   * Sanskrit (san).
   */
  SAN("san", TwoLetterLanguageCode.SA),

  /**
   * Samburu (saq).
   */
  SAQ("saq"),

  /**
   * Sangu (sbp).
   */
  SBP("sbp"),

  /**
   * Sena (seh).
   */
  SEH("seh"),

  /**
   * Koyra Senni (ses).
   */
  SES("ses"),

  /**
   * Taschelhit (Tifinagh, Marokko) (shi).
   */
  SHI("shi"),

  /**
   * Singhalesisch (Sri Lanka) (sin).
   */
  SIN("sin", TwoLetterLanguageCode.SI),

  /**
   * Slowakisch (slk).
   */
  SLK("slk", TwoLetterLanguageCode.SK),

  /**
   * Slowenisch (slv).
   */
  SLV("slv", TwoLetterLanguageCode.SL),

  /**
   * Nordsamisch (Norwegen) (sme).
   */
  SME("sme", TwoLetterLanguageCode.SE),

  /**
   * Inari-Samisch (smn).
   */
  SMN("smn"),

  /**
   * Samoanisch (smo).
   */
  SMO("smo", TwoLetterLanguageCode.SM),

  /**
   * Shona (sna).
   */
  SNA("sna", TwoLetterLanguageCode.SN),

  /**
   * Sindhi (snd).
   */
  SND("snd", TwoLetterLanguageCode.SD),

  /**
   * Somali (Kenia) (som).
   */
  SOM("som", TwoLetterLanguageCode.SO),

  /**
   * Süd-Sotho (sot).
   */
  SOT("sot", TwoLetterLanguageCode.ST),

  /**
   * Spanisch (Bolivien) (spa).
   */
  SPA("spa", TwoLetterLanguageCode.ES),

  /**
   * Albanisch (Nordmazedonien) (sqi).
   */
  SQI("sqi", TwoLetterLanguageCode.SQ),

  /**
   * Sardisch (srd).
   */
  SRD("srd", TwoLetterLanguageCode.SC),

  /**
   * Serbisch (Kyrillisch, Montenegro) (srp).
   */
  SRP("srp", TwoLetterLanguageCode.SR),

  /**
   * Swazi (ssw).
   */
  SSW("ssw", TwoLetterLanguageCode.SS),

  /**
   * Sundanesisch (sun).
   */
  SUN("sun", TwoLetterLanguageCode.SU),

  /**
   * Suaheli (Uganda) (swa).
   */
  SWA("swa", TwoLetterLanguageCode.SW),

  /**
   * Schwedisch (Schweden) (swe).
   */
  SWE("swe", TwoLetterLanguageCode.SV),

  /**
   * Tahitisch (tah).
   */
  TAH("tah", TwoLetterLanguageCode.TY),

  /**
   * Tamil (Singapur) (tam).
   */
  TAM("tam", TwoLetterLanguageCode.TA),

  /**
   * Tatarisch (Russland) (tat).
   */
  TAT("tat", TwoLetterLanguageCode.TT),

  /**
   * Telugu (tel).
   */
  TEL("tel", TwoLetterLanguageCode.TE),

  /**
   * Teso (teo).
   */
  TEO("teo"),

  /**
   * Tadschikisch (Tadschikistan) (tgk).
   */
  TGK("tgk", TwoLetterLanguageCode.TG),

  /**
   * Tagalog (tgl).
   */
  TGL("tgl", TwoLetterLanguageCode.TL),

  /**
   * Thailändisch (Thailand, TH, Thai-Ziffern) (tha).
   */
  THA("tha", TwoLetterLanguageCode.TH),

  /**
   * Tigrinya (Äthiopien) (tir).
   */
  TIR("tir", TwoLetterLanguageCode.TI),

  /**
   * Tongaisch (ton).
   */
  TON("ton", TwoLetterLanguageCode.TO),

  /**
   * Tswana (tsn).
   */
  TSN("tsn", TwoLetterLanguageCode.TN),

  /**
   * Tsonga (tso).
   */
  TSO("tso", TwoLetterLanguageCode.TS),

  /**
   * Turkmenisch (Turkmenistan) (tuk).
   */
  TUK("tuk", TwoLetterLanguageCode.TK),

  /**
   * Türkisch (Türkei) (tur).
   */
  TUR("tur", TwoLetterLanguageCode.TR),

  /**
   * Twi (twi).
   */
  TWI("twi", TwoLetterLanguageCode.TW),

  /**
   * Tasawaq (Niger) (twq).
   */
  TWQ("twq"),

  /**
   * Zentralatlas-Tamazight (tzm).
   */
  TZM("tzm"),

  /**
   * Uigurisch (China) (uig).
   */
  UIG("uig", TwoLetterLanguageCode.UG),

  /**
   * Ukrainisch (Ukraine) (ukr).
   */
  UKR("ukr", TwoLetterLanguageCode.UK),

  /**
   * Urdu (Pakistan) (urd).
   */
  URD("urd", TwoLetterLanguageCode.UR),

  /**
   * Usbekisch (Lateinisch, Usbekistan) (uzb).
   */
  UZB("uzb", TwoLetterLanguageCode.UZ),

  /**
   * Vai (Vai) (vai).
   */
  VAI("vai"),

  /**
   * Venda (ven).
   */
  VEN("ven", TwoLetterLanguageCode.VE),

  /**
   * Vietnamesisch (Vietnam) (vie).
   */
  VIE("vie", TwoLetterLanguageCode.VI),

  /**
   * Volapük (Welt) (vol).
   */
  VOL("vol", TwoLetterLanguageCode.VO),

  /**
   * Vunjo (Tansania) (vun).
   */
  VUN("vun"),

  /**
   * Walliserdeutsch (wae).
   */
  WAE("wae"),

  /**
   * Wallonisch (wln).
   */
  WLN("wln", TwoLetterLanguageCode.WA),

  /**
   * Wolof (wol).
   */
  WOL("wol", TwoLetterLanguageCode.WO),

  /**
   * Xhosa (Südafrika) (xho).
   */
  XHO("xho", TwoLetterLanguageCode.XH),

  /**
   * Soga (Uganda) (xog).
   */
  XOG("xog"),

  /**
   * Yangben (yav).
   */
  YAV("yav"),

  /**
   * Jiddish (yid).
   */
  YID("yid", TwoLetterLanguageCode.JI, TwoLetterLanguageCode.YI),

  /**
   * Yoruba (Nigeria) (yor).
   */
  YOR("yor", TwoLetterLanguageCode.YO),

  /**
   * Kantonesisch (Vereinfacht, China) (yue).
   */
  YUE("yue"),

  /**
   * Tamazight (zgh).
   */
  ZGH("zgh"),

  /**
   * Zhuang (zha).
   */
  ZHA("zha", TwoLetterLanguageCode.ZA),

  /**
   * Chinesisch (Vereinfacht, Singapur) (zho).
   */
  ZHO("zho", TwoLetterLanguageCode.ZH),

  /**
   * Zulu (Südafrika) (zul).
   */
  ZUL("zul", TwoLetterLanguageCode.ZU);

  private final String value;

  private final TwoLetterLanguageCode[] twoLetterLanguageCodes;

  ThreeLetterLanguageCode(
      final String value,
      final TwoLetterLanguageCode... twoLetterLanguageCodes) {

    this.value = value;
    this.twoLetterLanguageCodes = twoLetterLanguageCodes;
  }

  /**
   * Gets two letter language code.
   *
   * @return the two letter language code
   */
  public TwoLetterLanguageCode getTwoLetterLanguageCode() {
    return twoLetterLanguageCodes != null
        && twoLetterLanguageCodes.length > 0 ? twoLetterLanguageCodes[0] : null;
  }

  @Override
  @JsonValue
  public String toString() {
    return value;
  }

  /**
   * Has two letter code boolean.
   *
   * @return the boolean
   */
  public boolean hasTwoLetterCode() {
    return getTwoLetterLanguageCode() != null;
  }

  /**
   * To locale.
   *
   * @return the locale
   */
  public Locale toLocale() {
    return Arrays
        .stream(Locale.getAvailableLocales())
        .filter(this::hasIsoLanguage)
        .filter(locale -> value.equalsIgnoreCase(locale.getISO3Language()))
        .findAny()
        .map(locale -> new Locale(locale.getLanguage()))
        .orElseGet(() -> Arrays.stream(Locale.getISOLanguages())
            .map(Locale::new)
            .filter(this::hasIsoLanguage)
            .filter(locale -> value.equalsIgnoreCase(locale.getISO3Language()))
            .findAny()
            .map(locale -> new Locale(locale.getLanguage()))
            .orElse(null));
  }

  private boolean hasIsoLanguage(final Locale locale) {
    try {
      return StringUtils.hasText(locale.getISO3Language());
    } catch (MissingResourceException e) {
      return false;
    }
  }

  /**
   * From three letter language code.
   *
   * @param text the text
   * @return the three letter language code
   */
  @JsonCreator
  public static ThreeLetterLanguageCode fromValue(final String text) {
    return fromValue(text, null);
  }

  /**
   * From value three letter language code.
   *
   * @param text the text
   * @param defaultCode the default code
   * @return the three letter language code
   */
  @SuppressWarnings("DuplicatedCode")
  public static ThreeLetterLanguageCode fromValue(
      final String text,
      final ThreeLetterLanguageCode defaultCode) {

    String source = text != null ? text.trim().toLowerCase() : null;
    if (source == null || source.length() < 2) {
      return defaultCode;
    }
    source = source.replace("-", "_");
    int index = source.indexOf('_');
    if (index > -1) {
      source = source.substring(0, index).trim();
    }
    if (source.length() < 2 || source.length() > 3) {
      return defaultCode;
    }
    for (ThreeLetterLanguageCode b : ThreeLetterLanguageCode.values()) {
      if (b.value.equals(source) || contains(b.twoLetterLanguageCodes, source)) {
        return b;
      }
    }
    return defaultCode;
  }

  private static boolean contains(TwoLetterLanguageCode[] codes, String text) {
    return codes != null && Arrays.stream(codes)
        .map(TwoLetterLanguageCode::toString).anyMatch(code -> code.equals(text));
  }

  /**
   * From locale.
   *
   * @param locale the locale
   * @return the three letter language code
   */
  public static ThreeLetterLanguageCode fromLocale(final Locale locale) {
    return fromLocale(locale, null);
  }

  /**
   * From locale three letter language code.
   *
   * @param locale the locale
   * @param defaultCode the default code
   * @return the three letter language code
   */
  public static ThreeLetterLanguageCode fromLocale(
      final Locale locale,
      final ThreeLetterLanguageCode defaultCode) {
    if (locale == null || !StringUtils.hasText(locale.getISO3Language())) {
      return defaultCode;
    }
    return fromValue(locale.getISO3Language(), defaultCode);
  }

}

