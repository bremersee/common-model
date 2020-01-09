package org.bremersee.common.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * The address test.
 *
 * @author Christian Bremer
 */
class AddressTest {

  /**
   * Gets street number.
   */
  @Test
  void getStreetNumber() {
    Address model = new Address();
    model.setStreetNumber("value");
    assertEquals("value", model.getStreetNumber());

    model = Address.builder().streetNumber("value").build();
    assertEquals("value", model.getStreetNumber());

    assertNotEquals(model, null);
    assertNotEquals(model, new Object());
    assertEquals(model, model);
    assertEquals(model, model.toBuilder().streetNumber("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets street.
   */
  @Test
  void getStreet() {
    Address model = new Address();
    model.setStreet("value");
    assertEquals("value", model.getStreet());

    model = Address.builder().street("value").build();
    assertEquals("value", model.getStreet());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().street("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets postal code.
   */
  @Test
  void getPostalCode() {
    Address model = new Address();
    model.setPostalCode("value");
    assertEquals("value", model.getPostalCode());

    model = Address.builder().postalCode("value").build();
    assertEquals("value", model.getPostalCode());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().postalCode("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets city.
   */
  @Test
  void getCity() {
    Address model = new Address();
    model.setCity("value");
    assertEquals("value", model.getCity());

    model = Address.builder().city("value").build();
    assertEquals("value", model.getCity());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().city("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets suburb.
   */
  @Test
  void getSuburb() {
    Address model = new Address();
    model.setSuburb("value");
    assertEquals("value", model.getSuburb());

    model = Address.builder().suburb("value").build();
    assertEquals("value", model.getSuburb());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().suburb("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets state.
   */
  @Test
  void getState() {
    Address model = new Address();
    model.setState("value");
    assertEquals("value", model.getState());

    model = Address.builder().state("value").build();
    assertEquals("value", model.getState());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().state("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets country.
   */
  @Test
  void getCountry() {
    Address model = new Address();
    model.setCountry("value");
    assertEquals("value", model.getCountry());

    model = Address.builder().country("value").build();
    assertEquals("value", model.getCountry());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().country("value").build());

    assertTrue(model.toString().contains("value"));
  }

  /**
   * Gets country code.
   */
  @Test
  void getCountryCode() {
    TwoLetterCountryCode code = TwoLetterCountryCode.DE;
    Address model = new Address();
    model.setCountryCode(code);
    assertEquals(code, model.getCountryCode());

    model = Address.builder().countryCode(code).build();
    assertEquals(code, model.getCountryCode());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().countryCode(code).build());

    assertTrue(model.toString().contains(code.toString()));
  }

  /**
   * Gets formatted address.
   */
  @Test
  void getFormattedAddress() {
    Address model = new Address();
    model.setFormattedAddress("value");
    assertEquals("value", model.getFormattedAddress());

    model = Address.builder().formattedAddress("value").build();
    assertEquals("value", model.getFormattedAddress());

    assertEquals(model, model);
    assertEquals(model, model.toBuilder().formattedAddress("value").build());

    assertTrue(model.toString().contains("value"));
  }
}