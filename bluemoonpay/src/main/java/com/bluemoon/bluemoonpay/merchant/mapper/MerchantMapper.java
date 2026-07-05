package com.bluemoon.bluemoonpay.merchant.mapper;


import com.bluemoon.bluemoonpay.merchant.dto.request.MerchantSignupRequest;
import com.bluemoon.bluemoonpay.merchant.dto.response.ApiKeyCreateResponse;
import com.bluemoon.bluemoonpay.merchant.dto.response.ApiKeyResponse;
import com.bluemoon.bluemoonpay.merchant.dto.response.MerchantResponse;
import com.bluemoon.bluemoonpay.merchant.entity.Merchant;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MerchantMapper {
    Merchant toEntityFromSignUp(MerchantSignupRequest merchantSignupRequest);
    MerchantResponse toResponse(Merchant merchant);
}
