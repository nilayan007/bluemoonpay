package com.bluemoon.bluemoonpay.payment.processor;

import com.bluemoon.bluemoonpay.common.enums.PaymentMethods;
import com.bluemoon.bluemoonpay.payment.processor.dto.PaymentProcessorRequest;
import com.bluemoon.bluemoonpay.payment.processor.dto.PaymentProcessorResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class PaymentProcessorRouter {

    private final Map<PaymentMethods, PaymentProcessor> paymentProcessors;

    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {
        PaymentProcessor processor = paymentProcessors.get(request.method());
        if (processor == null) {
            throw new IllegalArgumentException("No payment processor registered for method: "+request.method());
        }
        return processor.charge(request);
    }
}