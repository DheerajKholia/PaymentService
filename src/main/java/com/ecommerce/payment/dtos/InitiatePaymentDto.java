package com.ecommerce.payment.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InitiatePaymentDto {
    private Long amount;
    private String orderId;
    private String phoneNumber;
    private String name;
}
