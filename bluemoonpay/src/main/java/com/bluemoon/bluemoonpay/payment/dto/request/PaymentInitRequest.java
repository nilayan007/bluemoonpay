package com.bluemoon.bluemoonpay.payment.dto.request;

import com.bluemoon.bluemoonpay.common.enums.PaymentMethods;
import jakarta.validation.constraints.NotNull;

import java.util.Map;
import java.util.UUID;

public record PaymentInitRequest(

        @NotNull(message = "Order Id is required")
        UUID orderId,

        @NotNull(message = "Payment method is required")
        PaymentMethods method,

        Map<String, Object> methodDetails

) {
}
