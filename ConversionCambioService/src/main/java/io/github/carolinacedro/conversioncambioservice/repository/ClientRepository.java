package io.github.carolinacedro.conversioncambioservice.repository;

import io.github.carolinacedro.conversioncambioservice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
