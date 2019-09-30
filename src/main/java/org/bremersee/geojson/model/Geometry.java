/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.geojson.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * GeoJSON Geometry.
 */
@ApiModel(description = "GeoJSON Geometry.")
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = GeometryCollection.class, name = "GeometryCollection"),
    @JsonSubTypes.Type(value = MultiPoint.class, name = "MultiPoint"),
    @JsonSubTypes.Type(value = MultiLineString.class, name = "MultiLineString"),
    @JsonSubTypes.Type(value = LineString.class, name = "LineString"),
    @JsonSubTypes.Type(value = MultiPolygon.class, name = "MultiPolygon"),
    @JsonSubTypes.Type(value = Point.class, name = "Point"),
    @JsonSubTypes.Type(value = Polygon.class, name = "Polygon"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public abstract class Geometry implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("bbox")
  private BoundingBox bbox = null;

  /**
   * Instantiates a new geometry.
   *
   * @param bbox the bbox
   */
  public Geometry(BoundingBox bbox) {
    this.bbox = bbox;
  }

  /**
   * The geometry type.
   *
   * @return type type
   */
  @ApiModelProperty(required = true, value = "The geometry type.")
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
   * Get bounding box.
   *
   * @return bbox bbox
   */
  @ApiModelProperty(value = "The boundling box.")
  public BoundingBox getBbox() {
    return bbox;
  }

  /**
   * Sets bbox.
   *
   * @param bbox the bbox
   */
  public void setBbox(BoundingBox bbox) {
    this.bbox = bbox;
  }

  /**
   * The geometry type.
   */
  public enum TypeEnum {

    /**
     * Point type enum.
     */
    POINT("Point"),

    /**
     * Multipoint type enum.
     */
    MULTIPOINT("MultiPoint"),

    /**
     * Linestring type enum.
     */
    LINESTRING("LineString"),

    /**
     * Multilinestring type enum.
     */
    MULTILINESTRING("MultiLineString"),

    /**
     * Polygon type enum.
     */
    POLYGON("Polygon"),

    /**
     * Multipolygon type enum.
     */
    MULTIPOLYGON("MultiPolygon"),

    /**
     * Geometrycollection type enum.
     */
    GEOMETRYCOLLECTION("GeometryCollection");

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
