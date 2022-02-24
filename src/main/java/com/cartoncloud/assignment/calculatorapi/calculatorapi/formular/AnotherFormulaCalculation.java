package com.cartoncloud.assignment.calculatorapi.calculatorapi.formular;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.common.ProductType;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrderProduct;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class AnotherFormulaCalculation implements FormulaCalculation {

    @Override
    public BigDecimal performFormulaBasedCalculation(PurchaseOrderProduct poProduct) {
        // we can put our new formula logic here
        return new BigDecimal(100);
    }


}
