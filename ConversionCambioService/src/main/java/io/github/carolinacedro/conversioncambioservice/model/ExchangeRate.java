package io.github.carolinacedro.conversioncambioservice.model;

import io.github.carolinacedro.conversioncambioservice.model.enums.CoinsAvailable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


/*
baseCurrency: Representa a moeda da qual a conversão está sendo realizada, ou seja, a moeda a partir da qual você está convertendo. Por exemplo, USD (Dólar Americano).
targetCurrency: Representa a moeda para a qual a conversão está sendo realizada, ou seja, a moeda para a qual você está convertendo. Por exemplo, EUR (Euro).
exchangeRate: O valor da taxa de câmbio entre a moeda base e a moeda de destino. Por exemplo, se baseCurrency for USD e targetCurrency for EUR, esse campo poderia ser 0.85, indicando que 1 USD é equivalente a 0.85 EUR.
rateDate: A data em que a taxa de câmbio foi registrada ou atualizada. Isso é importante porque as taxas de câmbio podem variar ao longo do tempo.
conversionDirection: Um campo que indica a direção da conversão. Pode ser útil se você deseja registrar se a taxa de câmbio é da moeda base para a moeda de destino ou vice-versa.
 */


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeRate {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private CoinsAvailable baseCurrency;
    private CoinsAvailable targetCurrency;
    private BigDecimal exchangeRate;
    private LocalDate rateDate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
