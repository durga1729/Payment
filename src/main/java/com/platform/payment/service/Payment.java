package com.platform.payment.service;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Base64;
import java.util.Date;

@Getter
@Setter
@Builder
public abstract class Payment {
    double amount;
    String paymentStatus;
    Date trasactionDate;
    String trasactionId;

    public String encodeData(Object o) {
        Base64.Encoder encoder = Base64.getEncoder();
        // Encode the card
        String encodedDetails = encoder.encodeToString(o.toString().getBytes());
        return encodedDetails;
    }
    public abstract boolean makePayment(Object o);
}
