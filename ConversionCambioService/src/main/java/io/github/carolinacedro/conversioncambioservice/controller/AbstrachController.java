package io.github.carolinacedro.conversioncambioservice.controller;

import io.github.carolinacedro.conversioncambioservice.service.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

public abstract class AbstrachController<T> {

    protected abstract ModelService<T> getService();

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        List<T> data = getService().findAll();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<T>> findById(@PathVariable Long id) {
        Optional<T> data = getService().findById(id);
        return ResponseEntity.ok(data);
    }


    @PostMapping
    public ResponseEntity<T> create(T body) {
        return ResponseEntity.ok(getService().save(body));
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable Long id, T body) {
        return ResponseEntity.ok(getService().save(body));
    }


}
