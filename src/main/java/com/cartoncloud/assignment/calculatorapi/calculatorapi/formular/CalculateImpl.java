package com.cartoncloud.assignment.calculatorapi.calculatorapi.formular;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.common.CalculationMethod;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.common.ProductType;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrderProduct;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CalculateImpl implements  Calculate{

    @Override
    public BigDecimal calculate(PurchaseOrderProduct poProduct) {
        var productTypeId = poProduct.getProductTypeId();
        if(productTypeId.equalsIgnoreCase(ProductType.TYPE1.getId())
                || productTypeId.equalsIgnoreCase(ProductType.TYPE3.getId())) {
            return calculateByMethod(CalculationMethod.WEIGHT, poProduct);

        } else {
            return calculateByMethod(CalculationMethod.VOLUME, poProduct);
        }
    }

    private BigDecimal calculateByMethod(CalculationMethod method, PurchaseOrderProduct poProduct) {
        if(method == CalculationMethod.WEIGHT) {
            return poProduct.getUnitQuantityInitial().multiply(poProduct.getProduct().getWeight());
        } else if (method == CalculationMethod.VOLUME) {
            return poProduct.getUnitQuantityInitial().multiply(poProduct.getProduct().getVolume());
        } else {
            return poProduct.getUnitQuantityInitial().multiply(poProduct.getProduct().getWeight());
        }
    }
}
