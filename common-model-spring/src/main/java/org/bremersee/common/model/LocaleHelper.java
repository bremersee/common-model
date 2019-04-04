/*
 * Copyright 2019 the original author or authors.
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

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import org.springframework.util.StringUtils;

/**
 * The locale helper.
 *
 * @author Christian Bremer
 */
@SuppressWarnings("WeakerAccess")
public abstract class LocaleHelper {

  private LocaleHelper() {
  }

  /**
   * Get all supported locales or a subset from the given locales.
   *
   * @param fromLocales the from locales
   * @return the locales
   */
  public static Locale[] getSupportedLocales(final Locale... fromLocales) {
    final Set<Locale> givenLocales;
    if (fromLocales == null) {
      givenLocales = Collections.emptySet();
    } else {
      givenLocales = new HashSet<>(Arrays.asList(fromLocales));
    }
    return Arrays.stream(JavaLocale.values())
        .map(LocaleHelper::toLocale)
        .filter(locale -> fromLocales == null || fromLocales.length == 0
            || givenLocales.contains(locale))
        .toArray(Locale[]::new);
  }

  /**
   * Build http language descriptions from the given locales or from all if there are no given
   * locales.
   *
   * @param inLocale    the locale for which to retrieve the descriptions
   * @param fromLocales the from locales
   * @return the http language tag descriptions
   */
  public static HttpLanguageTagDescriptions buildHttpLanguageDescriptions(
      final Locale inLocale,
      final Locale... fromLocales) {

    final Locale[] locales = fromLocales == null || fromLocales.length == 0
        ? getSupportedLocales()
        : fromLocales;
    final HttpLanguageTagDescriptions descriptions = new HttpLanguageTagDescriptions();
    for (final Locale locale : locales) {
      descriptions.addEntriesItem(buildHttpLanguageDescription(inLocale, locale));
    }
    return descriptions;
  }

  /**
   * Build http language description from the given locale.
   *
   * @param inLocale   the locale for which to retrieve the description
   * @param fromLocale the from locale
   * @return the http language tag description
   */
  public static HttpLanguageTagDescription buildHttpLanguageDescription(
      final Locale inLocale,
      final Locale fromLocale) {

    if (fromLocale == null) {
      return null;
    }
    return new HttpLanguageTagDescription()
        .description(buildDescription(inLocale, fromLocale))
        .tag(toHttpLanguageTag(fromLocale));
  }

  /**
   * Build java locale descriptions from the given locales or from all if there are no given
   * locales.
   *
   * @param inLocale    the locale for which to retrieve the descriptions
   * @param fromLocales the from locales
   * @return the java locale descriptions
   */
  public static JavaLocaleDescriptions buildJavaLocaleDescriptions(
      final Locale inLocale,
      final Locale... fromLocales) {

    final JavaLocaleDescriptions descriptions = new JavaLocaleDescriptions();
    final Locale[] locales = fromLocales == null || fromLocales.length == 0
        ? getSupportedLocales()
        : fromLocales;
    for (final Locale locale : locales) {
      descriptions.addEntriesItem(buildJavaLocaleDescription(inLocale, locale));
    }
    return descriptions;
  }

  /**
   * Build java locale description from the given locale.
   *
   * @param inLocale   the locale for which to retrieve the description
   * @param fromLocale the from locale
   * @return the java locale description
   */
  public static JavaLocaleDescription buildJavaLocaleDescription(
      final Locale inLocale,
      final Locale fromLocale) {

    if (fromLocale == null) {
      return null;
    }
    return new JavaLocaleDescription()
        .description(buildDescription(inLocale, fromLocale))
        .locale(toJavaLocale(fromLocale));
  }

  private static String buildDescription(final Locale inLocale, final Locale fromLocale) {
    final Locale inLoc = inLocale != null ? inLocale : Locale.US;
    final StringBuilder descriptionBuilder = new StringBuilder();
    descriptionBuilder.append(fromLocale.getDisplayLanguage(inLoc));
    if (StringUtils.hasText(fromLocale.getCountry())) {
      descriptionBuilder.append(" (").append(fromLocale.getDisplayCountry(inLoc)).append(")");
    }
    return descriptionBuilder.toString();
  }

  /**
   * Convert locale.
   *
   * @param javaLocale the java locale
   * @return the locale
   */
  public static Locale toLocale(final JavaLocale javaLocale) {
    if (javaLocale == null) {
      return null;
    }
    return toLocale(javaLocale.toString(), Pattern.quote("_"));
  }

  /**
   * Convert locale.
   *
   * @param locale the locale
   * @return the java locale
   */
  public static JavaLocale toJavaLocale(final Locale locale) {
    if (locale == null) {
      return null;
    }
    return JavaLocale.fromValue(locale.toString());
  }

  /**
   * Convert locale.
   *
   * @param languageTag the language tag
   * @return the locale
   */
  public static Locale toLocale(final HttpLanguageTag languageTag) {
    if (languageTag == null) {
      return null;
    }
    return toLocale(languageTag.toString(), Pattern.quote("-"));
  }

  /**
   * Convert locale.
   *
   * @param locale the locale
   * @return the http language tag
   */
  public static HttpLanguageTag toHttpLanguageTag(final Locale locale) {
    if (locale == null) {
      return null;
    }
    return HttpLanguageTag.fromValue(locale.toString().replace("_", "-"));
  }

  private static Locale toLocale(final String value, final String splitRegex) {
    if (value == null) {
      return null;
    }
    final String[] parts = value.split(splitRegex);
    if (parts.length >= 3) {
      return new Locale(parts[0], parts[1], parts[2]);
    } else if (parts.length == 2) {
      return new Locale(parts[0], parts[1]);
    } else {
      return new Locale(parts[0]);
    }
  }

}
