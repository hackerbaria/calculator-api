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
public class Data {
    @JsonProperty("id")
    private String id;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("customer_id")
    private String customerId;


    @JsonProperty("purchase_order_history_status_id")
    private String purchaseOrderHistoryStatusId;

    @JsonProperty("parent_id")
    private Object parentId;

    @JsonProperty("date_added")
    private String dateAdded;

    @JsonProperty("arrival_date")
    private String arrivalDate;

    @JsonProperty("last_modified")
    private String lastModified;

    @JsonProperty("version")
    private String version;

    @JsonProperty("customer_reference")
    private String customerReference;

    @JsonProperty("adjustment")
    private int adjustment;

    @JsonProperty("purchaseorder_filename")
    private Object purchaseOrderFilename;

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("invoice_id")
    private String invoice_id;

    @JsonProperty("income")
    private BigDecimal income;

    @JsonProperty("expense")
    private BigDecimal expense;

    @JsonProperty("20_ft_containers_unloaded")
    private String ftContainersUnloaded20;

    @JsonProperty("40_ft_containers_unloaded")
    private String ftContainersUnloaded40;

    @JsonProperty("20_ft_containers_hand_unloaded")
    private String ftContainersHandUnloaded20;

    @JsonProperty("40_ft_containers_hand_unloaded")
    private String ftContainersHandUnloaded40;

    @JsonProperty("warehouse_id")
    private String warehouse_id;

    @JsonProperty("pallets_wrapped")
    private String palletsWrapped;

    @JsonProperty("pallets_received")
    private String palletsReceived;

    @JsonProperty("purchase_order_charge_scheme_id")
    private String purchaseOrderChargeSchemeId;

    @JsonProperty("value")
    private String value;

    @JsonProperty("charge_error")
    private String chargeError;

    @JsonProperty("verified_quantities")
    private String verifiedQuantities;

    @JsonProperty("invoice_filename")
    private String invoiceFilename;

    @JsonProperty("invoice_upload_role_id")
    private String invoiceUploadRoleId;

    @JsonProperty("charges_finalized")
    private boolean chargesFinalized;

    @JsonProperty("special_instruction")
    private String specialInstruction;

    @JsonProperty("verification_email_sent")
    private boolean verificationEmailSent;

    @JsonProperty("order_urgent")
    private String orderUrgent;

    @JsonProperty("customer_urgent")
    private String customerUrgent;

    @JsonProperty("rts_record")
    private Object rtsRecord;

    @JsonProperty("arrival_temperatures")
    private Object arrivalTemperatures;

    @JsonProperty("bill_id")
    private Object billId;

    @JsonProperty("purchase_order_expense_charge_scheme_id")
    private String purchaseOrderExpenseChargeSchemeId;

    @JsonProperty("shipment_id")
    private Object shipmentId;

    @JsonProperty("custom_field_1")
    private Object customField1;

    @JsonProperty("custom_field_2")
    private Object customField2;

    @JsonProperty("custom_field_3")
    private Object customField3;

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

    @JsonProperty("source_id")
    private Object sourceId;

    @JsonProperty("Customer")
    private Customer customer;

    @JsonProperty("PurchaseOrderHistoryStatus")
    private PurchaseOrderHistoryStatus purchaseOrderHistoryStatus;

    @JsonProperty("PurchaseOrderProduct")
    private List<PurchaseOrderProduct> purchaseOrderProduct = null;

    @JsonProperty("complete")
    private boolean complete;

}
