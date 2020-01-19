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
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;
import org.springframework.util.StringUtils;

/**
 * Time zone ID.
 *
 * @author Christian Bremer
 */
public enum TimeZoneId {

  /**
   * Act time zone id.
   */
  ACT("ACT"),

  /**
   * Aet time zone id.
   */
  AET("AET"),

  /**
   * Agt time zone id.
   */
  AGT("AGT"),

  /**
   * Art time zone id.
   */
  ART("ART"),

  /**
   * Ast time zone id.
   */
  AST("AST"),

  /**
   * Africa abidjan time zone id.
   */
  AFRICA_ABIDJAN("Africa/Abidjan"),

  /**
   * Africa accra time zone id.
   */
  AFRICA_ACCRA("Africa/Accra"),

  /**
   * Africa addis ababa time zone id.
   */
  AFRICA_ADDIS_ABABA("Africa/Addis_Ababa"),

  /**
   * Africa algiers time zone id.
   */
  AFRICA_ALGIERS("Africa/Algiers"),

  /**
   * Africa asmara time zone id.
   */
  AFRICA_ASMARA("Africa/Asmara"),

  /**
   * Africa asmera time zone id.
   */
  AFRICA_ASMERA("Africa/Asmera"),

  /**
   * Africa bamako time zone id.
   */
  AFRICA_BAMAKO("Africa/Bamako"),

  /**
   * Africa bangui time zone id.
   */
  AFRICA_BANGUI("Africa/Bangui"),

  /**
   * Africa banjul time zone id.
   */
  AFRICA_BANJUL("Africa/Banjul"),

  /**
   * Africa bissau time zone id.
   */
  AFRICA_BISSAU("Africa/Bissau"),

  /**
   * Africa blantyre time zone id.
   */
  AFRICA_BLANTYRE("Africa/Blantyre"),

  /**
   * Africa brazzaville time zone id.
   */
  AFRICA_BRAZZAVILLE("Africa/Brazzaville"),

  /**
   * Africa bujumbura time zone id.
   */
  AFRICA_BUJUMBURA("Africa/Bujumbura"),

  /**
   * Africa cairo time zone id.
   */
  AFRICA_CAIRO("Africa/Cairo"),

  /**
   * Africa casablanca time zone id.
   */
  AFRICA_CASABLANCA("Africa/Casablanca"),

  /**
   * Africa ceuta time zone id.
   */
  AFRICA_CEUTA("Africa/Ceuta"),

  /**
   * Africa conakry time zone id.
   */
  AFRICA_CONAKRY("Africa/Conakry"),

  /**
   * Africa dakar time zone id.
   */
  AFRICA_DAKAR("Africa/Dakar"),

  /**
   * Africa dar es salaam time zone id.
   */
  AFRICA_DAR_ES_SALAAM("Africa/Dar_es_Salaam"),

  /**
   * Africa djibouti time zone id.
   */
  AFRICA_DJIBOUTI("Africa/Djibouti"),

  /**
   * Africa douala time zone id.
   */
  AFRICA_DOUALA("Africa/Douala"),

  /**
   * Africa el aaiun time zone id.
   */
  AFRICA_EL_AAIUN("Africa/El_Aaiun"),

  /**
   * Africa freetown time zone id.
   */
  AFRICA_FREETOWN("Africa/Freetown"),

  /**
   * Africa gaborone time zone id.
   */
  AFRICA_GABORONE("Africa/Gaborone"),

  /**
   * Africa harare time zone id.
   */
  AFRICA_HARARE("Africa/Harare"),

  /**
   * Africa johannesburg time zone id.
   */
  AFRICA_JOHANNESBURG("Africa/Johannesburg"),

  /**
   * Africa juba time zone id.
   */
  AFRICA_JUBA("Africa/Juba"),

  /**
   * Africa kampala time zone id.
   */
  AFRICA_KAMPALA("Africa/Kampala"),

  /**
   * Africa khartoum time zone id.
   */
  AFRICA_KHARTOUM("Africa/Khartoum"),

  /**
   * Africa kigali time zone id.
   */
  AFRICA_KIGALI("Africa/Kigali"),

  /**
   * Africa kinshasa time zone id.
   */
  AFRICA_KINSHASA("Africa/Kinshasa"),

  /**
   * Africa lagos time zone id.
   */
  AFRICA_LAGOS("Africa/Lagos"),

  /**
   * Africa libreville time zone id.
   */
  AFRICA_LIBREVILLE("Africa/Libreville"),

  /**
   * Africa lome time zone id.
   */
  AFRICA_LOME("Africa/Lome"),

  /**
   * Africa luanda time zone id.
   */
  AFRICA_LUANDA("Africa/Luanda"),

  /**
   * Africa lubumbashi time zone id.
   */
  AFRICA_LUBUMBASHI("Africa/Lubumbashi"),

  /**
   * Africa lusaka time zone id.
   */
  AFRICA_LUSAKA("Africa/Lusaka"),

  /**
   * Africa malabo time zone id.
   */
  AFRICA_MALABO("Africa/Malabo"),

  /**
   * Africa maputo time zone id.
   */
  AFRICA_MAPUTO("Africa/Maputo"),

  /**
   * Africa maseru time zone id.
   */
  AFRICA_MASERU("Africa/Maseru"),

  /**
   * Africa mbabane time zone id.
   */
  AFRICA_MBABANE("Africa/Mbabane"),

  /**
   * Africa mogadishu time zone id.
   */
  AFRICA_MOGADISHU("Africa/Mogadishu"),

  /**
   * Africa monrovia time zone id.
   */
  AFRICA_MONROVIA("Africa/Monrovia"),

  /**
   * Africa nairobi time zone id.
   */
  AFRICA_NAIROBI("Africa/Nairobi"),

  /**
   * Africa ndjamena time zone id.
   */
  AFRICA_NDJAMENA("Africa/Ndjamena"),

  /**
   * Africa niamey time zone id.
   */
  AFRICA_NIAMEY("Africa/Niamey"),

  /**
   * Africa nouakchott time zone id.
   */
  AFRICA_NOUAKCHOTT("Africa/Nouakchott"),

  /**
   * Africa ouagadougou time zone id.
   */
  AFRICA_OUAGADOUGOU("Africa/Ouagadougou"),

  /**
   * Africa porto novo time zone id.
   */
  AFRICA_PORTO_NOVO("Africa/Porto-Novo"),

  /**
   * Africa sao tome time zone id.
   */
  AFRICA_SAO_TOME("Africa/Sao_Tome"),

  /**
   * Africa timbuktu time zone id.
   */
  AFRICA_TIMBUKTU("Africa/Timbuktu"),

  /**
   * Africa tripoli time zone id.
   */
  AFRICA_TRIPOLI("Africa/Tripoli"),

  /**
   * Africa tunis time zone id.
   */
  AFRICA_TUNIS("Africa/Tunis"),

  /**
   * Africa windhoek time zone id.
   */
  AFRICA_WINDHOEK("Africa/Windhoek"),

  /**
   * America adak time zone id.
   */
  AMERICA_ADAK("America/Adak"),

  /**
   * America anchorage time zone id.
   */
  AMERICA_ANCHORAGE("America/Anchorage"),

  /**
   * America anguilla time zone id.
   */
  AMERICA_ANGUILLA("America/Anguilla"),

  /**
   * America antigua time zone id.
   */
  AMERICA_ANTIGUA("America/Antigua"),

  /**
   * America araguaina time zone id.
   */
  AMERICA_ARAGUAINA("America/Araguaina"),

  /**
   * America argentina buenos aires time zone id.
   */
  AMERICA_ARGENTINA_BUENOS_AIRES("America/Argentina/Buenos_Aires"),

  /**
   * America argentina catamarca time zone id.
   */
  AMERICA_ARGENTINA_CATAMARCA("America/Argentina/Catamarca"),

  /**
   * America argentina comodrivadavia time zone id.
   */
  AMERICA_ARGENTINA_COMODRIVADAVIA("America/Argentina/ComodRivadavia"),

  /**
   * America argentina cordoba time zone id.
   */
  AMERICA_ARGENTINA_CORDOBA("America/Argentina/Cordoba"),

  /**
   * America argentina jujuy time zone id.
   */
  AMERICA_ARGENTINA_JUJUY("America/Argentina/Jujuy"),

  /**
   * America argentina la rioja time zone id.
   */
  AMERICA_ARGENTINA_LA_RIOJA("America/Argentina/La_Rioja"),

  /**
   * America argentina mendoza time zone id.
   */
  AMERICA_ARGENTINA_MENDOZA("America/Argentina/Mendoza"),

  /**
   * America argentina rio gallegos time zone id.
   */
  AMERICA_ARGENTINA_RIO_GALLEGOS("America/Argentina/Rio_Gallegos"),

  /**
   * America argentina salta time zone id.
   */
  AMERICA_ARGENTINA_SALTA("America/Argentina/Salta"),

  /**
   * America argentina san juan time zone id.
   */
  AMERICA_ARGENTINA_SAN_JUAN("America/Argentina/San_Juan"),

  /**
   * America argentina san luis time zone id.
   */
  AMERICA_ARGENTINA_SAN_LUIS("America/Argentina/San_Luis"),

  /**
   * America argentina tucuman time zone id.
   */
  AMERICA_ARGENTINA_TUCUMAN("America/Argentina/Tucuman"),

  /**
   * America argentina ushuaia time zone id.
   */
  AMERICA_ARGENTINA_USHUAIA("America/Argentina/Ushuaia"),

  /**
   * America aruba time zone id.
   */
  AMERICA_ARUBA("America/Aruba"),

  /**
   * America asuncion time zone id.
   */
  AMERICA_ASUNCION("America/Asuncion"),

  /**
   * America atikokan time zone id.
   */
  AMERICA_ATIKOKAN("America/Atikokan"),

  /**
   * America atka time zone id.
   */
  AMERICA_ATKA("America/Atka"),

  /**
   * America bahia time zone id.
   */
  AMERICA_BAHIA("America/Bahia"),

  /**
   * America bahia banderas time zone id.
   */
  AMERICA_BAHIA_BANDERAS("America/Bahia_Banderas"),

  /**
   * America barbados time zone id.
   */
  AMERICA_BARBADOS("America/Barbados"),

  /**
   * America belem time zone id.
   */
  AMERICA_BELEM("America/Belem"),

  /**
   * America belize time zone id.
   */
  AMERICA_BELIZE("America/Belize"),

  /**
   * America blanc sablon time zone id.
   */
  AMERICA_BLANC_SABLON("America/Blanc-Sablon"),

  /**
   * America boa vista time zone id.
   */
  AMERICA_BOA_VISTA("America/Boa_Vista"),

  /**
   * America bogota time zone id.
   */
  AMERICA_BOGOTA("America/Bogota"),

  /**
   * America boise time zone id.
   */
  AMERICA_BOISE("America/Boise"),

  /**
   * America buenos aires time zone id.
   */
  AMERICA_BUENOS_AIRES("America/Buenos_Aires"),

  /**
   * America cambridge bay time zone id.
   */
  AMERICA_CAMBRIDGE_BAY("America/Cambridge_Bay"),

  /**
   * America campo grande time zone id.
   */
  AMERICA_CAMPO_GRANDE("America/Campo_Grande"),

  /**
   * America cancun time zone id.
   */
  AMERICA_CANCUN("America/Cancun"),

  /**
   * America caracas time zone id.
   */
  AMERICA_CARACAS("America/Caracas"),

  /**
   * America catamarca time zone id.
   */
  AMERICA_CATAMARCA("America/Catamarca"),

  /**
   * America cayenne time zone id.
   */
  AMERICA_CAYENNE("America/Cayenne"),

  /**
   * America cayman time zone id.
   */
  AMERICA_CAYMAN("America/Cayman"),

  /**
   * America chicago time zone id.
   */
  AMERICA_CHICAGO("America/Chicago"),

  /**
   * America chihuahua time zone id.
   */
  AMERICA_CHIHUAHUA("America/Chihuahua"),

  /**
   * America coral harbour time zone id.
   */
  AMERICA_CORAL_HARBOUR("America/Coral_Harbour"),

  /**
   * America cordoba time zone id.
   */
  AMERICA_CORDOBA("America/Cordoba"),

  /**
   * America costa rica time zone id.
   */
  AMERICA_COSTA_RICA("America/Costa_Rica"),

  /**
   * America creston time zone id.
   */
  AMERICA_CRESTON("America/Creston"),

  /**
   * America cuiaba time zone id.
   */
  AMERICA_CUIABA("America/Cuiaba"),

  /**
   * America curacao time zone id.
   */
  AMERICA_CURACAO("America/Curacao"),

  /**
   * America danmarkshavn time zone id.
   */
  AMERICA_DANMARKSHAVN("America/Danmarkshavn"),

  /**
   * America dawson time zone id.
   */
  AMERICA_DAWSON("America/Dawson"),

  /**
   * America dawson creek time zone id.
   */
  AMERICA_DAWSON_CREEK("America/Dawson_Creek"),

  /**
   * America denver time zone id.
   */
  AMERICA_DENVER("America/Denver"),

  /**
   * America detroit time zone id.
   */
  AMERICA_DETROIT("America/Detroit"),

  /**
   * America dominica time zone id.
   */
  AMERICA_DOMINICA("America/Dominica"),

  /**
   * America edmonton time zone id.
   */
  AMERICA_EDMONTON("America/Edmonton"),

  /**
   * America eirunepe time zone id.
   */
  AMERICA_EIRUNEPE("America/Eirunepe"),

  /**
   * America el salvador time zone id.
   */
  AMERICA_EL_SALVADOR("America/El_Salvador"),

  /**
   * America ensenada time zone id.
   */
  AMERICA_ENSENADA("America/Ensenada"),

  /**
   * America fort nelson time zone id.
   */
  AMERICA_FORT_NELSON("America/Fort_Nelson"),

  /**
   * America fort wayne time zone id.
   */
  AMERICA_FORT_WAYNE("America/Fort_Wayne"),

  /**
   * America fortaleza time zone id.
   */
  AMERICA_FORTALEZA("America/Fortaleza"),

  /**
   * America glace bay time zone id.
   */
  AMERICA_GLACE_BAY("America/Glace_Bay"),

  /**
   * America godthab time zone id.
   */
  AMERICA_GODTHAB("America/Godthab"),

  /**
   * America goose bay time zone id.
   */
  AMERICA_GOOSE_BAY("America/Goose_Bay"),

  /**
   * America grand turk time zone id.
   */
  AMERICA_GRAND_TURK("America/Grand_Turk"),

  /**
   * America grenada time zone id.
   */
  AMERICA_GRENADA("America/Grenada"),

  /**
   * America guadeloupe time zone id.
   */
  AMERICA_GUADELOUPE("America/Guadeloupe"),

  /**
   * America guatemala time zone id.
   */
  AMERICA_GUATEMALA("America/Guatemala"),

  /**
   * America guayaquil time zone id.
   */
  AMERICA_GUAYAQUIL("America/Guayaquil"),

  /**
   * America guyana time zone id.
   */
  AMERICA_GUYANA("America/Guyana"),

  /**
   * America halifax time zone id.
   */
  AMERICA_HALIFAX("America/Halifax"),

  /**
   * America havana time zone id.
   */
  AMERICA_HAVANA("America/Havana"),

  /**
   * America hermosillo time zone id.
   */
  AMERICA_HERMOSILLO("America/Hermosillo"),

  /**
   * America indiana indianapolis time zone id.
   */
  AMERICA_INDIANA_INDIANAPOLIS("America/Indiana/Indianapolis"),

  /**
   * America indiana knox time zone id.
   */
  AMERICA_INDIANA_KNOX("America/Indiana/Knox"),

  /**
   * America indiana marengo time zone id.
   */
  AMERICA_INDIANA_MARENGO("America/Indiana/Marengo"),

  /**
   * America indiana petersburg time zone id.
   */
  AMERICA_INDIANA_PETERSBURG("America/Indiana/Petersburg"),

  /**
   * America indiana tell city time zone id.
   */
  AMERICA_INDIANA_TELL_CITY("America/Indiana/Tell_City"),

  /**
   * America indiana vevay time zone id.
   */
  AMERICA_INDIANA_VEVAY("America/Indiana/Vevay"),

  /**
   * America indiana vincennes time zone id.
   */
  AMERICA_INDIANA_VINCENNES("America/Indiana/Vincennes"),

  /**
   * America indiana winamac time zone id.
   */
  AMERICA_INDIANA_WINAMAC("America/Indiana/Winamac"),

  /**
   * America indianapolis time zone id.
   */
  AMERICA_INDIANAPOLIS("America/Indianapolis"),

  /**
   * America inuvik time zone id.
   */
  AMERICA_INUVIK("America/Inuvik"),

  /**
   * America iqaluit time zone id.
   */
  AMERICA_IQALUIT("America/Iqaluit"),

  /**
   * America jamaica time zone id.
   */
  AMERICA_JAMAICA("America/Jamaica"),

  /**
   * America jujuy time zone id.
   */
  AMERICA_JUJUY("America/Jujuy"),

  /**
   * America juneau time zone id.
   */
  AMERICA_JUNEAU("America/Juneau"),

  /**
   * America kentucky louisville time zone id.
   */
  AMERICA_KENTUCKY_LOUISVILLE("America/Kentucky/Louisville"),

  /**
   * America kentucky monticello time zone id.
   */
  AMERICA_KENTUCKY_MONTICELLO("America/Kentucky/Monticello"),

  /**
   * America knox in time zone id.
   */
  AMERICA_KNOX_IN("America/Knox_IN"),

  /**
   * America kralendijk time zone id.
   */
  AMERICA_KRALENDIJK("America/Kralendijk"),

  /**
   * America la paz time zone id.
   */
  AMERICA_LA_PAZ("America/La_Paz"),

  /**
   * America lima time zone id.
   */
  AMERICA_LIMA("America/Lima"),

  /**
   * America los angeles time zone id.
   */
  AMERICA_LOS_ANGELES("America/Los_Angeles"),

  /**
   * America louisville time zone id.
   */
  AMERICA_LOUISVILLE("America/Louisville"),

  /**
   * America lower princes time zone id.
   */
  AMERICA_LOWER_PRINCES("America/Lower_Princes"),

  /**
   * America maceio time zone id.
   */
  AMERICA_MACEIO("America/Maceio"),

  /**
   * America managua time zone id.
   */
  AMERICA_MANAGUA("America/Managua"),

  /**
   * America manaus time zone id.
   */
  AMERICA_MANAUS("America/Manaus"),

  /**
   * America marigot time zone id.
   */
  AMERICA_MARIGOT("America/Marigot"),

  /**
   * America martinique time zone id.
   */
  AMERICA_MARTINIQUE("America/Martinique"),

  /**
   * America matamoros time zone id.
   */
  AMERICA_MATAMOROS("America/Matamoros"),

  /**
   * America mazatlan time zone id.
   */
  AMERICA_MAZATLAN("America/Mazatlan"),

  /**
   * America mendoza time zone id.
   */
  AMERICA_MENDOZA("America/Mendoza"),

  /**
   * America menominee time zone id.
   */
  AMERICA_MENOMINEE("America/Menominee"),

  /**
   * America merida time zone id.
   */
  AMERICA_MERIDA("America/Merida"),

  /**
   * America metlakatla time zone id.
   */
  AMERICA_METLAKATLA("America/Metlakatla"),

  /**
   * America mexico city time zone id.
   */
  AMERICA_MEXICO_CITY("America/Mexico_City"),

  /**
   * America miquelon time zone id.
   */
  AMERICA_MIQUELON("America/Miquelon"),

  /**
   * America moncton time zone id.
   */
  AMERICA_MONCTON("America/Moncton"),

  /**
   * America monterrey time zone id.
   */
  AMERICA_MONTERREY("America/Monterrey"),

  /**
   * America montevideo time zone id.
   */
  AMERICA_MONTEVIDEO("America/Montevideo"),

  /**
   * America montreal time zone id.
   */
  AMERICA_MONTREAL("America/Montreal"),

  /**
   * America montserrat time zone id.
   */
  AMERICA_MONTSERRAT("America/Montserrat"),

  /**
   * America nassau time zone id.
   */
  AMERICA_NASSAU("America/Nassau"),

  /**
   * America new york time zone id.
   */
  AMERICA_NEW_YORK("America/New_York"),

  /**
   * America nipigon time zone id.
   */
  AMERICA_NIPIGON("America/Nipigon"),

  /**
   * America nome time zone id.
   */
  AMERICA_NOME("America/Nome"),

  /**
   * America noronha time zone id.
   */
  AMERICA_NORONHA("America/Noronha"),

  /**
   * America north dakota beulah time zone id.
   */
  AMERICA_NORTH_DAKOTA_BEULAH("America/North_Dakota/Beulah"),

  /**
   * America north dakota center time zone id.
   */
  AMERICA_NORTH_DAKOTA_CENTER("America/North_Dakota/Center"),

  /**
   * America north dakota new salem time zone id.
   */
  AMERICA_NORTH_DAKOTA_NEW_SALEM("America/North_Dakota/New_Salem"),

  /**
   * America ojinaga time zone id.
   */
  AMERICA_OJINAGA("America/Ojinaga"),

  /**
   * America panama time zone id.
   */
  AMERICA_PANAMA("America/Panama"),

  /**
   * America pangnirtung time zone id.
   */
  AMERICA_PANGNIRTUNG("America/Pangnirtung"),

  /**
   * America paramaribo time zone id.
   */
  AMERICA_PARAMARIBO("America/Paramaribo"),

  /**
   * America phoenix time zone id.
   */
  AMERICA_PHOENIX("America/Phoenix"),

  /**
   * America port au prince time zone id.
   */
  AMERICA_PORT_AU_PRINCE("America/Port-au-Prince"),

  /**
   * America port of spain time zone id.
   */
  AMERICA_PORT_OF_SPAIN("America/Port_of_Spain"),

  /**
   * America porto acre time zone id.
   */
  AMERICA_PORTO_ACRE("America/Porto_Acre"),

  /**
   * America porto velho time zone id.
   */
  AMERICA_PORTO_VELHO("America/Porto_Velho"),

  /**
   * America puerto rico time zone id.
   */
  AMERICA_PUERTO_RICO("America/Puerto_Rico"),

  /**
   * America punta arenas time zone id.
   */
  AMERICA_PUNTA_ARENAS("America/Punta_Arenas"),

  /**
   * America rainy river time zone id.
   */
  AMERICA_RAINY_RIVER("America/Rainy_River"),

  /**
   * America rankin inlet time zone id.
   */
  AMERICA_RANKIN_INLET("America/Rankin_Inlet"),

  /**
   * America recife time zone id.
   */
  AMERICA_RECIFE("America/Recife"),

  /**
   * America regina time zone id.
   */
  AMERICA_REGINA("America/Regina"),

  /**
   * America resolute time zone id.
   */
  AMERICA_RESOLUTE("America/Resolute"),

  /**
   * America rio branco time zone id.
   */
  AMERICA_RIO_BRANCO("America/Rio_Branco"),

  /**
   * America rosario time zone id.
   */
  AMERICA_ROSARIO("America/Rosario"),

  /**
   * America santa isabel time zone id.
   */
  AMERICA_SANTA_ISABEL("America/Santa_Isabel"),

  /**
   * America santarem time zone id.
   */
  AMERICA_SANTAREM("America/Santarem"),

  /**
   * America santiago time zone id.
   */
  AMERICA_SANTIAGO("America/Santiago"),

  /**
   * America santo domingo time zone id.
   */
  AMERICA_SANTO_DOMINGO("America/Santo_Domingo"),

  /**
   * America sao paulo time zone id.
   */
  AMERICA_SAO_PAULO("America/Sao_Paulo"),

  /**
   * America scoresbysund time zone id.
   */
  AMERICA_SCORESBYSUND("America/Scoresbysund"),

  /**
   * America shiprock time zone id.
   */
  AMERICA_SHIPROCK("America/Shiprock"),

  /**
   * America sitka time zone id.
   */
  AMERICA_SITKA("America/Sitka"),

  /**
   * America st barthelemy time zone id.
   */
  AMERICA_ST_BARTHELEMY("America/St_Barthelemy"),

  /**
   * America st johns time zone id.
   */
  AMERICA_ST_JOHNS("America/St_Johns"),

  /**
   * America st kitts time zone id.
   */
  AMERICA_ST_KITTS("America/St_Kitts"),

  /**
   * America st lucia time zone id.
   */
  AMERICA_ST_LUCIA("America/St_Lucia"),

  /**
   * America st thomas time zone id.
   */
  AMERICA_ST_THOMAS("America/St_Thomas"),

  /**
   * America st vincent time zone id.
   */
  AMERICA_ST_VINCENT("America/St_Vincent"),

  /**
   * America swift current time zone id.
   */
  AMERICA_SWIFT_CURRENT("America/Swift_Current"),

  /**
   * America tegucigalpa time zone id.
   */
  AMERICA_TEGUCIGALPA("America/Tegucigalpa"),

  /**
   * America thule time zone id.
   */
  AMERICA_THULE("America/Thule"),

  /**
   * America thunder bay time zone id.
   */
  AMERICA_THUNDER_BAY("America/Thunder_Bay"),

  /**
   * America tijuana time zone id.
   */
  AMERICA_TIJUANA("America/Tijuana"),

  /**
   * America toronto time zone id.
   */
  AMERICA_TORONTO("America/Toronto"),

  /**
   * America tortola time zone id.
   */
  AMERICA_TORTOLA("America/Tortola"),

  /**
   * America vancouver time zone id.
   */
  AMERICA_VANCOUVER("America/Vancouver"),

  /**
   * America virgin time zone id.
   */
  AMERICA_VIRGIN("America/Virgin"),

  /**
   * America whitehorse time zone id.
   */
  AMERICA_WHITEHORSE("America/Whitehorse"),

  /**
   * America winnipeg time zone id.
   */
  AMERICA_WINNIPEG("America/Winnipeg"),

  /**
   * America yakutat time zone id.
   */
  AMERICA_YAKUTAT("America/Yakutat"),

  /**
   * America yellowknife time zone id.
   */
  AMERICA_YELLOWKNIFE("America/Yellowknife"),

  /**
   * Antarctica casey time zone id.
   */
  ANTARCTICA_CASEY("Antarctica/Casey"),

  /**
   * Antarctica davis time zone id.
   */
  ANTARCTICA_DAVIS("Antarctica/Davis"),

  /**
   * Antarctica dumontdurville time zone id.
   */
  ANTARCTICA_DUMONTDURVILLE("Antarctica/DumontDUrville"),

  /**
   * Antarctica macquarie time zone id.
   */
  ANTARCTICA_MACQUARIE("Antarctica/Macquarie"),

  /**
   * Antarctica mawson time zone id.
   */
  ANTARCTICA_MAWSON("Antarctica/Mawson"),

  /**
   * Antarctica mcmurdo time zone id.
   */
  ANTARCTICA_MCMURDO("Antarctica/McMurdo"),

  /**
   * Antarctica palmer time zone id.
   */
  ANTARCTICA_PALMER("Antarctica/Palmer"),

  /**
   * Antarctica rothera time zone id.
   */
  ANTARCTICA_ROTHERA("Antarctica/Rothera"),

  /**
   * Antarctica south pole time zone id.
   */
  ANTARCTICA_SOUTH_POLE("Antarctica/South_Pole"),

  /**
   * Antarctica syowa time zone id.
   */
  ANTARCTICA_SYOWA("Antarctica/Syowa"),

  /**
   * Antarctica troll time zone id.
   */
  ANTARCTICA_TROLL("Antarctica/Troll"),

  /**
   * Antarctica vostok time zone id.
   */
  ANTARCTICA_VOSTOK("Antarctica/Vostok"),

  /**
   * Arctic longyearbyen time zone id.
   */
  ARCTIC_LONGYEARBYEN("Arctic/Longyearbyen"),

  /**
   * Asia aden time zone id.
   */
  ASIA_ADEN("Asia/Aden"),

  /**
   * Asia almaty time zone id.
   */
  ASIA_ALMATY("Asia/Almaty"),

  /**
   * Asia amman time zone id.
   */
  ASIA_AMMAN("Asia/Amman"),

  /**
   * Asia anadyr time zone id.
   */
  ASIA_ANADYR("Asia/Anadyr"),

  /**
   * Asia aqtau time zone id.
   */
  ASIA_AQTAU("Asia/Aqtau"),

  /**
   * Asia aqtobe time zone id.
   */
  ASIA_AQTOBE("Asia/Aqtobe"),

  /**
   * Asia ashgabat time zone id.
   */
  ASIA_ASHGABAT("Asia/Ashgabat"),

  /**
   * Asia ashkhabad time zone id.
   */
  ASIA_ASHKHABAD("Asia/Ashkhabad"),

  /**
   * Asia atyrau time zone id.
   */
  ASIA_ATYRAU("Asia/Atyrau"),

  /**
   * Asia baghdad time zone id.
   */
  ASIA_BAGHDAD("Asia/Baghdad"),

  /**
   * Asia bahrain time zone id.
   */
  ASIA_BAHRAIN("Asia/Bahrain"),

  /**
   * Asia baku time zone id.
   */
  ASIA_BAKU("Asia/Baku"),

  /**
   * Asia bangkok time zone id.
   */
  ASIA_BANGKOK("Asia/Bangkok"),

  /**
   * Asia barnaul time zone id.
   */
  ASIA_BARNAUL("Asia/Barnaul"),

  /**
   * Asia beirut time zone id.
   */
  ASIA_BEIRUT("Asia/Beirut"),

  /**
   * Asia bishkek time zone id.
   */
  ASIA_BISHKEK("Asia/Bishkek"),

  /**
   * Asia brunei time zone id.
   */
  ASIA_BRUNEI("Asia/Brunei"),

  /**
   * Asia calcutta time zone id.
   */
  ASIA_CALCUTTA("Asia/Calcutta"),

  /**
   * Asia chita time zone id.
   */
  ASIA_CHITA("Asia/Chita"),

  /**
   * Asia choibalsan time zone id.
   */
  ASIA_CHOIBALSAN("Asia/Choibalsan"),

  /**
   * Asia chongqing time zone id.
   */
  ASIA_CHONGQING("Asia/Chongqing"),

  /**
   * Asia chungking time zone id.
   */
  ASIA_CHUNGKING("Asia/Chungking"),

  /**
   * Asia colombo time zone id.
   */
  ASIA_COLOMBO("Asia/Colombo"),

  /**
   * Asia dacca time zone id.
   */
  ASIA_DACCA("Asia/Dacca"),

  /**
   * Asia damascus time zone id.
   */
  ASIA_DAMASCUS("Asia/Damascus"),

  /**
   * Asia dhaka time zone id.
   */
  ASIA_DHAKA("Asia/Dhaka"),

  /**
   * Asia dili time zone id.
   */
  ASIA_DILI("Asia/Dili"),

  /**
   * Asia dubai time zone id.
   */
  ASIA_DUBAI("Asia/Dubai"),

  /**
   * Asia dushanbe time zone id.
   */
  ASIA_DUSHANBE("Asia/Dushanbe"),

  /**
   * Asia famagusta time zone id.
   */
  ASIA_FAMAGUSTA("Asia/Famagusta"),

  /**
   * Asia gaza time zone id.
   */
  ASIA_GAZA("Asia/Gaza"),

  /**
   * Asia harbin time zone id.
   */
  ASIA_HARBIN("Asia/Harbin"),

  /**
   * Asia hebron time zone id.
   */
  ASIA_HEBRON("Asia/Hebron"),

  /**
   * Asia ho chi minh time zone id.
   */
  ASIA_HO_CHI_MINH("Asia/Ho_Chi_Minh"),

  /**
   * Asia hong kong time zone id.
   */
  ASIA_HONG_KONG("Asia/Hong_Kong"),

  /**
   * Asia hovd time zone id.
   */
  ASIA_HOVD("Asia/Hovd"),

  /**
   * Asia irkutsk time zone id.
   */
  ASIA_IRKUTSK("Asia/Irkutsk"),

  /**
   * Asia istanbul time zone id.
   */
  ASIA_ISTANBUL("Asia/Istanbul"),

  /**
   * Asia jakarta time zone id.
   */
  ASIA_JAKARTA("Asia/Jakarta"),

  /**
   * Asia jayapura time zone id.
   */
  ASIA_JAYAPURA("Asia/Jayapura"),

  /**
   * Asia jerusalem time zone id.
   */
  ASIA_JERUSALEM("Asia/Jerusalem"),

  /**
   * Asia kabul time zone id.
   */
  ASIA_KABUL("Asia/Kabul"),

  /**
   * Asia kamchatka time zone id.
   */
  ASIA_KAMCHATKA("Asia/Kamchatka"),

  /**
   * Asia karachi time zone id.
   */
  ASIA_KARACHI("Asia/Karachi"),

  /**
   * Asia kashgar time zone id.
   */
  ASIA_KASHGAR("Asia/Kashgar"),

  /**
   * Asia kathmandu time zone id.
   */
  ASIA_KATHMANDU("Asia/Kathmandu"),

  /**
   * Asia katmandu time zone id.
   */
  ASIA_KATMANDU("Asia/Katmandu"),

  /**
   * Asia khandyga time zone id.
   */
  ASIA_KHANDYGA("Asia/Khandyga"),

  /**
   * Asia kolkata time zone id.
   */
  ASIA_KOLKATA("Asia/Kolkata"),

  /**
   * Asia krasnoyarsk time zone id.
   */
  ASIA_KRASNOYARSK("Asia/Krasnoyarsk"),

  /**
   * Asia kuala lumpur time zone id.
   */
  ASIA_KUALA_LUMPUR("Asia/Kuala_Lumpur"),

  /**
   * Asia kuching time zone id.
   */
  ASIA_KUCHING("Asia/Kuching"),

  /**
   * Asia kuwait time zone id.
   */
  ASIA_KUWAIT("Asia/Kuwait"),

  /**
   * Asia macao time zone id.
   */
  ASIA_MACAO("Asia/Macao"),

  /**
   * Asia macau time zone id.
   */
  ASIA_MACAU("Asia/Macau"),

  /**
   * Asia magadan time zone id.
   */
  ASIA_MAGADAN("Asia/Magadan"),

  /**
   * Asia makassar time zone id.
   */
  ASIA_MAKASSAR("Asia/Makassar"),

  /**
   * Asia manila time zone id.
   */
  ASIA_MANILA("Asia/Manila"),

  /**
   * Asia muscat time zone id.
   */
  ASIA_MUSCAT("Asia/Muscat"),

  /**
   * Asia nicosia time zone id.
   */
  ASIA_NICOSIA("Asia/Nicosia"),

  /**
   * Asia novokuznetsk time zone id.
   */
  ASIA_NOVOKUZNETSK("Asia/Novokuznetsk"),

  /**
   * Asia novosibirsk time zone id.
   */
  ASIA_NOVOSIBIRSK("Asia/Novosibirsk"),

  /**
   * Asia omsk time zone id.
   */
  ASIA_OMSK("Asia/Omsk"),

  /**
   * Asia oral time zone id.
   */
  ASIA_ORAL("Asia/Oral"),

  /**
   * Asia phnom penh time zone id.
   */
  ASIA_PHNOM_PENH("Asia/Phnom_Penh"),

  /**
   * Asia pontianak time zone id.
   */
  ASIA_PONTIANAK("Asia/Pontianak"),

  /**
   * Asia pyongyang time zone id.
   */
  ASIA_PYONGYANG("Asia/Pyongyang"),

  /**
   * Asia qatar time zone id.
   */
  ASIA_QATAR("Asia/Qatar"),

  /**
   * Asia qyzylorda time zone id.
   */
  ASIA_QYZYLORDA("Asia/Qyzylorda"),

  /**
   * Asia rangoon time zone id.
   */
  ASIA_RANGOON("Asia/Rangoon"),

  /**
   * Asia riyadh time zone id.
   */
  ASIA_RIYADH("Asia/Riyadh"),

  /**
   * Asia saigon time zone id.
   */
  ASIA_SAIGON("Asia/Saigon"),

  /**
   * Asia sakhalin time zone id.
   */
  ASIA_SAKHALIN("Asia/Sakhalin"),

  /**
   * Asia samarkand time zone id.
   */
  ASIA_SAMARKAND("Asia/Samarkand"),

  /**
   * Asia seoul time zone id.
   */
  ASIA_SEOUL("Asia/Seoul"),

  /**
   * Asia shanghai time zone id.
   */
  ASIA_SHANGHAI("Asia/Shanghai"),

  /**
   * Asia singapore time zone id.
   */
  ASIA_SINGAPORE("Asia/Singapore"),

  /**
   * Asia srednekolymsk time zone id.
   */
  ASIA_SREDNEKOLYMSK("Asia/Srednekolymsk"),

  /**
   * Asia taipei time zone id.
   */
  ASIA_TAIPEI("Asia/Taipei"),

  /**
   * Asia tashkent time zone id.
   */
  ASIA_TASHKENT("Asia/Tashkent"),

  /**
   * Asia tbilisi time zone id.
   */
  ASIA_TBILISI("Asia/Tbilisi"),

  /**
   * Asia tehran time zone id.
   */
  ASIA_TEHRAN("Asia/Tehran"),

  /**
   * Asia tel aviv time zone id.
   */
  ASIA_TEL_AVIV("Asia/Tel_Aviv"),

  /**
   * Asia thimbu time zone id.
   */
  ASIA_THIMBU("Asia/Thimbu"),

  /**
   * Asia thimphu time zone id.
   */
  ASIA_THIMPHU("Asia/Thimphu"),

  /**
   * Asia tokyo time zone id.
   */
  ASIA_TOKYO("Asia/Tokyo"),

  /**
   * Asia tomsk time zone id.
   */
  ASIA_TOMSK("Asia/Tomsk"),

  /**
   * Asia ujung pandang time zone id.
   */
  ASIA_UJUNG_PANDANG("Asia/Ujung_Pandang"),

  /**
   * Asia ulaanbaatar time zone id.
   */
  ASIA_ULAANBAATAR("Asia/Ulaanbaatar"),

  /**
   * Asia ulan bator time zone id.
   */
  ASIA_ULAN_BATOR("Asia/Ulan_Bator"),

  /**
   * Asia urumqi time zone id.
   */
  ASIA_URUMQI("Asia/Urumqi"),

  /**
   * Asia ust nera time zone id.
   */
  ASIA_UST_NERA("Asia/Ust-Nera"),

  /**
   * Asia vientiane time zone id.
   */
  ASIA_VIENTIANE("Asia/Vientiane"),

  /**
   * Asia vladivostok time zone id.
   */
  ASIA_VLADIVOSTOK("Asia/Vladivostok"),

  /**
   * Asia yakutsk time zone id.
   */
  ASIA_YAKUTSK("Asia/Yakutsk"),

  /**
   * Asia yangon time zone id.
   */
  ASIA_YANGON("Asia/Yangon"),

  /**
   * Asia yekaterinburg time zone id.
   */
  ASIA_YEKATERINBURG("Asia/Yekaterinburg"),

  /**
   * Asia yerevan time zone id.
   */
  ASIA_YEREVAN("Asia/Yerevan"),

  /**
   * Atlantic azores time zone id.
   */
  ATLANTIC_AZORES("Atlantic/Azores"),

  /**
   * Atlantic bermuda time zone id.
   */
  ATLANTIC_BERMUDA("Atlantic/Bermuda"),

  /**
   * Atlantic canary time zone id.
   */
  ATLANTIC_CANARY("Atlantic/Canary"),

  /**
   * Atlantic cape verde time zone id.
   */
  ATLANTIC_CAPE_VERDE("Atlantic/Cape_Verde"),

  /**
   * Atlantic faeroe time zone id.
   */
  ATLANTIC_FAEROE("Atlantic/Faeroe"),

  /**
   * Atlantic faroe time zone id.
   */
  ATLANTIC_FAROE("Atlantic/Faroe"),

  /**
   * Atlantic jan mayen time zone id.
   */
  ATLANTIC_JAN_MAYEN("Atlantic/Jan_Mayen"),

  /**
   * Atlantic madeira time zone id.
   */
  ATLANTIC_MADEIRA("Atlantic/Madeira"),

  /**
   * Atlantic reykjavik time zone id.
   */
  ATLANTIC_REYKJAVIK("Atlantic/Reykjavik"),

  /**
   * Atlantic south georgia time zone id.
   */
  ATLANTIC_SOUTH_GEORGIA("Atlantic/South_Georgia"),

  /**
   * Atlantic st helena time zone id.
   */
  ATLANTIC_ST_HELENA("Atlantic/St_Helena"),

  /**
   * Atlantic stanley time zone id.
   */
  ATLANTIC_STANLEY("Atlantic/Stanley"),

  /**
   * Australia act time zone id.
   */
  AUSTRALIA_ACT("Australia/ACT"),

  /**
   * Australia adelaide time zone id.
   */
  AUSTRALIA_ADELAIDE("Australia/Adelaide"),

  /**
   * Australia brisbane time zone id.
   */
  AUSTRALIA_BRISBANE("Australia/Brisbane"),

  /**
   * Australia broken hill time zone id.
   */
  AUSTRALIA_BROKEN_HILL("Australia/Broken_Hill"),

  /**
   * Australia canberra time zone id.
   */
  AUSTRALIA_CANBERRA("Australia/Canberra"),

  /**
   * Australia currie time zone id.
   */
  AUSTRALIA_CURRIE("Australia/Currie"),

  /**
   * Australia darwin time zone id.
   */
  AUSTRALIA_DARWIN("Australia/Darwin"),

  /**
   * Australia eucla time zone id.
   */
  AUSTRALIA_EUCLA("Australia/Eucla"),

  /**
   * Australia hobart time zone id.
   */
  AUSTRALIA_HOBART("Australia/Hobart"),

  /**
   * Australia lhi time zone id.
   */
  AUSTRALIA_LHI("Australia/LHI"),

  /**
   * Australia lindeman time zone id.
   */
  AUSTRALIA_LINDEMAN("Australia/Lindeman"),

  /**
   * Australia lord howe time zone id.
   */
  AUSTRALIA_LORD_HOWE("Australia/Lord_Howe"),

  /**
   * Australia melbourne time zone id.
   */
  AUSTRALIA_MELBOURNE("Australia/Melbourne"),

  /**
   * Australia nsw time zone id.
   */
  AUSTRALIA_NSW("Australia/NSW"),

  /**
   * Australia north time zone id.
   */
  AUSTRALIA_NORTH("Australia/North"),

  /**
   * Australia perth time zone id.
   */
  AUSTRALIA_PERTH("Australia/Perth"),

  /**
   * Australia queensland time zone id.
   */
  AUSTRALIA_QUEENSLAND("Australia/Queensland"),

  /**
   * Australia south time zone id.
   */
  AUSTRALIA_SOUTH("Australia/South"),

  /**
   * Australia sydney time zone id.
   */
  AUSTRALIA_SYDNEY("Australia/Sydney"),

  /**
   * Australia tasmania time zone id.
   */
  AUSTRALIA_TASMANIA("Australia/Tasmania"),

  /**
   * Australia victoria time zone id.
   */
  AUSTRALIA_VICTORIA("Australia/Victoria"),

  /**
   * Australia west time zone id.
   */
  AUSTRALIA_WEST("Australia/West"),

  /**
   * Australia yancowinna time zone id.
   */
  AUSTRALIA_YANCOWINNA("Australia/Yancowinna"),

  /**
   * Bet time zone id.
   */
  BET("BET"),

  /**
   * Bst time zone id.
   */
  BST("BST"),

  /**
   * Brazil acre time zone id.
   */
  BRAZIL_ACRE("Brazil/Acre"),

  /**
   * Brazil denoronha time zone id.
   */
  BRAZIL_DENORONHA("Brazil/DeNoronha"),

  /**
   * Brazil east time zone id.
   */
  BRAZIL_EAST("Brazil/East"),

  /**
   * Brazil west time zone id.
   */
  BRAZIL_WEST("Brazil/West"),

  /**
   * Cat time zone id.
   */
  CAT("CAT"),

  /**
   * Cet time zone id.
   */
  CET("CET"),

  /**
   * Cnt time zone id.
   */
  CNT("CNT"),

  /**
   * Cst time zone id.
   */
  CST("CST"),

  /**
   * Cst 6 cdt time zone id.
   */
  CST6CDT("CST6CDT"),

  /**
   * Ctt time zone id.
   */
  CTT("CTT"),

  /**
   * Canada atlantic time zone id.
   */
  CANADA_ATLANTIC("Canada/Atlantic"),

  /**
   * Canada central time zone id.
   */
  CANADA_CENTRAL("Canada/Central"),

  /**
   * Canada eastern time zone id.
   */
  CANADA_EASTERN("Canada/Eastern"),

  /**
   * Canada mountain time zone id.
   */
  CANADA_MOUNTAIN("Canada/Mountain"),

  /**
   * Canada newfoundland time zone id.
   */
  CANADA_NEWFOUNDLAND("Canada/Newfoundland"),

  /**
   * Canada pacific time zone id.
   */
  CANADA_PACIFIC("Canada/Pacific"),

  /**
   * Canada saskatchewan time zone id.
   */
  CANADA_SASKATCHEWAN("Canada/Saskatchewan"),

  /**
   * Canada yukon time zone id.
   */
  CANADA_YUKON("Canada/Yukon"),

  /**
   * Chile continental time zone id.
   */
  CHILE_CONTINENTAL("Chile/Continental"),

  /**
   * Chile easterisland time zone id.
   */
  CHILE_EASTERISLAND("Chile/EasterIsland"),

  /**
   * Cuba time zone id.
   */
  CUBA("Cuba"),

  /**
   * Eat time zone id.
   */
  EAT("EAT"),

  /**
   * Ect time zone id.
   */
  ECT("ECT"),

  /**
   * Eet time zone id.
   */
  EET("EET"),

  /**
   * Est time zone id.
   */
  EST("EST"),

  /**
   * Est 5 edt time zone id.
   */
  EST5EDT("EST5EDT"),

  /**
   * Egypt time zone id.
   */
  EGYPT("Egypt"),

  /**
   * Eire time zone id.
   */
  EIRE("Eire"),

  /**
   * Etc gmt time zone id.
   */
  ETC_GMT("Etc/GMT"),

  /**
   * Etc gmt plus 0 time zone id.
   */
  ETC_GMT_PLUS0("Etc/GMT+0"),

  /**
   * Etc gmt plus 1 time zone id.
   */
  ETC_GMT_PLUS1("Etc/GMT+1"),

  /**
   * Etc gmt plus 10 time zone id.
   */
  ETC_GMT_PLUS10("Etc/GMT+10"),

  /**
   * Etc gmt plus 11 time zone id.
   */
  ETC_GMT_PLUS11("Etc/GMT+11"),

  /**
   * Etc gmt plus 12 time zone id.
   */
  ETC_GMT_PLUS12("Etc/GMT+12"),

  /**
   * Etc gmt plus 2 time zone id.
   */
  ETC_GMT_PLUS2("Etc/GMT+2"),

  /**
   * Etc gmt plus 3 time zone id.
   */
  ETC_GMT_PLUS3("Etc/GMT+3"),

  /**
   * Etc gmt plus 4 time zone id.
   */
  ETC_GMT_PLUS4("Etc/GMT+4"),

  /**
   * Etc gmt plus 5 time zone id.
   */
  ETC_GMT_PLUS5("Etc/GMT+5"),

  /**
   * Etc gmt plus 6 time zone id.
   */
  ETC_GMT_PLUS6("Etc/GMT+6"),

  /**
   * Etc gmt plus 7 time zone id.
   */
  ETC_GMT_PLUS7("Etc/GMT+7"),

  /**
   * Etc gmt plus 8 time zone id.
   */
  ETC_GMT_PLUS8("Etc/GMT+8"),

  /**
   * Etc gmt plus 9 time zone id.
   */
  ETC_GMT_PLUS9("Etc/GMT+9"),

  /**
   * Etc gmt 0 time zone id.
   */
  ETC_GMT_0("Etc/GMT-0"),

  /**
   * Etc gmt 1 time zone id.
   */
  ETC_GMT_1("Etc/GMT-1"),

  /**
   * Etc gmt 10 time zone id.
   */
  ETC_GMT_10("Etc/GMT-10"),

  /**
   * Etc gmt 11 time zone id.
   */
  ETC_GMT_11("Etc/GMT-11"),

  /**
   * Etc gmt 12 time zone id.
   */
  ETC_GMT_12("Etc/GMT-12"),

  /**
   * Etc gmt 13 time zone id.
   */
  ETC_GMT_13("Etc/GMT-13"),

  /**
   * Etc gmt 14 time zone id.
   */
  ETC_GMT_14("Etc/GMT-14"),

  /**
   * Etc gmt 2 time zone id.
   */
  ETC_GMT_2("Etc/GMT-2"),

  /**
   * Etc gmt 3 time zone id.
   */
  ETC_GMT_3("Etc/GMT-3"),

  /**
   * Etc gmt 4 time zone id.
   */
  ETC_GMT_4("Etc/GMT-4"),

  /**
   * Etc gmt 5 time zone id.
   */
  ETC_GMT_5("Etc/GMT-5"),

  /**
   * Etc gmt 6 time zone id.
   */
  ETC_GMT_6("Etc/GMT-6"),

  /**
   * Etc gmt 7 time zone id.
   */
  ETC_GMT_7("Etc/GMT-7"),

  /**
   * Etc gmt 8 time zone id.
   */
  ETC_GMT_8("Etc/GMT-8"),

  /**
   * Etc gmt 9 time zone id.
   */
  ETC_GMT_9("Etc/GMT-9"),

  /**
   * Etc gmt 0 time zone id.
   */
  ETC_GMT0("Etc/GMT0"),

  /**
   * Etc greenwich time zone id.
   */
  ETC_GREENWICH("Etc/Greenwich"),

  /**
   * Etc uct time zone id.
   */
  ETC_UCT("Etc/UCT"),

  /**
   * Etc utc time zone id.
   */
  ETC_UTC("Etc/UTC"),

  /**
   * Etc universal time zone id.
   */
  ETC_UNIVERSAL("Etc/Universal"),

  /**
   * Etc zulu time zone id.
   */
  ETC_ZULU("Etc/Zulu"),

  /**
   * Europe amsterdam time zone id.
   */
  EUROPE_AMSTERDAM("Europe/Amsterdam"),

  /**
   * Europe andorra time zone id.
   */
  EUROPE_ANDORRA("Europe/Andorra"),

  /**
   * Europe astrakhan time zone id.
   */
  EUROPE_ASTRAKHAN("Europe/Astrakhan"),

  /**
   * Europe athens time zone id.
   */
  EUROPE_ATHENS("Europe/Athens"),

  /**
   * Europe belfast time zone id.
   */
  EUROPE_BELFAST("Europe/Belfast"),

  /**
   * Europe belgrade time zone id.
   */
  EUROPE_BELGRADE("Europe/Belgrade"),

  /**
   * Europe berlin time zone id.
   */
  EUROPE_BERLIN("Europe/Berlin"),

  /**
   * Europe bratislava time zone id.
   */
  EUROPE_BRATISLAVA("Europe/Bratislava"),

  /**
   * Europe brussels time zone id.
   */
  EUROPE_BRUSSELS("Europe/Brussels"),

  /**
   * Europe bucharest time zone id.
   */
  EUROPE_BUCHAREST("Europe/Bucharest"),

  /**
   * Europe budapest time zone id.
   */
  EUROPE_BUDAPEST("Europe/Budapest"),

  /**
   * Europe busingen time zone id.
   */
  EUROPE_BUSINGEN("Europe/Busingen"),

  /**
   * Europe chisinau time zone id.
   */
  EUROPE_CHISINAU("Europe/Chisinau"),

  /**
   * Europe copenhagen time zone id.
   */
  EUROPE_COPENHAGEN("Europe/Copenhagen"),

  /**
   * Europe dublin time zone id.
   */
  EUROPE_DUBLIN("Europe/Dublin"),

  /**
   * Europe gibraltar time zone id.
   */
  EUROPE_GIBRALTAR("Europe/Gibraltar"),

  /**
   * Europe guernsey time zone id.
   */
  EUROPE_GUERNSEY("Europe/Guernsey"),

  /**
   * Europe helsinki time zone id.
   */
  EUROPE_HELSINKI("Europe/Helsinki"),

  /**
   * Europe isle of man time zone id.
   */
  EUROPE_ISLE_OF_MAN("Europe/Isle_of_Man"),

  /**
   * Europe istanbul time zone id.
   */
  EUROPE_ISTANBUL("Europe/Istanbul"),

  /**
   * Europe jersey time zone id.
   */
  EUROPE_JERSEY("Europe/Jersey"),

  /**
   * Europe kaliningrad time zone id.
   */
  EUROPE_KALININGRAD("Europe/Kaliningrad"),

  /**
   * Europe kiev time zone id.
   */
  EUROPE_KIEV("Europe/Kiev"),

  /**
   * Europe kirov time zone id.
   */
  EUROPE_KIROV("Europe/Kirov"),

  /**
   * Europe lisbon time zone id.
   */
  EUROPE_LISBON("Europe/Lisbon"),

  /**
   * Europe ljubljana time zone id.
   */
  EUROPE_LJUBLJANA("Europe/Ljubljana"),

  /**
   * Europe london time zone id.
   */
  EUROPE_LONDON("Europe/London"),

  /**
   * Europe luxembourg time zone id.
   */
  EUROPE_LUXEMBOURG("Europe/Luxembourg"),

  /**
   * Europe madrid time zone id.
   */
  EUROPE_MADRID("Europe/Madrid"),

  /**
   * Europe malta time zone id.
   */
  EUROPE_MALTA("Europe/Malta"),

  /**
   * Europe mariehamn time zone id.
   */
  EUROPE_MARIEHAMN("Europe/Mariehamn"),

  /**
   * Europe minsk time zone id.
   */
  EUROPE_MINSK("Europe/Minsk"),

  /**
   * Europe monaco time zone id.
   */
  EUROPE_MONACO("Europe/Monaco"),

  /**
   * Europe moscow time zone id.
   */
  EUROPE_MOSCOW("Europe/Moscow"),

  /**
   * Europe nicosia time zone id.
   */
  EUROPE_NICOSIA("Europe/Nicosia"),

  /**
   * Europe oslo time zone id.
   */
  EUROPE_OSLO("Europe/Oslo"),

  /**
   * Europe paris time zone id.
   */
  EUROPE_PARIS("Europe/Paris"),

  /**
   * Europe podgorica time zone id.
   */
  EUROPE_PODGORICA("Europe/Podgorica"),

  /**
   * Europe prague time zone id.
   */
  EUROPE_PRAGUE("Europe/Prague"),

  /**
   * Europe riga time zone id.
   */
  EUROPE_RIGA("Europe/Riga"),

  /**
   * Europe rome time zone id.
   */
  EUROPE_ROME("Europe/Rome"),

  /**
   * Europe samara time zone id.
   */
  EUROPE_SAMARA("Europe/Samara"),

  /**
   * Europe san marino time zone id.
   */
  EUROPE_SAN_MARINO("Europe/San_Marino"),

  /**
   * Europe sarajevo time zone id.
   */
  EUROPE_SARAJEVO("Europe/Sarajevo"),

  /**
   * Europe saratov time zone id.
   */
  EUROPE_SARATOV("Europe/Saratov"),

  /**
   * Europe simferopol time zone id.
   */
  EUROPE_SIMFEROPOL("Europe/Simferopol"),

  /**
   * Europe skopje time zone id.
   */
  EUROPE_SKOPJE("Europe/Skopje"),

  /**
   * Europe sofia time zone id.
   */
  EUROPE_SOFIA("Europe/Sofia"),

  /**
   * Europe stockholm time zone id.
   */
  EUROPE_STOCKHOLM("Europe/Stockholm"),

  /**
   * Europe tallinn time zone id.
   */
  EUROPE_TALLINN("Europe/Tallinn"),

  /**
   * Europe tirane time zone id.
   */
  EUROPE_TIRANE("Europe/Tirane"),

  /**
   * Europe tiraspol time zone id.
   */
  EUROPE_TIRASPOL("Europe/Tiraspol"),

  /**
   * Europe ulyanovsk time zone id.
   */
  EUROPE_ULYANOVSK("Europe/Ulyanovsk"),

  /**
   * Europe uzhgorod time zone id.
   */
  EUROPE_UZHGOROD("Europe/Uzhgorod"),

  /**
   * Europe vaduz time zone id.
   */
  EUROPE_VADUZ("Europe/Vaduz"),

  /**
   * Europe vatican time zone id.
   */
  EUROPE_VATICAN("Europe/Vatican"),

  /**
   * Europe vienna time zone id.
   */
  EUROPE_VIENNA("Europe/Vienna"),

  /**
   * Europe vilnius time zone id.
   */
  EUROPE_VILNIUS("Europe/Vilnius"),

  /**
   * Europe volgograd time zone id.
   */
  EUROPE_VOLGOGRAD("Europe/Volgograd"),

  /**
   * Europe warsaw time zone id.
   */
  EUROPE_WARSAW("Europe/Warsaw"),

  /**
   * Europe zagreb time zone id.
   */
  EUROPE_ZAGREB("Europe/Zagreb"),

  /**
   * Europe zaporozhye time zone id.
   */
  EUROPE_ZAPOROZHYE("Europe/Zaporozhye"),

  /**
   * Europe zurich time zone id.
   */
  EUROPE_ZURICH("Europe/Zurich"),

  /**
   * Gb time zone id.
   */
  GB("GB"),

  /**
   * Gb eire time zone id.
   */
  GB_EIRE("GB-Eire"),

  /**
   * Gmt time zone id.
   */
  GMT("GMT"),

  /**
   * Gmt 0 time zone id.
   */
  GMT0("GMT0"),

  /**
   * Greenwich time zone id.
   */
  GREENWICH("Greenwich"),

  /**
   * Hst time zone id.
   */
  HST("HST"),

  /**
   * Hongkong time zone id.
   */
  HONGKONG("Hongkong"),

  /**
   * Iet time zone id.
   */
  IET("IET"),

  /**
   * Ist time zone id.
   */
  IST("IST"),

  /**
   * Iceland time zone id.
   */
  ICELAND("Iceland"),

  /**
   * Indian antananarivo time zone id.
   */
  INDIAN_ANTANANARIVO("Indian/Antananarivo"),

  /**
   * Indian chagos time zone id.
   */
  INDIAN_CHAGOS("Indian/Chagos"),

  /**
   * Indian christmas time zone id.
   */
  INDIAN_CHRISTMAS("Indian/Christmas"),

  /**
   * Indian cocos time zone id.
   */
  INDIAN_COCOS("Indian/Cocos"),

  /**
   * Indian comoro time zone id.
   */
  INDIAN_COMORO("Indian/Comoro"),

  /**
   * Indian kerguelen time zone id.
   */
  INDIAN_KERGUELEN("Indian/Kerguelen"),

  /**
   * Indian mahe time zone id.
   */
  INDIAN_MAHE("Indian/Mahe"),

  /**
   * Indian maldives time zone id.
   */
  INDIAN_MALDIVES("Indian/Maldives"),

  /**
   * Indian mauritius time zone id.
   */
  INDIAN_MAURITIUS("Indian/Mauritius"),

  /**
   * Indian mayotte time zone id.
   */
  INDIAN_MAYOTTE("Indian/Mayotte"),

  /**
   * Indian reunion time zone id.
   */
  INDIAN_REUNION("Indian/Reunion"),

  /**
   * Iran time zone id.
   */
  IRAN("Iran"),

  /**
   * Israel time zone id.
   */
  ISRAEL("Israel"),

  /**
   * Jst time zone id.
   */
  JST("JST"),

  /**
   * Jamaica time zone id.
   */
  JAMAICA("Jamaica"),

  /**
   * Japan time zone id.
   */
  JAPAN("Japan"),

  /**
   * Kwajalein time zone id.
   */
  KWAJALEIN("Kwajalein"),

  /**
   * Libya time zone id.
   */
  LIBYA("Libya"),

  /**
   * Met time zone id.
   */
  MET("MET"),

  /**
   * Mit time zone id.
   */
  MIT("MIT"),

  /**
   * Mst time zone id.
   */
  MST("MST"),

  /**
   * Mst 7 mdt time zone id.
   */
  MST7MDT("MST7MDT"),

  /**
   * Mexico bajanorte time zone id.
   */
  MEXICO_BAJANORTE("Mexico/BajaNorte"),

  /**
   * Mexico bajasur time zone id.
   */
  MEXICO_BAJASUR("Mexico/BajaSur"),

  /**
   * Mexico general time zone id.
   */
  MEXICO_GENERAL("Mexico/General"),

  /**
   * Net time zone id.
   */
  NET("NET"),

  /**
   * Nst time zone id.
   */
  NST("NST"),

  /**
   * Nz time zone id.
   */
  NZ("NZ"),

  /**
   * Nz chat time zone id.
   */
  NZ_CHAT("NZ-CHAT"),

  /**
   * Navajo time zone id.
   */
  NAVAJO("Navajo"),

  /**
   * Plt time zone id.
   */
  PLT("PLT"),

  /**
   * Pnt time zone id.
   */
  PNT("PNT"),

  /**
   * Prc time zone id.
   */
  PRC("PRC"),

  /**
   * Prt time zone id.
   */
  PRT("PRT"),

  /**
   * Pst time zone id.
   */
  PST("PST"),

  /**
   * Pst 8 pdt time zone id.
   */
  PST8PDT("PST8PDT"),

  /**
   * Pacific apia time zone id.
   */
  PACIFIC_APIA("Pacific/Apia"),

  /**
   * Pacific auckland time zone id.
   */
  PACIFIC_AUCKLAND("Pacific/Auckland"),

  /**
   * Pacific bougainville time zone id.
   */
  PACIFIC_BOUGAINVILLE("Pacific/Bougainville"),

  /**
   * Pacific chatham time zone id.
   */
  PACIFIC_CHATHAM("Pacific/Chatham"),

  /**
   * Pacific chuuk time zone id.
   */
  PACIFIC_CHUUK("Pacific/Chuuk"),

  /**
   * Pacific easter time zone id.
   */
  PACIFIC_EASTER("Pacific/Easter"),

  /**
   * Pacific efate time zone id.
   */
  PACIFIC_EFATE("Pacific/Efate"),

  /**
   * Pacific enderbury time zone id.
   */
  PACIFIC_ENDERBURY("Pacific/Enderbury"),

  /**
   * Pacific fakaofo time zone id.
   */
  PACIFIC_FAKAOFO("Pacific/Fakaofo"),

  /**
   * Pacific fiji time zone id.
   */
  PACIFIC_FIJI("Pacific/Fiji"),

  /**
   * Pacific funafuti time zone id.
   */
  PACIFIC_FUNAFUTI("Pacific/Funafuti"),

  /**
   * Pacific galapagos time zone id.
   */
  PACIFIC_GALAPAGOS("Pacific/Galapagos"),

  /**
   * Pacific gambier time zone id.
   */
  PACIFIC_GAMBIER("Pacific/Gambier"),

  /**
   * Pacific guadalcanal time zone id.
   */
  PACIFIC_GUADALCANAL("Pacific/Guadalcanal"),

  /**
   * Pacific guam time zone id.
   */
  PACIFIC_GUAM("Pacific/Guam"),

  /**
   * Pacific honolulu time zone id.
   */
  PACIFIC_HONOLULU("Pacific/Honolulu"),

  /**
   * Pacific johnston time zone id.
   */
  PACIFIC_JOHNSTON("Pacific/Johnston"),

  /**
   * Pacific kiritimati time zone id.
   */
  PACIFIC_KIRITIMATI("Pacific/Kiritimati"),

  /**
   * Pacific kosrae time zone id.
   */
  PACIFIC_KOSRAE("Pacific/Kosrae"),

  /**
   * Pacific kwajalein time zone id.
   */
  PACIFIC_KWAJALEIN("Pacific/Kwajalein"),

  /**
   * Pacific majuro time zone id.
   */
  PACIFIC_MAJURO("Pacific/Majuro"),

  /**
   * Pacific marquesas time zone id.
   */
  PACIFIC_MARQUESAS("Pacific/Marquesas"),

  /**
   * Pacific midway time zone id.
   */
  PACIFIC_MIDWAY("Pacific/Midway"),

  /**
   * Pacific nauru time zone id.
   */
  PACIFIC_NAURU("Pacific/Nauru"),

  /**
   * Pacific niue time zone id.
   */
  PACIFIC_NIUE("Pacific/Niue"),

  /**
   * Pacific norfolk time zone id.
   */
  PACIFIC_NORFOLK("Pacific/Norfolk"),

  /**
   * Pacific noumea time zone id.
   */
  PACIFIC_NOUMEA("Pacific/Noumea"),

  /**
   * Pacific pago pago time zone id.
   */
  PACIFIC_PAGO_PAGO("Pacific/Pago_Pago"),

  /**
   * Pacific palau time zone id.
   */
  PACIFIC_PALAU("Pacific/Palau"),

  /**
   * Pacific pitcairn time zone id.
   */
  PACIFIC_PITCAIRN("Pacific/Pitcairn"),

  /**
   * Pacific pohnpei time zone id.
   */
  PACIFIC_POHNPEI("Pacific/Pohnpei"),

  /**
   * Pacific ponape time zone id.
   */
  PACIFIC_PONAPE("Pacific/Ponape"),

  /**
   * Pacific port moresby time zone id.
   */
  PACIFIC_PORT_MORESBY("Pacific/Port_Moresby"),

  /**
   * Pacific rarotonga time zone id.
   */
  PACIFIC_RAROTONGA("Pacific/Rarotonga"),

  /**
   * Pacific saipan time zone id.
   */
  PACIFIC_SAIPAN("Pacific/Saipan"),

  /**
   * Pacific samoa time zone id.
   */
  PACIFIC_SAMOA("Pacific/Samoa"),

  /**
   * Pacific tahiti time zone id.
   */
  PACIFIC_TAHITI("Pacific/Tahiti"),

  /**
   * Pacific tarawa time zone id.
   */
  PACIFIC_TARAWA("Pacific/Tarawa"),

  /**
   * Pacific tongatapu time zone id.
   */
  PACIFIC_TONGATAPU("Pacific/Tongatapu"),

  /**
   * Pacific truk time zone id.
   */
  PACIFIC_TRUK("Pacific/Truk"),

  /**
   * Pacific wake time zone id.
   */
  PACIFIC_WAKE("Pacific/Wake"),

  /**
   * Pacific wallis time zone id.
   */
  PACIFIC_WALLIS("Pacific/Wallis"),

  /**
   * Pacific yap time zone id.
   */
  PACIFIC_YAP("Pacific/Yap"),

  /**
   * Poland time zone id.
   */
  POLAND("Poland"),

  /**
   * Portugal time zone id.
   */
  PORTUGAL("Portugal"),

  /**
   * Rok time zone id.
   */
  ROK("ROK"),

  /**
   * Sst time zone id.
   */
  SST("SST"),

  /**
   * Singapore time zone id.
   */
  SINGAPORE("Singapore"),

  /**
   * Systemv ast 4 time zone id.
   */
  SYSTEMV_AST4("SystemV/AST4"),

  /**
   * Systemv ast 4 adt time zone id.
   */
  SYSTEMV_AST4ADT("SystemV/AST4ADT"),

  /**
   * Systemv cst 6 time zone id.
   */
  SYSTEMV_CST6("SystemV/CST6"),

  /**
   * Systemv cst 6 cdt time zone id.
   */
  SYSTEMV_CST6CDT("SystemV/CST6CDT"),

  /**
   * Systemv est 5 time zone id.
   */
  SYSTEMV_EST5("SystemV/EST5"),

  /**
   * Systemv est 5 edt time zone id.
   */
  SYSTEMV_EST5EDT("SystemV/EST5EDT"),

  /**
   * Systemv hst 10 time zone id.
   */
  SYSTEMV_HST10("SystemV/HST10"),

  /**
   * Systemv mst 7 time zone id.
   */
  SYSTEMV_MST7("SystemV/MST7"),

  /**
   * Systemv mst 7 mdt time zone id.
   */
  SYSTEMV_MST7MDT("SystemV/MST7MDT"),

  /**
   * Systemv pst 8 time zone id.
   */
  SYSTEMV_PST8("SystemV/PST8"),

  /**
   * Systemv pst 8 pdt time zone id.
   */
  SYSTEMV_PST8PDT("SystemV/PST8PDT"),

  /**
   * Systemv yst 9 time zone id.
   */
  SYSTEMV_YST9("SystemV/YST9"),

  /**
   * Systemv yst 9 ydt time zone id.
   */
  SYSTEMV_YST9YDT("SystemV/YST9YDT"),

  /**
   * Turkey time zone id.
   */
  TURKEY("Turkey"),

  /**
   * Uct time zone id.
   */
  UCT("UCT"),

  /**
   * Us alaska time zone id.
   */
  US_ALASKA("US/Alaska"),

  /**
   * Us aleutian time zone id.
   */
  US_ALEUTIAN("US/Aleutian"),

  /**
   * Us arizona time zone id.
   */
  US_ARIZONA("US/Arizona"),

  /**
   * Us central time zone id.
   */
  US_CENTRAL("US/Central"),

  /**
   * Us east indiana time zone id.
   */
  US_EAST_INDIANA("US/East-Indiana"),

  /**
   * Us eastern time zone id.
   */
  US_EASTERN("US/Eastern"),

  /**
   * Us hawaii time zone id.
   */
  US_HAWAII("US/Hawaii"),

  /**
   * Us indiana starke time zone id.
   */
  US_INDIANA_STARKE("US/Indiana-Starke"),

  /**
   * Us michigan time zone id.
   */
  US_MICHIGAN("US/Michigan"),

  /**
   * Us mountain time zone id.
   */
  US_MOUNTAIN("US/Mountain"),

  /**
   * Us pacific time zone id.
   */
  US_PACIFIC("US/Pacific"),

  /**
   * Us pacific new time zone id.
   */
  US_PACIFIC_NEW("US/Pacific-New"),

  /**
   * Us samoa time zone id.
   */
  US_SAMOA("US/Samoa"),

  /**
   * Utc time zone id.
   */
  UTC("UTC"),

  /**
   * Universal time zone id.
   */
  UNIVERSAL("Universal"),

  /**
   * Vst time zone id.
   */
  VST("VST"),

  /**
   * W su time zone id.
   */
  W_SU("W-SU"),

  /**
   * Wet time zone id.
   */
  WET("WET"),

  /**
   * Zulu time zone id.
   */
  ZULU("Zulu");

  private String value;

  TimeZoneId(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return toString(false);
  }

  /**
   * Returns the string representation of this time zone id.
   *
   * @param urlEncode specifies whether the return value should be url encoded or not
   * @return the time zone id
   */
  public String toString(boolean urlEncode) {
    return String.valueOf(urlEncode ? urlEncode(value) : value);
  }

  /**
   * To time zone.
   *
   * @return the time zone
   */
  public TimeZone toTimeZone() {
    return TimeZone.getTimeZone(value);
  }

  /**
   * From time zone id.
   *
   * @param text the text
   * @return the time zone id
   */
  @JsonCreator
  public static TimeZoneId fromValue(String text) {
    if (!StringUtils.hasText(text)) {
      return null;
    }
    for (TimeZoneId b : TimeZoneId.values()) {
      if (String.valueOf(b.value).equalsIgnoreCase(text)
          || b.name().equalsIgnoreCase(text)
          || String.valueOf(urlEncode(b.value)).equalsIgnoreCase(text)) {
        return b;
      }
    }
    return null;
  }

  /**
   * From time zone.
   *
   * @param timeZone the time zone
   * @return the time zone id
   */
  public static TimeZoneId fromTimeZone(TimeZone timeZone) {
    if (timeZone == null) {
      return null;
    }
    return fromValue(timeZone.getID());
  }

  private static String urlEncode(String value) {
    try {
      return URLEncoder.encode(value, StandardCharsets.UTF_8.name());
    } catch (Exception e) {
      return value;
    }
  }
}

