package com.bluemoon.bluemoonpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BluemoonpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BluemoonpayApplication.class, args);
	}

}
