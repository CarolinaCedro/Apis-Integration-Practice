package io.github.com.priceexchangesystem.application.controller;

import io.github.com.priceexchangesystem.application.models.BankDisplay;
import io.github.com.priceexchangesystem.application.models.BankOrigin;
import io.github.com.priceexchangesystem.application.models.Product;
import io.github.com.priceexchangesystem.application.models.enums.Category;
import io.github.com.priceexchangesystem.application.models.enums.CoinsAvailable;
import io.github.com.priceexchangesystem.application.services.AbstractModelService;
import io.github.com.priceexchangesystem.application.services.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/conversion")
public class ProductController extends AbstractController<Product> {

    private final ProductServiceImpl service;

    @Override
    protected AbstractModelService<Product> getService() {
        return service;
    }
    private final String url = "http://localhost:8081/api/conversion";

    @Autowired
    private RestTemplate restTemplate;



    public ProductController(ProductServiceImpl service) {
        this.service = service;
    }


    @GetMapping("/convert-and-show")
    public ResponseEntity<String> convertAndShow() {
        String response = restTemplate.getForObject(url + "/hello", String.class);
        return ResponseEntity.ok("A resposta da api de conversão é: " + response);
    }


    @GetMapping("/show-just-name-Bank")
    public ResponseEntity<List<BankDisplay>> showNameBank() {
        ResponseEntity<BankOrigin[]> responseEntity = restTemplate.getForEntity(url + "/show-data-for-bank", BankOrigin[].class);
        List<BankOrigin> bankOriginList = Arrays.asList(responseEntity.getBody());
        String msg = "Uma mensagem que será integrada exemplo";
        Product product = new Product(1l, "Celular", "Uma descrição", CoinsAvailable.EURO, new BigDecimal("100.00"), Category.ALIMENTOS);

        List<BankDisplay> bankDisplayList = bankOriginList.stream()  // Cria um fluxo a partir da lista de BankOrigin
                .map(bankOrigin -> new BankDisplay(bankOrigin.getName(), bankOrigin.getCountryCode(), msg, product))  // Para cada BankOrigin, cria um BankDisplay com name e countryCode
                .collect(Collectors.toList());  // Coleta os BankDisplay transformados em uma lista

        return ResponseEntity.ok(bankDisplayList);
    }


    //passando por get para evitar abrir o postman
    @GetMapping("/create-bank")
    public ResponseEntity<String> sendNewBankAp2() {
        BankOrigin bankOrigin = new BankOrigin("Banco da carol", "67687", "bic", "Rua da riqueza");
        ResponseEntity<String> response = restTemplate.postForEntity(url + "/create-new-bank", bankOrigin, String.class);
        return ResponseEntity.ok("Banco criado com sucesso !");
    }


    @GetMapping("/show-data-of-api2")
    public ResponseEntity<List<BankOrigin>> showData() {
        ResponseEntity<BankOrigin[]> responseEntity = restTemplate.getForEntity(url + "/show-data-for-bank", BankOrigin[].class);
        List<BankOrigin> responseList = Arrays.asList(responseEntity.getBody());
        return ResponseEntity.ok(responseList);
    }



}
