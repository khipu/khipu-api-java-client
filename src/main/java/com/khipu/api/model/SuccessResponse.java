package com.khipu.api.model;

import com.khipu.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-07T14:46:41.422-04:00")
public class SuccessResponse   {
  
  private String message = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessResponse {\n");
    
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
