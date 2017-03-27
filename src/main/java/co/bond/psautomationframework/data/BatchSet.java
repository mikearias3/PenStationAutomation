package co.bond.psautomationframework.data;

/**
 * Created by mikearias on 3/27/17.
 */
public class BatchSet {
    public static String fullBatchSet = "{\n" +
            "    \"url\" : \"/api/v1.0/stationery-ordering/batches?status=10001\",\n" +
            "    \"method\" : \"get\",\n" +
            "    \"response\" : {\n" +
            "        \"statusCode\" : 200,\n" +
            "        \"payload\" : \"{\\\"total\\\":1221,\\\"per_page\\\":25,\\\"current_page\\\":1,\\\"last_page\\\":49,\\\"from\\\":1,\\\"to\\\":25,\\\"data\\\":{\\\"batches\\\":[{\\\"id\\\":\\\"35046\\\",\\\"order\\\":{\\\"name\\\":\\\"Marmoset Music (3%2F20%2F2017) - Mailing List - Internal - Hott 100 (2)\\\",\\\"link\\\":\\\"https://backoffice.bond.co/orders/217768\\\"},\\\"links\\\":{\\\"batch\\\":\\\"https://backoffice.bond.co/batches/order-restricted/35046\\\",\\\"pdf\\\":\\\"https://backoffice.bond.co/api/batches/order-restricted/35046/download/pdf\\\"}},{\\\"id\\\":\\\"35045\\\",\\\"order\\\":{\\\"name\\\":\\\"Marmoset Music (3%2F20%2F2017) - Mailing List - Internal - Hott 100 (2)\\\",\\\"link\\\":\\\"https://backoffice.bond.co/orders/217768\\\"},\\\"links\\\":{\\\"batch\\\":\\\"https://backoffice.bond.co/batches/order-restricted/35045\\\",\\\"pdf\\\":\\\"https://backoffice.bond.co/api/batches/order-restricted/35045/download/pdf\\\"}},{\\\"id\\\":\\\"35044\\\",\\\"order\\\":{\\\"name\\\":\\\"Marmoset Music (3%2F20%2F2017) - Mailing List - Internal - Hott 100 (2)\\\",\\\"link\\\":\\\"https://backoffice.bond.co/orders/217768\\\"},\\\"links\\\":{\\\"batch\\\":\\\"https://backoffice.bond.co/batches/order-restricted/35044\\\",\\\"pdf\\\":\\\"https://backoffice.bond.co/api/batches/order-restricted/35044/download/pdf\\\"}},{\\\"id\\\":\\\"35042\\\",\\\"links\\\":{\\\"batch\\\":\\\"https://backoffice.bond.co/batches/standard/35042\\\",\\\"pdf\\\":\\\"https://backoffice.bond.co/api/batches/standard/35042/download/pdf\\\"}}]},\\\"status\\\":\\\"success\\\"}\"\n" +
            "    }\n" +
            "}";
    public static String emptyBatchSet = "{\n" +
            "  \"url\": \"/api/v1.0/stationery-ordering/batches?status=10001\",\n" +
            "  \"method\": \"get\",\n" +
            "  \"response\": {\n" +
            "    \"statusCode\": 200,\n" +
            "    \"payload\": \"{\\\"total\\\":1221,\\\"per_page\\\":15,\\\"current_page\\\":1,\\\"last_page\\\":49,\\\"from\\\":1,\\\"to\\\":25,\\\"data\\\":{\\\"batches\\\":[]},\\\"status\\\":\\\"success\\\"}\"\n" +
            "  }\n" +
            "}";
}
