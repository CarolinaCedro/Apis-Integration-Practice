package io.github.com.priceexchangesystem.application.services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractModelService<T> implements ModelService<T> {

    //Eu posso trazer o tipo que estou fazendo a persistencia de dados(no meu caso jpa)
    protected abstract JpaRepository<T, Long> getRepository();

    @Override
    public List<T> getAll() {
        return getRepository().findAll();
    }

    @Override
    public Optional<T> getById(Long id) {
        return getRepository().findById(id);
    }

    @Override
    public T save(T body) {
        return getRepository().save(body);
    }

    @Override
    public T put(Long id, T body) {
        return getRepository().save(body);
    }

    @Override
    public void delete(Long id) {
        getRepository().deleteById(id);
    }


}
