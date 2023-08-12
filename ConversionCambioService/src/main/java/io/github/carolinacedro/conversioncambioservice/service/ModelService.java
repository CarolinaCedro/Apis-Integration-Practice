package io.github.carolinacedro.conversioncambioservice.service;

import java.util.List;

public interface ModelService<T> {
    T save(T model);

    T update(String idColaborador, T model);

    List<T> findAll();


}

