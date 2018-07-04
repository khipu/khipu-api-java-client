package com.khipu.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.api.model.ServiceError;
import com.khipu.api.model.BanksResponse;
import com.khipu.api.model.ValidationError;
import com.khipu.api.model.AuthorizationError;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-04T15:34:43.055-04:00")
public class BanksApi {
  private ApiClient apiClient;

  public BanksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BanksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Obtener listado de bancos
   * Obtiene el listado de bancos que pueden usarse para pagar a esta cuenta de cobro.
   * @param options Mapa de parámetros opcionales
   * @return BanksResponse
   */
  public BanksResponse banksGet ( Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/banks".replaceAll("\\{format\\}","json");

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

    
    TypeRef returnType = new TypeRef<BanksResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  


  
  /**
  * Obtener listado de bancos
  * Obtiene el listado de bancos que pueden usarse para pagar a esta cuenta de cobro.
  * @return BanksResponse
  */
  public BanksResponse banksGet () throws ApiException {
    return banksGet(null);
    
  }
  

}
