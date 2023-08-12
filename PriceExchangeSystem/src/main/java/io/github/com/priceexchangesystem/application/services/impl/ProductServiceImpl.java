package io.github.com.priceexchangesystem.application.services.impl;

import io.github.com.priceexchangesystem.application.models.Product;
import io.github.com.priceexchangesystem.application.repository.ProductRepository;
import io.github.com.priceexchangesystem.application.services.AbstractModelService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends AbstractModelService<Product> {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<Product, Long> getRepository() {
        return repository;
    }

}
