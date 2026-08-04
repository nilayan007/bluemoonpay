package com.bluemoon.bluemoonpay.payment.gateway.adapter;
import com.bluemoon.bluemoonpay.payment.gateway.PaymentAdapter;
import com.bluemoon.bluemoonpay.payment.gateway.dto.PaymentRequest;
import com.bluemoon.bluemoonpay.payment.gateway.dto.PaymentResult;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class CardPaymentAdapter implements PaymentAdapter {

    @Override
    public PaymentResult initiate(PaymentRequest request) {
        return null;
    }

    @Override
    public PaymentResult capture(UUID paymentId) {
        return null;
    }
}
