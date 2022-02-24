package com.cartoncloud.assignment.calculatorapi.calculatorapi.controller;


import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrderRequest;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProductController {


    private OrderService orderService;

    public ProductController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/test")
    public ResponseEntity<Map<String, Object>> calculateOrderTotal(
            @RequestBody PurchaseOrderRequest request) {
        var orderIds = request.getPurchaseOrderIds();

        var orderGroupTotal = orderService.calculateOrderTotal(orderIds);
        return new ResponseEntity<>(Map.of("result", orderGroupTotal), HttpStatus.OK);
    }

}
