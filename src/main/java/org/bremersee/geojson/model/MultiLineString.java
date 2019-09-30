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
 * GeoJSON MultiLineString.
 */
@ApiModel(description = "GeoJSON MultiLineString.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuppressWarnings("unused")
public class MultiLineString extends Geometry implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("coordinates")
  private List<List<Position>> coordinates = null;

  /**
   * Instantiates a new multi line string.
   */
  public MultiLineString() {
    setType(TypeEnum.MULTILINESTRING);
  }

  /**
   * Instantiates a new multi line string.
   *
   * @param bbox        the bbox
   * @param coordinates the coordinates
   */
  @Builder
  public MultiLineString(BoundingBox bbox, List<List<Position>> coordinates) {
    super(bbox);
    setType(TypeEnum.MULTILINESTRING);
    this.coordinates = coordinates;
  }

  /**
   * Get coordinates.
   *
   * @return coordinates coordinates
   */
  @ApiModelProperty(value = "The coordinates.")
  public List<List<Position>> getCoordinates() {
    return coordinates;
  }

  /**
   * Sets coordinates.
   *
   * @param coordinates the coordinates
   */
  public void setCoordinates(List<List<Position>> coordinates) {
    this.coordinates = coordinates;
  }

}
