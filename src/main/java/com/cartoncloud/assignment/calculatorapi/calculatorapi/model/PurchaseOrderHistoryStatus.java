package com.cartoncloud.assignment.calculatorapi.calculatorapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name"
})
@Data
public class PurchaseOrderHistoryStatus {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
}
