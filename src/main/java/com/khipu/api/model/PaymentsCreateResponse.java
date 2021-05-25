package com.khipu.api.model;

import com.khipu.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PaymentsCreateResponse   {
  
  private String paymentId = null;
  private String paymentUrl = null;
  private String simplifiedTransferUrl = null;
  private String transferUrl = null;
  private String webpayUrl = null;
  private String hitesUrl = null;
  private String paymeUrl = null;
  private String appUrl = null;
  private Boolean readyForTerminal = null;

  
  /**
   * Identificador único del pago, es una cadena alfanumérica de 12 caracteres. Cómo este identificador es único, se puede usar, por ejemplo, para evitar procesar una notificación repetida. (Khipu espera un código 200 al notificar un pago, si esto no ocurre se reintenta hasta por dos días).
   **/
  @ApiModelProperty(value = "Identificador único del pago, es una cadena alfanumérica de 12 caracteres. Cómo este identificador es único, se puede usar, por ejemplo, para evitar procesar una notificación repetida. (Khipu espera un código 200 al notificar un pago, si esto no ocurre se reintenta hasta por dos días).")
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
   * URL de pago usando Webpay
   **/
  @ApiModelProperty(value = "URL de pago usando Webpay")
  @JsonProperty("webpay_url")
  public String getWebpayUrl() {
    return webpayUrl;
  }
  public void setWebpayUrl(String webpayUrl) {
    this.webpayUrl = webpayUrl;
  }

  
  /**
   * URL de pago usando Hites
   **/
  @ApiModelProperty(value = "URL de pago usando Hites")
  @JsonProperty("hites_url")
  public String getHitesUrl() {
    return hitesUrl;
  }
  public void setHitesUrl(String hitesUrl) {
    this.hitesUrl = hitesUrl;
  }

  
  /**
   * URL de pago usando Hites
   **/
  @ApiModelProperty(value = "URL de pago usando Hites")
  @JsonProperty("payme_url")
  public String getPaymeUrl() {
    return paymeUrl;
  }
  public void setPaymeUrl(String paymeUrl) {
    this.paymeUrl = paymeUrl;
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
    sb.append("    webpayUrl: ").append(StringUtil.toIndentedString(webpayUrl)).append("\n");
    sb.append("    hitesUrl: ").append(StringUtil.toIndentedString(hitesUrl)).append("\n");
    sb.append("    paymeUrl: ").append(StringUtil.toIndentedString(paymeUrl)).append("\n");
    sb.append("    appUrl: ").append(StringUtil.toIndentedString(appUrl)).append("\n");
    sb.append("    readyForTerminal: ").append(StringUtil.toIndentedString(readyForTerminal)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
