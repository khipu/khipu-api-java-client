package com.khipu.api.model;

import com.khipu.StringUtil;
import java.util.Date;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-01T14:39:50.873-03:00")
public class PaymentsResponse   {
  
  private String paymentId = null;
  private String paymentUrl = null;
  private String simplifiedTransferUrl = null;
  private String transferUrl = null;
  private String appUrl = null;
  private Boolean readyForTerminal = null;
  private String notificationToken = null;
  private Long receiverId = null;
  private Date conciliationDate = null;
  private String subject = null;
  private Double amount = null;
  private String currency = null;
  private String status = null;
  private String statusDetail = null;
  private String body = null;
  private String pictureUrl = null;
  private String receiptUrl = null;
  private String returnUrl = null;
  private String cancelUrl = null;
  private String notifyUrl = null;
  private String notifyApiVersion = null;
  private Date expiresDate = null;
  private List<String> attachmentUrls = new ArrayList<String>();
  private String bank = null;
  private String bankId = null;
  private String payerName = null;
  private String payerEmail = null;
  private String personalIdentifier = null;
  private String bankAccountNumber = null;
  private Boolean outOfDateConciliation = null;
  private String transactionId = null;
  private String custom = null;
  private String responsibleUserEmail = null;
  private Boolean sendReminders = null;
  private Boolean sendEmail = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("notification_token")
  public String getNotificationToken() {
    return notificationToken;
  }
  public void setNotificationToken(String notificationToken) {
    this.notificationToken = notificationToken;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("receiver_id")
  public Long getReceiverId() {
    return receiverId;
  }
  public void setReceiverId(Long receiverId) {
    this.receiverId = receiverId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("conciliation_date")
  public Date getConciliationDate() {
    return conciliationDate;
  }
  public void setConciliationDate(Date conciliationDate) {
    this.conciliationDate = conciliationDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("status_detail")
  public String getStatusDetail() {
    return statusDetail;
  }
  public void setStatusDetail(String statusDetail) {
    this.statusDetail = statusDetail;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("picture_url")
  public String getPictureUrl() {
    return pictureUrl;
  }
  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("receipt_url")
  public String getReceiptUrl() {
    return receiptUrl;
  }
  public void setReceiptUrl(String receiptUrl) {
    this.receiptUrl = receiptUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("return_url")
  public String getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("cancel_url")
  public String getCancelUrl() {
    return cancelUrl;
  }
  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("notify_url")
  public String getNotifyUrl() {
    return notifyUrl;
  }
  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("notify_api_version")
  public String getNotifyApiVersion() {
    return notifyApiVersion;
  }
  public void setNotifyApiVersion(String notifyApiVersion) {
    this.notifyApiVersion = notifyApiVersion;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("expires_date")
  public Date getExpiresDate() {
    return expiresDate;
  }
  public void setExpiresDate(Date expiresDate) {
    this.expiresDate = expiresDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("attachment_urls")
  public List<String> getAttachmentUrls() {
    return attachmentUrls;
  }
  public void setAttachmentUrls(List<String> attachmentUrls) {
    this.attachmentUrls = attachmentUrls;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bank")
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bank_id")
  public String getBankId() {
    return bankId;
  }
  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("payer_name")
  public String getPayerName() {
    return payerName;
  }
  public void setPayerName(String payerName) {
    this.payerName = payerName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("payer_email")
  public String getPayerEmail() {
    return payerEmail;
  }
  public void setPayerEmail(String payerEmail) {
    this.payerEmail = payerEmail;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("personal_identifier")
  public String getPersonalIdentifier() {
    return personalIdentifier;
  }
  public void setPersonalIdentifier(String personalIdentifier) {
    this.personalIdentifier = personalIdentifier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bank_account_number")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }
  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("out_of_date_conciliation")
  public Boolean getOutOfDateConciliation() {
    return outOfDateConciliation;
  }
  public void setOutOfDateConciliation(Boolean outOfDateConciliation) {
    this.outOfDateConciliation = outOfDateConciliation;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("transaction_id")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("custom")
  public String getCustom() {
    return custom;
  }
  public void setCustom(String custom) {
    this.custom = custom;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("responsible_user_email")
  public String getResponsibleUserEmail() {
    return responsibleUserEmail;
  }
  public void setResponsibleUserEmail(String responsibleUserEmail) {
    this.responsibleUserEmail = responsibleUserEmail;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("send_reminders")
  public Boolean getSendReminders() {
    return sendReminders;
  }
  public void setSendReminders(Boolean sendReminders) {
    this.sendReminders = sendReminders;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("send_email")
  public Boolean getSendEmail() {
    return sendEmail;
  }
  public void setSendEmail(Boolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsResponse {\n");
    
    sb.append("    paymentId: ").append(StringUtil.toIndentedString(paymentId)).append("\n");
    sb.append("    paymentUrl: ").append(StringUtil.toIndentedString(paymentUrl)).append("\n");
    sb.append("    simplifiedTransferUrl: ").append(StringUtil.toIndentedString(simplifiedTransferUrl)).append("\n");
    sb.append("    transferUrl: ").append(StringUtil.toIndentedString(transferUrl)).append("\n");
    sb.append("    appUrl: ").append(StringUtil.toIndentedString(appUrl)).append("\n");
    sb.append("    readyForTerminal: ").append(StringUtil.toIndentedString(readyForTerminal)).append("\n");
    sb.append("    notificationToken: ").append(StringUtil.toIndentedString(notificationToken)).append("\n");
    sb.append("    receiverId: ").append(StringUtil.toIndentedString(receiverId)).append("\n");
    sb.append("    conciliationDate: ").append(StringUtil.toIndentedString(conciliationDate)).append("\n");
    sb.append("    subject: ").append(StringUtil.toIndentedString(subject)).append("\n");
    sb.append("    amount: ").append(StringUtil.toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    statusDetail: ").append(StringUtil.toIndentedString(statusDetail)).append("\n");
    sb.append("    body: ").append(StringUtil.toIndentedString(body)).append("\n");
    sb.append("    pictureUrl: ").append(StringUtil.toIndentedString(pictureUrl)).append("\n");
    sb.append("    receiptUrl: ").append(StringUtil.toIndentedString(receiptUrl)).append("\n");
    sb.append("    returnUrl: ").append(StringUtil.toIndentedString(returnUrl)).append("\n");
    sb.append("    cancelUrl: ").append(StringUtil.toIndentedString(cancelUrl)).append("\n");
    sb.append("    notifyUrl: ").append(StringUtil.toIndentedString(notifyUrl)).append("\n");
    sb.append("    notifyApiVersion: ").append(StringUtil.toIndentedString(notifyApiVersion)).append("\n");
    sb.append("    expiresDate: ").append(StringUtil.toIndentedString(expiresDate)).append("\n");
    sb.append("    attachmentUrls: ").append(StringUtil.toIndentedString(attachmentUrls)).append("\n");
    sb.append("    bank: ").append(StringUtil.toIndentedString(bank)).append("\n");
    sb.append("    bankId: ").append(StringUtil.toIndentedString(bankId)).append("\n");
    sb.append("    payerName: ").append(StringUtil.toIndentedString(payerName)).append("\n");
    sb.append("    payerEmail: ").append(StringUtil.toIndentedString(payerEmail)).append("\n");
    sb.append("    personalIdentifier: ").append(StringUtil.toIndentedString(personalIdentifier)).append("\n");
    sb.append("    bankAccountNumber: ").append(StringUtil.toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    outOfDateConciliation: ").append(StringUtil.toIndentedString(outOfDateConciliation)).append("\n");
    sb.append("    transactionId: ").append(StringUtil.toIndentedString(transactionId)).append("\n");
    sb.append("    custom: ").append(StringUtil.toIndentedString(custom)).append("\n");
    sb.append("    responsibleUserEmail: ").append(StringUtil.toIndentedString(responsibleUserEmail)).append("\n");
    sb.append("    sendReminders: ").append(StringUtil.toIndentedString(sendReminders)).append("\n");
    sb.append("    sendEmail: ").append(StringUtil.toIndentedString(sendEmail)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
