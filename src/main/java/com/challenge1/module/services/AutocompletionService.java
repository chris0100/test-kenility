package com.challenge1.module.services;

import com.challenge1.module.entities.dtos.UsAutocompletionsDto;
import com.challenge1.module.entities.dtos.UsAutocompletionsWritableDto;
import com.lob.api.ApiException;

public interface AutocompletionService {

    UsAutocompletionsDto autocomplete(UsAutocompletionsWritableDto autocompletionsWritable) throws ApiException;
}
