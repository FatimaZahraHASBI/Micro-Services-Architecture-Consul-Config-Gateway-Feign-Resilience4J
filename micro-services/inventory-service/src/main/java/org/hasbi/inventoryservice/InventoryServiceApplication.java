package org.hasbi.inventoryservice;

import org.hasbi.inventoryservice.entities.Product;
import org.hasbi.inventoryservice.repo.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            for (int i = 1; i < 10; i++) {
                productRepository.saveAll(List.of(
                        Product.builder()
                                .name("Computer "+i)
                                .price(1000+Math.random()*1020)
                                .quantity(1+200*i)
                                .build()
                ));
            }
        };
    }


}
