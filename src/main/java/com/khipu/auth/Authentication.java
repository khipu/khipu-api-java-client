package com.khipu.auth;

import com.khipu.Pair;
import com.khipu.ApiClient;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-13T12:16:49.253-03:00")
public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(ApiClient apiClient, String basePath, String path, String method, List<Pair> queryParams, Map<String, String> headerParams, Map<String, Object> formParams);
}
