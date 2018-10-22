package com.khipu.api.model;

import com.khipu.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-22T10:09:36.361-03:00")
public class ErrorItem   {
  
  private String field = null;
  private String message = null;

  
  /**
   * Campo que tiene el error de validación
   **/
  @ApiModelProperty(value = "Campo que tiene el error de validación")
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  
  /**
   * Motivo del error de validación
   **/
  @ApiModelProperty(value = "Motivo del error de validación")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorItem {\n");
    
    sb.append("    field: ").append(StringUtil.toIndentedString(field)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
