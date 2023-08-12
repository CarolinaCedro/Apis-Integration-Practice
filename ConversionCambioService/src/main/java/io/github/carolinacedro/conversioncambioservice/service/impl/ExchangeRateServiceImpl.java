package io.github.carolinacedro.conversioncambioservice.service.impl;

import io.github.carolinacedro.conversioncambioservice.model.ExchangeRate;
import io.github.carolinacedro.conversioncambioservice.repository.ExchangeRateRepository;
import io.github.carolinacedro.conversioncambioservice.service.ExchangeRateService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

    private final ExchangeRateRepository repository;

    public ExchangeRateServiceImpl(ExchangeRateRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ExchangeRate> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ExchangeRate> getExchangeRateById(Long id) {
        return repository.findById(id);
    }

    @Override
    public ExchangeRate conversionCoin(ExchangeRate body) {
        return null;
    }
}
