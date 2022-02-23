package com.cartoncloud.assignment.calculatorapi.calculatorapi.client;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;


@Service
public class PurchaseOrdersServiceImpl implements  PurchaseOrdersService{


    @Autowired
    private RestTemplate restTemplate;



    @Override
    public List<PurchaseOrder> getOrderDetails(List<Integer> orderIds) {
        String url = "https://api.cartoncloud.com.au/CartonCloud_Demo/PurchaseOrders/{id}";
        List<PurchaseOrder> orderList = new ArrayList<>();
        restTemplate.getInterceptors()
                .add(new BasicAuthorizationInterceptor("interview-test@cartoncloud.com.au", "test123456"));
        for (Integer orderId : orderIds) {

            // URI (URL) parameters
            Map<String, Integer> uriParams = new HashMap<>();
            uriParams.put("id", orderId);

            // Query parameters
            UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                    // Add query parameter
                    .queryParam("version", "5").queryParam("associated", "true");
            String uri = builder.buildAndExpand(uriParams).toUri().toString();

            HttpHeaders headers = setHeaders();
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            System.out.println(uri);

            ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);

            ObjectMapper mapper = new ObjectMapper();
            PurchaseOrder purchaseOrder = null;

            try {
                // Convert JSON string to Object
                purchaseOrder = mapper.readValue(result.getBody(), PurchaseOrder.class);
                orderList.add(purchaseOrder);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return orderList;
    }

    private HttpHeaders setHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
