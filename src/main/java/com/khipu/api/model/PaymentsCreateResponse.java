package com.khipu.api.model;

import com.khipu.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T10:13:50.881-04:00")
public class PaymentsCreateResponse   {
  
  private String paymentId = null;
  private String paymentUrl = null;
  private String simplifiedTransferUrl = null;
  private String transferUrl = null;
  private String appUrl = null;
  private Boolean readyForTerminal = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("payment_id")
  public String getPaymentId() {
    return paymentId;
  }
  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("payment_url")
  public String getPaymentUrl() {
    return paymentUrl;
  }
  public void setPaymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("simplified_transfer_url")
  public String getSimplifiedTransferUrl() {
    return simplifiedTransferUrl;
  }
  public void setSimplifiedTransferUrl(String simplifiedTransferUrl) {
    this.simplifiedTransferUrl = simplifiedTransferUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("transfer_url")
  public String getTransferUrl() {
    return transferUrl;
  }
  public void setTransferUrl(String transferUrl) {
    this.transferUrl = transferUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("app_url")
  public String getAppUrl() {
    return appUrl;
  }
  public void setAppUrl(String appUrl) {
    this.appUrl = appUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
