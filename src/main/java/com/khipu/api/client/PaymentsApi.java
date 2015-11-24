package com.khipu.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.api.model.PaymentsResponse;
import com.khipu.api.model.ServiceError;
import com.khipu.api.model.AuthorizationError;
import com.khipu.api.model.ValidationError;
import java.util.Date;
import com.khipu.api.model.PaymentsCreateResponse;
import com.khipu.api.model.SuccessResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-24T11:29:23.565-03:00")
public class PaymentsApi {
  private ApiClient apiClient;

  public PaymentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Obtener información de un pago
   * Información completa del pago. Datos con los que fue creado y el estado actual del pago. Se obtiene del notification_token que envia khipu cuando el pago es conciliado.
   * @param notificationToken Token de notifiación recibido usando la API de notificaiones 1.3 o superior.
   * @return PaymentsResponse
   */
  public PaymentsResponse paymentsGet (String notificationToken) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'notificationToken' is set
     if (notificationToken == null) {
        throw new ApiException(400, "Missing the required parameter 'notificationToken' when calling paymentsGet");
     }
     
    // create path and map variables
    String path = "/payments".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "notification_token", notificationToken));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    

    
    
    TypeRef returnType = new TypeRef<PaymentsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Crear un pago
   * Crea un pago en khipu y obtiene las URLs para redirección al usuario para que complete el pago.
   * @param subject Motivo
   * @param currency El código de moneda en formato ISO-4217
   * @param amount El monto del cobro. Sin separador de miles y usando &#39;.&#39; como separador de decimales. Hasta 4 lugares decimales, dependiendo de la moneda
   * @param transactionId Identificador propio de la  transacción. Ej: número de factura u orden de compra
   * @param custom Parámetro para enviar información personalizada de la transacción. Ej: documento XML con el detalle del carro de compra
   * @param body Descripción del cobro
   * @param bankId Identificador del banco para usar en el pago
   * @param returnUrl La dirección URL a donde enviar al cliente mientras el pago está siendo verificado
   * @param cancelUrl La dirección URL a donde enviar al cliente si decide no hacer hacer la transacción
   * @param pictureUrl Una dirección URL de una foto de tu producto o servicio
   * @param notifyUrl La dirección del web-service que utilizará khipu para notificar cuando el pago esté conciliado
   * @param notifyApiVersion Versión de la API de notifiaciones para recibir avisos por web-service
   * @param expiresDate Fecha de expiración del cobro. Pasada esta fecha el cobro es inválido. Formato ISO-8601. Ej: 2017-03-01T13:00:00Z
   * @param sendEmail Si es &#39;true&#39;, se enviará una solicitud de cobro al correo especificado en &#39;payer_email&#39;
   * @param payerName Nombre del pagador. Es obligatorio cuando send_email es &#39;true&#39;
   * @param payerEmail Correo del pagador. Es obligatorio cuando send_email es &#39;true&#39;
   * @param sendReminders Si es &#39;true&#39;, se enviarán recordatorios de cobro.
   * @param responsibleUserEmail Correo electrónico del responsable de este cobro, debe corresponder a un usuario khipu con permisos para cobrar usando esta cuenta de cobro
   * @param fixedPayerPersonalIdentifier Identificador personal. Si se especifica, solo podrá ser pagado usando ese identificador
   * @param integratorFee Comisión para el integrador. Sólo es válido si la cuenta de cobro tiene una cuenta de integrador asociada
   * @return PaymentsCreateResponse
   */
  public PaymentsCreateResponse paymentsPost (String subject, String currency, Double amount, String transactionId, String custom, String body, String bankId, String returnUrl, String cancelUrl, String pictureUrl, String notifyUrl, String notifyApiVersion, Date expiresDate, Boolean sendEmail, String payerName, String payerEmail, Boolean sendReminders, String responsibleUserEmail, String fixedPayerPersonalIdentifier, Double integratorFee) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'subject' is set
     if (subject == null) {
        throw new ApiException(400, "Missing the required parameter 'subject' when calling paymentsPost");
     }
     
     // verify the required parameter 'currency' is set
     if (currency == null) {
        throw new ApiException(400, "Missing the required parameter 'currency' when calling paymentsPost");
     }
     
     // verify the required parameter 'amount' is set
     if (amount == null) {
        throw new ApiException(400, "Missing the required parameter 'amount' when calling paymentsPost");
     }
     
    // create path and map variables
    String path = "/payments".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    if (subject != null)
      formParams.put("subject", subject);
    if (currency != null)
      formParams.put("currency", currency);
    if (amount != null)
      formParams.put("amount", amount);
    if (transactionId != null)
      formParams.put("transaction_id", transactionId);
    if (custom != null)
      formParams.put("custom", custom);
    if (body != null)
      formParams.put("body", body);
    if (bankId != null)
      formParams.put("bank_id", bankId);
    if (returnUrl != null)
      formParams.put("return_url", returnUrl);
    if (cancelUrl != null)
      formParams.put("cancel_url", cancelUrl);
    if (pictureUrl != null)
      formParams.put("picture_url", pictureUrl);
    if (notifyUrl != null)
      formParams.put("notify_url", notifyUrl);
    if (notifyApiVersion != null)
      formParams.put("notify_api_version", notifyApiVersion);
    if (expiresDate != null)
      formParams.put("expires_date", expiresDate);
    if (sendEmail != null)
      formParams.put("send_email", sendEmail);
    if (payerName != null)
      formParams.put("payer_name", payerName);
    if (payerEmail != null)
      formParams.put("payer_email", payerEmail);
    if (sendReminders != null)
      formParams.put("send_reminders", sendReminders);
    if (responsibleUserEmail != null)
      formParams.put("responsible_user_email", responsibleUserEmail);
    if (fixedPayerPersonalIdentifier != null)
      formParams.put("fixed_payer_personal_identifier", fixedPayerPersonalIdentifier);
    if (integratorFee != null)
      formParams.put("integrator_fee", integratorFee);
    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    

    
    
    TypeRef returnType = new TypeRef<PaymentsCreateResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Obtener información de un pago
   * Información completa del pago. Datos con los que fue creado y el estado actual del pago.
   * @param id Identificador del pago
   * @return PaymentsResponse
   */
  public PaymentsResponse paymentsIdGet (String id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling paymentsIdGet");
     }
     
    // create path and map variables
    String path = "/payments/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    

    
    
    TypeRef returnType = new TypeRef<PaymentsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Borrar un pago
   * Solo se pueden borrar pagos que estén pendientes de pagar. Esta operación no puede deshacerse.
   * @param id Identificador del pago
   * @return SuccessResponse
   */
  public SuccessResponse paymentsIdDelete (String id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling paymentsIdDelete");
     }
     
    // create path and map variables
    String path = "/payments/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    

    
    
    TypeRef returnType = new TypeRef<SuccessResponse>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Reembolsar un pago
   * Reembolsa el total del monto del pago. Esta operación solo se puede realizar en los comercios que recauden en cuenta khipu y antes de la rendición de los fondos correspondientes.
   * @param id Identificador del pago
   * @return SuccessResponse
   */
  public SuccessResponse paymentsIdRefundsPost (String id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling paymentsIdRefundsPost");
     }
     
    // create path and map variables
    String path = "/payments/{id}/refunds".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    

    
    
    TypeRef returnType = new TypeRef<SuccessResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
