package com.konopackipio1.ch10restexception.services;

import org.springframework.stereotype.Service;

import com.konopackipio1.ch10restexception.exceptions.NotEnoughMoneyException;

@Service
public class PaymentService {

    public void processPayment(double payment) {
        throw new NotEnoughMoneyException("Not enough money");
    }

}
