package com.ecommerce.payment.services;

import com.ecommerce.payment.controllers.PaymentController;
import com.ecommerce.payment.paymentgateway.PaymentGateway;
import com.ecommerce.payment.paymentgateway.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public String getPaymentLink(Long amount,String orderId,String phoneNumber,String name){
        PaymentGateway paymentGateway= paymentGatewayChooserStrategy.getOptimalPaymentGateway();
        return paymentGateway.getPaymentlink(amount,orderId,phoneNumber,name);
    }
}
