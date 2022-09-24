package com.konopackipio1.ch11openfeign.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.konopackipio1.ch11openfeign.model.Payment;

// Method declared here will use the service implementation
@FeignClient(name = "payment", url = "${name.service.url}")
public interface PaymentProxy {

    @PostMapping("/payment")
    Payment createPayment(@RequestHeader String requestId, @RequestBody Payment payment);

}
