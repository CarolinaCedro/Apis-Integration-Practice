package io.github.carolinacedro.conversioncambioservice.service;

import io.github.carolinacedro.conversioncambioservice.model.Bank;

import java.util.List;
import java.util.Optional;

//Retorna detalhes sobre uma taxa de câmbio específica, incluindo sua taxa e moedas envolvidas.

public interface BankService {

    List<Bank> getAll();

    Bank createBank(Bank bank);

    Optional<Bank> getById(Long id);

}
