package com.cartoncloud.assignment.calculatorapi.calculatorapi.client;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.resilience4j.ratelimiter.RateLimiter;
import io.github.resilience4j.ratelimiter.RateLimiterConfig;
import io.github.resilience4j.reactor.ratelimiter.operator.RateLimiterOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.ExchangeFilterFunctions;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Flux;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;


@Service
public class PurchaseOrdersServiceImpl implements  PurchaseOrdersService{




    @Override
    public List<PurchaseOrder> getOrderDetails(List<Integer> orderIds) {
        String CARTON_API_BASE_URL = "https://api.cartoncloud.com.au/CartonCloud_Demo/PurchaseOrders/{id}";
        List<PurchaseOrder> orderList = new ArrayList<>();

        RateLimiter rateLimiter = RateLimiter.of("my-rate-limiter",
                RateLimiterConfig.custom()
                        .limitRefreshPeriod(Duration.ofSeconds(5))
                        .limitForPeriod(50)
                        .timeoutDuration(Duration.ofMinutes(2)) // max wait time for a request, if reached then error
                        .build());

        for (Integer orderId : orderIds) {
            Map<String, Integer> uriParams = new HashMap<>();
            uriParams.put("id", orderId);

            // Query parameters
            UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(CARTON_API_BASE_URL)
                    // Add query parameter
                    .queryParam("version", "5").queryParam("associated", "true");
            String uri = builder.buildAndExpand(uriParams).toUri().toString();


            
            WebClient webClient = WebClient.builder()
                    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON.toString())
                    .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON.toString())
                    .baseUrl(uri)
                             .filter(ExchangeFilterFunctions
                            .basicAuthentication("interview-test@cartoncloud.com.au"
                                    , "test123456"))
                    .build();

            Flux<PurchaseOrder> purchaseOrder = webClient.get()
                    .retrieve()
                    .bodyToFlux(PurchaseOrder.class)
                    .transformDeferred(RateLimiterOperator.of(rateLimiter));

            orderList.add(purchaseOrder.blockFirst());
        }

        return orderList;
    }
}
