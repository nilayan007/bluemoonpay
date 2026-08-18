package com.bluemoon.bluemoonpay.vault.dto.response;

import com.bluemoon.bluemoonpay.common.enums.CardBrand;

public record TokenizeResponse(
        String token,
        String lastFour,
        CardBrand brand,
        Integer expiryMonth,
        Integer expiryYear
) {
}