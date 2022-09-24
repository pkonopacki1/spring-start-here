package com.konopackipio1.ch11openfeign.controller;

import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.konopackipio1.ch11openfeign.model.Payment;
import com.konopackipio1.ch11openfeign.proxy.PaymentProxy;

@RestController
public class PaymentController {

    PaymentProxy paymentProxy;
    Logger logger = Logger.getLogger(PaymentController.class.toString());

    public PaymentController(PaymentProxy paymentProxy) {
        this.paymentProxy = paymentProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(@RequestBody Payment payment) {
        String requestId = UUID.randomUUID().toString();
        logger.info("Calling API: " + "${name.service.url}");
        return paymentProxy.createPayment(requestId, payment);
    }

}
