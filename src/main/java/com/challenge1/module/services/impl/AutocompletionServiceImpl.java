package com.challenge1.module.services.impl;

import com.challenge1.module.entities.dtos.UsAutocompletionsDto;
import com.challenge1.module.entities.dtos.UsAutocompletionsWritableDto;
import com.challenge1.module.entities.mapper.UsAutocompletionMapper;
import com.challenge1.module.services.AutocompletionService;
import com.lob.api.ApiClient;
import com.lob.api.ApiException;
import com.lob.api.Configuration;
import com.lob.api.auth.HttpBasicAuth;
import com.lob.api.client.UsAutocompletionsApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.client.model.UsAutocompletions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AutocompletionServiceImpl implements AutocompletionService {


    private final UsAutocompletionMapper mapper;

    @Value("${lob.username}")
    private String username;

    @Value("${lob.password}")
    private String password;


    @Override
    public UsAutocompletionsDto autocomplete(UsAutocompletionsWritableDto usAutocompletionsWritableDto) throws ApiException {
        ApiClient lobClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) lobClient.getAuthentication("basicAuth");
        basicAuth.setUsername(username);
        basicAuth.setPassword(password);

        UsAutocompletionsApi apiInstanceAu = new UsAutocompletionsApi(lobClient);

        log.info(usAutocompletionsWritableDto.getAddressPrefix());

        try {
            UsAutocompletions autocomplete = apiInstanceAu.autocomplete(
                    mapper.UsAutocompletionsWritableDtoToUsAutocompletionsWritable(usAutocompletionsWritableDto));

            return mapper.usAutocompletionsToUsAutocompletionsDto(autocomplete);
        } catch (ApiException e) {
            log.error("Exception when calling UsAutocomplete");
            log.error("Status code: " + e.getCode());
            log.error("Reason: " + e.getMessage());
            throw new ApiException(e.getCode(), e.getMessage());
        }
    }
}
