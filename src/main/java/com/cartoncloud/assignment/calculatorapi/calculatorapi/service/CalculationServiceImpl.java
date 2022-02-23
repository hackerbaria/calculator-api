package com.cartoncloud.assignment.calculatorapi.calculatorapi.service;

import com.cartoncloud.assignment.calculatorapi.calculatorapi.common.ProductType;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.Product;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.ProductGroupTotal;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrder;
import com.cartoncloud.assignment.calculatorapi.calculatorapi.model.PurchaseOrderProduct;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CalculationServiceImpl implements CalculationService{
    @Override
    public List<ProductGroupTotal> calculateProductTotal(List<PurchaseOrder> orderLists) {
        Map<Integer, BigDecimal> productGroupTotal = new HashMap<>();
        for (PurchaseOrder order : orderLists) {
            List<PurchaseOrderProduct> poProductLst = order.getData().getPurchaseOrderProduct();
            for (PurchaseOrderProduct product : poProductLst) {
                BigDecimal productTotal = performFormulaBasedCalculation(product);
                Integer productId = Integer.parseInt(product.getProductTypeId());
                if (productGroupTotal.containsKey(productId)) {
                    productGroupTotal.put(productId, productGroupTotal.get(productId).add(productTotal));
                }
                else {
                    productGroupTotal.put(productId, productTotal);
                }

            }
        }

        List<ProductGroupTotal> productGroupTotalLst = new ArrayList<>();

        for (Map.Entry<Integer, BigDecimal> entry : productGroupTotal.entrySet()) {
            productGroupTotalLst.add(new ProductGroupTotal(entry.getKey(), entry.getValue()));
        }
        return productGroupTotalLst;
    }

    private BigDecimal performFormulaBasedCalculation(PurchaseOrderProduct poProduct) {
        BigDecimal orderTotal = BigDecimal.ZERO;
        if (ProductType.TYPE1.getId().equals(poProduct.getProductTypeId())) {
            //by weight
            orderTotal = getUnitQuanity(poProduct).multiply(getProductWeight(poProduct.getProduct()));

        }
        else if (ProductType.TYPE2.getId().equals(poProduct.getProductTypeId())) {
            //By volume
            orderTotal = getUnitQuanity(poProduct).multiply(getProductVolume(poProduct.getProduct()));
        }
        else if (ProductType.TYPE3.getId().equals(poProduct.getProductTypeId())) {
            //by weight
            orderTotal = getUnitQuanity(poProduct).multiply(getProductWeight(poProduct.getProduct()));
        }
        return orderTotal;
    }

    public BigDecimal getProductWeight(Product product) {
        return new BigDecimal(product.getWeight());
    }

    public BigDecimal getProductVolume(Product product) {
        return new BigDecimal(product.getVolume());
    }

    public BigDecimal getUnitQuanity(PurchaseOrderProduct poProduct) {
        return new BigDecimal(poProduct.getUnitQuantityInitial());
    }
}
