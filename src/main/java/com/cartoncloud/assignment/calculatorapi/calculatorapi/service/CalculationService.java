package com.cartoncloud.assignment.calculatorapi.calculatorapi.service;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.ProductGroupTotal;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrder;

import java.util.List;

public interface CalculationService {

    List<ProductGroupTotal> calculateProductTotal(List<PurchaseOrder> orderLists);
}
