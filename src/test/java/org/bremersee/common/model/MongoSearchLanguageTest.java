package org.bremersee.common.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Locale;
import org.junit.Test;

/**
 * The mongo search language test.
 *
 * @author Christian Bremer
 */
public class MongoSearchLanguageTest {

  /**
   * From value.
   */
  @Test
  public void fromValue() {
    for (MongoSearchLanguage language : MongoSearchLanguage.values()) {
      assertEquals(language, MongoSearchLanguage.fromValue(language.name()));
      assertEquals(language, MongoSearchLanguage.fromValue(language.toString()));
    }
  }

  /**
   * To locale.
   */
  @Test
  public void toLocale() {
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