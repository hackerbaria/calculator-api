package com.cartoncloud.assignment.calculatorapi.calculatorapi.formular;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.common.CalculationMethod;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.common.ProductType;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrderProduct;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class FirstFormulaCalculation implements FormulaCalculation {

    private Calculate calculate;

    public FirstFormulaCalculation(Calculate calculate) {
        this.calculate = calculate;
    }

    @Override
    public BigDecimal performFormulaBasedCalculation(PurchaseOrderProduct poProduct) {
        var orderTotal = BigDecimal.ZERO;
        orderTotal = calculate.calculate(poProduct);

        return orderTotal;
    }









}
