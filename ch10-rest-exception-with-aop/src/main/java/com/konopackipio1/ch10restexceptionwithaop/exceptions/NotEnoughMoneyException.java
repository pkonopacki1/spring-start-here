package com.konopackipio1.ch10restexceptionwithaop.exceptions;

public class NotEnoughMoneyException extends RuntimeException {

    public NotEnoughMoneyException(String message) {
        super(message);
    }

}
