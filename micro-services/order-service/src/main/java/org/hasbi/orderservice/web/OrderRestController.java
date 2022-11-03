package org.hasbi.orderservice.web;

import lombok.AllArgsConstructor;
import org.hasbi.orderservice.entities.Order;
import org.hasbi.orderservice.model.Customer;
import org.hasbi.orderservice.model.Product;
import org.hasbi.orderservice.repositories.OrderRepositoey;
import org.hasbi.orderservice.repositories.ProductItemRepositoey;
import org.hasbi.orderservice.service.CustomerRestClientService;
import org.hasbi.orderservice.service.InventoryRestClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController @AllArgsConstructor
public class OrderRestController {
    private OrderRepositoey orderRepositoey;
    private ProductItemRepositoey productItemRepositoey;
    private CustomerRestClientService customerRestClientService;
    private InventoryRestClientService inventoryRestClientService;
    @GetMapping(path = "/fullOrder/{id}")
    public Order getOrder(@PathVariable Long id){
        Order order = orderRepositoey.findById(id).get();
        Customer customer = customerRestClientService.customerById(order.getCustomerId());
        order.setCustomer(customer);
        order.getProductItems().forEach(pi -> {
            Product product = inventoryRestClientService.productById(pi.getProductId());
            pi.setProduct(product);
        });
        return order;
    }
}
