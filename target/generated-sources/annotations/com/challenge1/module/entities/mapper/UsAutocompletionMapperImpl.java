package com.challenge1.module.entities.mapper;

import com.challenge1.module.entities.dtos.SuggestionsDto;
import com.challenge1.module.entities.dtos.UsAutocompletionsDto;
import com.challenge1.module.entities.dtos.UsAutocompletionsWritableDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.openapitools.client.model.Suggestions;
import org.openapitools.client.model.UsAutocompletions;
import org.openapitools.client.model.UsAutocompletionsWritable;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-03T11:45:59-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class UsAutocompletionMapperImpl implements UsAutocompletionMapper {

    @Override
    public UsAutocompletionsDto usAutocompletionsToUsAutocompletionsDto(UsAutocompletions usAutocompletions) {
        if ( usAutocompletions == null ) {
            return null;
        }

        UsAutocompletionsDto usAutocompletionsDto = new UsAutocompletionsDto();

        usAutocompletionsDto.setId( usAutocompletions.getId() );
        usAutocompletionsDto.setSuggestions( suggestionsListToSuggestionsDtoList( usAutocompletions.getSuggestions() ) );

        return usAutocompletionsDto;
    }

    @Override
    public UsAutocompletionsWritable UsAutocompletionsWritableDtoToUsAutocompletionsWritable(UsAutocompletionsWritableDto usAutocompletionsWritableDto) {
        if ( usAutocompletionsWritableDto == null ) {
            return null;
        }

        UsAutocompletionsWritable usAutocompletionsWritable = new UsAutocompletionsWritable();

        usAutocompletionsWritable.setAddressPrefix( usAutocompletionsWritableDto.getAddressPrefix() );
        usAutocompletionsWritable.setCity( usAutocompletionsWritableDto.getCity() );
        usAutocompletionsWritable.setState( usAutocompletionsWritableDto.getState() );
        usAutocompletionsWritable.setZipCode( usAutocompletionsWritableDto.getZipCode() );
        usAutocompletionsWritable.setGeoIpSort( usAutocompletionsWritableDto.getGeoIpSort() );

        return usAutocompletionsWritable;
    }

    protected SuggestionsDto suggestionsToSuggestionsDto(Suggestions suggestions) {
        if ( suggestions == null ) {
            return null;
        }

        SuggestionsDto suggestionsDto = new SuggestionsDto();

        suggestionsDto.setPrimaryLine( suggestions.getPrimaryLine() );
        suggestionsDto.setCity( suggestions.getCity() );
        suggestionsDto.setState( suggestions.getState() );
        suggestionsDto.setZipCode( suggestions.getZipCode() );

        return suggestionsDto;
    }

    protected List<SuggestionsDto> suggestionsListToSuggestionsDtoList(List<Suggestions> list) {
        if ( list == null ) {
            return null;
        }

        List<SuggestionsDto> list1 = new ArrayList<SuggestionsDto>( list.size() );
        for ( Suggestions suggestions : list ) {
            list1.add( suggestionsToSuggestionsDto( suggestions ) );
        }

        return list1;
    }
}
