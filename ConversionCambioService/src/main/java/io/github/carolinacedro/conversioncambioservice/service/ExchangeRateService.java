package io.github.carolinacedro.conversioncambioservice.service;

import io.github.carolinacedro.conversioncambioservice.model.ExchangeRate;

import java.util.List;
import java.util.Optional;

//Retorna detalhes sobre uma taxa de câmbio específica, incluindo sua taxa e moedas envolvidas.

public interface ExchangeRateService {

    List<ExchangeRate> getAll();

    Optional<ExchangeRate> getExchangeRateById(Long id);

    ExchangeRate conversionCoin(ExchangeRate body);
}
