package com.cartoncloud.assignment.calculatorapi.calculatorapi.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "info",
        "data"
})

@lombok.Data
public class PurchaseOrder {

    @JsonProperty("info")
    private String info;
    @JsonProperty("data")
    private Data data;

}
