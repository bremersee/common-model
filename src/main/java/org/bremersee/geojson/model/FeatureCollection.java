/*
 * Copyright 2018-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bremersee.geojson.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * A collection of features.
 *
 * @author Christian Bremer
 */
@ApiModel(description = "A collection of features.")
@Validated
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class FeatureCollection implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("type")
  private TypeEnum type = TypeEnum.FEATURECOLLECTION;

  @JsonProperty("bbox")
  private BoundingBox bbox = null;

  @JsonProperty("features")
  private List<Feature> features = null;

  @Builder(toBuilder = true)
  @SuppressWarnings("unused")
  public FeatureCollection(
      BoundingBox bbox,
      List<Feature> features) {
    this.bbox = bbox;
    this.features = features;
  }

  /**
   * The feature collection type.
   *
   * @return type type
   */
  @ApiModelProperty(required = true, value = "The feature collection type.")
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
   * Get features.
   *
   * @return features features
   */
  @ApiModelProperty(value = "The features.")
  public List<Feature> getFeatures() {
    return features;
  }

  /**
   * Sets features.
   *
   * @param features the features
   */
  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  /**
   * The feature collection type.
   */
  public enum TypeEnum {

    /**
     * Featurecollection type enum.
     */
    FEATURECOLLECTION("FeatureCollection");

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

