package io.github.com.priceexchangesystem.application.controller;

import io.github.com.priceexchangesystem.application.services.AbstractModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public abstract class AbstractController<T> {

    //Aqui basicamente criamos um metodo que obriga a classe concreta a implementar o metodo de pegar a service
    protected abstract AbstractModelService<T> getService();

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        List<T> data = getService().getAll();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    public Optional<T> findById(@PathVariable Long id) {
        return getService().getById(id);
    }

    @PostMapping
    public ResponseEntity<T> create( @RequestBody T body) {
        return ResponseEntity.ok(getService().save(body));
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable Long id, T body) {
        return ResponseEntity.ok(getService().save(body));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        getService().delete(id);
    }


}
