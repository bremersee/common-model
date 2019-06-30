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
 * Java locale string representation.
 */
public enum JavaLocale {

  /**
   * Ar java locale.
   */
  AR("ar"),

  /**
   * Ar ae java locale.
   */
  AR_AE("ar_AE"),

  /**
   * Ar bh java locale.
   */
  AR_BH("ar_BH"),

  /**
   * Ar dz java locale.
   */
  AR_DZ("ar_DZ"),

  /**
   * Ar eg java locale.
   */
  AR_EG("ar_EG"),

  /**
   * Ar iq java locale.
   */
  AR_IQ("ar_IQ"),

  /**
   * Ar jo java locale.
   */
  AR_JO("ar_JO"),

  /**
   * Ar kw java locale.
   */
  AR_KW("ar_KW"),

  /**
   * Ar lb java locale.
   */
  AR_LB("ar_LB"),

  /**
   * Ar ly java locale.
   */
  AR_LY("ar_LY"),

  /**
   * Ar ma java locale.
   */
  AR_MA("ar_MA"),

  /**
   * Ar om java locale.
   */
  AR_OM("ar_OM"),

  /**
   * Ar qa java locale.
   */
  AR_QA("ar_QA"),

  /**
   * Ar sa java locale.
   */
  AR_SA("ar_SA"),

  /**
   * Ar sd java locale.
   */
  AR_SD("ar_SD"),

  /**
   * Ar sy java locale.
   */
  AR_SY("ar_SY"),

  /**
   * Ar tn java locale.
   */
  AR_TN("ar_TN"),

  /**
   * Ar ye java locale.
   */
  AR_YE("ar_YE"),

  /**
   * Be java locale.
   */
  BE("be"),

  /**
   * Be by java locale.
   */
  BE_BY("be_BY"),

  /**
   * Bg java locale.
   */
  BG("bg"),

  /**
   * Bg bg java locale.
   */
  BG_BG("bg_BG"),

  /**
   * Ca java locale.
   */
  CA("ca"),

  /**
   * Ca es java locale.
   */
  CA_ES("ca_ES"),

  /**
   * Cs java locale.
   */
  CS("cs"),

  /**
   * Cs cz java locale.
   */
  CS_CZ("cs_CZ"),

  /**
   * Da java locale.
   */
  DA("da"),

  /**
   * Da dk java locale.
   */
  DA_DK("da_DK"),

  /**
   * De java locale.
   */
  DE("de"),

  /**
   * De at java locale.
   */
  DE_AT("de_AT"),

  /**
   * De ch java locale.
   */
  DE_CH("de_CH"),

  /**
   * De de java locale.
   */
  DE_DE("de_DE"),

  /**
   * De gr java locale.
   */
  DE_GR("de_GR"),

  /**
   * De lu java locale.
   */
  DE_LU("de_LU"),

  /**
   * El java locale.
   */
  EL("el"),

  /**
   * El cy java locale.
   */
  EL_CY("el_CY"),

  /**
   * El gr java locale.
   */
  EL_GR("el_GR"),

  /**
   * En java locale.
   */
  EN("en"),

  /**
   * En au java locale.
   */
  EN_AU("en_AU"),

  /**
   * En ca java locale.
   */
  EN_CA("en_CA"),

  /**
   * En gb java locale.
   */
  EN_GB("en_GB"),

  /**
   * En ie java locale.
   */
  EN_IE("en_IE"),

  /**
   * En in java locale.
   */
  EN_IN("en_IN"),

  /**
   * En mt java locale.
   */
  EN_MT("en_MT"),

  /**
   * En nz java locale.
   */
  EN_NZ("en_NZ"),

  /**
   * En ph java locale.
   */
  EN_PH("en_PH"),

  /**
   * En sg java locale.
   */
  EN_SG("en_SG"),

  /**
   * En us java locale.
   */
  EN_US("en_US"),

  /**
   * En za java locale.
   */
  EN_ZA("en_ZA"),

  /**
   * Es java locale.
   */
  ES("es"),

  /**
   * Es ar java locale.
   */
  ES_AR("es_AR"),

  /**
   * Es bo java locale.
   */
  ES_BO("es_BO"),

  /**
   * Es cl java locale.
   */
  ES_CL("es_CL"),

  /**
   * Es co java locale.
   */
  ES_CO("es_CO"),

  /**
   * Es cr java locale.
   */
  ES_CR("es_CR"),

  /**
   * Es cu java locale.
   */
  ES_CU("es_CU"),

  /**
   * Es do java locale.
   */
  ES_DO("es_DO"),

  /**
   * Es ec java locale.
   */
  ES_EC("es_EC"),

  /**
   * Es es java locale.
   */
  ES_ES("es_ES"),

  /**
   * Es gt java locale.
   */
  ES_GT("es_GT"),

  /**
   * Es hn java locale.
   */
  ES_HN("es_HN"),

  /**
   * Es mx java locale.
   */
  ES_MX("es_MX"),

  /**
   * Es ni java locale.
   */
  ES_NI("es_NI"),

  /**
   * Es pa java locale.
   */
  ES_PA("es_PA"),

  /**
   * Es pe java locale.
   */
  ES_PE("es_PE"),

  /**
   * Es pr java locale.
   */
  ES_PR("es_PR"),

  /**
   * Es py java locale.
   */
  ES_PY("es_PY"),

  /**
   * Es sv java locale.
   */
  ES_SV("es_SV"),

  /**
   * Es us java locale.
   */
  ES_US("es_US"),

  /**
   * Es uy java locale.
   */
  ES_UY("es_UY"),

  /**
   * Es ve java locale.
   */
  ES_VE("es_VE"),

  /**
   * Et java locale.
   */
  ET("et"),

  /**
   * Et ee java locale.
   */
  ET_EE("et_EE"),

  /**
   * Fi java locale.
   */
  FI("fi"),

  /**
   * Fi fi java locale.
   */
  FI_FI("fi_FI"),

  /**
   * Fr java locale.
   */
  FR("fr"),

  /**
   * Fr be java locale.
   */
  FR_BE("fr_BE"),

  /**
   * Fr ca java locale.
   */
  FR_CA("fr_CA"),

  /**
   * Fr ch java locale.
   */
  FR_CH("fr_CH"),

  /**
   * Fr fr java locale.
   */
  FR_FR("fr_FR"),

  /**
   * Fr lu java locale.
   */
  FR_LU("fr_LU"),

  /**
   * Ga java locale.
   */
  GA("ga"),

  /**
   * Ga ie java locale.
   */
  GA_IE("ga_IE"),

  /**
   * Hi java locale.
   */
  HI("hi"),

  /**
   * Hi in java locale.
   */
  HI_IN("hi_IN"),

  /**
   * Hr java locale.
   */
  HR("hr"),

  /**
   * Hr hr java locale.
   */
  HR_HR("hr_HR"),

  /**
   * Hu java locale.
   */
  HU("hu"),

  /**
   * Hu hu java locale.
   */
  HU_HU("hu_HU"),

  /**
   * In java locale.
   */
  IN("in"),

  /**
   * In id java locale.
   */
  IN_ID("in_ID"),

  /**
   * Is java locale.
   */
  IS("is"),

  /**
   * Is is java locale.
   */
  IS_IS("is_IS"),

  /**
   * It java locale.
   */
  IT("it"),

  /**
   * It ch java locale.
   */
  IT_CH("it_CH"),

  /**
   * It it java locale.
   */
  IT_IT("it_IT"),

  /**
   * Iw java locale.
   */
  IW("iw"),

  /**
   * Iw il java locale.
   */
  IW_IL("iw_IL"),

  /**
   * Ja java locale.
   */
  JA("ja"),

  /**
   * Ja jp java locale.
   */
  JA_JP("ja_JP"),

  /**
   * Ko java locale.
   */
  KO("ko"),

  /**
   * Ko kr java locale.
   */
  KO_KR("ko_KR"),

  /**
   * Lt java locale.
   */
  LT("lt"),

  /**
   * Lt lt java locale.
   */
  LT_LT("lt_LT"),

  /**
   * Lv java locale.
   */
  LV("lv"),

  /**
   * Lv lv java locale.
   */
  LV_LV("lv_LV"),

  /**
   * Mk java locale.
   */
  MK("mk"),

  /**
   * Mk mk java locale.
   */
  MK_MK("mk_MK"),

  /**
   * Ms java locale.
   */
  MS("ms"),

  /**
   * Ms my java locale.
   */
  MS_MY("ms_MY"),

  /**
   * Mt java locale.
   */
  MT("mt"),

  /**
   * Mt mt java locale.
   */
  MT_MT("mt_MT"),

  /**
   * Nl java locale.
   */
  NL("nl"),

  /**
   * Nl be java locale.
   */
  NL_BE("nl_BE"),

  /**
   * Nl nl java locale.
   */
  NL_NL("nl_NL"),

  /**
   * No java locale.
   */
  NO("no"),

  /**
   * No no java locale.
   */
  NO_NO("no_NO"),

  /**
   * Pl java locale.
   */
  PL("pl"),

  /**
   * Pl pl java locale.
   */
  PL_PL("pl_PL"),

  /**
   * Pt java locale.
   */
  PT("pt"),

  /**
   * Pt br java locale.
   */
  PT_BR("pt_BR"),

  /**
   * Pt pt java locale.
   */
  PT_PT("pt_PT"),

  /**
   * Ro java locale.
   */
  RO("ro"),

  /**
   * Ro ro java locale.
   */
  RO_RO("ro_RO"),

  /**
   * Ru java locale.
   */
  RU("ru"),

  /**
   * Ru ru java locale.
   */
  RU_RU("ru_RU"),

  /**
   * Sk java locale.
   */
  SK("sk"),

  /**
   * Sk sk java locale.
   */
  SK_SK("sk_SK"),

  /**
   * Sl java locale.
   */
  SL("sl"),

  /**
   * Sl si java locale.
   */
  SL_SI("sl_SI"),

  /**
   * Sq java locale.
   */
  SQ("sq"),

  /**
   * Sq al java locale.
   */
  SQ_AL("sq_AL"),

  /**
   * Sr java locale.
   */
  SR("sr"),

  /**
   * Sr ba java locale.
   */
  SR_BA("sr_BA"),

  /**
   * Sr cs java locale.
   */
  SR_CS("sr_CS"),

  /**
   * Sr me java locale.
   */
  SR_ME("sr_ME"),

  /**
   * Sr rs java locale.
   */
  SR_RS("sr_RS"),

  /**
   * Sv java locale.
   */
  SV("sv"),

  /**
   * Sv se java locale.
   */
  SV_SE("sv_SE"),

  /**
   * Th java locale.
   */
  TH("th"),

  /**
   * Th th java locale.
   */
  TH_TH("th_TH"),

  /**
   * Tr java locale.
   */
  TR("tr"),

  /**
   * Tr tr java locale.
   */
  TR_TR("tr_TR"),

  /**
   * Uk java locale.
   */
  UK("uk"),

  /**
   * Uk ua java locale.
   */
  UK_UA("uk_UA"),

  /**
   * Vi java locale.
   */
  VI("vi"),

  /**
   * Vi vn java locale.
   */
  VI_VN("vi_VN"),

  /**
   * Zh java locale.
   */
  ZH("zh"),

  /**
   * Zh cn java locale.
   */
  ZH_CN("zh_CN"),

  /**
   * Zh hk java locale.
   */
  ZH_HK("zh_HK"),

  /**
   * Zh sg java locale.
   */
  ZH_SG("zh_SG"),

  /**
   * Zh tw java locale.
   */
  ZH_TW("zh_TW");

  private String value;

  JavaLocale(String value) {
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
    String[] parts = value.split(Pattern.quote("_"));
    if (parts.length >= 2) {
      return new Locale(parts[0], parts[1]);
    }
    return new Locale(parts[0]);
  }

  /**
   * From java locale.
   *
   * @param text the text
   * @return the java locale
   */
  @JsonCreator
  public static JavaLocale fromValue(String text) {
    for (JavaLocale b : JavaLocale.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  /**
   * From locale.
   *
   * @param locale the locale
   * @return the java locale
   */
  public static JavaLocale fromLocale(Locale locale) {
    if (locale == null || !StringUtils.hasText(locale.toString())) {
      return null;
    }
    if (locale.toString().length() > 5) {
      return fromValue(locale.toString().substring(0, 5));
    }
    return fromValue(locale.toString());
  }

}

