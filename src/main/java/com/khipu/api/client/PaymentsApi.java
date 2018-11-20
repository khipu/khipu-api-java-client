package com.khipu.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.api.model.ServiceError;
import com.khipu.api.model.PaymentsResponse;
import com.khipu.api.model.ValidationError;
import com.khipu.api.model.AuthorizationError;
import com.khipu.api.model.PaymentsCreateResponse;
import java.util.Date;
import com.khipu.api.model.SuccessResponse;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
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
   * @param options Mapa de parámetros opcionales
   * @return PaymentsResponse
   */
  public PaymentsResponse paymentsGet (String notificationToken,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
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
    

    if(options != null) {
        
    }


    

    if(options != null) {
        
    }


    

    if(options != null) {
      
    }

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
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Crear un pago
   * Crea un pago en khipu y obtiene las URLs para redirección al usuario para que complete el pago.
   * @param subject Motivo
   * @param currency El código de moneda en formato ISO-4217
   * @param amount El monto del cobro. Sin separador de miles y usando &#39;.&#39; como separador de decimales. Hasta 4 lugares decimales, dependiendo de la moneda
   * @param options Mapa de parámetros opcionales
   * - transactionId Identificador propio de la  transacción. Ej: número de factura u orden de compra
   * - custom Parámetro para enviar información personalizada de la transacción. Ej: documento XML con el detalle del carro de compra
   * - body Descripción del cobro
   * - bankId Identificador del banco para usar en el pago
   * - returnUrl La dirección URL a donde enviar al cliente mientras el pago está siendo verificado
   * - cancelUrl La dirección URL a donde enviar al cliente si decide no hacer hacer la transacción
   * - pictureUrl Una dirección URL de una foto de tu producto o servicio
   * - notifyUrl La dirección del web-service que utilizará khipu para notificar cuando el pago esté conciliado
   * - contractUrl La dirección URL del archivo PDF con el contrato a firmar mediante este pago. El cobrador debe estar habilitado para este servicio y el campo &#39;fixed_payer_personal_identifier&#39; es obgligatorio
   * - notifyApiVersion Versión de la API de notifiaciones para recibir avisos por web-service
   * - expiresDate Fecha de expiración del cobro. Pasada esta fecha el cobro es inválido. Formato ISO-8601. Ej: 2017-03-01T13:00:00Z
   * - sendEmail Si es &#39;true&#39;, se enviará una solicitud de cobro al correo especificado en &#39;payer_email&#39;
   * - payerName Nombre del pagador. Es obligatorio cuando send_email es &#39;true&#39;
   * - payerEmail Correo del pagador. Es obligatorio cuando send_email es &#39;true&#39;
   * - sendReminders Si es &#39;true&#39;, se enviarán recordatorios de cobro.
   * - responsibleUserEmail Correo electrónico del responsable de este cobro, debe corresponder a un usuario khipu con permisos para cobrar usando esta cuenta de cobro
   * - fixedPayerPersonalIdentifier Identificador personal. Si se especifica, solo podrá ser pagado usando ese identificador
   * - integratorFee Comisión para el integrador. Sólo es válido si la cuenta de cobro tiene una cuenta de integrador asociada
   * - collectAccountUuid Para cuentas de cobro con más cuenta propia. Permite elegir la cuenta donde debe ocurrir la transferencia.
   * - confirmTimeoutDate Fecha de rendición del cobro. Es también la fecha final para poder reembolsar el cobro. Formato ISO-8601. Ej: 2017-03-01T13:00:00Z
   * - mandatoryPaymentMethod Si se especifica, el cobro sólo se podrá pagar utilizando ese medio de pago. El valor para el campo de obtiene consultando el endpoint &#39;Consulta medios de pago disponibles&#39;.
   * @return PaymentsCreateResponse
   */
  public PaymentsCreateResponse paymentsPost (String subject, String currency, Double amount,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
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

    

    if(options != null) {
        
    }


    

    if(options != null) {
        
    }


    formParams.put("subject", subject);
    formParams.put("currency", currency);
    formParams.put("amount", amount);
    

    if(options != null) {
      if(options.containsKey("transactionId") && options.get("transactionId") != null)
        formParams.put("transaction_id", options.get("transactionId"));

      if(options.containsKey("custom") && options.get("custom") != null)
        formParams.put("custom", options.get("custom"));

      if(options.containsKey("body") && options.get("body") != null)
        formParams.put("body", options.get("body"));

      if(options.containsKey("bankId") && options.get("bankId") != null)
        formParams.put("bank_id", options.get("bankId"));

      if(options.containsKey("returnUrl") && options.get("returnUrl") != null)
        formParams.put("return_url", options.get("returnUrl"));

      if(options.containsKey("cancelUrl") && options.get("cancelUrl") != null)
        formParams.put("cancel_url", options.get("cancelUrl"));

      if(options.containsKey("pictureUrl") && options.get("pictureUrl") != null)
        formParams.put("picture_url", options.get("pictureUrl"));

      if(options.containsKey("notifyUrl") && options.get("notifyUrl") != null)
        formParams.put("notify_url", options.get("notifyUrl"));

      if(options.containsKey("contractUrl") && options.get("contractUrl") != null)
        formParams.put("contract_url", options.get("contractUrl"));

      if(options.containsKey("notifyApiVersion") && options.get("notifyApiVersion") != null)
        formParams.put("notify_api_version", options.get("notifyApiVersion"));

      if(options.containsKey("expiresDate") && options.get("expiresDate") != null)
        formParams.put("expires_date", options.get("expiresDate"));

      if(options.containsKey("sendEmail") && options.get("sendEmail") != null)
        formParams.put("send_email", options.get("sendEmail"));

      if(options.containsKey("payerName") && options.get("payerName") != null)
        formParams.put("payer_name", options.get("payerName"));

      if(options.containsKey("payerEmail") && options.get("payerEmail") != null)
        formParams.put("payer_email", options.get("payerEmail"));

      if(options.containsKey("sendReminders") && options.get("sendReminders") != null)
        formParams.put("send_reminders", options.get("sendReminders"));

      if(options.containsKey("responsibleUserEmail") && options.get("responsibleUserEmail") != null)
        formParams.put("responsible_user_email", options.get("responsibleUserEmail"));

      if(options.containsKey("fixedPayerPersonalIdentifier") && options.get("fixedPayerPersonalIdentifier") != null)
        formParams.put("fixed_payer_personal_identifier", options.get("fixedPayerPersonalIdentifier"));

      if(options.containsKey("integratorFee") && options.get("integratorFee") != null)
        formParams.put("integrator_fee", options.get("integratorFee"));

      if(options.containsKey("collectAccountUuid") && options.get("collectAccountUuid") != null)
        formParams.put("collect_account_uuid", options.get("collectAccountUuid"));

      if(options.containsKey("confirmTimeoutDate") && options.get("confirmTimeoutDate") != null)
        formParams.put("confirm_timeout_date", options.get("confirmTimeoutDate"));

      if(options.containsKey("mandatoryPaymentMethod") && options.get("mandatoryPaymentMethod") != null)
        formParams.put("mandatory_payment_method", options.get("mandatoryPaymentMethod"));

      
    }

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Obtener información de un pago
   * Información completa del pago. Datos con los que fue creado y el estado actual del pago.
   * @param id Identificador del pago
   * @param options Mapa de parámetros opcionales
   * @return PaymentsResponse
   */
  public PaymentsResponse paymentsIdGet (String id,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
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

    

    if(options != null) {
        
    }


    

    if(options != null) {
        
    }


    

    if(options != null) {
      
    }

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
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Borrar un pago
   * Solo se pueden borrar pagos que estén pendientes de pagar. Esta operación no puede deshacerse.
   * @param id Identificador del pago
   * @param options Mapa de parámetros opcionales
   * @return SuccessResponse
   */
  public SuccessResponse paymentsIdDelete (String id,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
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

    

    if(options != null) {
        
    }


    

    if(options != null) {
        
    }


    

    if(options != null) {
      
    }

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
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Confirmar el pago.
   * Al confirmar el pago, este será rendido al día siguiente.
   * @param id Identificador del pago
   * @param options Mapa de parámetros opcionales
   * @return SuccessResponse
   */
  public SuccessResponse paymentsIdConfirmPost (String id,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling paymentsIdConfirmPost");
    }
    
    // create path and map variables
    String path = "/payments/{id}/confirm".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if(options != null) {
        
    }


    

    if(options != null) {
        
    }


    

    if(options != null) {
      
    }

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Reembolsar total o parcialmente un pago
   * Reembolsa total o parcialmente el monto de un pago. Esta operación solo se puede realizar en los comercios que recauden en cuenta khipu y antes de la rendición de los fondos correspondientes.
   * @param id Identificador del pago
   * @param options Mapa de parámetros opcionales
   * - amount El monto a devolver. Sin separador de miles y usando &#39;.&#39; como separador de decimales. Hasta 4 lugares decimales, dependiendo de la moneda. Si se omite el reembolso se hará por el total del monto del pago.
   * @return SuccessResponse
   */
  public SuccessResponse paymentsIdRefundsPost (String id,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
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

    

    if(options != null) {
        
    }


    

    if(options != null) {
        
    }


    

    if(options != null) {
      if(options.containsKey("amount") && options.get("amount") != null)
        formParams.put("amount", options.get("amount"));

      
    }

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  


  
  /**
  * Obtener información de un pago
  * Información completa del pago. Datos con los que fue creado y el estado actual del pago. Se obtiene del notification_token que envia khipu cuando el pago es conciliado.
  * @param notificationToken Token de notifiación recibido usando la API de notificaiones 1.3 o superior.
  * @return PaymentsResponse
  */
  public PaymentsResponse paymentsGet (String notificationToken) throws ApiException {
    return paymentsGet(notificationToken, null);
    
  }
  
  /**
  * Crear un pago
  * Crea un pago en khipu y obtiene las URLs para redirección al usuario para que complete el pago.
  * @param subject Motivo
  * @param currency El código de moneda en formato ISO-4217
  * @param amount El monto del cobro. Sin separador de miles y usando &#39;.&#39; como separador de decimales. Hasta 4 lugares decimales, dependiendo de la moneda
  * @return PaymentsCreateResponse
  */
  public PaymentsCreateResponse paymentsPost (String subject, String currency, Double amount) throws ApiException {
    return paymentsPost(subject, currency, amount, null);
    
  }
  
  /**
  * Obtener información de un pago
  * Información completa del pago. Datos con los que fue creado y el estado actual del pago.
  * @param id Identificador del pago
  * @return PaymentsResponse
  */
  public PaymentsResponse paymentsIdGet (String id) throws ApiException {
    return paymentsIdGet(id, null);
    
  }
  
  /**
  * Borrar un pago
  * Solo se pueden borrar pagos que estén pendientes de pagar. Esta operación no puede deshacerse.
  * @param id Identificador del pago
  * @return SuccessResponse
  */
  public SuccessResponse paymentsIdDelete (String id) throws ApiException {
    return paymentsIdDelete(id, null);
    
  }
  
  /**
  * Confirmar el pago.
  * Al confirmar el pago, este será rendido al día siguiente.
  * @param id Identificador del pago
  * @return SuccessResponse
  */
  public SuccessResponse paymentsIdConfirmPost (String id) throws ApiException {
    return paymentsIdConfirmPost(id, null);
    
  }
  
  /**
  * Reembolsar total o parcialmente un pago
  * Reembolsa total o parcialmente el monto de un pago. Esta operación solo se puede realizar en los comercios que recauden en cuenta khipu y antes de la rendición de los fondos correspondientes.
  * @param id Identificador del pago
  * @return SuccessResponse
  */
  public SuccessResponse paymentsIdRefundsPost (String id) throws ApiException {
    return paymentsIdRefundsPost(id, null);
    
  }
  

}
