package org.hasbi.orderservice.repositories;

import org.hasbi.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductItemRepositoey extends JpaRepository<ProductItem,Long> {
}
