
package com.cartoncloud.assignment.calculatorapi.calculatorapi.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ProductPackaging {

    @JsonProperty("id")
    private String id;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("product_unit_of_measure_category_id")
    private String productUnitOfMeasureCategoryId;
    @JsonProperty("product_unit_of_measure_id")
    private String productUnitOfMeasureId;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("description")
    private String description;


}
