
package com.cartoncloud.assignment.calculatorapi.calculatorapi.model;

import com.fasterxml.jackson.annotation.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    @JsonProperty("id")
    private String id;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("customer_code")
    private String customerCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("product_type_id")
    private String productTypeId;
    @JsonProperty("product_unit_of_measure_id")
    private String productUnitOfMeasureId;
    @JsonProperty("product_group_id")
    private Object productGroupId;
    @JsonProperty("warning_threshold_days")
    private String warningThresholdDays;
    @JsonProperty("expiry_threshold_days")
    private String expiryThresholdDays;
    @JsonProperty("product_packaging_id")
    private String productPackagingId;
    @JsonProperty("require_weight")
    private String requireWeight;
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("warehouse_ids")
    private String warehouseIds;
    @JsonProperty("product_unit_of_measure_category_id")
    private String productUnitOfMeasureCategoryId;
    @JsonProperty("created")
    private String created;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("custom_field_1")
    private Object customField1;
    @JsonProperty("custom_field_2")
    private Object customField2;
    @JsonProperty("custom_field_3")
    private Object customField3;
    @JsonProperty("low_stock_threshold")
    private Object lowStockThreshold;
    @JsonProperty("low_stock_notification_enable")
    private String lowStockNotificationEnable;
    @JsonProperty("low_stock_bitmask")
    private String lowStockBitmask;
    @JsonProperty("storage_charge_method_id")
    private String storageChargeMethodId;
    @JsonProperty("per_item_storage_charge")
    private String perItemStorageCharge;
    @JsonProperty("volume")
    private BigDecimal volume;
    @JsonProperty("weight")
    private BigDecimal weight;
    @JsonProperty("allow_zero_storage_charge")
    private String allowZeroStorageCharge;
    @JsonProperty("custom_field_4")
    private Object customField4;
    @JsonProperty("custom_field_5")
    private Object customField5;
    @JsonProperty("custom_field_6")
    private Object customField6;
    @JsonProperty("custom_field_7")
    private Object customField7;
    @JsonProperty("custom_field_8")
    private Object customField8;
    @JsonProperty("custom_field_9")
    private Object customField9;
    @JsonProperty("custom_field_10")
    private Object customField10;
    @JsonProperty("pop_expiry_date_required")
    private String popExpiryDateRequired;
    @JsonProperty("pop_custom_field_disable_bitmask")
    private String popCustomFieldDisableBitmask;
    @JsonProperty("pop_custom_field_optional_bitmask")
    private String popCustomFieldOptionalBitmask;
    @JsonProperty("pop_custom_field_require_bitmask")
    private String popCustomFieldRequireBitmask;
    @JsonProperty("pop_custom_field_require_on_outgoing_bitmask")
    private String popCustomFieldRequireOnOutgoingBitmask;
    @JsonProperty("stock_selection_method_id")
    private String stockSelectionMethodId;
    @JsonProperty("pop_initial_status_id")
    private String popInitialStatusId;

}
