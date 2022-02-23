package com.cartoncloud.assignment.calculatorapi.calculatorapi.service;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.client.PurchaseOrdersService;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.ProductGroupTotal;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements  OrderService {

    private CalculationService calculationService;

    private PurchaseOrdersService purchaseOrdersService;

    public OrderServiceImpl(CalculationService calculationService,
                            PurchaseOrdersService purchaseOrdersService) {
        this.calculationService = calculationService;
        this.purchaseOrdersService = purchaseOrdersService;
    }

    @Override
    public List<ProductGroupTotal> calculateOrderTotal(List<Integer> orderIds) {

        List<PurchaseOrder> purchaseOrderList = purchaseOrdersService.getOrderDetails(orderIds);

        return calculationService.calculateProductTotal(purchaseOrderList);


    }
}
