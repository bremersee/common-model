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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

/**
 * A stack trace element of an exception.
 *
 * @author Christian Bremer
 */
@ApiModel(description = "A stack trace element of an exception.")
@Validated
@JacksonXmlRootElement(localName = "StackTraceItem")
@XmlRootElement(name = "StackTraceItem")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public class StackTraceItem implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("declaringClass")
  @JacksonXmlProperty(localName = "declaringClass")
  private String declaringClass = null;

  @JsonProperty("methodName")
  @JacksonXmlProperty(localName = "methodName")
  private String methodName = null;

  @JsonProperty("fileName")
  @JacksonXmlProperty(localName = "fileName")
  private String fileName = null;

  @JsonProperty("lineNumber")
  @JacksonXmlProperty(localName = "lineNumber")
  private Integer lineNumber = null;

  /**
   * Instantiates a new stack trace item.
   *
   * @param declaringClass the declaring class
   * @param methodName the method name
   * @param fileName the file name
   * @param lineNumber the line number
   */
  @Builder(toBuilder = true)
  public StackTraceItem(
      String declaringClass,
      String methodName,
      String fileName,
      Integer lineNumber) {
    this.declaringClass = declaringClass;
    this.methodName = methodName;
    this.fileName = fileName;
    this.lineNumber = lineNumber;
  }

  /**
   * The declaring class.
   *
   * @return declaringClass declaring class
   */
  @ApiModelProperty(value = "The declaring class.")
  public String getDeclaringClass() {
    return declaringClass;
  }

  /**
   * Sets declaring class.
   *
   * @param declaringClass the declaring class
   */
  public void setDeclaringClass(String declaringClass) {
    this.declaringClass = declaringClass;
  }

  /**
   * The method name.
   *
   * @return methodName method name
   */
  @ApiModelProperty(value = "The method name.")
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
   * The file name.
   *
   * @return fileName file name
   */
  @ApiModelProperty(value = "The file name.")
  public String getFileName() {
    return fileName;
  }

  /**
   * Sets file name.
   *
   * @param fileName the file name
   */
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * The line number.
   *
   * @return lineNumber line number
   */
  @ApiModelProperty(value = "The line number.")
  public Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * Sets line number.
   *
   * @param lineNumber the line number
   */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

}