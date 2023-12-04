package com.challenge1.module.entities.dtos;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class UsAutocompletionsDto {

    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName("id")
    private String id;

    public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
    @SerializedName("suggestions")
    private List<SuggestionsDto> suggestions;


}
