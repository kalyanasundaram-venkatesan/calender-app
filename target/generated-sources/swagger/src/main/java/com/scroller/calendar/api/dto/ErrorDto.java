package com.scroller.calendar.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-21T23:42:46.294178+05:30[Asia/Kolkata]")


public class ErrorDto   {
  @JsonProperty("error_type")
  private String errorType = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("errors")
  @Valid
  private List<Map<String, Object>> errors = null;

  public ErrorDto errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Type of the error
   * @return errorType
   **/
  @Schema(example = "FD-VALIDATION_ERROR-12345", description = "Type of the error")
  
    public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public ErrorDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Type of the error
   * @return message
   **/
  @Schema(example = "Some user friendly error message", description = "Type of the error")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDto errors(List<Map<String, Object>> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorDto addErrorsItem(Map<String, Object> errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Map<String, Object>>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
   **/
  @Schema(description = "")
      @Valid
    public List<Map<String, Object>> getErrors() {
    return errors;
  }

  public void setErrors(List<Map<String, Object>> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto error = (ErrorDto) o;
    return Objects.equals(this.errorType, error.errorType) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.errors, error.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorType, message, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
