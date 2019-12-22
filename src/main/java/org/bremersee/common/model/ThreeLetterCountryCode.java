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
import java.util.regex.Pattern;
import org.springframework.util.StringUtils;

/**
 * ISO 3166-1 ALPHA-3 country codes from Java Locale.
 */
public enum ThreeLetterCountryCode {

  /**
   * Aruba (ABW).
   */
  ABW("ABW", TwoLetterCountryCode.AW),

  /**
   * Afghanistan (AFG).
   */
  AFG("AFG", TwoLetterCountryCode.AF),

  /**
   * Angola (AGO).
   */
  AGO("AGO", TwoLetterCountryCode.AO),

  /**
   * Anguilla (AIA).
   */
  AIA("AIA", TwoLetterCountryCode.AI),

  /**
   * Ålandinseln (ALA).
   */
  ALA("ALA", TwoLetterCountryCode.AX),

  /**
   * Albanien (ALB).
   */
  ALB("ALB", TwoLetterCountryCode.AL),

  /**
   * Andorra (AND).
   */
  AND("AND", TwoLetterCountryCode.AD),

  /**
   * Vereinigte Arabische Emirate (ARE).
   */
  ARE("ARE", TwoLetterCountryCode.AE),

  /**
   * Argentinien (ARG).
   */
  ARG("ARG", TwoLetterCountryCode.AR),

  /**
   * Armenien (ARM).
   */
  ARM("ARM", TwoLetterCountryCode.AM),

  /**
   * Amerikanisch-Samoa (ASM).
   */
  ASM("ASM", TwoLetterCountryCode.AS),

  /**
   * Antarktis (ATA).
   */
  ATA("ATA", TwoLetterCountryCode.AQ),

  /**
   * Französische Süd- und Antarktisgebiete (ATF).
   */
  ATF("ATF", TwoLetterCountryCode.TF),

  /**
   * Antigua und Barbuda (ATG).
   */
  ATG("ATG", TwoLetterCountryCode.AG),

  /**
   * Australien (AUS).
   */
  AUS("AUS", TwoLetterCountryCode.AU),

  /**
   * Österreich (AUT).
   */
  AUT("AUT", TwoLetterCountryCode.AT),

  /**
   * Aserbaidschan (AZE).
   */
  AZE("AZE", TwoLetterCountryCode.AZ),

  /**
   * Burundi (BDI).
   */
  BDI("BDI", TwoLetterCountryCode.BI),

  /**
   * Belgien (BEL).
   */
  BEL("BEL", TwoLetterCountryCode.BE),

  /**
   * Benin (BEN).
   */
  BEN("BEN", TwoLetterCountryCode.BJ),

  /**
   * Bonaire, Sint Eustatius und Saba (BES).
   */
  BES("BES", TwoLetterCountryCode.BQ),

  /**
   * Burkina Faso (BFA).
   */
  BFA("BFA", TwoLetterCountryCode.BF),

  /**
   * Bangladesch (BGD).
   */
  BGD("BGD", TwoLetterCountryCode.BD),

  /**
   * Bulgarien (BGR).
   */
  BGR("BGR", TwoLetterCountryCode.BG),

  /**
   * Bahrain (BHR).
   */
  BHR("BHR", TwoLetterCountryCode.BH),

  /**
   * Bahamas (BHS).
   */
  BHS("BHS", TwoLetterCountryCode.BS),

  /**
   * Bosnien und Herzegowina (BIH).
   */
  BIH("BIH", TwoLetterCountryCode.BA),

  /**
   * St. Barthélemy (BLM).
   */
  BLM("BLM", TwoLetterCountryCode.BL),

  /**
   * Belarus (BLR).
   */
  BLR("BLR", TwoLetterCountryCode.BY),

  /**
   * Belize (BLZ).
   */
  BLZ("BLZ", TwoLetterCountryCode.BZ),

  /**
   * Bermuda (BMU).
   */
  BMU("BMU", TwoLetterCountryCode.BM),

  /**
   * Bolivien (BOL).
   */
  BOL("BOL", TwoLetterCountryCode.BO),

  /**
   * Brasilien (BRA).
   */
  BRA("BRA", TwoLetterCountryCode.BR),

  /**
   * Barbados (BRB).
   */
  BRB("BRB", TwoLetterCountryCode.BB),

  /**
   * Brunei Darussalam (BRN).
   */
  BRN("BRN", TwoLetterCountryCode.BN),

  /**
   * Bhutan (BTN).
   */
  BTN("BTN", TwoLetterCountryCode.BT),

  /**
   * Bouvetinsel (BVT).
   */
  BVT("BVT", TwoLetterCountryCode.BV),

  /**
   * Botsuana (BWA).
   */
  BWA("BWA", TwoLetterCountryCode.BW),

  /**
   * Zentralafrikanische Republik (CAF).
   */
  CAF("CAF", TwoLetterCountryCode.CF),

  /**
   * Kanada (CAN).
   */
  CAN("CAN", TwoLetterCountryCode.CA),

  /**
   * Kokosinseln (CCK).
   */
  CCK("CCK", TwoLetterCountryCode.CC),

  /**
   * Schweiz (CHE).
   */
  CHE("CHE", TwoLetterCountryCode.CH),

  /**
   * Chile (CHL).
   */
  CHL("CHL", TwoLetterCountryCode.CL),

  /**
   * China (CHN).
   */
  CHN("CHN", TwoLetterCountryCode.CN),

  /**
   * Côte d’Ivoire (CIV).
   */
  CIV("CIV", TwoLetterCountryCode.CI),

  /**
   * Kamerun (CMR).
   */
  CMR("CMR", TwoLetterCountryCode.CM),

  /**
   * Kongo-Kinshasa (COD).
   */
  COD("COD", TwoLetterCountryCode.CD),

  /**
   * Kongo-Brazzaville (COG).
   */
  COG("COG", TwoLetterCountryCode.CG),

  /**
   * Cookinseln (COK).
   */
  COK("COK", TwoLetterCountryCode.CK),

  /**
   * Kolumbien (COL).
   */
  COL("COL", TwoLetterCountryCode.CO),

  /**
   * Komoren (COM).
   */
  COM("COM", TwoLetterCountryCode.KM),

  /**
   * Cabo Verde (CPV).
   */
  CPV("CPV", TwoLetterCountryCode.CV),

  /**
   * Costa Rica (CRI).
   */
  CRI("CRI", TwoLetterCountryCode.CR),

  /**
   * Kuba (CUB).
   */
  CUB("CUB", TwoLetterCountryCode.CU),

  /**
   * Curaçao (CUW).
   */
  CUW("CUW", TwoLetterCountryCode.CW),

  /**
   * Weihnachtsinsel (CXR).
   */
  CXR("CXR", TwoLetterCountryCode.CX),

  /**
   * Kaimaninseln (CYM).
   */
  CYM("CYM", TwoLetterCountryCode.KY),

  /**
   * Zypern (CYP).
   */
  CYP("CYP", TwoLetterCountryCode.CY),

  /**
   * Tschechien (CZE).
   */
  CZE("CZE", TwoLetterCountryCode.CZ),

  /**
   * Deutschland (DEU).
   */
  DEU("DEU", TwoLetterCountryCode.DE),

  /**
   * Dschibuti (DJI).
   */
  DJI("DJI", TwoLetterCountryCode.DJ),

  /**
   * Dominica (DMA).
   */
  DMA("DMA", TwoLetterCountryCode.DM),

  /**
   * Dänemark (DNK).
   */
  DNK("DNK", TwoLetterCountryCode.DK),

  /**
   * Dominikanische Republik (DOM).
   */
  DOM("DOM", TwoLetterCountryCode.DO),

  /**
   * Algerien (DZA).
   */
  DZA("DZA", TwoLetterCountryCode.DZ),

  /**
   * Ecuador (ECU).
   */
  ECU("ECU", TwoLetterCountryCode.EC),

  /**
   * Ägypten (EGY).
   */
  EGY("EGY", TwoLetterCountryCode.EG),

  /**
   * Eritrea (ERI).
   */
  ERI("ERI", TwoLetterCountryCode.ER),

  /**
   * Westsahara (ESH).
   */
  ESH("ESH", TwoLetterCountryCode.EH),

  /**
   * Spanien (ESP).
   */
  ESP("ESP", TwoLetterCountryCode.ES),

  /**
   * Estland (EST).
   */
  EST("EST", TwoLetterCountryCode.EE),

  /**
   * Äthiopien (ETH).
   */
  ETH("ETH", TwoLetterCountryCode.ET),

  /**
   * Finnland (FIN).
   */
  FIN("FIN", TwoLetterCountryCode.FI),

  /**
   * Fidschi (FJI).
   */
  FJI("FJI", TwoLetterCountryCode.FJ),

  /**
   * Falklandinseln (FLK).
   */
  FLK("FLK", TwoLetterCountryCode.FK),

  /**
   * Frankreich (FRA).
   */
  FRA("FRA", TwoLetterCountryCode.FR),

  /**
   * Färöer (FRO).
   */
  FRO("FRO", TwoLetterCountryCode.FO),

  /**
   * Mikronesien (FSM).
   */
  FSM("FSM", TwoLetterCountryCode.FM),

  /**
   * Gabun (GAB).
   */
  GAB("GAB", TwoLetterCountryCode.GA),

  /**
   * Vereinigtes Königreich (GBR).
   */
  GBR("GBR", TwoLetterCountryCode.GB),

  /**
   * Georgien (GEO).
   */
  GEO("GEO", TwoLetterCountryCode.GE),

  /**
   * Guernsey (GGY).
   */
  GGY("GGY", TwoLetterCountryCode.GG),

  /**
   * Ghana (GHA).
   */
  GHA("GHA", TwoLetterCountryCode.GH),

  /**
   * Gibraltar (GIB).
   */
  GIB("GIB", TwoLetterCountryCode.GI),

  /**
   * Guinea (GIN).
   */
  GIN("GIN", TwoLetterCountryCode.GN),

  /**
   * Guadeloupe (GLP).
   */
  GLP("GLP", TwoLetterCountryCode.GP),

  /**
   * Gambia (GMB).
   */
  GMB("GMB", TwoLetterCountryCode.GM),

  /**
   * Guinea-Bissau (GNB).
   */
  GNB("GNB", TwoLetterCountryCode.GW),

  /**
   * Äquatorialguinea (GNQ).
   */
  GNQ("GNQ", TwoLetterCountryCode.GQ),

  /**
   * Griechenland (GRC).
   */
  GRC("GRC", TwoLetterCountryCode.GR),

  /**
   * Grenada (GRD).
   */
  GRD("GRD", TwoLetterCountryCode.GD),

  /**
   * Grönland (GRL).
   */
  GRL("GRL", TwoLetterCountryCode.GL),

  /**
   * Guatemala (GTM).
   */
  GTM("GTM", TwoLetterCountryCode.GT),

  /**
   * Französisch-Guayana (GUF).
   */
  GUF("GUF", TwoLetterCountryCode.GF),

  /**
   * Guam (GUM).
   */
  GUM("GUM", TwoLetterCountryCode.GU),

  /**
   * Guyana (GUY).
   */
  GUY("GUY", TwoLetterCountryCode.GY),

  /**
   * Sonderverwaltungsregion Hongkong (HKG).
   */
  HKG("HKG", TwoLetterCountryCode.HK),

  /**
   * Heard und McDonaldinseln (HMD).
   */
  HMD("HMD", TwoLetterCountryCode.HM),

  /**
   * Honduras (HND).
   */
  HND("HND", TwoLetterCountryCode.HN),

  /**
   * Kroatien (HRV).
   */
  HRV("HRV", TwoLetterCountryCode.HR),

  /**
   * Haiti (HTI).
   */
  HTI("HTI", TwoLetterCountryCode.HT),

  /**
   * Ungarn (HUN).
   */
  HUN("HUN", TwoLetterCountryCode.HU),

  /**
   * Indonesien (IDN).
   */
  IDN("IDN", TwoLetterCountryCode.ID),

  /**
   * Isle of Man (IMN).
   */
  IMN("IMN", TwoLetterCountryCode.IM),

  /**
   * Indien (IND).
   */
  IND("IND", TwoLetterCountryCode.IN),

  /**
   * Britisches Territorium im Indischen Ozean (IOT).
   */
  IOT("IOT", TwoLetterCountryCode.IO),

  /**
   * Irland (IRL).
   */
  IRL("IRL", TwoLetterCountryCode.IE),

  /**
   * Iran (IRN).
   */
  IRN("IRN", TwoLetterCountryCode.IR),

  /**
   * Irak (IRQ).
   */
  IRQ("IRQ", TwoLetterCountryCode.IQ),

  /**
   * Island (ISL).
   */
  ISL("ISL", TwoLetterCountryCode.IS),

  /**
   * Israel (ISR).
   */
  ISR("ISR", TwoLetterCountryCode.IL),

  /**
   * Italien (ITA).
   */
  ITA("ITA", TwoLetterCountryCode.IT),

  /**
   * Jamaika (JAM).
   */
  JAM("JAM", TwoLetterCountryCode.JM),

  /**
   * Jersey (JEY).
   */
  JEY("JEY", TwoLetterCountryCode.JE),

  /**
   * Jordanien (JOR).
   */
  JOR("JOR", TwoLetterCountryCode.JO),

  /**
   * Japan (JPN).
   */
  JPN("JPN", TwoLetterCountryCode.JP),

  /**
   * Kasachstan (KAZ).
   */
  KAZ("KAZ", TwoLetterCountryCode.KZ),

  /**
   * Kenia (KEN).
   */
  KEN("KEN", TwoLetterCountryCode.KE),

  /**
   * Kirgisistan (KGZ).
   */
  KGZ("KGZ", TwoLetterCountryCode.KG),

  /**
   * Kambodscha (KHM).
   */
  KHM("KHM", TwoLetterCountryCode.KH),

  /**
   * Kiribati (KIR).
   */
  KIR("KIR", TwoLetterCountryCode.KI),

  /**
   * St. Kitts und Nevis (KNA).
   */
  KNA("KNA", TwoLetterCountryCode.KN),

  /**
   * Südkorea (KOR).
   */
  KOR("KOR", TwoLetterCountryCode.KR),

  /**
   * Kuwait (KWT).
   */
  KWT("KWT", TwoLetterCountryCode.KW),

  /**
   * Laos (LAO).
   */
  LAO("LAO", TwoLetterCountryCode.LA),

  /**
   * Libanon (LBN).
   */
  LBN("LBN", TwoLetterCountryCode.LB),

  /**
   * Liberia (LBR).
   */
  LBR("LBR", TwoLetterCountryCode.LR),

  /**
   * Libyen (LBY).
   */
  LBY("LBY", TwoLetterCountryCode.LY),

  /**
   * St. Lucia (LCA).
   */
  LCA("LCA", TwoLetterCountryCode.LC),

  /**
   * Liechtenstein (LIE).
   */
  LIE("LIE", TwoLetterCountryCode.LI),

  /**
   * Sri Lanka (LKA).
   */
  LKA("LKA", TwoLetterCountryCode.LK),

  /**
   * Lesotho (LSO).
   */
  LSO("LSO", TwoLetterCountryCode.LS),

  /**
   * Litauen (LTU).
   */
  LTU("LTU", TwoLetterCountryCode.LT),

  /**
   * Luxemburg (LUX).
   */
  LUX("LUX", TwoLetterCountryCode.LU),

  /**
   * Lettland (LVA).
   */
  LVA("LVA", TwoLetterCountryCode.LV),

  /**
   * Sonderverwaltungsregion Macau (MAC).
   */
  MAC("MAC", TwoLetterCountryCode.MO),

  /**
   * St. Martin (MAF).
   */
  MAF("MAF", TwoLetterCountryCode.MF),

  /**
   * Marokko (MAR).
   */
  MAR("MAR", TwoLetterCountryCode.MA),

  /**
   * Monaco (MCO).
   */
  MCO("MCO", TwoLetterCountryCode.MC),

  /**
   * Republik Moldau (MDA).
   */
  MDA("MDA", TwoLetterCountryCode.MD),

  /**
   * Madagaskar (MDG).
   */
  MDG("MDG", TwoLetterCountryCode.MG),

  /**
   * Malediven (MDV).
   */
  MDV("MDV", TwoLetterCountryCode.MV),

  /**
   * Mexiko (MEX).
   */
  MEX("MEX", TwoLetterCountryCode.MX),

  /**
   * Marshallinseln (MHL).
   */
  MHL("MHL", TwoLetterCountryCode.MH),

  /**
   * Nordmazedonien (MKD).
   */
  MKD("MKD", TwoLetterCountryCode.MK),

  /**
   * Mali (MLI).
   */
  MLI("MLI", TwoLetterCountryCode.ML),

  /**
   * Malta (MLT).
   */
  MLT("MLT", TwoLetterCountryCode.MT),

  /**
   * Myanmar (MMR).
   */
  MMR("MMR", TwoLetterCountryCode.MM),

  /**
   * Montenegro (MNE).
   */
  MNE("MNE", TwoLetterCountryCode.ME),

  /**
   * Mongolei (MNG).
   */
  MNG("MNG", TwoLetterCountryCode.MN),

  /**
   * Nördliche Marianen (MNP).
   */
  MNP("MNP", TwoLetterCountryCode.MP),

  /**
   * Mosambik (MOZ).
   */
  MOZ("MOZ", TwoLetterCountryCode.MZ),

  /**
   * Mauretanien (MRT).
   */
  MRT("MRT", TwoLetterCountryCode.MR),

  /**
   * Montserrat (MSR).
   */
  MSR("MSR", TwoLetterCountryCode.MS),

  /**
   * Martinique (MTQ).
   */
  MTQ("MTQ", TwoLetterCountryCode.MQ),

  /**
   * Mauritius (MUS).
   */
  MUS("MUS", TwoLetterCountryCode.MU),

  /**
   * Malawi (MWI).
   */
  MWI("MWI", TwoLetterCountryCode.MW),

  /**
   * Malaysia (MYS).
   */
  MYS("MYS", TwoLetterCountryCode.MY),

  /**
   * Mayotte (MYT).
   */
  MYT("MYT", TwoLetterCountryCode.YT),

  /**
   * Namibia (NAM).
   */
  NAM("NAM", TwoLetterCountryCode.NA),

  /**
   * Neukaledonien (NCL).
   */
  NCL("NCL", TwoLetterCountryCode.NC),

  /**
   * Niger (NER).
   */
  NER("NER", TwoLetterCountryCode.NE),

  /**
   * Norfolkinsel (NFK).
   */
  NFK("NFK", TwoLetterCountryCode.NF),

  /**
   * Nigeria (NGA).
   */
  NGA("NGA", TwoLetterCountryCode.NG),

  /**
   * Nicaragua (NIC).
   */
  NIC("NIC", TwoLetterCountryCode.NI),

  /**
   * Niue (NIU).
   */
  NIU("NIU", TwoLetterCountryCode.NU),

  /**
   * Niederlande (NLD).
   */
  NLD("NLD", TwoLetterCountryCode.NL),

  /**
   * Norwegen (NOR).
   */
  NOR("NOR", TwoLetterCountryCode.NO),

  /**
   * Nepal (NPL).
   */
  NPL("NPL", TwoLetterCountryCode.NP),

  /**
   * Nauru (NRU).
   */
  NRU("NRU", TwoLetterCountryCode.NR),

  /**
   * Neuseeland (NZL).
   */
  NZL("NZL", TwoLetterCountryCode.NZ),

  /**
   * Oman (OMN).
   */
  OMN("OMN", TwoLetterCountryCode.OM),

  /**
   * Pakistan (PAK).
   */
  PAK("PAK", TwoLetterCountryCode.PK),

  /**
   * Panama (PAN).
   */
  PAN("PAN", TwoLetterCountryCode.PA),

  /**
   * Pitcairninseln (PCN).
   */
  PCN("PCN", TwoLetterCountryCode.PN),

  /**
   * Peru (PER).
   */
  PER("PER", TwoLetterCountryCode.PE),

  /**
   * Philippinen (PHL).
   */
  PHL("PHL", TwoLetterCountryCode.PH),

  /**
   * Palau (PLW).
   */
  PLW("PLW", TwoLetterCountryCode.PW),

  /**
   * Papua-Neuguinea (PNG).
   */
  PNG("PNG", TwoLetterCountryCode.PG),

  /**
   * Polen (POL).
   */
  POL("POL", TwoLetterCountryCode.PL),

  /**
   * Puerto Rico (PRI).
   */
  PRI("PRI", TwoLetterCountryCode.PR),

  /**
   * Nordkorea (PRK).
   */
  PRK("PRK", TwoLetterCountryCode.KP),

  /**
   * Portugal (PRT).
   */
  PRT("PRT", TwoLetterCountryCode.PT),

  /**
   * Paraguay (PRY).
   */
  PRY("PRY", TwoLetterCountryCode.PY),

  /**
   * Palästinensische Autonomiegebiete (PSE).
   */
  PSE("PSE", TwoLetterCountryCode.PS),

  /**
   * Französisch-Polynesien (PYF).
   */
  PYF("PYF", TwoLetterCountryCode.PF),

  /**
   * Katar (QAT).
   */
  QAT("QAT", TwoLetterCountryCode.QA),

  /**
   * Réunion (REU).
   */
  REU("REU", TwoLetterCountryCode.RE),

  /**
   * Rumänien (ROU).
   */
  ROU("ROU", TwoLetterCountryCode.RO),

  /**
   * Russland (RUS).
   */
  RUS("RUS", TwoLetterCountryCode.RU),

  /**
   * Ruanda (RWA).
   */
  RWA("RWA", TwoLetterCountryCode.RW),

  /**
   * Saudi-Arabien (SAU).
   */
  SAU("SAU", TwoLetterCountryCode.SA),

  /**
   * Sudan (SDN).
   */
  SDN("SDN", TwoLetterCountryCode.SD),

  /**
   * Senegal (SEN).
   */
  SEN("SEN", TwoLetterCountryCode.SN),

  /**
   * Singapur (SGP).
   */
  SGP("SGP", TwoLetterCountryCode.SG),

  /**
   * Südgeorgien und die Südlichen Sandwichinseln (SGS).
   */
  SGS("SGS", TwoLetterCountryCode.GS),

  /**
   * St. Helena (SHN).
   */
  SHN("SHN", TwoLetterCountryCode.SH),

  /**
   * Spitzbergen und Jan Mayen (SJM).
   */
  SJM("SJM", TwoLetterCountryCode.SJ),

  /**
   * Salomonen (SLB).
   */
  SLB("SLB", TwoLetterCountryCode.SB),

  /**
   * Sierra Leone (SLE).
   */
  SLE("SLE", TwoLetterCountryCode.SL),

  /**
   * El Salvador (SLV).
   */
  SLV("SLV", TwoLetterCountryCode.SV),

  /**
   * San Marino (SMR).
   */
  SMR("SMR", TwoLetterCountryCode.SM),

  /**
   * Somalia (SOM).
   */
  SOM("SOM", TwoLetterCountryCode.SO),

  /**
   * St. Pierre und Miquelon (SPM).
   */
  SPM("SPM", TwoLetterCountryCode.PM),

  /**
   * Serbien (SRB).
   */
  SRB("SRB", TwoLetterCountryCode.RS),

  /**
   * Südsudan (SSD).
   */
  SSD("SSD", TwoLetterCountryCode.SS),

  /**
   * São Tomé und Príncipe (STP).
   */
  STP("STP", TwoLetterCountryCode.ST),

  /**
   * Suriname (SUR).
   */
  SUR("SUR", TwoLetterCountryCode.SR),

  /**
   * Slowakei (SVK).
   */
  SVK("SVK", TwoLetterCountryCode.SK),

  /**
   * Slowenien (SVN).
   */
  SVN("SVN", TwoLetterCountryCode.SI),

  /**
   * Schweden (SWE).
   */
  SWE("SWE", TwoLetterCountryCode.SE),

  /**
   * Swasiland (SWZ).
   */
  SWZ("SWZ", TwoLetterCountryCode.SZ),

  /**
   * Sint Maarten (SXM).
   */
  SXM("SXM", TwoLetterCountryCode.SX),

  /**
   * Seychellen (SYC).
   */
  SYC("SYC", TwoLetterCountryCode.SC),

  /**
   * Syrien (SYR).
   */
  SYR("SYR", TwoLetterCountryCode.SY),

  /**
   * Turks- und Caicosinseln (TCA).
   */
  TCA("TCA", TwoLetterCountryCode.TC),

  /**
   * Tschad (TCD).
   */
  TCD("TCD", TwoLetterCountryCode.TD),

  /**
   * Togo (TGO).
   */
  TGO("TGO", TwoLetterCountryCode.TG),

  /**
   * Thailand (THA).
   */
  THA("THA", TwoLetterCountryCode.TH),

  /**
   * Tadschikistan (TJK).
   */
  TJK("TJK", TwoLetterCountryCode.TJ),

  /**
   * Tokelau (TKL).
   */
  TKL("TKL", TwoLetterCountryCode.TK),

  /**
   * Turkmenistan (TKM).
   */
  TKM("TKM", TwoLetterCountryCode.TM),

  /**
   * Timor-Leste (TLS).
   */
  TLS("TLS", TwoLetterCountryCode.TL),

  /**
   * Tonga (TON).
   */
  TON("TON", TwoLetterCountryCode.TO),

  /**
   * Trinidad und Tobago (TTO).
   */
  TTO("TTO", TwoLetterCountryCode.TT),

  /**
   * Tunesien (TUN).
   */
  TUN("TUN", TwoLetterCountryCode.TN),

  /**
   * Türkei (TUR).
   */
  TUR("TUR", TwoLetterCountryCode.TR),

  /**
   * Tuvalu (TUV).
   */
  TUV("TUV", TwoLetterCountryCode.TV),

  /**
   * Taiwan (TWN).
   */
  TWN("TWN", TwoLetterCountryCode.TW),

  /**
   * Tansania (TZA).
   */
  TZA("TZA", TwoLetterCountryCode.TZ),

  /**
   * Uganda (UGA).
   */
  UGA("UGA", TwoLetterCountryCode.UG),

  /**
   * Ukraine (UKR).
   */
  UKR("UKR", TwoLetterCountryCode.UA),

  /**
   * Amerikanische Überseeinseln (UMI).
   */
  UMI("UMI", TwoLetterCountryCode.UM),

  /**
   * Uruguay (URY).
   */
  URY("URY", TwoLetterCountryCode.UY),

  /**
   * Vereinigte Staaten (USA).
   */
  USA("USA", TwoLetterCountryCode.US),

  /**
   * Usbekistan (UZB).
   */
  UZB("UZB", TwoLetterCountryCode.UZ),

  /**
   * Vatikanstadt (VAT).
   */
  VAT("VAT", TwoLetterCountryCode.VA),

  /**
   * St. Vincent und die Grenadinen (VCT).
   */
  VCT("VCT", TwoLetterCountryCode.VC),

  /**
   * Venezuela (VEN).
   */
  VEN("VEN", TwoLetterCountryCode.VE),

  /**
   * Britische Jungferninseln (VGB).
   */
  VGB("VGB", TwoLetterCountryCode.VG),

  /**
   * Amerikanische Jungferninseln (VIR).
   */
  VIR("VIR", TwoLetterCountryCode.VI),

  /**
   * Vietnam (VNM).
   */
  VNM("VNM", TwoLetterCountryCode.VN),

  /**
   * Vanuatu (VUT).
   */
  VUT("VUT", TwoLetterCountryCode.VU),

  /**
   * Wallis und Futuna (WLF).
   */
  WLF("WLF", TwoLetterCountryCode.WF),

  /**
   * Samoa (WSM).
   */
  WSM("WSM", TwoLetterCountryCode.WS),

  /**
   * Jemen (YEM).
   */
  YEM("YEM", TwoLetterCountryCode.YE),

  /**
   * Südafrika (ZAF).
   */
  ZAF("ZAF", TwoLetterCountryCode.ZA),

  /**
   * Sambia (ZMB).
   */
  ZMB("ZMB", TwoLetterCountryCode.ZM),

  /**
   * Simbabwe (ZWE).
   */
  ZWE("ZWE", TwoLetterCountryCode.ZW);

  private final String value;

  private final TwoLetterCountryCode twoLetterCountryCode;

  ThreeLetterCountryCode(final String value, final TwoLetterCountryCode twoLetterCountryCode) {
    this.value = value;
    this.twoLetterCountryCode = twoLetterCountryCode;
  }

  /**
   * Gets two letter country code.
   *
   * @return the two letter country code
   */
  public TwoLetterCountryCode getTwoLetterCountryCode() {
    return twoLetterCountryCode;
  }

  /**
   * Has two letter country code boolean.
   *
   * @return the boolean
   */
  public boolean hasTwoLetterCountryCode() {
    return twoLetterCountryCode != null;
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
        .stream(Locale.getAvailableLocales())
        .filter(this::hasIsoCountry)
        .filter(locale -> value.equalsIgnoreCase(locale.getISO3Country()))
        .findAny()
        .map(locale -> new Locale("", locale.getCountry()))
        .orElseGet(() -> Arrays.stream(Locale.getISOCountries())
            .map(iso -> new Locale("", iso))
            .filter(this::hasIsoCountry)
            .filter(locale -> value.equalsIgnoreCase(locale.getISO3Country()))
            .findAny()
            .map(locale -> new Locale("", locale.getCountry()))
            .orElse(null));
  }

  private boolean hasIsoCountry(final Locale locale) {
    try {
      return StringUtils.hasText(locale.getISO3Country());
    } catch (MissingResourceException e) {
      return false;
    }
  }

  /**
   * From three letter country code.
   *
   * @param text the text
   * @return the three letter country code
   */
  @JsonCreator
  public static ThreeLetterCountryCode fromValue(final String text) {
    return fromValue(text, null);
  }

  /**
   * From value three letter country code.
   *
   * @param text        the text
   * @param defaultCode the default code
   * @return the three letter country code
   */
  @SuppressWarnings("DuplicatedCode")
  public static ThreeLetterCountryCode fromValue(
      final String text,
      final ThreeLetterCountryCode defaultCode) {

    String source = text != null ? text.trim().toUpperCase() : null;
    if (source == null || source.length() < 2) {
      return defaultCode;
    }
    source = source.replace("-", "_");
    String[] parts = source.split(Pattern.quote("_"));
    source = parts.length > 1 ? parts[1].trim() : parts[0].trim();
    for (ThreeLetterCountryCode b : ThreeLetterCountryCode.values()) {
      if (b.value.equals(source)
          || (b.twoLetterCountryCode != null && b.twoLetterCountryCode.toString().equals(source))) {
        return b;
      }
    }
    return defaultCode;
  }

  /**
   * From locale.
   *
   * @param locale the locale
   * @return the three letter country code
   */
  public static ThreeLetterCountryCode fromLocale(final Locale locale) {
    return fromLocale(locale, null);
  }

  /**
   * From locale three letter country code.
   *
   * @param locale      the locale
   * @param defaultCode the default code
   * @return the three letter country code
   */
  public static ThreeLetterCountryCode fromLocale(
      final Locale locale,
      final ThreeLetterCountryCode defaultCode) {
    if (locale == null || !StringUtils.hasText(locale.getISO3Country())) {
      return defaultCode;
    }
    return fromValue(locale.getISO3Country(), defaultCode);
  }

}

