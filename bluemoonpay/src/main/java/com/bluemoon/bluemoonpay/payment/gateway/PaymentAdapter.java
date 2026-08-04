package com.bluemoon.bluemoonpay.payment.gateway;


import com.bluemoon.bluemoonpay.payment.gateway.dto.PaymentRequest;
import com.bluemoon.bluemoonpay.payment.gateway.dto.PaymentResult;

import java.util.UUID;

public interface PaymentAdapter {

    PaymentResult initiate(PaymentRequest request);

    PaymentResult capture(UUID paymentId);
}
