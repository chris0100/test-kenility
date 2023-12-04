package com.challenge1.module.controllers;

import com.challenge1.module.entities.dtos.UsAutocompletionsDto;
import com.challenge1.module.entities.dtos.UsAutocompletionsWritableDto;
import com.challenge1.module.services.AutocompletionService;
import com.lob.api.ApiException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class AutocompletionController {


    private final AutocompletionService autocompletionService;


    @PostMapping("/autocompletions")
    public ResponseEntity<UsAutocompletionsDto> autocompletion(@RequestBody UsAutocompletionsWritableDto usAutocompletionsWritableDto) throws ApiException {
        return new ResponseEntity<>(autocompletionService.autocomplete(usAutocompletionsWritableDto), HttpStatus.OK);
    }



}
