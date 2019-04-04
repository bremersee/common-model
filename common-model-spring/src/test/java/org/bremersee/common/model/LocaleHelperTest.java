package org.bremersee.common.model;

import java.util.Arrays;
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
        .map(LocaleHelper::toLocale)
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
    HttpLanguageTagDescriptions expected = new HttpLanguageTagDescriptions()
        .addEntriesItem(LocaleHelper.buildHttpLanguageDescription(Locale.JAPANESE, Locale.GERMAN));
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
    HttpLanguageTagDescription expected = new HttpLanguageTagDescription()
        .tag(HttpLanguageTag.IT_IT)
        .description(Locale.ITALY.getDisplayLanguage(Locale.GERMAN)
            + " (" + Locale.ITALY.getDisplayCountry(Locale.GERMAN) + ")");
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
    JavaLocaleDescriptions expected = new JavaLocaleDescriptions()
        .addEntriesItem(LocaleHelper.buildJavaLocaleDescription(Locale.JAPANESE, Locale.GERMAN));
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
    JavaLocaleDescription expected = new JavaLocaleDescription()
        .locale(JavaLocale.IT_IT)
        .description(Locale.ITALY.getDisplayLanguage(Locale.GERMAN)
            + " (" + Locale.ITALY.getDisplayCountry(Locale.GERMAN) + ")");
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
    JavaLocale actual = LocaleHelper.toJavaLocale(Locale.CANADA_FRENCH);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * To http language tag.
   */
  @Test
  public void toHttpLanguageTag() {
    HttpLanguageTag expected = HttpLanguageTag.EN_GB;
    HttpLanguageTag actual = LocaleHelper.toHttpLanguageTag(new Locale("en", "GB"));
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void toTwoLetterCountryCode() {
    TwoLetterCountryCode expected = TwoLetterCountryCode.ZA;
    TwoLetterCountryCode actual = LocaleHelper.toTwoLetterCountryCode(new Locale("", "ZA"));
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void toThreeLetterCountryCode() {
    ThreeLetterCountryCode expected = ThreeLetterCountryCode.ZAF;
    ThreeLetterCountryCode actual = LocaleHelper.toThreeLetterCountryCode(new Locale("", "ZA"));
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void toTwoLetterLanguageCode() {
    TwoLetterLanguageCode expected = TwoLetterLanguageCode.ZH;
    TwoLetterLanguageCode actual = LocaleHelper.toTwoLetterLanguageCode(new Locale("zh"));
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void toThreeLetterLanguageCode() {
    ThreeLetterLanguageCode expected = ThreeLetterLanguageCode.ZHO;
    ThreeLetterLanguageCode actual = LocaleHelper.toThreeLetterLanguageCode(new Locale("zh"));
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);
  }

  /**
   * To locale.
   */
  @Test
  public void toLocale() {
    Locale expected = Locale.FRANCE;
    Locale actual = LocaleHelper.toLocale(JavaLocale.FR_FR);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);

    actual = LocaleHelper.toLocale(HttpLanguageTag.FR_FR);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);

    expected = new Locale("", "TW");
    actual = LocaleHelper.toLocale(TwoLetterCountryCode.TW);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);

    actual = LocaleHelper.toLocale(ThreeLetterCountryCode.TWN);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);

    expected = new Locale("zh");
    actual = LocaleHelper.toLocale(TwoLetterLanguageCode.ZH);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);

    actual = LocaleHelper.toLocale(ThreeLetterLanguageCode.ZHO);
    Assert.assertNotNull(actual);
    Assert.assertEquals(expected, actual);

  }

}
