package com.cartoncloud.assignment.calculatorapi.calculatorapi.common;

public enum ProductType {
    TYPE1("1", CalculationMethod.WEIGHT), TYPE2("2",CalculationMethod.VOLUME), TYPE3("3", CalculationMethod.WEIGHT);

    private String mId;
    private CalculationMethod mCalculationMethod;

    ProductType(String id, CalculationMethod calMethod) {
        mId = id;
        mCalculationMethod = calMethod;
    }


    public String getId() {
        return mId;
    }


    public CalculationMethod getCalculationMethod() {
        return mCalculationMethod;
    }

}
