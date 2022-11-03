package org.hasbi.customerservice;

import org.hasbi.customerservice.entities.Customer;
import org.hasbi.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.saveAll(List.of(
                    Customer.builder().name("Fatima Zahra").email("hasbi@gmail.com").build(),
                    Customer.builder().name("Hasnaa").email("hasnaa@gmail.com").build(),
                    Customer.builder().name("Achraf").email("achraf@gmail.com").build()
            ));
            customerRepository.findAll().forEach(System.out::println);

        };
    }
}
