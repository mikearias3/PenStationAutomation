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
    public static void modifyPayload (String batchSet) {
        Client client = ClientBuilder.newClient();
        Entity payload = Entity.json(batchSet);
        Response response = client.target("https://apimocker.ps.bondco.io/_api/v1.0/b56ad34d-eeee-4a39-8e38-e656c2d2ee3c/requests/58d2ac7688cba100174f0a2d" )
                .request(MediaType.APPLICATION_JSON_TYPE)
                .put(payload);

        System.out.println("status: " + response.getStatus());
        System.out.println("headers: " + response.getHeaders());
        System.out.println("body:" + response.readEntity(String.class));
    }
}

