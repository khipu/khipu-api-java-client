## Installation

Add maven dependency: _com.khipu:khipu-api-client:2.8.1.7_

## Usage

### Basic usage
```java
package test;

import com.khipu.api.client.PaymentsApi;
import com.khipu.api.model.PaymentsCreateResponse;

import java.math.BigDecimal;
import java.util.Calendar;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;

public class App
{
    public static void main( String[] args ) throws ApiException {
		ApiClient apiClient = new ApiClient();
		apiClient.setKhipuCredentials(1234l, "abc123");
		PaymentsApi paymentsApi = new PaymentsApi();
		paymentsApi.setApiClient(apiClient);


		Map<String, Object> options = new HashMap<>();
		options.put("transactionId", "MTI-100");
		options.put("returnUrl", "http://mi-ecomerce.com/backend/return");
		options.put("cancelUrl", "http://mi-ecomerce.com/backend/cancel");
		options.put("pictureUrl", "http://mi-ecomerce.com/pictures/foto-producto.jpg");
		options.put("apiVersion", "1.3");

		PaymentsCreateResponse response = paymentsApi.paymentsPost("Compra de prueba de la API" //Motivo de la compra
				, "CLP" //Moneda
				, 100.0 //Monto
				, options
		);
        System.out.println("resp = " + api.paymentsIdGet(response.getPaymentId()));
    }
}
```
