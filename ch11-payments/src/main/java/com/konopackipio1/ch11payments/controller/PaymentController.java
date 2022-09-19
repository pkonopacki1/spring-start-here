package com.konopackipio1.ch11payments.controller;

import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.konopackipio1.ch11payments.model.Payment;

@RestController
public class PaymentController {
    private Logger logger = Logger.getLogger(PaymentController.class.toString());

    @PostMapping("/payment")
    public ResponseEntity<Payment> postPayment(@RequestHeader String requestId, @RequestBody Payment payment) {
        logger.info("Received request with ID: " + requestId + " ;Payment Amount: " + payment.getAmount());
        payment.setId(UUID.randomUUID().toString());

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("requestId", requestId)
                .body(payment);
    }

}
