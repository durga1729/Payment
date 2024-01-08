package com.platform.payment.controller;

import com.platform.payment.service.Card;
import com.platform.payment.service.Payment;
import com.platform.payment.service.UPI;
import com.platform.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/makePaymentByCard")
    public ResponseEntity<Boolean> makePaymentByCard(@RequestBody Card card) {
        return ResponseEntity.ok(paymentService.makePaymentByCard(card));
    }

    @PostMapping("/makePaymentByUpi")
    public ResponseEntity<Boolean> makePaymentByCard(@RequestBody UPI upi) {
        return ResponseEntity.ok(paymentService.makePaymentByUPI(upi));
    }

}
