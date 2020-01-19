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
 * ISO 3166-1 ALPHA-3 country codes from Java Locale.
 *
 * @author Christian Bremer
 */
public enum ThreeLetterCountryCode {

  /**
   * Andorra (AND)
   */
  AND("AND"),

  /**
   * United Arab Emirates (ARE)
   */
  ARE("ARE"),

  /**
   * Afghanistan (AFG)
   */
  AFG("AFG"),

  /**
   * Antigua and Barbuda (ATG)
   */
  ATG("ATG"),

  /**
   * Anguilla (AIA)
   */
  AIA("AIA"),

  /**
   * Albania (ALB)
   */
  ALB("ALB"),

  /**
   * Armenia (ARM)
   */
  ARM("ARM"),

  /**
   * Netherlands Antilles (ANT)
   */
  ANT("ANT"),

  /**
   * Angola (AGO)
   */
  AGO("AGO"),

  /**
   * Antarctica (ATA)
   */
  ATA("ATA"),

  /**
   * Argentina (ARG)
   */
  ARG("ARG"),

  /**
   * American Samoa (ASM)
   */
  ASM("ASM"),

  /**
   * Austria (AUT)
   */
  AUT("AUT"),

  /**
   * Australia (AUS)
   */
  AUS("AUS"),

  /**
   * Aruba (ABW)
   */
  ABW("ABW"),

  /**
   * Åland Islands (ALA)
   */
  ALA("ALA"),

  /**
   * Azerbaijan (AZE)
   */
  AZE("AZE"),

  /**
   * Bosnia and Herzegovina (BIH)
   */
  BIH("BIH"),

  /**
   * Barbados (BRB)
   */
  BRB("BRB"),

  /**
   * Bangladesh (BGD)
   */
  BGD("BGD"),

  /**
   * Belgium (BEL)
   */
  BEL("BEL"),

  /**
   * Burkina Faso (BFA)
   */
  BFA("BFA"),

  /**
   * Bulgaria (BGR)
   */
  BGR("BGR"),

  /**
   * Bahrain (BHR)
   */
  BHR("BHR"),

  /**
   * Burundi (BDI)
   */
  BDI("BDI"),

  /**
   * Benin (BEN)
   */
  BEN("BEN"),

  /**
   * Saint Barthélemy (BLM)
   */
  BLM("BLM"),

  /**
   * Bermuda (BMU)
   */
  BMU("BMU"),

  /**
   * Brunei (BRN)
   */
  BRN("BRN"),

  /**
   * Bolivia (BOL)
   */
  BOL("BOL"),

  /**
   * Bonaire, Sint Eustatius and Saba (BES)
   */
  BES("BES"),

  /**
   * Brazil (BRA)
   */
  BRA("BRA"),

  /**
   * Bahamas (BHS)
   */
  BHS("BHS"),

  /**
   * Bhutan (BTN)
   */
  BTN("BTN"),

  /**
   * Bouvet Island (BVT)
   */
  BVT("BVT"),

  /**
   * Botswana (BWA)
   */
  BWA("BWA"),

  /**
   * Belarus (BLR)
   */
  BLR("BLR"),

  /**
   * Belize (BLZ)
   */
  BLZ("BLZ"),

  /**
   * Canada (CAN)
   */
  CAN("CAN"),

  /**
   * Cocos Islands (CCK)
   */
  CCK("CCK"),

  /**
   * The Democratic Republic Of Congo (COD)
   */
  COD("COD"),

  /**
   * Central African Republic (CAF)
   */
  CAF("CAF"),

  /**
   * Congo (COG)
   */
  COG("COG"),

  /**
   * Switzerland (CHE)
   */
  CHE("CHE"),

  /**
   * Côte d'Ivoire (CIV)
   */
  CIV("CIV"),

  /**
   * Cook Islands (COK)
   */
  COK("COK"),

  /**
   * Chile (CHL)
   */
  CHL("CHL"),

  /**
   * Cameroon (CMR)
   */
  CMR("CMR"),

  /**
   * China (CHN)
   */
  CHN("CHN"),

  /**
   * Colombia (COL)
   */
  COL("COL"),

  /**
   * Costa Rica (CRI)
   */
  CRI("CRI"),

  /**
   * Cuba (CUB)
   */
  CUB("CUB"),

  /**
   * Cape Verde (CPV)
   */
  CPV("CPV"),

  /**
   * Curaçao (CUW)
   */
  CUW("CUW"),

  /**
   * Christmas Island (CXR)
   */
  CXR("CXR"),

  /**
   * Cyprus (CYP)
   */
  CYP("CYP"),

  /**
   * Czech Republic (CZE)
   */
  CZE("CZE"),

  /**
   * Germany (DEU)
   */
  DEU("DEU"),

  /**
   * Djibouti (DJI)
   */
  DJI("DJI"),

  /**
   * Denmark (DNK)
   */
  DNK("DNK"),

  /**
   * Dominica (DMA)
   */
  DMA("DMA"),

  /**
   * Dominican Republic (DOM)
   */
  DOM("DOM"),

  /**
   * Algeria (DZA)
   */
  DZA("DZA"),

  /**
   * Ecuador (ECU)
   */
  ECU("ECU"),

  /**
   * Estonia (EST)
   */
  EST("EST"),

  /**
   * Egypt (EGY)
   */
  EGY("EGY"),

  /**
   * Western Sahara (ESH)
   */
  ESH("ESH"),

  /**
   * Eritrea (ERI)
   */
  ERI("ERI"),

  /**
   * Spain (ESP)
   */
  ESP("ESP"),

  /**
   * Ethiopia (ETH)
   */
  ETH("ETH"),

  /**
   * Finland (FIN)
   */
  FIN("FIN"),

  /**
   * Fiji (FJI)
   */
  FJI("FJI"),

  /**
   * Falkland Islands (FLK)
   */
  FLK("FLK"),

  /**
   * Micronesia (FSM)
   */
  FSM("FSM"),

  /**
   * Faroe Islands (FRO)
   */
  FRO("FRO"),

  /**
   * France (FRA)
   */
  FRA("FRA"),

  /**
   * Gabon (GAB)
   */
  GAB("GAB"),

  /**
   * United Kingdom (GBR)
   */
  GBR("GBR"),

  /**
   * Grenada (GRD)
   */
  GRD("GRD"),

  /**
   * Georgia (GEO)
   */
  GEO("GEO"),

  /**
   * French Guiana (GUF)
   */
  GUF("GUF"),

  /**
   * Guernsey (GGY)
   */
  GGY("GGY"),

  /**
   * Ghana (GHA)
   */
  GHA("GHA"),

  /**
   * Gibraltar (GIB)
   */
  GIB("GIB"),

  /**
   * Greenland (GRL)
   */
  GRL("GRL"),

  /**
   * Gambia (GMB)
   */
  GMB("GMB"),

  /**
   * Guinea (GIN)
   */
  GIN("GIN"),

  /**
   * Guadeloupe (GLP)
   */
  GLP("GLP"),

  /**
   * Equatorial Guinea (GNQ)
   */
  GNQ("GNQ"),

  /**
   * Greece (GRC)
   */
  GRC("GRC"),

  /**
   * South Georgia And The South Sandwich Islands (SGS)
   */
  SGS("SGS"),

  /**
   * Guatemala (GTM)
   */
  GTM("GTM"),

  /**
   * Guam (GUM)
   */
  GUM("GUM"),

  /**
   * Guinea-Bissau (GNB)
   */
  GNB("GNB"),

  /**
   * Guyana (GUY)
   */
  GUY("GUY"),

  /**
   * Hong Kong (HKG)
   */
  HKG("HKG"),

  /**
   * Heard Island And McDonald Islands (HMD)
   */
  HMD("HMD"),

  /**
   * Honduras (HND)
   */
  HND("HND"),

  /**
   * Croatia (HRV)
   */
  HRV("HRV"),

  /**
   * Haiti (HTI)
   */
  HTI("HTI"),

  /**
   * Hungary (HUN)
   */
  HUN("HUN"),

  /**
   * Indonesia (IDN)
   */
  IDN("IDN"),

  /**
   * Ireland (IRL)
   */
  IRL("IRL"),

  /**
   * Israel (ISR)
   */
  ISR("ISR"),

  /**
   * Isle Of Man (IMN)
   */
  IMN("IMN"),

  /**
   * India (IND)
   */
  IND("IND"),

  /**
   * British Indian Ocean Territory (IOT)
   */
  IOT("IOT"),

  /**
   * Iraq (IRQ)
   */
  IRQ("IRQ"),

  /**
   * Iran (IRN)
   */
  IRN("IRN"),

  /**
   * Iceland (ISL)
   */
  ISL("ISL"),

  /**
   * Italy (ITA)
   */
  ITA("ITA"),

  /**
   * Jersey (JEY)
   */
  JEY("JEY"),

  /**
   * Jamaica (JAM)
   */
  JAM("JAM"),

  /**
   * Jordan (JOR)
   */
  JOR("JOR"),

  /**
   * Japan (JPN)
   */
  JPN("JPN"),

  /**
   * Kenya (KEN)
   */
  KEN("KEN"),

  /**
   * Kyrgyzstan (KGZ)
   */
  KGZ("KGZ"),

  /**
   * Cambodia (KHM)
   */
  KHM("KHM"),

  /**
   * Kiribati (KIR)
   */
  KIR("KIR"),

  /**
   * Comoros (COM)
   */
  COM("COM"),

  /**
   * Saint Kitts And Nevis (KNA)
   */
  KNA("KNA"),

  /**
   * North Korea (PRK)
   */
  PRK("PRK"),

  /**
   * South Korea (KOR)
   */
  KOR("KOR"),

  /**
   * Kuwait (KWT)
   */
  KWT("KWT"),

  /**
   * Cayman Islands (CYM)
   */
  CYM("CYM"),

  /**
   * Kazakhstan (KAZ)
   */
  KAZ("KAZ"),

  /**
   * Laos (LAO)
   */
  LAO("LAO"),

  /**
   * Lebanon (LBN)
   */
  LBN("LBN"),

  /**
   * Saint Lucia (LCA)
   */
  LCA("LCA"),

  /**
   * Liechtenstein (LIE)
   */
  LIE("LIE"),

  /**
   * Sri Lanka (LKA)
   */
  LKA("LKA"),

  /**
   * Liberia (LBR)
   */
  LBR("LBR"),

  /**
   * Lesotho (LSO)
   */
  LSO("LSO"),

  /**
   * Lithuania (LTU)
   */
  LTU("LTU"),

  /**
   * Luxembourg (LUX)
   */
  LUX("LUX"),

  /**
   * Latvia (LVA)
   */
  LVA("LVA"),

  /**
   * Libya (LBY)
   */
  LBY("LBY"),

  /**
   * Morocco (MAR)
   */
  MAR("MAR"),

  /**
   * Monaco (MCO)
   */
  MCO("MCO"),

  /**
   * Moldova (MDA)
   */
  MDA("MDA"),

  /**
   * Montenegro (MNE)
   */
  MNE("MNE"),

  /**
   * Saint Martin (MAF)
   */
  MAF("MAF"),

  /**
   * Madagascar (MDG)
   */
  MDG("MDG"),

  /**
   * Marshall Islands (MHL)
   */
  MHL("MHL"),

  /**
   * Macedonia (MKD)
   */
  MKD("MKD"),

  /**
   * Mali (MLI)
   */
  MLI("MLI"),

  /**
   * Myanmar (MMR)
   */
  MMR("MMR"),

  /**
   * Mongolia (MNG)
   */
  MNG("MNG"),

  /**
   * Macao (MAC)
   */
  MAC("MAC"),

  /**
   * Northern Mariana Islands (MNP)
   */
  MNP("MNP"),

  /**
   * Martinique (MTQ)
   */
  MTQ("MTQ"),

  /**
   * Mauritania (MRT)
   */
  MRT("MRT"),

  /**
   * Montserrat (MSR)
   */
  MSR("MSR"),

  /**
   * Malta (MLT)
   */
  MLT("MLT"),

  /**
   * Mauritius (MUS)
   */
  MUS("MUS"),

  /**
   * Maldives (MDV)
   */
  MDV("MDV"),

  /**
   * Malawi (MWI)
   */
  MWI("MWI"),

  /**
   * Mexico (MEX)
   */
  MEX("MEX"),

  /**
   * Malaysia (MYS)
   */
  MYS("MYS"),

  /**
   * Mozambique (MOZ)
   */
  MOZ("MOZ"),

  /**
   * Namibia (NAM)
   */
  NAM("NAM"),

  /**
   * New Caledonia (NCL)
   */
  NCL("NCL"),

  /**
   * Niger (NER)
   */
  NER("NER"),

  /**
   * Norfolk Island (NFK)
   */
  NFK("NFK"),

  /**
   * Nigeria (NGA)
   */
  NGA("NGA"),

  /**
   * Nicaragua (NIC)
   */
  NIC("NIC"),

  /**
   * Netherlands (NLD)
   */
  NLD("NLD"),

  /**
   * Norway (NOR)
   */
  NOR("NOR"),

  /**
   * Nepal (NPL)
   */
  NPL("NPL"),

  /**
   * Nauru (NRU)
   */
  NRU("NRU"),

  /**
   * Niue (NIU)
   */
  NIU("NIU"),

  /**
   * New Zealand (NZL)
   */
  NZL("NZL"),

  /**
   * Oman (OMN)
   */
  OMN("OMN"),

  /**
   * Panama (PAN)
   */
  PAN("PAN"),

  /**
   * Peru (PER)
   */
  PER("PER"),

  /**
   * French Polynesia (PYF)
   */
  PYF("PYF"),

  /**
   * Papua New Guinea (PNG)
   */
  PNG("PNG"),

  /**
   * Philippines (PHL)
   */
  PHL("PHL"),

  /**
   * Pakistan (PAK)
   */
  PAK("PAK"),

  /**
   * Poland (POL)
   */
  POL("POL"),

  /**
   * Saint Pierre And Miquelon (SPM)
   */
  SPM("SPM"),

  /**
   * Pitcairn (PCN)
   */
  PCN("PCN"),

  /**
   * Puerto Rico (PRI)
   */
  PRI("PRI"),

  /**
   * Palestine (PSE)
   */
  PSE("PSE"),

  /**
   * Portugal (PRT)
   */
  PRT("PRT"),

  /**
   * Palau (PLW)
   */
  PLW("PLW"),

  /**
   * Paraguay (PRY)
   */
  PRY("PRY"),

  /**
   * Qatar (QAT)
   */
  QAT("QAT"),

  /**
   * Reunion (REU)
   */
  REU("REU"),

  /**
   * Romania (ROU)
   */
  ROU("ROU"),

  /**
   * Serbia (SRB)
   */
  SRB("SRB"),

  /**
   * Russia (RUS)
   */
  RUS("RUS"),

  /**
   * Rwanda (RWA)
   */
  RWA("RWA"),

  /**
   * Saudi Arabia (SAU)
   */
  SAU("SAU"),

  /**
   * Solomon Islands (SLB)
   */
  SLB("SLB"),

  /**
   * Seychelles (SYC)
   */
  SYC("SYC"),

  /**
   * Sudan (SDN)
   */
  SDN("SDN"),

  /**
   * Sweden (SWE)
   */
  SWE("SWE"),

  /**
   * Singapore (SGP)
   */
  SGP("SGP"),

  /**
   * Saint Helena (SHN)
   */
  SHN("SHN"),

  /**
   * Slovenia (SVN)
   */
  SVN("SVN"),

  /**
   * Svalbard And Jan Mayen (SJM)
   */
  SJM("SJM"),

  /**
   * Slovakia (SVK)
   */
  SVK("SVK"),

  /**
   * Sierra Leone (SLE)
   */
  SLE("SLE"),

  /**
   * San Marino (SMR)
   */
  SMR("SMR"),

  /**
   * Senegal (SEN)
   */
  SEN("SEN"),

  /**
   * Somalia (SOM)
   */
  SOM("SOM"),

  /**
   * Suriname (SUR)
   */
  SUR("SUR"),

  /**
   * South Sudan (SSD)
   */
  SSD("SSD"),

  /**
   * Sao Tome And Principe (STP)
   */
  STP("STP"),

  /**
   * El Salvador (SLV)
   */
  SLV("SLV"),

  /**
   * Sint Maarten (Dutch part) (SXM)
   */
  SXM("SXM"),

  /**
   * Syria (SYR)
   */
  SYR("SYR"),

  /**
   * Swaziland (SWZ)
   */
  SWZ("SWZ"),

  /**
   * Turks And Caicos Islands (TCA)
   */
  TCA("TCA"),

  /**
   * Chad (TCD)
   */
  TCD("TCD"),

  /**
   * French Southern Territories (ATF)
   */
  ATF("ATF"),

  /**
   * Togo (TGO)
   */
  TGO("TGO"),

  /**
   * Thailand (THA)
   */
  THA("THA"),

  /**
   * Tajikistan (TJK)
   */
  TJK("TJK"),

  /**
   * Tokelau (TKL)
   */
  TKL("TKL"),

  /**
   * Timor-Leste (TLS)
   */
  TLS("TLS"),

  /**
   * Turkmenistan (TKM)
   */
  TKM("TKM"),

  /**
   * Tunisia (TUN)
   */
  TUN("TUN"),

  /**
   * Tonga (TON)
   */
  TON("TON"),

  /**
   * Turkey (TUR)
   */
  TUR("TUR"),

  /**
   * Trinidad and Tobago (TTO)
   */
  TTO("TTO"),

  /**
   * Tuvalu (TUV)
   */
  TUV("TUV"),

  /**
   * Taiwan (TWN)
   */
  TWN("TWN"),

  /**
   * Tanzania (TZA)
   */
  TZA("TZA"),

  /**
   * Ukraine (UKR)
   */
  UKR("UKR"),

  /**
   * Uganda (UGA)
   */
  UGA("UGA"),

  /**
   * United States Minor Outlying Islands (UMI)
   */
  UMI("UMI"),

  /**
   * United States (USA)
   */
  USA("USA"),

  /**
   * Uruguay (URY)
   */
  URY("URY"),

  /**
   * Uzbekistan (UZB)
   */
  UZB("UZB"),

  /**
   * Vatican (VAT)
   */
  VAT("VAT"),

  /**
   * Saint Vincent And The Grenadines (VCT)
   */
  VCT("VCT"),

  /**
   * Venezuela (VEN)
   */
  VEN("VEN"),

  /**
   * British Virgin Islands (VGB)
   */
  VGB("VGB"),

  /**
   * U.S. Virgin Islands (VIR)
   */
  VIR("VIR"),

  /**
   * Vietnam (VNM)
   */
  VNM("VNM"),

  /**
   * Vanuatu (VUT)
   */
  VUT("VUT"),

  /**
   * Wallis And Futuna (WLF)
   */
  WLF("WLF"),

  /**
   * Samoa (WSM)
   */
  WSM("WSM"),

  /**
   * Yemen (YEM)
   */
  YEM("YEM"),

  /**
   * Mayotte (MYT)
   */
  MYT("MYT"),

  /**
   * South Africa (ZAF)
   */
  ZAF("ZAF"),

  /**
   * Zambia (ZMB)
   */
  ZMB("ZMB"),

  /**
   * Zimbabwe (ZWE)
   */
  ZWE("ZWE");

  private String value;

  ThreeLetterCountryCode(String value) {
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
        .stream(Locale.getISOCountries())
        .filter(iso -> value.equalsIgnoreCase(new Locale("", iso).getISO3Country()))
        .findAny()
        .map(iso -> new Locale("", iso))
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
    String source = text != null ? text.trim() : null;
    if (source == null || source.length() < 2) {
      return null;
    }
    if (source.length() != 3) {
      TwoLetterCountryCode code = TwoLetterCountryCode.fromValue(source);
      return code != null ? fromLocale(code.toLocale()) : null;
    }
    source = text.substring(0, 3).toUpperCase();
    for (ThreeLetterCountryCode b : ThreeLetterCountryCode.values()) {
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
   * @return the three letter country code
   */
  public static ThreeLetterCountryCode fromLocale(Locale locale) {
    if (locale == null || !StringUtils.hasText(locale.getISO3Country())) {
      return null;
    }
    return fromValue(locale.getISO3Country());
  }

}

