/*
 * The template was taken from
 * https://github.com/swagger-api/swagger-codegen/blob/v2.3.1/modules/swagger-codegen/src/main/resources/JavaSpring/model.mustache
 * to add @JsonIgnoreProperties(ignoreUnknown = true)
 */

package org.bremersee.exception.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.OffsetDateTime;
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
 * The serialized exception.
 */
@ApiModel(description = "The serialized exception.")
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "_type", visible = true)
@JsonSubTypes({
})
@JacksonXmlRootElement(localName = "RestApiException")
@XmlRootElement(name = "RestApiException")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public class RestApiException implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  @JacksonXmlProperty(localName = "id")
  private String id = null;

  @JsonProperty("timestamp")
  @JacksonXmlProperty(localName = "timestamp")
  private OffsetDateTime timestamp;

  @JsonProperty("message")
  @JacksonXmlProperty(localName = "message")
  private String message = "No message present.";

  @JsonProperty("errorCode")
  @JacksonXmlProperty(localName = "errorCode")
  private String errorCode = null;

  @JsonProperty("errorCodeInherited")
  @JacksonXmlProperty(localName = "errorCodeInherited")
  private Boolean errorCodeInherited = Boolean.FALSE;

  @JsonProperty("className")
  @JacksonXmlProperty(localName = "className")
  private String className = null;

  @JsonProperty("application")
  @JacksonXmlProperty(localName = "application")
  private String application = null;

  @JsonProperty("path")
  @JacksonXmlProperty(localName = "path")
  private String path = null;

  @JsonProperty("handler")
  @JacksonXmlProperty(localName = "handler")
  private Handler handler = null;

  @JsonProperty("stackTrace")
  @JacksonXmlProperty(localName = "stackTrace")
  private List<StackTraceItem> stackTrace = null;

  @JsonProperty("cause")
  @JacksonXmlProperty(localName = "cause")
  private RestApiException cause = null;

  /**
   * Instantiates a new rest api exception.
   *
   * @param id                 the id
   * @param timestamp          the timestamp
   * @param message            the message
   * @param errorCode          the error code
   * @param errorCodeInherited the error code inherited
   * @param className          the class name
   * @param application        the application
   * @param path               the path
   * @param handler            the handler
   * @param stackTrace         the stack trace
   * @param cause              the cause
   */
  @Builder(toBuilder = true)
  public RestApiException(
      String id,
      OffsetDateTime timestamp,
      String message,
      String errorCode,
      Boolean errorCodeInherited,
      String className,
      String application,
      String path,
      Handler handler,
      List<StackTraceItem> stackTrace,
      RestApiException cause) {
    this.id = id;
    this.timestamp = timestamp;
    this.message = message;
    this.errorCode = errorCode;
    this.errorCodeInherited = Boolean.TRUE.equals(errorCodeInherited);
    this.className = className;
    this.application = application;
    this.path = path;
    this.handler = handler;
    this.stackTrace = stackTrace;
    this.cause = cause;
  }

  /**
   * The id of the exception.
   *
   * @return id id
   */
  @ApiModelProperty(value = "The id of the exception.")
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
   * The timestamp.
   *
   * @return timestamp timestamp
   */
  @ApiModelProperty(value = "The timestamp.")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  /**
   * Sets timestamp.
   *
   * @param timestamp the timestamp
   */
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * A human readable exception message.
   *
   * @return message message
   */
  @ApiModelProperty(value = "A human readable exception message.")
  public String getMessage() {
    return message;
  }

  /**
   * Sets message.
   *
   * @param message the message
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * A service specific error code.
   *
   * @return errorCode error code
   */
  @ApiModelProperty(value = "A service specific error code.")
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * Sets error code.
   *
   * @param errorCode the error code
   */
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Is the error code inherited from the cause.
   *
   * @return errorCodeInherited error code inherited
   */
  @ApiModelProperty(value = "Is the error code inherited from the cause?")
  public Boolean getErrorCodeInherited() {
    if (errorCodeInherited == null) {
      errorCodeInherited = Boolean.FALSE;
    }
    return errorCodeInherited;
  }

  /**
   * Sets error code inherited.
   *
   * @param errorCodeInherited the error code inherited
   */
  public void setErrorCodeInherited(Boolean errorCodeInherited) {
    this.errorCodeInherited = Boolean.TRUE.equals(errorCodeInherited);
  }

  /**
   * The class name of the exception.
   *
   * @return className class name
   */
  @ApiModelProperty(value = "The class name of the exception.")
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
   * The name of the application.
   *
   * @return application application
   */
  @ApiModelProperty(value = "The name of the application.")
  public String getApplication() {
    return application;
  }

  /**
   * Sets application.
   *
   * @param application the application
   */
  public void setApplication(String application) {
    this.application = application;
  }

  /**
   * The request path.
   *
   * @return path path
   */
  @ApiModelProperty(value = "The request path.")
  public String getPath() {
    return path;
  }

  /**
   * Sets path.
   *
   * @param path the path
   */
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * Get handler.
   *
   * @return handler handler
   */
  @ApiModelProperty(value = "The handler.")
  public Handler getHandler() {
    return handler;
  }

  /**
   * Sets handler.
   *
   * @param handler the handler
   */
  public void setHandler(Handler handler) {
    this.handler = handler;
  }

  /**
   * The stack trace.
   *
   * @return stackTrace stack trace
   */
  @ApiModelProperty(value = "The stack trace.")
  public List<StackTraceItem> getStackTrace() {
    return stackTrace;
  }

  /**
   * Sets stack trace.
   *
   * @param stackTrace the stack trace
   */
  public void setStackTrace(List<StackTraceItem> stackTrace) {
    this.stackTrace = stackTrace;
  }

  /**
   * Get cause.
   *
   * @return cause cause
   */
  @ApiModelProperty(value = "The cause.")
  public RestApiException getCause() {
    return cause;
  }

  /**
   * Sets cause.
   *
   * @param cause the cause
   */
  public void setCause(RestApiException cause) {
    this.cause = cause;
  }

}

