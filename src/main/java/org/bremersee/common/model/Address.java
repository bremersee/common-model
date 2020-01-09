/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Address data.
 */
@ApiModel(description = "Address data.")
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public class Address implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("streetNumber")
  private String streetNumber;

  @JsonProperty("street")
  private String street;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("city")
  private String city;

  @JsonProperty("suburb")
  private String suburb;

  @JsonProperty("state")
  private String state;

  @JsonProperty("country")
  private String country;

  @JsonProperty("countryCode")
  private TwoLetterCountryCode countryCode;

  @JsonProperty("formattedAddress")
  private String formattedAddress;

  /**
   * Instantiates a new address.
   *
   * @param streetNumber     the street number
   * @param street           the street
   * @param postalCode       the postal code
   * @param city             the city
   * @param suburb           the suburb
   * @param state            the state
   * @param country          the country
   * @param countryCode      the country code
   * @param formattedAddress the formatted address
   */
  @Builder(toBuilder = true)
  public Address(String streetNumber, String street, String postalCode, String city,
      String suburb, String state, String country,
      TwoLetterCountryCode countryCode, String formattedAddress) {
    this.streetNumber = streetNumber;
    this.street = street;
    this.postalCode = postalCode;
    this.city = city;
    this.suburb = suburb;
    this.state = state;
    this.country = country;
    this.countryCode = countryCode;
    this.formattedAddress = formattedAddress;
  }

  /**
   * The street number.
   *
   * @return streetNumber street number
   */
  @ApiModelProperty(value = "The street number.")
  public String getStreetNumber() {
    return streetNumber;
  }

  /**
   * Sets street number.
   *
   * @param streetNumber the street number
   */
  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  /**
   * The street name.
   *
   * @return street street
   */
  @ApiModelProperty(value = "The street name.")
  public String getStreet() {
    return street;
  }

  /**
   * Sets street.
   *
   * @param street the street
   */
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * The postal code.
   *
   * @return postalCode postal code
   */
  @ApiModelProperty(value = "The postal code.")
  public String getPostalCode() {
    return postalCode;
  }

  /**
   * Sets postal code.
   *
   * @param postalCode the postal code
   */
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * The city name.
   *
   * @return city city
   */
  @ApiModelProperty(value = "The city name.")
  public String getCity() {
    return city;
  }

  /**
   * Sets city.
   *
   * @param city the city
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The suburb name.
   *
   * @return suburb suburb
   */
  @ApiModelProperty(value = "The suburb name.")
  public String getSuburb() {
    return suburb;
  }

  /**
   * Sets suburb.
   *
   * @param suburb the suburb
   */
  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  /**
   * The state name.
   *
   * @return state state
   */
  @ApiModelProperty(value = "The state name.")
  public String getState() {
    return state;
  }

  /**
   * Sets state.
   *
   * @param state the state
   */
  public void setState(String state) {
    this.state = state;
  }

  /**
   * The country name.
   *
   * @return country country
   */
  @ApiModelProperty(value = "The country name.")
  public String getCountry() {
    return country;
  }

  /**
   * Sets country.
   *
   * @param country the country
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The country code.
   *
   * @return countryCode country code
   */
  @ApiModelProperty(value = "The country code.")
  public TwoLetterCountryCode getCountryCode() {
    return countryCode;
  }

  /**
   * Sets country code.
   *
   * @param countryCode the country code
   */
  public void setCountryCode(TwoLetterCountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The street number.
   *
   * @return formattedAddress formatted address
   */
  @ApiModelProperty(value = "The street number.")
  public String getFormattedAddress() {
    return formattedAddress;
  }

  /**
   * Sets formatted address.
   *
   * @param formattedAddress the formatted address
   */
  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

}

