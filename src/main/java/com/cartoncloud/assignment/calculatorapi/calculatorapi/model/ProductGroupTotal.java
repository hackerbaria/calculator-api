package com.cartoncloud.assignment.calculatorapi.calculatorapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;


@Accessors(chain = true)
@Data
@AllArgsConstructor
public class ProductGroupTotal {

    @JsonProperty("product_type_id")
    private Integer product_type_id;

    @JsonProperty("total")
    private BigDecimal total;


}
