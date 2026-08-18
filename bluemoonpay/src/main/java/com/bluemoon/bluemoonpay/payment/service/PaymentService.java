package com.bluemoon.bluemoonpay.payment.service;
import com.bluemoon.bluemoonpay.payment.dto.request.PaymentInitRequest;
import com.bluemoon.bluemoonpay.payment.dto.response.PaymentResponse;
import org.jspecify.annotations.Nullable;

import java.util.UUID;

public interface PaymentService {

    PaymentResponse initiate(UUID merchantId, PaymentInitRequest request);

    PaymentResponse capture(UUID merchantId, UUID paymentId);
}