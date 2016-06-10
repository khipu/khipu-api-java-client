package com.khipu.api.model;

import com.khipu.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T10:13:50.881-04:00")
public class ReceiversCreateResponse   {
  
  private String receiverId = null;
  private String secret = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("receiver_id")
  public String getReceiverId() {
    return receiverId;
  }
  public void setReceiverId(String receiverId) {
    this.receiverId = receiverId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("secret")
  public String getSecret() {
    return secret;
  }
  public void setSecret(String secret) {
    this.secret = secret;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiversCreateResponse {\n");
    
    sb.append("    receiverId: ").append(StringUtil.toIndentedString(receiverId)).append("\n");
    sb.append("    secret: ").append(StringUtil.toIndentedString(secret)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
