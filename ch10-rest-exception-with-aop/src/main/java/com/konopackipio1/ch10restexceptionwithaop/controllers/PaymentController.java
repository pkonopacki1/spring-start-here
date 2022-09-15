package com.konopackipio1.ch10restexceptionwithaop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.konopackipio1.ch10restexceptionwithaop.services.PaymentService;

import model.PaymentDetails;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity<?> payment(@RequestBody PaymentDetails paymentDetails) {
        paymentService.processPayment(paymentDetails.getAmount());

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body("Payment ok");
    }
}
