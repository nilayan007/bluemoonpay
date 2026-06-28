package com.bluemoon.bluemoonpay.payment.dto.response;

import com.bluemoon.bluemoonpay.common.entity.Money;
import com.bluemoon.bluemoonpay.common.enums.PaymentMethods;
import com.bluemoon.bluemoonpay.common.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record PaymentResponse(
        UUID id,
        UUID orderId,
        UUID merchantId,
        Money amount,
        PaymentStatus status,
        PaymentMethods method,
        Map<String, Object> methodDetails,
        String errorCode,
        String errorDescription,
        LocalDateTime capturedAt,
        LocalDateTime createdAt
) {}
