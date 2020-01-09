/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.geojson.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * GeoJSON MultiPoint.
 */
@ApiModel(description = "GeoJSON MultiPoint.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuppressWarnings("unused")
public class MultiPoint extends Geometry implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("coordinates")
  private List<Position> coordinates = null;

  /**
   * Instantiates a new multi point.
   */
  public MultiPoint() {
    setType(TypeEnum.MULTIPOINT);
  }

  /**
   * Instantiates a new multi point.
   *
   * @param bbox        the bbox
   * @param coordinates the coordinates
   */
  @Builder(toBuilder = true)
  public MultiPoint(BoundingBox bbox, List<Position> coordinates) {
    super(bbox);
    setType(TypeEnum.MULTIPOINT);
    this.coordinates = coordinates;
  }

  /**
   * Get coordinates.
   *
   * @return coordinates coordinates
   */
  @ApiModelProperty(value = "The coordinates.")
  public List<Position> getCoordinates() {
    return coordinates;
  }

  /**
   * Sets coordinates.
   *
   * @param coordinates the coordinates
   */
  public void setCoordinates(List<Position> coordinates) {
    this.coordinates = coordinates;
  }

}

