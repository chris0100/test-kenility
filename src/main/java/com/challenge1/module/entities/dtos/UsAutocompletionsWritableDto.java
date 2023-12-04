package com.challenge1.module.entities.dtos;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class UsAutocompletionsWritableDto {

    public static final String SERIALIZED_NAME_ADDRESS_PREFIX = "address_prefix";
    @SerializedName("address_prefix")
    private String addressPrefix;

    public static final String SERIALIZED_NAME_CITY = "city";
    @SerializedName("city")
    private String city;

    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName("state")
    private String state;

    public static final String SERIALIZED_NAME_ZIP_CODE = "zip_code";
    @SerializedName("zip_code")
    private String zipCode;

    public static final String SERIALIZED_NAME_GEO_IP_SORT = "geo_ip_sort";
    @SerializedName("geo_ip_sort")
    private Boolean geoIpSort;
}
