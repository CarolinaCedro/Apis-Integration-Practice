package io.github.com.priceexchangesystem.application.services;

import io.github.com.priceexchangesystem.application.models.ClientOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/integration")
public class ClientOriginService extends AbstractProviderService<ClientOrigin> {

    protected String url = "http://localhost:8081/api";
    protected String endpoint = "/customer/client";

    @Override
    protected String getUrl() {
        return this.url;
    }

    @Override
    protected String getEndPoint() {
        return this.endpoint;
    }

    protected ClientOriginService(RestTemplate restTemplate) {
        super(restTemplate, ClientOrigin[].class, ClientOrigin.class); // Passa ClientOrigin.class como o responseType
    }
}
