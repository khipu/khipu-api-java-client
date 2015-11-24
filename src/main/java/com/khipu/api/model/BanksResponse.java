package com.khipu.api.model;

import com.khipu.StringUtil;
import java.util.*;
import com.khipu.api.model.BankItem;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-24T11:29:23.565-03:00")
public class BanksResponse   {
  
  private List<BankItem> banks = new ArrayList<BankItem>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("banks")
  public List<BankItem> getBanks() {
    return banks;
  }
  public void setBanks(List<BankItem> banks) {
    this.banks = banks;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BanksResponse {\n");
    
    sb.append("    banks: ").append(StringUtil.toIndentedString(banks)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
