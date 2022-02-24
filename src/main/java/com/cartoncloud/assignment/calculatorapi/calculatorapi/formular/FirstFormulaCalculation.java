package com.cartoncloud.assignment.calculatorapi.calculatorapi.formular;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.common.ProductType;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrderProduct;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class FirstFormulaCalculation implements FormulaCalculation {

    @Override
    public BigDecimal performFormulaBasedCalculation(PurchaseOrderProduct poProduct) {
        var orderTotal = BigDecimal.ZERO;
        if (ProductType.TYPE1.getId().equals(poProduct.getProductTypeId())) {
            //by weight: total = quantity x weight
            orderTotal = poProduct.getUnitQuantityInitial().multiply(poProduct.getProduct().getWeight());

        }
        else if (ProductType.TYPE2.getId().equals(poProduct.getProductTypeId())) {
            //By volume: total = quantity x weight
            orderTotal = poProduct.getUnitQuantityInitial().multiply(poProduct.getProduct().getVolume());
        }
        else if (ProductType.TYPE3.getId().equals(poProduct.getProductTypeId())) {
            //by weight
            orderTotal = poProduct.getUnitQuantityInitial().multiply(poProduct.getProduct().getWeight());
        }
        return orderTotal;
    }


}
