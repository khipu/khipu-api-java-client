package com.khipu.api.model;

import com.khipu.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-11T14:54:34.635-04:00")
public class PaymentsCreateResponse   {
  
  private String paymentId = null;
  private String paymentUrl = null;
  private String simplifiedTransferUrl = null;
  private String transferUrl = null;
  private String appUrl = null;
  private Boolean readyForTerminal = null;

  
  /**
   * Identificador único del pago, es una cadena alfanumérica de 12 caracteres
   **/
  @ApiModelProperty(value = "Identificador único del pago, es una cadena alfanumérica de 12 caracteres")
  @JsonProperty("payment_id")
  public String getPaymentId() {
    return paymentId;
  }
  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  
  /**
   * URL principal del pago, si el usuario no ha elegido previamente un método de pago se le muestran las opciones
   **/
  @ApiModelProperty(value = "URL principal del pago, si el usuario no ha elegido previamente un método de pago se le muestran las opciones")
  @JsonProperty("payment_url")
  public String getPaymentUrl() {
    return paymentUrl;
  }
  public void setPaymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
  }

  
  /**
   * URL de pago simplificado
   **/
  @ApiModelProperty(value = "URL de pago simplificado")
  @JsonProperty("simplified_transfer_url")
  public String getSimplifiedTransferUrl() {
    return simplifiedTransferUrl;
  }
  public void setSimplifiedTransferUrl(String simplifiedTransferUrl) {
    this.simplifiedTransferUrl = simplifiedTransferUrl;
  }

  
  /**
   * URL de pago normal
   **/
  @ApiModelProperty(value = "URL de pago normal")
  @JsonProperty("transfer_url")
  public String getTransferUrl() {
    return transferUrl;
  }
  public void setTransferUrl(String transferUrl) {
    this.transferUrl = transferUrl;
  }

  
  /**
   * URL para invocar el pago desde un dispositivo móvil usando la APP de khipu
   **/
  @ApiModelProperty(value = "URL para invocar el pago desde un dispositivo móvil usando la APP de khipu")
  @JsonProperty("app_url")
  public String getAppUrl() {
    return appUrl;
  }
  public void setAppUrl(String appUrl) {
    this.appUrl = appUrl;
  }

  
  /**
   * Es 'true' si el pago ya cuenta con todos los datos necesarios para abrir directamente la aplicación de pagos khipu
   **/
  @ApiModelProperty(value = "Es 'true' si el pago ya cuenta con todos los datos necesarios para abrir directamente la aplicación de pagos khipu")
  @JsonProperty("ready_for_terminal")
  public Boolean getReadyForTerminal() {
    return readyForTerminal;
  }
  public void setReadyForTerminal(Boolean readyForTerminal) {
    this.readyForTerminal = readyForTerminal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsCreateResponse {\n");
    
    sb.append("    paymentId: ").append(StringUtil.toIndentedString(paymentId)).append("\n");
    sb.append("    paymentUrl: ").append(StringUtil.toIndentedString(paymentUrl)).append("\n");
    sb.append("    simplifiedTransferUrl: ").append(StringUtil.toIndentedString(simplifiedTransferUrl)).append("\n");
    sb.append("    transferUrl: ").append(StringUtil.toIndentedString(transferUrl)).append("\n");
    sb.append("    appUrl: ").append(StringUtil.toIndentedString(appUrl)).append("\n");
    sb.append("    readyForTerminal: ").append(StringUtil.toIndentedString(readyForTerminal)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
