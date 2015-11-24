package com.khipu.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.api.model.BanksResponse;
import com.khipu.api.model.ServiceError;
import com.khipu.api.model.AuthorizationError;
import com.khipu.api.model.ValidationError;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-24T11:29:23.565-03:00")
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
   * @return BanksResponse
   */
  public BanksResponse banksGet () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/banks".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<BanksResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
