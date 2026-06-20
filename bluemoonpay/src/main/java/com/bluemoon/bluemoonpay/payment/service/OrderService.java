package com.bluemoon.bluemoonpay.payment.service;

import com.bluemoon.bluemoonpay.payment.dto.request.CreateOrderRequest;
import com.bluemoon.bluemoonpay.payment.dto.response.OrderResponse;

import java.util.UUID;

public interface OrderService {
    OrderResponse create(UUID merchantId, CreateOrderRequest request);

}
