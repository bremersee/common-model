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
import java.util.stream.Collectors;
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
        .map(JavaLocale::toLocale)
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
    return new HttpLanguageTagDescriptions(
        Arrays
            .stream(locales)
            .map(locale -> buildHttpLanguageDescription(inLocale, locale))
            .collect(Collectors.toList()));
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
    return HttpLanguageTagDescription.builder()
        .description(buildDescription(inLocale, fromLocale))
        .tag(HttpLanguageTag.fromLocale(fromLocale))
        .build();
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

    final Locale[] locales = fromLocales == null || fromLocales.length == 0
        ? getSupportedLocales()
        : fromLocales;
    return new JavaLocaleDescriptions(
        Arrays
            .stream(locales)
            .map(locale -> buildJavaLocaleDescription(inLocale, locale))
            .collect(Collectors.toList()));
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
    return JavaLocaleDescription.builder()
        .description(buildDescription(inLocale, fromLocale))
        .locale(JavaLocale.fromLocale(fromLocale))
        .build();
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

}
