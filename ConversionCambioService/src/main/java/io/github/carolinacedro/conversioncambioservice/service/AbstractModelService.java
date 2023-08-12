package io.github.carolinacedro.conversioncambioservice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractModelService<T> implements ModelService<T> {

    protected abstract JpaRepository<T, Long> getRepository();

    @Override
    public T save(T model) {
        return getRepository().save(model);
    }

    @Override
    public Optional<T> findById(Long id) {
        return getRepository().findById(id);
    }

    @Override
    public T update(String id, T model) {
        return getRepository().save(model);
    }

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }
}




