/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.exception.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * The handler where the exception occurred.
 */
@ApiModel(description = "The handler where the exception occurred.")
@Validated
@JacksonXmlRootElement(localName = "Handler")
@XmlRootElement(name = "Handler")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public class Handler implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("className")
  @JacksonXmlProperty(localName = "className")
  private String className = null;

  @JsonProperty("methodName")
  @JacksonXmlProperty(localName = "methodName")
  private String methodName = null;

  @JsonProperty("methodParameterTypes")
  @JacksonXmlProperty(localName = "methodParameterTypes")
  private List<String> methodParameterTypes = null;

  /**
   * Instantiates a new handler.
   *
   * @param className            the class name
   * @param methodName           the method name
   * @param methodParameterTypes the method parameter types
   */
  @Builder(toBuilder = true)
  public Handler(
      String className,
      String methodName,
      List<String> methodParameterTypes) {
    this.className = className;
    this.methodName = methodName;
    this.methodParameterTypes = methodParameterTypes;
  }

  /**
   * The class name of the handler.
   *
   * @return className class name
   */
  @ApiModelProperty(value = "The class name of the handler.")
  public String getClassName() {
    return className;
  }

  /**
   * Sets class name.
   *
   * @param className the class name
   */
  public void setClassName(String className) {
    this.className = className;
  }

  /**
   * The method name of the handler.
   *
   * @return methodName method name
   */
  @ApiModelProperty(value = "The method name of the handler.")
  public String getMethodName() {
    return methodName;
  }

  /**
   * Sets method name.
   *
   * @param methodName the method name
   */
  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  /**
   * The method parameters.
   *
   * @return methodParameterTypes method parameter types
   */
  @ApiModelProperty(value = "The method parameters.")
  public List<String> getMethodParameterTypes() {
    return methodParameterTypes;
  }

  /**
   * Sets method parameter types.
   *
   * @param methodParameterTypes the method parameter types
   */
  public void setMethodParameterTypes(List<String> methodParameterTypes) {
    this.methodParameterTypes = methodParameterTypes;
  }

}

