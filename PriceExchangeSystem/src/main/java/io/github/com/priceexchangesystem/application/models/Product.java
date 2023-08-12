package io.github.com.priceexchangesystem.application.models;

//Produto ID: Um identificador único para cada produto.
//Nome do Produto: O nome descritivo do produto.
//Descrição: Uma descrição detalhada do produto.
//Preço em Moeda Base: O preço do produto na moeda base (por exemplo, USD).
//Moedas Disponíveis: Uma lista das moedas nas quais o preço do produto pode ser consultado.
//Preços em Outras Moedas: Para cada moeda disponível, o preço equivalente do produto nessa moeda.
//Categoria: A categoria à qual o produto pertence (por exemplo, eletrônicos, roupas, alimentos, etc.).


import io.github.com.priceexchangesystem.application.models.enums.Category;
import io.github.com.priceexchangesystem.application.models.enums.CoinsAvailable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameProduct;
    private String description;
    @Enumerated(EnumType.STRING)
    private CoinsAvailable coinsAvailable;
    private BigDecimal pricesOtherCurrency;
    @Enumerated(EnumType.STRING)
    private Category category;

}
