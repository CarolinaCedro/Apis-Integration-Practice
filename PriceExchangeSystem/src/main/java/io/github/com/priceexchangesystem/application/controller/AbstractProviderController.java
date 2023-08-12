package io.github.com.priceexchangesystem.application.controller;

import io.github.com.priceexchangesystem.application.services.AbstractProviderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;
import java.util.Optional;

public abstract class AbstractProviderController<T> {

    protected abstract AbstractProviderService<T> getService();

    @GetMapping
    public ResponseEntity<List<T>> getAllClients() {
        return ResponseEntity.ok(getService().getAll());
    }

    @GetMapping("/client-by-header")
    public ResponseEntity<T> getClientByHeader(@RequestHeader("idClient") final Long idClient) {
        Optional<T> clientOptional = getService().getById(idClient);

        if (clientOptional.isPresent()) {
            T client = clientOptional.get();
            return ResponseEntity.ok(client);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

