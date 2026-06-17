package com.bluemoon.bluemoonpay.merchant.dto.response;

import com.bluemoon.bluemoonpay.common.enums.Environment;

import java.util.UUID;

public record ApiKeyCreateResponse(
        UUID id,
        String keyId,
        String keySecret,
        Environment environment
) {
}
