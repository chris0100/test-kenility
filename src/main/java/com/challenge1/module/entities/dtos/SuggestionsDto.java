package com.challenge1.module.entities.dtos;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SuggestionsDto {

    public static final String SERIALIZED_NAME_PRIMARY_LINE = "primary_line";
    @SerializedName("primary_line")
    private String primaryLine;

    public static final String SERIALIZED_NAME_CITY = "city";
    @SerializedName("city")
    private String city;

    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName("state")
    private String state;

    public static final String SERIALIZED_NAME_ZIP_CODE = "zip_code";
    @SerializedName("zip_code")
    private String zipCode;
}
