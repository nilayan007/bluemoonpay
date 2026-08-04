package com.bluemoon.bluemoonpay.payment.config;
import com.bluemoon.bluemoonpay.common.enums.PaymentMethods;
import com.bluemoon.bluemoonpay.payment.gateway.PaymentAdapter;
import com.bluemoon.bluemoonpay.payment.gateway.adapter.CardPaymentAdapter;
import com.bluemoon.bluemoonpay.payment.gateway.adapter.NetBankingAdapter;
import com.bluemoon.bluemoonpay.payment.gateway.adapter.UpiPaymentAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@RequiredArgsConstructor
@Configuration
public class PaymentAdapterConfig {

    private final NetBankingAdapter netBankingAdapter;
    private final CardPaymentAdapter cardPaymentAdapter;
    private final UpiPaymentAdapter upiPaymentAdapter;


    @Bean
    public Map<PaymentMethods, PaymentAdapter> paymentAdapterMap() {
        return Map.of(
                PaymentMethods.CARD, cardPaymentAdapter,
                PaymentMethods.NETBANKING, netBankingAdapter,
                PaymentMethods.UPI, upiPaymentAdapter
        );
    }
}
