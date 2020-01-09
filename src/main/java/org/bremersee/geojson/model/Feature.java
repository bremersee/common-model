/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.geojson.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * A Feature object represents a spatially bounded thing.
 */
@ApiModel(description = "A Feature object represents a spatially bounded thing.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public class Feature implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("type")
  private TypeEnum type = TypeEnum.FEATURE;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("bbox")
  private BoundingBox bbox = null;

  @JsonProperty("geometry")
  private Geometry geometry = null;

  @JsonProperty("properties")
  private Object properties = null;

  /**
   * Instantiates a new feature.
   *
   * @param id the id
   * @param bbox the bbox
   * @param geometry the geometry
   * @param properties the properties
   */
  @Builder(toBuilder = true)
  public Feature(
      String id,
      BoundingBox bbox,
      Geometry geometry,
      Object properties) {
    this.id = id;
    this.bbox = bbox;
    this.geometry = geometry;
    this.properties = properties;
  }

  /**
   * The feature type.
   *
   * @return type type
   */
  @ApiModelProperty(required = true, value = "The feature type.")
  @NotNull
  public TypeEnum getType() {
    return type;
  }

  /**
   * Sets type.
   *
   * @param type the type
   */
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The identifier of this feature.
   *
   * @return id id
   */
  @ApiModelProperty(value = "The identifier of this feature.")
  public String getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Get bounding box.
   *
   * @return bbox bbox
   */
  @ApiModelProperty(value = "The bounding box.")
  public BoundingBox getBbox() {
    return bbox;
  }

  /**
   * Sets bounding box.
   *
   * @param bbox the bbox
   */
  public void setBbox(BoundingBox bbox) {
    this.bbox = bbox;
  }

  /**
   * Get geometry.
   *
   * @return geometry geometry
   */
  @ApiModelProperty(value = "The geometry.")
  public Geometry getGeometry() {
    return geometry;
  }

  /**
   * Sets geometry.
   *
   * @param geometry the geometry
   */
  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }

  /**
   * The feature properties.
   *
   * @return properties properties
   */
  @ApiModelProperty(value = "The feature properties.")
  public Object getProperties() {
    return properties;
  }

  /**
   * Sets properties.
   *
   * @param properties the properties
   */
  public void setProperties(Object properties) {
    this.properties = properties;
  }

  /**
   * The feature type.
   */
  public enum TypeEnum {

    /**
     * Feature type enum.
     */
    FEATURE("Feature");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * From value type enum.
     *
     * @param text the text
     * @return the type enum
     */
    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

}

