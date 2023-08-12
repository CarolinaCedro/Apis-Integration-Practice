package io.github.com.priceexchangesystem.application.repository;

import io.github.com.priceexchangesystem.application.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
