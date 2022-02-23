package com.cartoncloud.assignment.calculatorapi.calculatorapi.client;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrder;

import java.util.List;

public interface PurchaseOrdersService {

    List<PurchaseOrder> getOrderDetails(List<Integer> orderIds);
}
