package com.bluemoon.bluemoonpay.operations.entity;

import com.bluemoon.bluemoonpay.common.entity.BaseEntity;
import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class SettlementPaymentId  extends BaseEntity {

    private UUID settlementId;

    private UUID paymentId;
}

