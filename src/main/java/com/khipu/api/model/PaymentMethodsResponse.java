package com.khipu.api.model;

import com.khipu.StringUtil;
import com.khipu.api.model.PaymentMethodItem;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PaymentMethodsResponse   {
  
  private List<PaymentMethodItem> paymentMethods = new ArrayList<PaymentMethodItem>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("paymentMethods")
  public List<PaymentMethodItem> getPaymentMethods() {
    return paymentMethods;
  }
  public void setPaymentMethods(List<PaymentMethodItem> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodsResponse {\n");
    
    sb.append("    paymentMethods: ").append(StringUtil.toIndentedString(paymentMethods)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
