package com.khipu.api.model;

import com.khipu.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-12T16:32:49.586-04:00")
public class BankItem   {
  
  private String bankId = null;
  private String name = null;
  private String message = null;
  private Double minAmount = null;
  private String type = null;
  private String parent = null;

  
  /**
   * Identificador del banco
   **/
  @ApiModelProperty(value = "Identificador del banco")
  @JsonProperty("bank_id")
  public String getBankId() {
    return bankId;
  }
  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  
  /**
   * Nombre del banco
   **/
  @ApiModelProperty(value = "Nombre del banco")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Mensaje con particularidades del banco
   **/
  @ApiModelProperty(value = "Mensaje con particularidades del banco")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Monto mínimo que acepta el banco en un pago
   **/
  @ApiModelProperty(value = "Monto mínimo que acepta el banco en un pago")
  @JsonProperty("min_amount")
  public Double getMinAmount() {
    return minAmount;
  }
  public void setMinAmount(Double minAmount) {
    this.minAmount = minAmount;
  }

  
  /**
   * Tipo de banco
   **/
  @ApiModelProperty(value = "Tipo de banco")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Identificador del banco padre (si un banco tiene banca personas y empresas, el primero será el padre del segundo)
   **/
  @ApiModelProperty(value = "Identificador del banco padre (si un banco tiene banca personas y empresas, el primero será el padre del segundo)")
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }
  public void setParent(String parent) {
    this.parent = parent;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankItem {\n");
    
    sb.append("    bankId: ").append(StringUtil.toIndentedString(bankId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    minAmount: ").append(StringUtil.toIndentedString(minAmount)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    parent: ").append(StringUtil.toIndentedString(parent)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
