package com.konopackipio1.ch10restexceptionwithaop.services;

import org.springframework.stereotype.Service;

import com.konopackipio1.ch10restexceptionwithaop.exceptions.NotEnoughMoneyException;

@Service
public class PaymentService {

    public void processPayment(double payment) {
        if (payment < 100.0) {
            throw new NotEnoughMoneyException("Not enough money");
        }
    }

}
