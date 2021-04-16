package com.centrol;

/**
 * @TODO to add javadoc
 * 
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.centrol.dao.CustomerRepository;
import com.centrol.model.Customer;

@SpringBootApplication
public class GwCustomerMsApplication {

	Logger logger = LoggerFactory.getLogger(GwCustomerMsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GwCustomerMsApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(new Customer(null, "Bennani", "bennani@gmail.com"));
			customerRepository.save(new Customer(null, "Gregory", "gregory@gmail.com"));
			customerRepository.save(new Customer(null, "Maxwell", "maxwell@gmail.com"));
			customerRepository.findAll().forEach(c -> {
				logger.trace(c.getName() + " " + c.getEmail());
			});
		};
	}

}
