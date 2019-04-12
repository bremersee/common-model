/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.common.model;

import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * A list of ISO 3166-1 ALPHA-2 country codes.
 */
@ApiModel(description = "A list of ISO 3166-1 ALPHA-2 country codes.")
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@SuppressWarnings("unused")
public class TwoLetterCountryCodes extends ArrayList<TwoLetterCountryCode> implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new list of two letter country codes.
   *
   * @param countryCodes the country codes
   */
  public TwoLetterCountryCodes(Collection<? extends TwoLetterCountryCode> countryCodes) {
    super(countryCodes);
  }
}
