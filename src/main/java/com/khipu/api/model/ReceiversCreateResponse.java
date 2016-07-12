package com.khipu.api.model;

import com.khipu.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-12T16:32:49.586-04:00")
public class ReceiversCreateResponse   {
  
  private String receiverId = null;
  private String secret = null;

  
  /**
   * Identificador único de la cuenta de cobro
   **/
  @ApiModelProperty(value = "Identificador único de la cuenta de cobro")
  @JsonProperty("receiver_id")
  public String getReceiverId() {
    return receiverId;
  }
  public void setReceiverId(String receiverId) {
    this.receiverId = receiverId;
  }

  
  /**
   * Llave secreta de la cuenta de cobro, se usa para firmar todas las peticiones
   **/
  @ApiModelProperty(value = "Llave secreta de la cuenta de cobro, se usa para firmar todas las peticiones")
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
