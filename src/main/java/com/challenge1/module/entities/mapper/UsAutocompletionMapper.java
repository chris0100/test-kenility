package com.challenge1.module.entities.mapper;

import com.challenge1.module.entities.dtos.UsAutocompletionsDto;
import com.challenge1.module.entities.dtos.UsAutocompletionsWritableDto;
import org.mapstruct.Mapper;
import org.openapitools.client.model.UsAutocompletions;
import org.openapitools.client.model.UsAutocompletionsWritable;

@Mapper(componentModel = "spring")
public interface UsAutocompletionMapper {

    UsAutocompletionsDto usAutocompletionsToUsAutocompletionsDto(UsAutocompletions usAutocompletions);

    UsAutocompletionsWritable UsAutocompletionsWritableDtoToUsAutocompletionsWritable(UsAutocompletionsWritableDto usAutocompletionsWritableDto);
}
