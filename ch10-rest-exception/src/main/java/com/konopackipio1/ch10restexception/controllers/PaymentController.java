package com.konopackipio1.ch10restexception.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konopackipio1.ch10restexception.exceptions.NotEnoughMoneyException;
import com.konopackipio1.ch10restexception.services.PaymentService;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity<?> payment() {
        try {
            paymentService.processPayment(0.0d);

            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body("Payment ok");
        } catch (NotEnoughMoneyException e) {
            return ResponseEntity
                    .badRequest()
                    .body(e.getMessage());
        }
    }
}
