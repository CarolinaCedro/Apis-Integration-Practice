package io.github.com.priceexchangesystem.application.services;

import io.github.com.priceexchangesystem.application.models.Product;
import io.github.com.priceexchangesystem.application.models.enums.Category;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAll();

    Optional<Product> getById(Long id);

    Category getAllCategorys();

    List<Product> getAllProductsByCategory();


}
