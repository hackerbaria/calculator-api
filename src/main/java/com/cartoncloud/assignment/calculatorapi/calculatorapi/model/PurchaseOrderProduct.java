package com.cartoncloud.assignment.calculatorapi.calculatorapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseOrderProduct {

    @JsonProperty("id")
    private String id;
    @JsonProperty("purchase_order_id")
    private String purchaseOrderId;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("unit_quantity_confirmed")
    private Object unitQuantityConfirmed;
    @JsonProperty("unit_quantity_initial")
    private BigDecimal unitQuantityInitial;
    @JsonProperty("unit_quantity_onhand")
    private String unitQuantityOnhand;
    @JsonProperty("unit_quantity_free")
    private String unitQuantityFree;
    @JsonProperty("expiry_date")
    private String expiryDate;
    @JsonProperty("product_unit_of_measure_id")
    private String productUnitOfMeasureId;
    @JsonProperty("product_status_id")
    private String productStatusId;
    @JsonProperty("parent_id")
    private Object parentId;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("version")
    private String version;
    @JsonProperty("arrival_date")
    private String arrivalDate;
    @JsonProperty("date_allocated")
    private Object dateAllocated;
    @JsonProperty("original_date_allocated")
    private Object originalDateAllocated;
    @JsonProperty("date_depleted")
    private Object dateDepleted;
    @JsonProperty("product_type_id")
    private String productTypeId;
    @JsonProperty("warehouse_id")
    private String warehouseId;
    @JsonProperty("send_warn_email")
    private String sendWarnEmail;
    @JsonProperty("product_packaging_id")
    private String productPackagingId;
    @JsonProperty("warehouse_location_id")
    private Object warehouseLocationId;
    @JsonProperty("charge_new_storage")
    private String chargeNewStorage;
    @JsonProperty("warehouse_location_capacity_id")
    private Object warehouseLocationCapacityId;
    @JsonProperty("warehouse_location_pick_efficiency_id")
    private Object warehouseLocationPickEfficiencyId;
    @JsonProperty("purchase_order_history_status_id")
    private String purchaseOrderHistoryStatusId;
    @JsonProperty("pallet_id")
    private String palletId;
    @JsonProperty("custom_field_1")
    private String customField1;
    @JsonProperty("custom_field_2")
    private String customField2;
    @JsonProperty("custom_field_3")
    private String customField3;
    @JsonProperty("confirmed")
    private boolean confirmed;
    @JsonProperty("adjustment")
    private String adjustment;
    @JsonProperty("labels_printed")
    private String labelsPrinted;
    @JsonProperty("custom_field_4")
    private String customField4;
    @JsonProperty("custom_field_5")
    private String customField5;
    @JsonProperty("custom_field_6")
    private String customField6;
    @JsonProperty("custom_field_7")
    private String customField7;
    @JsonProperty("custom_field_8")
    private String customField8;
    @JsonProperty("custom_field_9")
    private String customField9;
    @JsonProperty("custom_field_10")
    private String customField10;
    @JsonProperty("pallet_rental_applies")
    private boolean palletRentalApplies;
    @JsonProperty("Product")
    private Product product;
    @JsonProperty("ProductPackaging")
    private ProductPackaging productPackaging;
    @JsonProperty("WarehouseLocation")
    private Object warehouseLocation;
    @JsonProperty("unit_quantity_packed")
    private String unitQuantityPacked;
    @JsonProperty("product_storage_charge_method")
    private String productStorageChargeMethod;
    @JsonProperty("scale_msg")
    private String scaleMsg;
    @JsonProperty("pallet_qty")
    private int palletQty;
    @JsonProperty("pallet_qty_name")
    private String palletQtyName;
    @JsonProperty("undercharging_storage")
    private boolean underchargingStorage;
    @JsonProperty("location_already_used")
    private boolean locationAlreadyUsed;
    @JsonProperty("custom_fields")
    private List<Object> customFields = null;


}
