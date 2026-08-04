package com.bluemoon.bluemoonpay.operations.entity;

import com.bluemoon.bluemoonpay.common.entity.BaseEntity;
import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class SettlementPaymentId  {

    private UUID settlementId;

    private UUID paymentId;
}

