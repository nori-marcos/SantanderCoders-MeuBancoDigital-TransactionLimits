package com.letscode.transactionLimit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TransactionLimitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionLimitApplication.class, args);
	}

}
