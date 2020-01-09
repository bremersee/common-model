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
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * GeoJSON Point.
 */
@ApiModel(description = "GeoJSON Point.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuppressWarnings("unused")
public class Point extends Geometry implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("coordinates")
  private Position coordinates = null;

  /**
   * Instantiates a new point.
   */
  public Point() {
    setType(TypeEnum.POINT);
  }

  /**
   * Instantiates a new point.
   *
   * @param bbox the bbox
   * @param coordinates the coordinates
   */
  @Builder(toBuilder = true)
  public Point(BoundingBox bbox, Position coordinates) {
    super(bbox);
    setType(TypeEnum.POINT);
    this.coordinates = coordinates;
  }

  /**
   * Get coordinates.
   *
   * @return coordinates coordinates
   */
  @ApiModelProperty(value = "The coordinates.")
  public Position getCoordinates() {
    return coordinates;
  }

  /**
   * Sets coordinates.
   *
   * @param coordinates the coordinates
   */
  public void setCoordinates(Position coordinates) {
    this.coordinates = coordinates;
  }

}

