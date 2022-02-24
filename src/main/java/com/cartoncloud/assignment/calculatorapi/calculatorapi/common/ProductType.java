package com.cartoncloud.assignment.calculatorapi.calculatorapi.common;

public enum ProductType {
    TYPE1("1", CalculationMethod.WEIGHT), TYPE2("2",CalculationMethod.VOLUME), TYPE3("3", CalculationMethod.WEIGHT);

    private String id;
    private CalculationMethod calculationMethod;

    ProductType(String id, CalculationMethod calMethod) {
        this.id = id;
        calculationMethod = calMethod;
    }


    public String getId() {
        return id;
    }


    public CalculationMethod getCalculationMethod() {
        return calculationMethod;
    }

}
