package com.bluemoon.bluemoonpay.payment.statemachine;

import com.bluemoon.bluemoonpay.common.enums.PaymentActor;
import com.bluemoon.bluemoonpay.common.enums.PaymentEvent;
import com.bluemoon.bluemoonpay.common.enums.PaymentStatus;
import com.bluemoon.bluemoonpay.payment.entity.Payment;
import com.bluemoon.bluemoonpay.payment.entity.PaymentTransitionLog;
import com.bluemoon.bluemoonpay.payment.repository.PaymentTransitionLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PaymentTransitionService {

    private final PaymentTransitionLogRepository paymentTransitionLogRepository;
    private final PaymentStateMachine paymentStateMachine;

    public PaymentStatus apply(Payment payment, PaymentEvent event) {
        PaymentStatus current = payment.getStatus();
        PaymentStatus next = paymentStateMachine.transition(current, event);
        payment.setStatus(next);
        PaymentTransitionLog log = PaymentTransitionLog.builder()
                .payment(payment)
                .fromStatus(current)
                .event(event)
                .toStatus(next)
                .actor(PaymentActor.SYSTEM) //TODO: fetch merchant context to identify actor
                .occurredAt(LocalDateTime.now())
                .build();

        paymentTransitionLogRepository.save(log);
        return next;
    }
}
