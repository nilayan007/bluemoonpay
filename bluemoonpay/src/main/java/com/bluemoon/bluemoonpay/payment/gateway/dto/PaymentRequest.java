package com.bluemoon.bluemoonpay.payment.gateway.dto;


import com.bluemoon.bluemoonpay.common.entity.Money;
import com.bluemoon.bluemoonpay.common.enums.PaymentMethods;

import java.util.Map;
import java.util.UUID;

public record PaymentRequest(
        UUID paymentId,
        UUID orderId,
        UUID merchantId,
        Money amount,
        PaymentMethods method,
        Map<String, Object> methodDetails
) {
}