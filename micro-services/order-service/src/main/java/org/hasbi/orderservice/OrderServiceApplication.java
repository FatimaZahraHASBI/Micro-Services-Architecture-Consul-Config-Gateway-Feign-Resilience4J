package org.hasbi.orderservice;

import org.hasbi.orderservice.entities.Order;
import org.hasbi.orderservice.entities.ProductItem;
import org.hasbi.orderservice.enums.OrderStatus;
import org.hasbi.orderservice.model.Customer;
import org.hasbi.orderservice.model.Product;
import org.hasbi.orderservice.repositories.OrderRepositoey;
import org.hasbi.orderservice.repositories.ProductItemRepositoey;
import org.hasbi.orderservice.service.CustomerRestClientService;
import org.hasbi.orderservice.service.InventoryRestClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(
            OrderRepositoey orderRepositoey,
            ProductItemRepositoey productItemRepositoey,
            CustomerRestClientService customerRestClientService,
            InventoryRestClientService inventoryRestClientService
    ){
        return args -> {
            List<Customer> customers=customerRestClientService.allCustomers().getContent().stream().toList();
            List<Product> products=inventoryRestClientService.allProducts().getContent().stream().toList();
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                Order order=Order.builder()
                        .customerId(customers.get(random.nextInt(customers.size())).getId())
                        .status(Math.random()>0.5? OrderStatus.PENDING:OrderStatus.CREATED)
                        .createdAt(new Date())
                        .build();
                Order savedOrder = orderRepositoey.save(order);
                for (int j = 0; j < products.size(); j++) {
                    if (Math.random()>0.70){
                        ProductItem productItem = ProductItem.builder()
                                .order(savedOrder)
                                .productId(products.get(j).getId())
                                .price(products.get(j).getPrice())
                                .quantity(1+random.nextInt(10))
                                .discount(Math.random())
                                .build();
                        productItemRepositoey.save(productItem);
                    }

                }
            }
        };
    }


}
