package com.cartoncloud.assignment.calculatorapi.calculatorapi.service;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.ProductGroupTotal;

import java.util.List;

public interface OrderService {

    List<ProductGroupTotal> calculateOrderTotal(List<Integer> orderIds);
}
