package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Locale;
import org.junit.jupiter.api.Test;

/**
 * The mongo search language test.
 *
 * @author Christian Bremer
 */
class MongoSearchLanguageTest {

  /**
   * From value.
   */
  @Test
  void fromValue() {
    for (MongoSearchLanguage language : MongoSearchLanguage.values()) {
      assertEquals(language, MongoSearchLanguage.fromValue(language.name()));
      assertEquals(language, MongoSearchLanguage.fromValue(language.toString()));
    }
  }

  /**
   * To locale.
   */
  @Test
  void toLocale() {
    for (MongoSearchLanguage language : MongoSearchLanguage.values()) {
      Locale locale = language.toLocale();
      if (MongoSearchLanguage.NONE == language) {
        assertNull(locale);
      } else {
        assertNotNull(locale);
        assertEquals(language.name().toLowerCase(), locale.getLanguage());
        assertNotNull(TwoLetterLanguageCode.fromValue(locale.getLanguage()));
      }
    }
  }
}