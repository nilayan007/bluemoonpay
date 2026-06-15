package com.bluemoon.bluemoonpay.merchant.service;

import com.bluemoon.bluemoonpay.merchant.dto.request.MerchantSignupRequest;
import com.bluemoon.bluemoonpay.merchant.dto.response.MerchantResponse;

public interface AuthService {
    MerchantResponse signup( MerchantSignupRequest request);
}
