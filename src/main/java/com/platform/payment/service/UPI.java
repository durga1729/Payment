package com.platform.payment.service;

import com.platform.payment.service.Payment;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class UPI extends Payment {
    String virtualAddress;

    UPI(double amount, String paymentStatus, Date trasactionDate, String trasactionId) {
        super(amount, paymentStatus, trasactionDate, trasactionId);
    }

    @Override
    public boolean makePayment(Object o) {
        return false;
    }
}
