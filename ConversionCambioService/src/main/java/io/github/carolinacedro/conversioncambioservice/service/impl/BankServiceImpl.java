package io.github.carolinacedro.conversioncambioservice.service.impl;

import io.github.carolinacedro.conversioncambioservice.model.Bank;
import io.github.carolinacedro.conversioncambioservice.repository.BankRepository;
import io.github.carolinacedro.conversioncambioservice.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService {

    private final BankRepository repository;

    public BankServiceImpl(BankRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Bank> getAll() {
        return repository.findAll();
    }

    @Override
    public Bank createBank(Bank bank) {
        return repository.save(bank);
    }


    @Override
    public Optional<Bank> getById(Long id) {
        return repository.findById(id);
    }
}
