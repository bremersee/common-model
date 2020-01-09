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
 * GeoJSON GeometryCollection.
 */
@ApiModel(description = "GeoJSON GeometryCollection.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuppressWarnings("unused")
public class GeometryCollection extends Geometry implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("geometries")
  private List<Geometry> geometries = null;

  /**
   * Instantiates a new geometry collection.
   */
  public GeometryCollection() {
    setType(TypeEnum.GEOMETRYCOLLECTION);
  }

  /**
   * Instantiates a new geometry collection.
   *
   * @param bbox       the bbox
   * @param geometries the geometries
   */
  @Builder(toBuilder = true)
  public GeometryCollection(BoundingBox bbox, List<Geometry> geometries) {
    super(bbox);
    setType(TypeEnum.GEOMETRYCOLLECTION);
    this.geometries = geometries;
  }

  /**
   * Get geometries.
   *
   * @return geometries geometries
   */
  @ApiModelProperty(value = "The geometry.")
  public List<Geometry> getGeometries() {
    return geometries;
  }

  /**
   * Sets geometries.
   *
   * @param geometries the geometries
   */
  public void setGeometries(List<Geometry> geometries) {
    this.geometries = geometries;
  }

}

