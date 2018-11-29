package com.khipu.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.api.model.ServiceError;
import com.khipu.api.model.ValidationError;
import com.khipu.api.model.PaymentMethodsResponse;
import com.khipu.api.model.AuthorizationError;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PaymentMethodsApi {
  private ApiClient apiClient;

  public PaymentMethodsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentMethodsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Obtener listado de medios de pago disponible para una cuenta de cobrador
   * Obtiene el listado de medios de pago que pueden usarse para pagar a esta cuenta de cobro.
   * @param id Identificador del merchant
   * @param options Mapa de par��metros opcionales
   * @return PaymentMethodsResponse
   */
  public PaymentMethodsResponse merchantsIdPaymentMethodsGet (String id,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling merchantsIdPaymentMethodsGet");
    }
    
    // create path and map variables
    String path = "/merchants/{id}/paymentMethods".replaceAll("\\{format\\}","json")
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

    
    TypeRef returnType = new TypeRef<PaymentMethodsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  


  
  /**
  * Obtener listado de medios de pago disponible para una cuenta de cobrador
  * Obtiene el listado de medios de pago que pueden usarse para pagar a esta cuenta de cobro.
  * @param id Identificador del merchant
  * @return PaymentMethodsResponse
  */
  public PaymentMethodsResponse merchantsIdPaymentMethodsGet (String id) throws ApiException {
    return merchantsIdPaymentMethodsGet(id, null);
    
  }
  

}
