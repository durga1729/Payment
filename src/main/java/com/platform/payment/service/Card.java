package com.platform.payment.service;

import com.platform.payment.service.Payment;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Base64;
import java.util.Date;

@Getter
@Setter
@Builder
public class Card extends Payment {
    String cardNumber;
    String validity;
    String cvv;
    String name;

    Card(double amount, String paymentStatus, Date trasactionDate, String trasactionId) {
        super(amount, paymentStatus, trasactionDate, trasactionId);
    }


    @Override
    public boolean makePayment(Object o) {
        return false;
    }
}
