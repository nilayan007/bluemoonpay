package com.bluemoon.bluemoonpay.payment.processor.strategy;


import com.bluemoon.bluemoonpay.payment.processor.PaymentProcessor;
import com.bluemoon.bluemoonpay.payment.processor.dto.PaymentProcessorRequest;
import com.bluemoon.bluemoonpay.payment.processor.dto.PaymentProcessorResponse;

public class CardPaymentProcessor implements PaymentProcessor {

    @Override
    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {
        return null;
    }
}