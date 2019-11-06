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
 * RFC 5646 language tags from Java Locale.
 */
public enum HttpLanguageTag {

  /**
   * Ar http language tag.
   */
  AR("ar"),

  /**
   * Ar ae http language tag.
   */
  AR_AE("ar-AE"),

  /**
   * Ar bh http language tag.
   */
  AR_BH("ar-BH"),

  /**
   * Ar dz http language tag.
   */
  AR_DZ("ar-DZ"),

  /**
   * Ar eg http language tag.
   */
  AR_EG("ar-EG"),

  /**
   * Ar iq http language tag.
   */
  AR_IQ("ar-IQ"),

  /**
   * Ar jo http language tag.
   */
  AR_JO("ar-JO"),

  /**
   * Ar kw http language tag.
   */
  AR_KW("ar-KW"),

  /**
   * Ar lb http language tag.
   */
  AR_LB("ar-LB"),

  /**
   * Ar ly http language tag.
   */
  AR_LY("ar-LY"),

  /**
   * Ar ma http language tag.
   */
  AR_MA("ar-MA"),

  /**
   * Ar om http language tag.
   */
  AR_OM("ar-OM"),

  /**
   * Ar qa http language tag.
   */
  AR_QA("ar-QA"),

  /**
   * Ar sa http language tag.
   */
  AR_SA("ar-SA"),

  /**
   * Ar sd http language tag.
   */
  AR_SD("ar-SD"),

  /**
   * Ar sy http language tag.
   */
  AR_SY("ar-SY"),

  /**
   * Ar tn http language tag.
   */
  AR_TN("ar-TN"),

  /**
   * Ar ye http language tag.
   */
  AR_YE("ar-YE"),

  /**
   * Be http language tag.
   */
  BE("be"),

  /**
   * Be by http language tag.
   */
  BE_BY("be-BY"),

  /**
   * Bg http language tag.
   */
  BG("bg"),

  /**
   * Bg bg http language tag.
   */
  BG_BG("bg-BG"),

  /**
   * Ca http language tag.
   */
  CA("ca"),

  /**
   * Ca es http language tag.
   */
  CA_ES("ca-ES"),

  /**
   * Cs http language tag.
   */
  CS("cs"),

  /**
   * Cs cz http language tag.
   */
  CS_CZ("cs-CZ"),

  /**
   * Da http language tag.
   */
  DA("da"),

  /**
   * Da dk http language tag.
   */
  DA_DK("da-DK"),

  /**
   * De http language tag.
   */
  DE("de"),

  /**
   * De at http language tag.
   */
  DE_AT("de-AT"),

  /**
   * De ch http language tag.
   */
  DE_CH("de-CH"),

  /**
   * De de http language tag.
   */
  DE_DE("de-DE"),

  /**
   * De gr http language tag.
   */
  DE_GR("de-GR"),

  /**
   * De lu http language tag.
   */
  DE_LU("de-LU"),

  /**
   * El http language tag.
   */
  EL("el"),

  /**
   * El cy http language tag.
   */
  EL_CY("el-CY"),

  /**
   * El gr http language tag.
   */
  EL_GR("el-GR"),

  /**
   * En http language tag.
   */
  EN("en"),

  /**
   * En au http language tag.
   */
  EN_AU("en-AU"),

  /**
   * En ca http language tag.
   */
  EN_CA("en-CA"),

  /**
   * En gb http language tag.
   */
  EN_GB("en-GB"),

  /**
   * En ie http language tag.
   */
  EN_IE("en-IE"),

  /**
   * En in http language tag.
   */
  EN_IN("en-IN"),

  /**
   * En mt http language tag.
   */
  EN_MT("en-MT"),

  /**
   * En nz http language tag.
   */
  EN_NZ("en-NZ"),

  /**
   * En ph http language tag.
   */
  EN_PH("en-PH"),

  /**
   * En sg http language tag.
   */
  EN_SG("en-SG"),

  /**
   * En us http language tag.
   */
  EN_US("en-US"),

  /**
   * En za http language tag.
   */
  EN_ZA("en-ZA"),

  /**
   * Es http language tag.
   */
  ES("es"),

  /**
   * Es ar http language tag.
   */
  ES_AR("es-AR"),

  /**
   * Es bo http language tag.
   */
  ES_BO("es-BO"),

  /**
   * Es cl http language tag.
   */
  ES_CL("es-CL"),

  /**
   * Es co http language tag.
   */
  ES_CO("es-CO"),

  /**
   * Es cr http language tag.
   */
  ES_CR("es-CR"),

  /**
   * Es cu http language tag.
   */
  ES_CU("es-CU"),

  /**
   * Es do http language tag.
   */
  ES_DO("es-DO"),

  /**
   * Es ec http language tag.
   */
  ES_EC("es-EC"),

  /**
   * Es es http language tag.
   */
  ES_ES("es-ES"),

  /**
   * Es gt http language tag.
   */
  ES_GT("es-GT"),

  /**
   * Es hn http language tag.
   */
  ES_HN("es-HN"),

  /**
   * Es mx http language tag.
   */
  ES_MX("es-MX"),

  /**
   * Es ni http language tag.
   */
  ES_NI("es-NI"),

  /**
   * Es pa http language tag.
   */
  ES_PA("es-PA"),

  /**
   * Es pe http language tag.
   */
  ES_PE("es-PE"),

  /**
   * Es pr http language tag.
   */
  ES_PR("es-PR"),

  /**
   * Es py http language tag.
   */
  ES_PY("es-PY"),

  /**
   * Es sv http language tag.
   */
  ES_SV("es-SV"),

  /**
   * Es us http language tag.
   */
  ES_US("es-US"),

  /**
   * Es uy http language tag.
   */
  ES_UY("es-UY"),

  /**
   * Es ve http language tag.
   */
  ES_VE("es-VE"),

  /**
   * Et http language tag.
   */
  ET("et"),

  /**
   * Et ee http language tag.
   */
  ET_EE("et-EE"),

  /**
   * Fi http language tag.
   */
  FI("fi"),

  /**
   * Fi fi http language tag.
   */
  FI_FI("fi-FI"),

  /**
   * Fr http language tag.
   */
  FR("fr"),

  /**
   * Fr be http language tag.
   */
  FR_BE("fr-BE"),

  /**
   * Fr ca http language tag.
   */
  FR_CA("fr-CA"),

  /**
   * Fr ch http language tag.
   */
  FR_CH("fr-CH"),

  /**
   * Fr fr http language tag.
   */
  FR_FR("fr-FR"),

  /**
   * Fr lu http language tag.
   */
  FR_LU("fr-LU"),

  /**
   * Ga http language tag.
   */
  GA("ga"),

  /**
   * Ga ie http language tag.
   */
  GA_IE("ga-IE"),

  /**
   * He http language tag.
   */
  HE("he"),

  /**
   * He il http language tag.
   */
  HE_IL("he-IL"),

  /**
   * Hi http language tag.
   */
  HI("hi"),

  /**
   * Hi in http language tag.
   */
  HI_IN("hi-IN"),

  /**
   * Hr http language tag.
   */
  HR("hr"),

  /**
   * Hr hr http language tag.
   */
  HR_HR("hr-HR"),

  /**
   * Hu http language tag.
   */
  HU("hu"),

  /**
   * Hu hu http language tag.
   */
  HU_HU("hu-HU"),

  /**
   * Id http language tag.
   */
  ID("id"),

  /**
   * Id id http language tag.
   */
  ID_ID("id-ID"),

  /**
   * Is http language tag.
   */
  IS("is"),

  /**
   * Is is http language tag.
   */
  IS_IS("is-IS"),

  /**
   * It http language tag.
   */
  IT("it"),

  /**
   * It ch http language tag.
   */
  IT_CH("it-CH"),

  /**
   * It it http language tag.
   */
  IT_IT("it-IT"),

  /**
   * Ja http language tag.
   */
  JA("ja"),

  /**
   * Ja jp http language tag.
   */
  JA_JP("ja-JP"),

  /**
   * Ko http language tag.
   */
  KO("ko"),

  /**
   * Ko kr http language tag.
   */
  KO_KR("ko-KR"),

  /**
   * Lt http language tag.
   */
  LT("lt"),

  /**
   * Lt lt http language tag.
   */
  LT_LT("lt-LT"),

  /**
   * Lv http language tag.
   */
  LV("lv"),

  /**
   * Lv lv http language tag.
   */
  LV_LV("lv-LV"),

  /**
   * Mk http language tag.
   */
  MK("mk"),

  /**
   * Mk mk http language tag.
   */
  MK_MK("mk-MK"),

  /**
   * Ms http language tag.
   */
  MS("ms"),

  /**
   * Ms my http language tag.
   */
  MS_MY("ms-MY"),

  /**
   * Mt http language tag.
   */
  MT("mt"),

  /**
   * Mt mt http language tag.
   */
  MT_MT("mt-MT"),

  /**
   * Nl http language tag.
   */
  NL("nl"),

  /**
   * Nl be http language tag.
   */
  NL_BE("nl-BE"),

  /**
   * Nl nl http language tag.
   */
  NL_NL("nl-NL"),

  /**
   * Nn no http language tag.
   */
  NN_NO("nn-NO"),

  /**
   * No http language tag.
   */
  NO("no"),

  /**
   * No no http language tag.
   */
  NO_NO("no-NO"),

  /**
   * Pl http language tag.
   */
  PL("pl"),

  /**
   * Pl pl http language tag.
   */
  PL_PL("pl-PL"),

  /**
   * Pt http language tag.
   */
  PT("pt"),

  /**
   * Pt br http language tag.
   */
  PT_BR("pt-BR"),

  /**
   * Pt pt http language tag.
   */
  PT_PT("pt-PT"),

  /**
   * Ro http language tag.
   */
  RO("ro"),

  /**
   * Ro ro http language tag.
   */
  RO_RO("ro-RO"),

  /**
   * Ru http language tag.
   */
  RU("ru"),

  /**
   * Ru ru http language tag.
   */
  RU_RU("ru-RU"),

  /**
   * Sk http language tag.
   */
  SK("sk"),

  /**
   * Sk sk http language tag.
   */
  SK_SK("sk-SK"),

  /**
   * Sl http language tag.
   */
  SL("sl"),

  /**
   * Sl si http language tag.
   */
  SL_SI("sl-SI"),

  /**
   * Sq http language tag.
   */
  SQ("sq"),

  /**
   * Sq al http language tag.
   */
  SQ_AL("sq-AL"),

  /**
   * Sr http language tag.
   */
  SR("sr"),

  /**
   * Sr ba http language tag.
   */
  SR_BA("sr-BA"),

  /**
   * Sr cs http language tag.
   */
  SR_CS("sr-CS"),

  /**
   * Sr me http language tag.
   */
  SR_ME("sr-ME"),

  /**
   * Sr rs http language tag.
   */
  SR_RS("sr-RS"),

  /**
   * Sv http language tag.
   */
  SV("sv"),

  /**
   * Sv se http language tag.
   */
  SV_SE("sv-SE"),

  /**
   * Th http language tag.
   */
  TH("th"),

  /**
   * Th th http language tag.
   */
  TH_TH("th-TH"),

  /**
   * Tr http language tag.
   */
  TR("tr"),

  /**
   * Tr tr http language tag.
   */
  TR_TR("tr-TR"),

  /**
   * Uk http language tag.
   */
  UK("uk"),

  /**
   * Uk ua http language tag.
   */
  UK_UA("uk-UA"),

  /**
   * Vi http language tag.
   */
  VI("vi"),

  /**
   * Vi vn http language tag.
   */
  VI_VN("vi-VN"),

  /**
   * Zh http language tag.
   */
  ZH("zh"),

  /**
   * Zh cn http language tag.
   */
  ZH_CN("zh-CN"),

  /**
   * Zh hk http language tag.
   */
  ZH_HK("zh-HK"),

  /**
   * Zh sg http language tag.
   */
  ZH_SG("zh-SG"),

  /**
   * Zh tw http language tag.
   */
  ZH_TW("zh-TW");

  private String value;

  HttpLanguageTag(String value) {
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
        .filter(locale -> value.equalsIgnoreCase(locale.toLanguageTag()))
        .findAny().orElse(null);
  }

  /**
   * From http language tag.
   *
   * @param text the text
   * @return the http language tag
   */
  @JsonCreator
  public static HttpLanguageTag fromValue(String text) {
    if (!StringUtils.hasText(text)) {
      return null;
    }
    final String source = text
        .substring(0, Math.min(text.length(), 5))
        .replace("_", "-");
    for (HttpLanguageTag b : HttpLanguageTag.values()) {
      if (String.valueOf(b.value).equalsIgnoreCase(source)) {
        return b;
      }
    }
    return null;
  }

  /**
   * From locale.
   *
   * @param locale the locale
   * @return the http language tag
   */
  public static HttpLanguageTag fromLocale(Locale locale) {
    if (locale == null) {
      return null;
    }
    HttpLanguageTag tag = fromValue(locale.toLanguageTag());
    if (tag != null) {
      return tag;
    }
    if (StringUtils.hasText(locale.getLanguage()) && StringUtils.hasText(locale.getCountry())) {
      tag = fromValue(locale.getLanguage() + "-" + locale.getCountry());
      if (tag != null) {
        return tag;
      }
    }
    return fromValue(locale.getLanguage());
  }
}

