package io.github.carolinacedro.conversioncambioservice.service;

import java.util.List;
import java.util.Optional;

public interface ModelService<T> {
    T save(T model);

    Optional<T> findById(Long id);

    T update(String idColaborador, T model);

    List<T> findAll();


}

