package io.github.com.priceexchangesystem.application.controller;

import io.github.com.priceexchangesystem.application.models.ClientOrigin;
import io.github.com.priceexchangesystem.application.services.AbstractProviderService;
import io.github.com.priceexchangesystem.application.services.ClientOriginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/integration")
public class ClientController extends AbstractProviderController<ClientOrigin> {

    private final ClientOriginService service;

    public ClientController(ClientOriginService service) {
        this.service = service;
    }

    @Override
    protected AbstractProviderService<ClientOrigin> getService() {
        return this.service;
    }
}
