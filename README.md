## Installation

Add maven dependency: _com.khipu:khipu-api-client:2.0_

## Usage

### Basic usage
```java
package test;

import com.khipu.api.client.PaymentApi;
import com.khipu.api.client.model.CreateResponse;

import java.math.BigDecimal;
import java.util.Calendar;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;

public class App
{
    public static void main( String[] args ) throws ApiException {
        ApiClient ac = new ApiClient();
        ac.setKhipuCredentials(1234l, "abc123");

        PaymentApi api = new PaymentApi();
        api.setApiClient(ac);

        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR, 1);

        CreateResponse resp = api.paymentsPost("Test de api", "CLP", new BigDecimal("1570"),
            null, null, null, null, null, null, null, null, null, c.getTime(), false, null, null, false, null, null);

        System.out.println("resp = " + api.paymentsIdGet(resp.getPaymentId()));
    }
}
```
