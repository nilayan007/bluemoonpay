package com.bluemoon.bluemoonpay.payment.config;

import com.bluemoon.bluemoonpay.common.enums.PaymentMethods;
import com.bluemoon.bluemoonpay.payment.processor.strategy.CardPaymentProcessor;
import com.bluemoon.bluemoonpay.payment.processor.PaymentProcessor;
import com.bluemoon.bluemoonpay.payment.processor.strategy.NetBankingPaymentProcessor;
import com.bluemoon.bluemoonpay.payment.processor.strategy.UpiPaymentProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class PaymentProcessorConfig {

    @Bean
    public Map<PaymentMethods, PaymentProcessor> paymentProcessorMap() {
        return Map.of(
                PaymentMethods.CARD, new CardPaymentProcessor(),
                PaymentMethods.NETBANKING, new NetBankingPaymentProcessor(),
                PaymentMethods.UPI, new UpiPaymentProcessor()
        );
    }
}