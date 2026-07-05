package com.bluemoon.bluemoonpay.payment.mapper;

import com.bluemoon.bluemoonpay.payment.dto.response.OrderResponse;
import com.bluemoon.bluemoonpay.payment.entity.OrderRecord;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {

    OrderResponse toResponse(OrderRecord orderRecord);
}
