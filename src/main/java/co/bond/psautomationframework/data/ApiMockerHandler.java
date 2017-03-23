package co.bond.psautomationframework.data;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

/**
 * Created by mikearias on 3/23/17.
 */
public class ApiMockerHandler {
    public static void modifyPayload () {
        Client client = ClientBuilder.newClient();
        Entity payload = Entity.json("{\n" +
                "  \"url\": \"/api/v1.0/stationery-ordering/batches?status=10001\",\n" +
                "  \"method\": \"get\",\n" +
                "  \"response\": {\n" +
                "    \"statusCode\": 200,\n" +
                "    \"payload\": \"{\\\"total\\\":1221,\\\"per_page\\\":2,\\\"current_page\\\":1,\\\"last_page\\\":49,\\\"from\\\":1,\\\"to\\\":25,\\\"data\\\":{\\\"batches\\\":[{\\\"id\\\":\\\"35046\\\",\\\"order\\\":{\\\"name\\\":\\\"Marmoset Music (3%2F20%2F2017) - Mailing List - Internal - Hott 100 (2)\\\",\\\"link\\\":\\\"https://backoffice.bond.co/orders/217768\\\"},\\\"links\\\":{\\\"batch\\\":\\\"https://backoffice.bond.co/batches/order-restricted/35046\\\",\\\"pdf\\\":\\\"https://backoffice.bond.co/api/batches/order-restricted/35046/download/pdf\\\"}},{\\\"id\\\":\\\"35045\\\",\\\"order\\\":{\\\"name\\\":\\\"Marmoset Music (3%2F20%2F2017) - Mailing List - Internal - Hott 100 (2)\\\",\\\"link\\\":\\\"https://backoffice.bond.co/orders/217768\\\"},\\\"links\\\":{\\\"batch\\\":\\\"https://backoffice.bond.co/batches/order-restricted/35045\\\",\\\"pdf\\\":\\\"https://backoffice.bond.co/api/batches/order-restricted/35045/download/pdf\\\"}},{\\\"id\\\":\\\"35044\\\",\\\"order\\\":{\\\"name\\\":\\\"Marmoset Music (3%2F20%2F2017) - Mailing List - Internal - Hott 100 (2)\\\",\\\"link\\\":\\\"https://backoffice.bond.co/orders/217768\\\"},\\\"links\\\":{\\\"batch\\\":\\\"https://backoffice.bond.co/batches/order-restricted/35044\\\",\\\"pdf\\\":\\\"https://backoffice.bond.co/api/batches/order-restricted/35044/download/pdf\\\"}},{\\\"id\\\":\\\"35042\\\",\\\"links\\\":{\\\"batch\\\":\\\"https://backoffice.bond.co/batches/standard/35042\\\",\\\"pdf\\\":\\\"https://backoffice.bond.co/api/batches/standard/35042/download/pdf\\\"}}]},\\\"status\\\":\\\"success\\\"}\"\n" +
                "  }\n" +
                "}");
        Response response = client.target("https://apimocker.ps.bondco.io/_api/v1.0/b56ad34d-eeee-4a39-8e38-e656c2d2ee3c/requests/58d2ac7688cba100174f0a2d" )
                .request(MediaType.APPLICATION_JSON_TYPE)
                .put(payload);

        System.out.println("status: " + response.getStatus());
        System.out.println("headers: " + response.getHeaders());
        System.out.println("body:" + response.readEntity(String.class));
    }
}

