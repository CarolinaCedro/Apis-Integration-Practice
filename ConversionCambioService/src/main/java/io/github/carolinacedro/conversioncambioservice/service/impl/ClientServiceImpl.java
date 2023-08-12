package io.github.carolinacedro.conversioncambioservice.service.impl;

import io.github.carolinacedro.conversioncambioservice.model.Client;
import io.github.carolinacedro.conversioncambioservice.repository.ClientRepository;
import io.github.carolinacedro.conversioncambioservice.service.AbstractModelService;
import io.github.carolinacedro.conversioncambioservice.service.ClientService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl extends AbstractModelService<Client> implements ClientService {

    private final ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<Client, Long> getRepository() {
        return repository;
    }
}
