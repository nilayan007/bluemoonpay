package com.bluemoon.bluemoonpay.merchant.dto.response;

import com.bluemoon.bluemoonpay.common.enums.BusinessType;
import com.bluemoon.bluemoonpay.common.enums.MerchantStatus;

import java.util.UUID;

public record MerchantResponse(

        UUID id,
        String name,
        String email,
        String businessName,
        BusinessType businessType,
        MerchantStatus merchantStatus
) {
}
