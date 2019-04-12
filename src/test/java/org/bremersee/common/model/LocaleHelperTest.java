package org.bremersee.common.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;

/**
 * The locale helper test.
 *
 * @author Christian Bremer
 */
public class LocaleHelperTest {

  /**
   * Gets supported locales.
   */
  @Test
  public void getSupportedLocales() {
    Locale[] expected = Arrays.stream(JavaLocale.values())
        .map(JavaLocale::toLocale)
        .toArray(Locale[]::new);
    Locale[] actual = LocaleHelper.getSupportedLocales();
    Assert.assertArrayEquals(expected, actual);

    expected = new Locale[]{Locale.GERMANY};
    actual = LocaleHelper.getSupportedLocales(Locale.GERMANY);
    Assert.assertArrayEquals(expected, actual);
  }

  /**
   * Build http language descriptions.
   */
  @Test
  public void buildHttpLanguageDescriptions() {
    HttpLanguageTagDescriptions expected = new HttpLanguageTagDescriptions(
        Collections.singletonList(
            LocaleHelper.buildHttpLanguageDescription(Locale.JAPANESE, Locale.GERMAN))
    );
    HttpLanguageTagDescriptions actual = LocaleHelper.buildHttpLanguageDescriptions(
        Locale.JAPANESE, Locale.GERMAN);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * Build http language description.
   */
  @Test
  public void buildHttpLanguageDescription() {
    HttpLanguageTagDescription expected = HttpLanguageTagDescription
        .builder()
        .tag(HttpLanguageTag.IT_IT)
        .description(Locale.ITALY.getDisplayLanguage(Locale.GERMAN)
            + " (" + Locale.ITALY.getDisplayCountry(Locale.GERMAN) + ")")
        .build();
    HttpLanguageTagDescription actual = LocaleHelper.buildHttpLanguageDescription(
        Locale.GERMAN, Locale.ITALY);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * Build java locale descriptions.
   */
  @Test
  public void buildJavaLocaleDescriptions() {
    JavaLocaleDescriptions expected = new JavaLocaleDescriptions(
        Collections.singletonList(
            LocaleHelper.buildJavaLocaleDescription(Locale.JAPANESE, Locale.GERMAN))
    );
    JavaLocaleDescriptions actual = LocaleHelper.buildJavaLocaleDescriptions(
        Locale.JAPANESE, Locale.GERMAN);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * Build java locale description.
   */
  @Test
  public void buildJavaLocaleDescription() {
    JavaLocaleDescription expected = JavaLocaleDescription
        .builder()
        .locale(JavaLocale.IT_IT)
        .description(Locale.ITALY.getDisplayLanguage(Locale.GERMAN)
            + " (" + Locale.ITALY.getDisplayCountry(Locale.GERMAN) + ")")
        .build();
    JavaLocaleDescription actual = LocaleHelper.buildJavaLocaleDescription(
        Locale.GERMAN, Locale.ITALY);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * To java locale.
   */
  @Test
  public void toJavaLocale() {
    JavaLocale expected = JavaLocale.FR_CA;
    JavaLocale actual = JavaLocale.fromLocale(Locale.CANADA_FRENCH);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * To http language tag.
   */
  @Test
  public void toHttpLanguageTag() {
    HttpLanguageTag expected = HttpLanguageTag.EN_GB;
    HttpLanguageTag actual = HttpLanguageTag.fromLocale(new Locale("en", "GB"));
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * To two letter country code.
   */
  @Test
  public void toTwoLetterCountryCode() {
    TwoLetterCountryCode expected = TwoLetterCountryCode.ZA;
    TwoLetterCountryCode actual = TwoLetterCountryCode.fromLocale(new Locale("", "ZA"));
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * To three letter country code.
   */
  @Test
  public void toThreeLetterCountryCode() {
    ThreeLetterCountryCode expected = ThreeLetterCountryCode.ZAF;
    ThreeLetterCountryCode actual = ThreeLetterCountryCode.fromLocale(new Locale("", "ZA"));
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * To two letter language code.
   */
  @Test
  public void toTwoLetterLanguageCode() {
    TwoLetterLanguageCode expected = TwoLetterLanguageCode.ZH;
    TwoLetterLanguageCode actual = TwoLetterLanguageCode.fromLocale(new Locale("zh"));
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * To three letter language code.
   */
  @Test
  public void toThreeLetterLanguageCode() {
    ThreeLetterLanguageCode expected = ThreeLetterLanguageCode.ZHO;
    ThreeLetterLanguageCode actual = ThreeLetterLanguageCode.fromLocale(new Locale("zh"));
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * To locale.
   */
  @Test
  public void toLocale() {
    Locale expected = Locale.FRANCE;
    Locale actual = JavaLocale.FR_FR.toLocale();
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);

    actual = HttpLanguageTag.FR_FR.toLocale();
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);

    expected = new Locale("", "TW");
    actual = TwoLetterCountryCode.TW.toLocale();
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);

    actual = ThreeLetterCountryCode.TWN.toLocale();
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);

    expected = new Locale("zh");
    actual = TwoLetterLanguageCode.ZH.toLocale();
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

}
