package io.github.com.priceexchangesystem.application.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Aqui estou tentando criar uma tentativa de criar um serviço generico pora fazer chamadas externas para outros serviços.

public abstract class AbstractProviderService<T> implements ProviderService<T> {
    private final RestTemplate restTemplate;

    //Um campo para armazenar o tipo de resposta esperada, que é um array do tipo T[]
    private final Class<T[]> responseListType;
    private final Class<T> responseType;

    protected AbstractProviderService(RestTemplate restTemplate, Class<T[]> responseType, Class<T> responseType1) {
        this.restTemplate = restTemplate;
        this.responseListType = responseType;
        this.responseType = responseType1;
    }

    protected abstract String getUrl();

    protected abstract String getEndPoint();

    @Override
    public List<T> getAll() {
        ResponseEntity<T[]> responseEntity = restTemplate.getForEntity(getUrl() + getEndPoint(), responseListType);
        T[] responseArray = responseEntity.getBody();
        assert responseArray != null;
        return Arrays.asList(responseArray);
    }

    @Override
    public Optional<T> getById(Long id) {
        ResponseEntity<T> responseEntity = restTemplate.getForEntity(getUrl() + getEndPoint() + "/" + id, responseType);
        return Optional.ofNullable(responseEntity.getBody());
    }

    @Override
    public T save(T body) {
        return null;
    }

    @Override
    public T put(Long id, T body) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
