package com.khipu.api.model;

import com.khipu.StringUtil;
import com.khipu.api.model.ErrorItem;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-09T16:31:38.083-03:00")
public class ValidationError   {
  
  private Integer status = null;
  private String message = null;
  private List<ErrorItem> errors = new ArrayList<ErrorItem>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errors")
  public List<ErrorItem> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorItem> errors) {
    this.errors = errors;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(StringUtil.toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
