package io.github.com.priceexchangesystem.application.services;


import java.util.List;
import java.util.Optional;

public interface ProviderService<T> {
    List<T> getAll();

    Optional<T> getById(Long id);

    T save(T body);

    T put(Long id, T body);

    void delete(Long id);
}
