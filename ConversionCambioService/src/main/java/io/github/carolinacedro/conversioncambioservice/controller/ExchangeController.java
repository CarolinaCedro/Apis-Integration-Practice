package io.github.carolinacedro.conversioncambioservice.controller;

import io.github.carolinacedro.conversioncambioservice.model.Bank;
import io.github.carolinacedro.conversioncambioservice.model.ExchangeRate;
import io.github.carolinacedro.conversioncambioservice.service.impl.BankServiceImpl;
import io.github.carolinacedro.conversioncambioservice.service.impl.ExchangeRateServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/conversion")
public class ExchangeController {

    private final ExchangeRateServiceImpl service;
    private final BankServiceImpl bankService;

    public ExchangeController(ExchangeRateServiceImpl service, BankServiceImpl bankService) {
        this.service = service;
        this.bankService = bankService;
    }


    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Uma mensagem de deu tudo certo");
    }

    @GetMapping("/show-data-for-bank")
    public ResponseEntity<List<Bank>> showData() {
        return ResponseEntity.ok(bankService.getAll());
    }

    @PostMapping("/create-new-bank")
    public ResponseEntity<Bank> createBankData(@RequestBody Bank body) {
        return ResponseEntity.ok(bankService.createBank(body));
    }

    @GetMapping
    public ResponseEntity<List<ExchangeRate>> findAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/cambio/{id}")
    public ResponseEntity<Optional<ExchangeRate>> getCambioById(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.getExchangeRateById(id));
    }

    @PostMapping("/conversion")
    public ResponseEntity<ExchangeRate> conversion(@RequestBody ExchangeRate exchangeRate) {
        return ResponseEntity.ok(service.conversionCoin(exchangeRate));
    }


}
