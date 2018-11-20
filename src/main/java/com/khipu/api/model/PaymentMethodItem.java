package com.khipu.api.model;

import com.khipu.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PaymentMethodItem   {
  
  private String id = null;
  private String name = null;
  private String logoUrl = null;

  
  /**
   * Identificador del medio de pago
   **/
  @ApiModelProperty(value = "Identificador del medio de pago")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Nombre del medio de pago
   **/
  @ApiModelProperty(value = "Nombre del medio de pago")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * URL del logo sugerido para mostrar
   **/
  @ApiModelProperty(value = "URL del logo sugerido para mostrar")
  @JsonProperty("logo_url")
  public String getLogoUrl() {
    return logoUrl;
  }
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodItem {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    logoUrl: ").append(StringUtil.toIndentedString(logoUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
