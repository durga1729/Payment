package com.platform.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PaymentService {

     @Autowired
     Payment payment;

    public boolean makePaymentByCard(Card card) {
        return payment.makePayment(card);
    }

    public boolean makePaymentByUPI(UPI upi) {
        return payment.makePayment(upi);
    }

}
