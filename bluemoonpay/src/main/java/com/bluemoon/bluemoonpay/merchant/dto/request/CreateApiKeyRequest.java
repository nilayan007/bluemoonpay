package com.bluemoon.bluemoonpay.merchant.dto.request;

import com.bluemoon.bluemoonpay.common.enums.Environment;

public record CreateApiKeyRequest(
        Environment environment
) {
}
