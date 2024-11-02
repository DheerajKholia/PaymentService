package com.ecommerce.payment.paymentgateway;

public interface PaymentGateway {
    String getPaymentlink(Long amount,String orderId,String phoneNumber,String name);
}
