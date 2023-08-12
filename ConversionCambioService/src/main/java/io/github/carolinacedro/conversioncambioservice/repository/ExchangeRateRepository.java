package io.github.carolinacedro.conversioncambioservice.repository;

import io.github.carolinacedro.conversioncambioservice.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {
}
