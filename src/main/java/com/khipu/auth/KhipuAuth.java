package com.khipu.auth;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.net.URLDecoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.khipu.ApiException;
import com.khipu.JSON;
import com.khipu.Pair;
import com.khipu.ApiClient;

public class KhipuAuth implements Authentication {

  private long receiverId;
  private String secret;
  private JSON json = new JSON();


  @Override
  public void applyToParams(ApiClient apiClient, String basePath, String path, String method, List<Pair> queryParams, Map<String, String> headerParams, Map<String, Object> formParams, Object body) {

    String toSign = method + "&" + percentEncode(basePath + unescapeString(path));

    Map<String, String> params = new HashMap<String, String>();
    for (Pair pair : queryParams) {
      params.put(pair.getName(), pair.getValue());
    }
    for (Map.Entry<String, Object> entry : formParams.entrySet()) {
      if (entry.getValue() instanceof Date) {
        params.put(entry.getKey(), apiClient.formatDate((Date) entry.getValue()));
      } else if (entry.getValue() instanceof List) {
        StringBuffer sb = new StringBuffer();
        for(Object object:((List)entry.getValue())){
          if (sb.length()>0){
            sb.append(",");
          }
          sb.append(object.toString());
        }
        params.put(entry.getKey(), sb.toString());
      } else {
        params.put(entry.getKey(), entry.getValue().toString());
      }
    }

    List<String> keys = new ArrayList<String>(params.keySet());
    Collections.sort(keys);

    for(String key : keys) {
      toSign += "&" + percentEncode(key) + "=" + percentEncode(params.get(key));
    }
    if (body!=null){
        try{
           toSign += "&"+json.serializeCanonical(body);
        }catch(ApiException e) {
           e.printStackTrace();
        }
    }
    String hmac = HmacSHA256(secret, toSign);
    headerParams.put("Authorization", receiverId + ":" + hmac);
  }

  public void setReceiverId(long receiverId) {
    this.receiverId = receiverId;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  private String HmacSHA256(String secret, String data) {
    try {
      if (secret == null || data == null) {
        return "";
      }
      SecretKeySpec secretKeySpec = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256");
      Mac mac = Mac.getInstance("HmacSHA256");
      mac.init(secretKeySpec);
      byte[] digest = mac.doFinal(data.getBytes("UTF-8"));
      return byteArrayToString(digest);
    } catch (Exception ignored) {
      throw new RuntimeException("Invalid key exception while converting to HMac SHA256");
    }
  }

  private String byteArrayToString(byte[] data) {
    BigInteger bigInteger = new BigInteger(1, data);
    String hash = bigInteger.toString(16);
    while (hash.length() < 64) {
      hash = "0" + hash;
    }
    return hash;
  }

  public static String unescapeString(String str) {
    try {
      return URLDecoder.decode(str.replaceAll("%20", "\\+"), "utf8");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }


  public static String percentEncode(String string) {
    if (string == null) {
      return "";
    }
    try {
      return URLEncoder.encode(string, "UTF-8")
          .replace("+", "%20")
          .replace("*", "%2A")
          .replace("%7E", "~");
    } catch (UnsupportedEncodingException wow) {
      throw new RuntimeException(wow.getMessage(), wow);
    }
  }
}
