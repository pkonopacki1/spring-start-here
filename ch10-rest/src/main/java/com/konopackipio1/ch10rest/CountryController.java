package com.konopackipio1.ch10rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france() {
        Country c = Country.of("France", 67);

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Continent", "Europe")
                .body(c);
    }
}
