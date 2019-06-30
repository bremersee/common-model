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
import java.util.Collection;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * The bounding box of a geometry, feature or feature collection.
 */
@ApiModel(description = "The bounding box of a geometry, feature or feature collection.")
@Validated
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@SuppressWarnings("unused")
public class BoundingBox extends ArrayList<BigDecimal> implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new bounding box.
   *
   * @param coordinates the coordinates
   */
  public BoundingBox(Collection<? extends BigDecimal> coordinates) {
    super(coordinates);
  }

}

