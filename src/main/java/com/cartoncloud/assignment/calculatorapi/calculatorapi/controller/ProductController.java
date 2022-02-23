package com.cartoncloud.assignment.calculatorapi.calculatorapi.controller;


import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.ProductGroupTotal;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrderRequest;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    private OrderService orderService;

    public ProductController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/test")
    public ResponseEntity<List<ProductGroupTotal>> calculateOrderTotal(
            @RequestBody PurchaseOrderRequest request) {
        List<Integer> orderIds = request.getPurchaseOrderIds();

        List<ProductGroupTotal> orderGroupTotal = orderService.calculateOrderTotal(orderIds);
        return new ResponseEntity<>(orderGroupTotal, HttpStatus.OK);
    }

}
