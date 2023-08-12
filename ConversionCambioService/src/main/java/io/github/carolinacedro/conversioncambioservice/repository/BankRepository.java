package io.github.carolinacedro.conversioncambioservice.repository;

import io.github.carolinacedro.conversioncambioservice.model.Bank;
import io.github.carolinacedro.conversioncambioservice.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
