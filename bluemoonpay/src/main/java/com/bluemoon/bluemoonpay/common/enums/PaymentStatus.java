package com.bluemoon.bluemoonpay.common.enums;

public enum PaymentStatus {
    CREATED,
    AUTHORIZING,
    AUTHORIZED,
    CAPTURING,
    CAPTURED,
    FAILED,
    CANCELED,
    REFUNDED,
    PARTIALLY_REFUNDED,
    SETTLED,
    SETTLEMENT_FAILED,
    AUTH_EXPIRED,
    VOIDED,
}
