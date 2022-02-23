package com.cartoncloud.assignment.calculatorapi.calculatorapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.experimental.Accessors;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors(chain = true)
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

    @JsonProperty("id")
    private String id;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("telephone")
    private String telephone;

    @JsonProperty("customer_charge_id")
    private String customerChargeId;

    @JsonProperty("active")
    private boolean active;

    @JsonProperty("warehouse_ids")
    private String warehouseIds;

    @JsonProperty("code")
    private String code;

    @JsonProperty("logo_remote_file_id")
    private Object logoRemoteFileId;

    @JsonProperty("customer_type_id")
    private String customerTypeId;

    @JsonProperty("custom_field_1")
    private String customField1;

    @JsonProperty("custom_field_2")
    private String customField2;

    @JsonProperty("custom_field_3")
    private String customField3;

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

    @JsonProperty("custom_field_11")
    private String customField11;

    @JsonProperty("custom_field_12")
    private String customField12;

    @JsonProperty("custom_field_13")
    private String customField13;

    @JsonProperty("custom_field_14")
    private String customField14;

    @JsonProperty("custom_field_15")
    private String customField15;

    @JsonProperty("custom_field_16")
    private String customField16;

    @JsonProperty("custom_field_17")
    private String customField17;

    @JsonProperty("custom_field_18")
    private String customField18;

    @JsonProperty("custom_field_19")
    private String customField19;

    @JsonProperty("custom_field_20")
    private String customField20;


    @JsonProperty("customer_logo_id")
    private Object customerLogoId;

    @JsonProperty("address_id")
    private Object addressId;

    @JsonProperty("allow_invalid_addresses_via_api")
    private boolean allowInvalidAddressesViaApi;

}
