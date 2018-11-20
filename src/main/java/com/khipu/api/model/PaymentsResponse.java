package com.khipu.api.model;

import com.khipu.StringUtil;
import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PaymentsResponse   {
  
  private String paymentId = null;
  private String paymentUrl = null;
  private String simplifiedTransferUrl = null;
  private String transferUrl = null;
  private String webpayUrl = null;
  private String hitesUrl = null;
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
  private String paymentMethod = null;

  
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
   * URL de pago con Webpay
   **/
  @ApiModelProperty(value = "URL de pago con Webpay")
  @JsonProperty("webpay_url")
  public String getWebpayUrl() {
    return webpayUrl;
  }
  public void setWebpayUrl(String webpayUrl) {
    this.webpayUrl = webpayUrl;
  }

  
  /**
   * URL de pago con Hites
   **/
  @ApiModelProperty(value = "URL de pago con Hites")
  @JsonProperty("hites_url")
  public String getHitesUrl() {
    return hitesUrl;
  }
  public void setHitesUrl(String hitesUrl) {
    this.hitesUrl = hitesUrl;
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

  
  /**
   * Cadena de caracteres alfanuméricos que identifican unicamente al pago, es el identificador que el servidor de khipu enviará al servidor del comercio cuando notifique que un pago está conciliado
   **/
  @ApiModelProperty(value = "Cadena de caracteres alfanuméricos que identifican unicamente al pago, es el identificador que el servidor de khipu enviará al servidor del comercio cuando notifique que un pago está conciliado")
  @JsonProperty("notification_token")
  public String getNotificationToken() {
    return notificationToken;
  }
  public void setNotificationToken(String notificationToken) {
    this.notificationToken = notificationToken;
  }

  
  /**
   * Identificador único de una cuenta de cobro
   **/
  @ApiModelProperty(value = "Identificador único de una cuenta de cobro")
  @JsonProperty("receiver_id")
  public Long getReceiverId() {
    return receiverId;
  }
  public void setReceiverId(Long receiverId) {
    this.receiverId = receiverId;
  }

  
  /**
   * Fecha y hora de conciliación del pago. Formato ISO-8601. Ej: 2017-03-01T13:00:00Z
   **/
  @ApiModelProperty(value = "Fecha y hora de conciliación del pago. Formato ISO-8601. Ej: 2017-03-01T13:00:00Z")
  @JsonProperty("conciliation_date")
  public Date getConciliationDate() {
    return conciliationDate;
  }
  public void setConciliationDate(Date conciliationDate) {
    this.conciliationDate = conciliationDate;
  }

  
  /**
   * Motivo del pago
   **/
  @ApiModelProperty(value = "Motivo del pago")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   * Monto del pago, sin separador de miles y usando '.' como separador de decimales.
   **/
  @ApiModelProperty(value = "Monto del pago, sin separador de miles y usando '.' como separador de decimales.")
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  
  /**
   * El código de moneda en formato ISO-4217
   **/
  @ApiModelProperty(value = "El código de moneda en formato ISO-4217")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * Estado del pago, puede ser 'pending' (el pagador aún no comienza a pagar), 'verifying' (se está verificando el pago) o 'done', cuando el pago ya está confirmado
   **/
  @ApiModelProperty(value = "Estado del pago, puede ser 'pending' (el pagador aún no comienza a pagar), 'verifying' (se está verificando el pago) o 'done', cuando el pago ya está confirmado")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Detalle del estado del pago, 'pending' (el pagadon aún no comienza a pagar), 'normal' (el pago fue verificado y fue cancelado por algún medio de pago estandar), 'marked-paid-by-receiver' (el cobrador marco el cobro como pagado por otro medio), 'rejected-by-payer' (el pagador declaró que no pagará), 'marked-as-abuse' (el pagador declaró que no pagará y que el cobro fue no solicitado) y 'reversed' (el pago fue anulado por el comercio, el dinero fue devuelto al pagador).
   **/
  @ApiModelProperty(value = "Detalle del estado del pago, 'pending' (el pagadon aún no comienza a pagar), 'normal' (el pago fue verificado y fue cancelado por algún medio de pago estandar), 'marked-paid-by-receiver' (el cobrador marco el cobro como pagado por otro medio), 'rejected-by-payer' (el pagador declaró que no pagará), 'marked-as-abuse' (el pagador declaró que no pagará y que el cobro fue no solicitado) y 'reversed' (el pago fue anulado por el comercio, el dinero fue devuelto al pagador).")
  @JsonProperty("status_detail")
  public String getStatusDetail() {
    return statusDetail;
  }
  public void setStatusDetail(String statusDetail) {
    this.statusDetail = statusDetail;
  }

  
  /**
   * Detalle del cobro
   **/
  @ApiModelProperty(value = "Detalle del cobro")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  
  /**
   * URL de cobro
   **/
  @ApiModelProperty(value = "URL de cobro")
  @JsonProperty("picture_url")
  public String getPictureUrl() {
    return pictureUrl;
  }
  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  
  /**
   * URL del comprobante de pago
   **/
  @ApiModelProperty(value = "URL del comprobante de pago")
  @JsonProperty("receipt_url")
  public String getReceiptUrl() {
    return receiptUrl;
  }
  public void setReceiptUrl(String receiptUrl) {
    this.receiptUrl = receiptUrl;
  }

  
  /**
   * URL donde se redirige al pagador luego que termina el pago
   **/
  @ApiModelProperty(value = "URL donde se redirige al pagador luego que termina el pago")
  @JsonProperty("return_url")
  public String getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  
  /**
   * URL donde se redirige al pagador luego de que desiste hacer el pago
   **/
  @ApiModelProperty(value = "URL donde se redirige al pagador luego de que desiste hacer el pago")
  @JsonProperty("cancel_url")
  public String getCancelUrl() {
    return cancelUrl;
  }
  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  
  /**
   * URL del webservice donde se notificará el pago
   **/
  @ApiModelProperty(value = "URL del webservice donde se notificará el pago")
  @JsonProperty("notify_url")
  public String getNotifyUrl() {
    return notifyUrl;
  }
  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }

  
  /**
   * Versión de la api de notificación
   **/
  @ApiModelProperty(value = "Versión de la api de notificación")
  @JsonProperty("notify_api_version")
  public String getNotifyApiVersion() {
    return notifyApiVersion;
  }
  public void setNotifyApiVersion(String notifyApiVersion) {
    this.notifyApiVersion = notifyApiVersion;
  }

  
  /**
   * Fecha de expiración del pago. En formato ISO-8601
   **/
  @ApiModelProperty(value = "Fecha de expiración del pago. En formato ISO-8601")
  @JsonProperty("expires_date")
  public Date getExpiresDate() {
    return expiresDate;
  }
  public void setExpiresDate(Date expiresDate) {
    this.expiresDate = expiresDate;
  }

  
  /**
   * URLs de archivos adjuntos al pago
   **/
  @ApiModelProperty(value = "URLs de archivos adjuntos al pago")
  @JsonProperty("attachment_urls")
  public List<String> getAttachmentUrls() {
    return attachmentUrls;
  }
  public void setAttachmentUrls(List<String> attachmentUrls) {
    this.attachmentUrls = attachmentUrls;
  }

  
  /**
   * Nombre del banco seleccionado por el pagador
   **/
  @ApiModelProperty(value = "Nombre del banco seleccionado por el pagador")
  @JsonProperty("bank")
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }

  
  /**
   * Identificador del banco seleccionado por el pagador
   **/
  @ApiModelProperty(value = "Identificador del banco seleccionado por el pagador")
  @JsonProperty("bank_id")
  public String getBankId() {
    return bankId;
  }
  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  
  /**
   * Nombre del pagador
   **/
  @ApiModelProperty(value = "Nombre del pagador")
  @JsonProperty("payer_name")
  public String getPayerName() {
    return payerName;
  }
  public void setPayerName(String payerName) {
    this.payerName = payerName;
  }

  
  /**
   * Correo electrónico del pagador
   **/
  @ApiModelProperty(value = "Correo electrónico del pagador")
  @JsonProperty("payer_email")
  public String getPayerEmail() {
    return payerEmail;
  }
  public void setPayerEmail(String payerEmail) {
    this.payerEmail = payerEmail;
  }

  
  /**
   * Identificador personal del pagador
   **/
  @ApiModelProperty(value = "Identificador personal del pagador")
  @JsonProperty("personal_identifier")
  public String getPersonalIdentifier() {
    return personalIdentifier;
  }
  public void setPersonalIdentifier(String personalIdentifier) {
    this.personalIdentifier = personalIdentifier;
  }

  
  /**
   * Número de cuenta bancaria del pagador
   **/
  @ApiModelProperty(value = "Número de cuenta bancaria del pagador")
  @JsonProperty("bank_account_number")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }
  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  
  /**
   * Es 'true' si la conciliación del pago fue hecha luego de la fecha de expiración
   **/
  @ApiModelProperty(value = "Es 'true' si la conciliación del pago fue hecha luego de la fecha de expiración")
  @JsonProperty("out_of_date_conciliation")
  public Boolean getOutOfDateConciliation() {
    return outOfDateConciliation;
  }
  public void setOutOfDateConciliation(Boolean outOfDateConciliation) {
    this.outOfDateConciliation = outOfDateConciliation;
  }

  
  /**
   * Identificador del pago asignado por el cobrador
   **/
  @ApiModelProperty(value = "Identificador del pago asignado por el cobrador")
  @JsonProperty("transaction_id")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   * Campo genérico que asigna el cobrador al momento de hacer el pago
   **/
  @ApiModelProperty(value = "Campo genérico que asigna el cobrador al momento de hacer el pago")
  @JsonProperty("custom")
  public String getCustom() {
    return custom;
  }
  public void setCustom(String custom) {
    this.custom = custom;
  }

  
  /**
   * Correo electrónico de la persona responsable del pago
   **/
  @ApiModelProperty(value = "Correo electrónico de la persona responsable del pago")
  @JsonProperty("responsible_user_email")
  public String getResponsibleUserEmail() {
    return responsibleUserEmail;
  }
  public void setResponsibleUserEmail(String responsibleUserEmail) {
    this.responsibleUserEmail = responsibleUserEmail;
  }

  
  /**
   * Es 'true' cuando este es un cobro por correo electrónico y khipu enviará recordatorios
   **/
  @ApiModelProperty(value = "Es 'true' cuando este es un cobro por correo electrónico y khipu enviará recordatorios")
  @JsonProperty("send_reminders")
  public Boolean getSendReminders() {
    return sendReminders;
  }
  public void setSendReminders(Boolean sendReminders) {
    this.sendReminders = sendReminders;
  }

  
  /**
   * Es 'true' cuando khipu enviará el cobro por correo electrónico
   **/
  @ApiModelProperty(value = "Es 'true' cuando khipu enviará el cobro por correo electrónico")
  @JsonProperty("send_email")
  public Boolean getSendEmail() {
    return sendEmail;
  }
  public void setSendEmail(Boolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  
  /**
   * Método de pago usado por el pagador, puede ser 'regular_transfer' (transferencia normal), 'simplified_transfer' (transferencia simplificada) o 'not_available' (para un pago marcado como realizado por otro medio por el cobrador).
   **/
  @ApiModelProperty(value = "Método de pago usado por el pagador, puede ser 'regular_transfer' (transferencia normal), 'simplified_transfer' (transferencia simplificada) o 'not_available' (para un pago marcado como realizado por otro medio por el cobrador).")
  @JsonProperty("payment_method")
  public String getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsResponse {\n");
    
    sb.append("    paymentId: ").append(StringUtil.toIndentedString(paymentId)).append("\n");
    sb.append("    paymentUrl: ").append(StringUtil.toIndentedString(paymentUrl)).append("\n");
    sb.append("    simplifiedTransferUrl: ").append(StringUtil.toIndentedString(simplifiedTransferUrl)).append("\n");
    sb.append("    transferUrl: ").append(StringUtil.toIndentedString(transferUrl)).append("\n");
    sb.append("    webpayUrl: ").append(StringUtil.toIndentedString(webpayUrl)).append("\n");
    sb.append("    hitesUrl: ").append(StringUtil.toIndentedString(hitesUrl)).append("\n");
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
    sb.append("    paymentMethod: ").append(StringUtil.toIndentedString(paymentMethod)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
