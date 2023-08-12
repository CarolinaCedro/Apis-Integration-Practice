package io.github.carolinacedro.conversioncambioservice.controller;

import io.github.carolinacedro.conversioncambioservice.service.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public abstract class AbstrachController<T> {

    protected abstract ModelService<T> getService();

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        List<T> data = getService().findAll();
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
