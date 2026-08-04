package com.bluemoon.bluemoonpay.payment.processor;

import com.bluemoon.bluemoonpay.payment.processor.dto.PaymentProcessorRequest;
import com.bluemoon.bluemoonpay.payment.processor.dto.PaymentProcessorResponse;

public interface PaymentProcessor {

    PaymentProcessorResponse charge(PaymentProcessorRequest request);

}