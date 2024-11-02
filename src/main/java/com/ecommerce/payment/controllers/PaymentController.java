package com.ecommerce.payment.controllers;

import com.ecommerce.payment.dtos.InitiatePaymentDto;
import com.ecommerce.payment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDto paymentDto) {
        return paymentService.getPaymentLink(paymentDto.getAmount(),paymentDto.getOrderId(),paymentDto.getPhoneNumber(),paymentDto.getName());
    }
}
