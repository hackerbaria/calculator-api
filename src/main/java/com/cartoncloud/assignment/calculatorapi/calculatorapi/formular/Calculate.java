package com.cartoncloud.assignment.calculatorapi.calculatorapi.formular;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrderProduct;

import java.math.BigDecimal;

public interface Calculate {

    BigDecimal calculate(PurchaseOrderProduct purchaseOrderProduct);
}
