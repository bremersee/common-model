/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.geojson.model;

import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;

/**
 * The first two elements are longitude and latitude.
 */
@ApiModel(description = "The first two elements are longitude and latitude.")
@Validated
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@SuppressWarnings({"WeakerAccess", "unused"})
public class Position extends ArrayList<BigDecimal> implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new position.
   *
   * @param x the x
   * @param y the y
   */
  public Position(BigDecimal x, BigDecimal y) {
    Assert.notNull(x, "X must not be null.");
    Assert.notNull(y, "Y must not be null.");
    add(x);
    add(y);
  }

  /**
   * Instantiates a new position.
   *
   * @param x the x
   * @param y the y
   * @param z the z
   */
  public Position(BigDecimal x, BigDecimal y, BigDecimal z) {
    this(x, y);
    Assert.notNull(z, "Z must not be null.");
    add(z);
  }

}

