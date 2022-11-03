package org.hasbi.orderservice.repositories;

import org.hasbi.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepositoey extends JpaRepository<Order,Long> {
}
