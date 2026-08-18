package com.bluemoon.bluemoonpay.vault.service;

import com.bluemoon.bluemoonpay.common.entity.Money;
import com.bluemoon.bluemoonpay.payment.processor.dto.PaymentProcessorResponse;
import com.bluemoon.bluemoonpay.vault.dto.request.TokenizeRequest;
import com.bluemoon.bluemoonpay.vault.dto.response.TokenizeResponse;
import jakarta.validation.Valid;
import org.jspecify.annotations.Nullable;

import java.util.Map;
import java.util.UUID;

public interface VaultService {

    TokenizeResponse tokenize(TokenizeRequest request, UUID merchantId);

    PaymentProcessorResponse charge(UUID paymentId, String token, Money amount, Map<String, Object> methodDetails);
}
