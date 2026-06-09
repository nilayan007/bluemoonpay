package com.bluemoon.bluemoonpay.payment.entity;


import com.bluemoon.bluemoonpay.common.enums.PaymentActor;
import com.bluemoon.bluemoonpay.common.enums.PaymentEvent;
import com.bluemoon.bluemoonpay.common.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "payment_transition_log")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentTransitionLog {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20, name = "from_status")
    private PaymentStatus fromStatus;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20, name = "event")
    private PaymentEvent event;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20, name = "to_status")
    private PaymentStatus toStatus;


    @Enumerated(EnumType.STRING)
    @Column(length = 500, name = "actor")
    private PaymentActor actor; // e.g., "SYSTEM", "USER",

    @Column(length = 1000, name = "occurred_at", nullable = false)
    private LocalDateTime occurredAt;
}
