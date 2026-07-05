package com.bluemoon.bluemoonpay.merchant.mapper;

import com.bluemoon.bluemoonpay.merchant.dto.response.ApiKeyCreateResponse;
import com.bluemoon.bluemoonpay.merchant.dto.response.ApiKeyResponse;
import com.bluemoon.bluemoonpay.merchant.entity.ApiKey;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface ApiKeyMapper {
    ApiKeyCreateResponse toCreateResponse(ApiKey apiKey);
    List<ApiKeyResponse> toResponseList(List<ApiKey> apiKeyList);
}
