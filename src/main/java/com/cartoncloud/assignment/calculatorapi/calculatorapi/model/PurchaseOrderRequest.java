package com.cartoncloud.assignment.calculatorapi.calculatorapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

@Accessors(chain = true)
@Data
public class PurchaseOrderRequest {
    @JsonProperty("purchase_order_ids")
    private List<Integer> purchaseOrderIds = null;

}
