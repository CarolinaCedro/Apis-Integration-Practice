package io.github.carolinacedro.conversioncambioservice.controller;

import io.github.carolinacedro.conversioncambioservice.model.Client;
import io.github.carolinacedro.conversioncambioservice.service.ModelService;
import io.github.carolinacedro.conversioncambioservice.service.impl.ClientServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer/client")
public class ClientController extends AbstrachController<Client> {

    private final ClientServiceImpl service;

    public ClientController(ClientServiceImpl service) {
        this.service = service;
    }

    @Override
    protected ModelService<Client> getService() {
        return service;
    }
}
