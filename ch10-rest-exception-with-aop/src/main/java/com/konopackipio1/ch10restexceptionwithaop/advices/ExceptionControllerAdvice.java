package com.konopackipio1.ch10restexceptionwithaop.advices;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.konopackipio1.ch10restexceptionwithaop.exceptions.ExceptionDetails;
import com.konopackipio1.ch10restexceptionwithaop.exceptions.NotEnoughMoneyException;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ExceptionDetails> notEnoughMoneyExceptionHandler() {
        ExceptionDetails exceptionDetails = new ExceptionDetails();
        exceptionDetails.setMessage("Not enough money for the payment");
        return ResponseEntity
                .badRequest()
                .body(exceptionDetails);
    }

}
