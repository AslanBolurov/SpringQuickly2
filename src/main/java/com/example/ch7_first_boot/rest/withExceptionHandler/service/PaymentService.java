package com.example.ch7_first_boot.rest.withExceptionHandler.service;

import com.example.ch7_first_boot.rest.withExceptionHandler.exceptions.NotEnoughMoneyException;
import com.example.ch7_first_boot.rest.withExceptionHandler.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
