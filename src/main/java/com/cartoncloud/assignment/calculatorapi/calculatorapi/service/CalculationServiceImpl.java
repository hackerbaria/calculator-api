package com.cartoncloud.assignment.calculatorapi.calculatorapi.service;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.formular.FormulaCalculation;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.ProductGroupTotal;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CalculationServiceImpl implements CalculationService{

    private FormulaCalculation formulaCalculation;

    public CalculationServiceImpl(@Qualifier("firstFormulaCalculation") FormulaCalculation formulaCalculation) {
        this.formulaCalculation = formulaCalculation;
    }


    @Override
    public List<ProductGroupTotal> calculateProductTotal(List<PurchaseOrder> orderLists) {
        var productGroupTotal = new HashMap<Integer, BigDecimal>();
        for (PurchaseOrder e : orderLists) {
            e.getData().getPurchaseOrderProduct()
                    .forEach(c -> {
                        var productTotal = formulaCalculation.performFormulaBasedCalculation(c);
                        var productId = Integer.parseInt(c.getProductTypeId());
                        if (productGroupTotal.containsKey(productId)) {
                            productGroupTotal.put(productId, productGroupTotal.get(productId).add(productTotal));
                        } else {
                            productGroupTotal.put(productId, productTotal);
                        }
                    });
        }

        var productGroupTotalLst = new ArrayList<ProductGroupTotal>();

        for (Map.Entry<Integer, BigDecimal> entry : productGroupTotal.entrySet()) {
            productGroupTotalLst.add(new ProductGroupTotal(entry.getKey(), entry.getValue().setScale(1, RoundingMode.HALF_UP)));
        }
        return productGroupTotalLst;
    }


}
