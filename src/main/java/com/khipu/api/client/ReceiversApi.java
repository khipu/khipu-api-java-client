package com.khipu.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.api.model.ServiceError;
import com.khipu.api.model.ReceiversCreateResponse;
import com.khipu.api.model.ValidationError;
import com.khipu.api.model.AuthorizationError;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-12T11:53:13.728-03:00")
public class ReceiversApi {
  private ApiClient apiClient;

  public ReceiversApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReceiversApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Crear una nueva cuenta de cobro
   * Crear una nueva cuenta de cobro asociada a un integrador. Necesita datos de la cuenta de usuario asociada, datos de facturación y datos de contacto.
   * @param adminFirstName Nombre de pila del administrador de la cuenta de cobro a crear.
   * @param adminLastName Apellido del administrador de la cuenta de cobro a crear.
   * @param adminEmail Correo electrónico del administrador de la cuenta de cobro a crear.
   * @param countryCode Código alfanumérico de dos caractéres ISO 3166-1 del país de la cuenta de cobro a crear.
   * @param businessIdentifier Identificador tributario del cobrador asociado a la cuenta de cobro a crear.
   * @param businessCategory Categoría tributaria o rubro tributario del cobrador asociado a la cuenta de cobro a crear.
   * @param businessName Nombre tributario del cobrador asociado a la cuenta de cobro a crear.
   * @param businessPhone Teléfono del cobrador asociado a la cuenta de cobro a crear.
   * @param businessAddressLine1 Dirección del cobrador de la cuenta de cobro a crear.
   * @param businessAddressLine2 Segunda línea de la dirección del cobrador de la cuenta de cobro a crear.
   * @param businessAddressLine3 Tercera línea de la dirección del cobrador de la cuenta de cobro a crear.
   * @param contactFullName Nombre del contacto del cobrador.
   * @param contactJobTitle Cargo del contacto del cobrador.
   * @param contactEmail Correo electrónico del contacto del cobrador.
   * @param contactPhone Teléfono del contacto del cobrador.
   * @param options Mapa de parámetros opcionales
   * - bankAccountBankId Identificador del banco.
   * - bankAccountIdentifier Identificador personal del dueño de la cuenta de banco.
   * - bankAccountName Nombre de la cuenta de banco.
   * - bankAccountNumber Número de la cuenta en el banco.
   * - notifyUrl URL por omisión para el webservice donde se notificará el pago.
   * - renditionUrl URL para el webservice donde se notificará la rendición.
   * @return ReceiversCreateResponse
   */
  public ReceiversCreateResponse receiversPost (String adminFirstName, String adminLastName, String adminEmail, String countryCode, String businessIdentifier, String businessCategory, String businessName, String businessPhone, String businessAddressLine1, String businessAddressLine2, String businessAddressLine3, String contactFullName, String contactJobTitle, String contactEmail, String contactPhone,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'adminFirstName' is set
    if (adminFirstName == null) {
      throw new ApiException(400, "Missing the required parameter 'adminFirstName' when calling receiversPost");
    }
    
    // verify the required parameter 'adminLastName' is set
    if (adminLastName == null) {
      throw new ApiException(400, "Missing the required parameter 'adminLastName' when calling receiversPost");
    }
    
    // verify the required parameter 'adminEmail' is set
    if (adminEmail == null) {
      throw new ApiException(400, "Missing the required parameter 'adminEmail' when calling receiversPost");
    }
    
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCode' when calling receiversPost");
    }
    
    // verify the required parameter 'businessIdentifier' is set
    if (businessIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'businessIdentifier' when calling receiversPost");
    }
    
    // verify the required parameter 'businessCategory' is set
    if (businessCategory == null) {
      throw new ApiException(400, "Missing the required parameter 'businessCategory' when calling receiversPost");
    }
    
    // verify the required parameter 'businessName' is set
    if (businessName == null) {
      throw new ApiException(400, "Missing the required parameter 'businessName' when calling receiversPost");
    }
    
    // verify the required parameter 'businessPhone' is set
    if (businessPhone == null) {
      throw new ApiException(400, "Missing the required parameter 'businessPhone' when calling receiversPost");
    }
    
    // verify the required parameter 'businessAddressLine1' is set
    if (businessAddressLine1 == null) {
      throw new ApiException(400, "Missing the required parameter 'businessAddressLine1' when calling receiversPost");
    }
    
    // verify the required parameter 'businessAddressLine2' is set
    if (businessAddressLine2 == null) {
      throw new ApiException(400, "Missing the required parameter 'businessAddressLine2' when calling receiversPost");
    }
    
    // verify the required parameter 'businessAddressLine3' is set
    if (businessAddressLine3 == null) {
      throw new ApiException(400, "Missing the required parameter 'businessAddressLine3' when calling receiversPost");
    }
    
    // verify the required parameter 'contactFullName' is set
    if (contactFullName == null) {
      throw new ApiException(400, "Missing the required parameter 'contactFullName' when calling receiversPost");
    }
    
    // verify the required parameter 'contactJobTitle' is set
    if (contactJobTitle == null) {
      throw new ApiException(400, "Missing the required parameter 'contactJobTitle' when calling receiversPost");
    }
    
    // verify the required parameter 'contactEmail' is set
    if (contactEmail == null) {
      throw new ApiException(400, "Missing the required parameter 'contactEmail' when calling receiversPost");
    }
    
    // verify the required parameter 'contactPhone' is set
    if (contactPhone == null) {
      throw new ApiException(400, "Missing the required parameter 'contactPhone' when calling receiversPost");
    }
    
    // create path and map variables
    String path = "/receivers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if(options != null) {
        
    }


    

    if(options != null) {
        
    }


    formParams.put("admin_first_name", adminFirstName);
    formParams.put("admin_last_name", adminLastName);
    formParams.put("admin_email", adminEmail);
    formParams.put("country_code", countryCode);
    formParams.put("business_identifier", businessIdentifier);
    formParams.put("business_category", businessCategory);
    formParams.put("business_name", businessName);
    formParams.put("business_phone", businessPhone);
    formParams.put("business_address_line_1", businessAddressLine1);
    formParams.put("business_address_line_2", businessAddressLine2);
    formParams.put("business_address_line_3", businessAddressLine3);
    formParams.put("contact_full_name", contactFullName);
    formParams.put("contact_job_title", contactJobTitle);
    formParams.put("contact_email", contactEmail);
    formParams.put("contact_phone", contactPhone);
    

    if(options != null) {
      if(options.containsKey("bankAccountBankId") && options.get("bankAccountBankId") != null)
        formParams.put("bank_account_bank_id", options.get("bankAccountBankId"));

      if(options.containsKey("bankAccountIdentifier") && options.get("bankAccountIdentifier") != null)
        formParams.put("bank_account_identifier", options.get("bankAccountIdentifier"));

      if(options.containsKey("bankAccountName") && options.get("bankAccountName") != null)
        formParams.put("bank_account_name", options.get("bankAccountName"));

      if(options.containsKey("bankAccountNumber") && options.get("bankAccountNumber") != null)
        formParams.put("bank_account_number", options.get("bankAccountNumber"));

      if(options.containsKey("notifyUrl") && options.get("notifyUrl") != null)
        formParams.put("notify_url", options.get("notifyUrl"));

      if(options.containsKey("renditionUrl") && options.get("renditionUrl") != null)
        formParams.put("rendition_url", options.get("renditionUrl"));

      
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    TypeRef returnType = new TypeRef<ReceiversCreateResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  


  
  /**
  * Crear una nueva cuenta de cobro
  * Crear una nueva cuenta de cobro asociada a un integrador. Necesita datos de la cuenta de usuario asociada, datos de facturación y datos de contacto.
  * @param adminFirstName Nombre de pila del administrador de la cuenta de cobro a crear.
  * @param adminLastName Apellido del administrador de la cuenta de cobro a crear.
  * @param adminEmail Correo electrónico del administrador de la cuenta de cobro a crear.
  * @param countryCode Código alfanumérico de dos caractéres ISO 3166-1 del país de la cuenta de cobro a crear.
  * @param businessIdentifier Identificador tributario del cobrador asociado a la cuenta de cobro a crear.
  * @param businessCategory Categoría tributaria o rubro tributario del cobrador asociado a la cuenta de cobro a crear.
  * @param businessName Nombre tributario del cobrador asociado a la cuenta de cobro a crear.
  * @param businessPhone Teléfono del cobrador asociado a la cuenta de cobro a crear.
  * @param businessAddressLine1 Dirección del cobrador de la cuenta de cobro a crear.
  * @param businessAddressLine2 Segunda línea de la dirección del cobrador de la cuenta de cobro a crear.
  * @param businessAddressLine3 Tercera línea de la dirección del cobrador de la cuenta de cobro a crear.
  * @param contactFullName Nombre del contacto del cobrador.
  * @param contactJobTitle Cargo del contacto del cobrador.
  * @param contactEmail Correo electrónico del contacto del cobrador.
  * @param contactPhone Teléfono del contacto del cobrador.
  * @return ReceiversCreateResponse
  */
  public ReceiversCreateResponse receiversPost (String adminFirstName, String adminLastName, String adminEmail, String countryCode, String businessIdentifier, String businessCategory, String businessName, String businessPhone, String businessAddressLine1, String businessAddressLine2, String businessAddressLine3, String contactFullName, String contactJobTitle, String contactEmail, String contactPhone) throws ApiException {
    return receiversPost(adminFirstName, adminLastName, adminEmail, countryCode, businessIdentifier, businessCategory, businessName, businessPhone, businessAddressLine1, businessAddressLine2, businessAddressLine3, contactFullName, contactJobTitle, contactEmail, contactPhone, null);
    
  }
  

}
