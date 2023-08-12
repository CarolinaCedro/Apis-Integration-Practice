package io.github.carolinacedro.conversioncambioservice.model;

/*
*   ID do Cliente: Um identificador único para cada cliente.
    Nome: O nome completo do cliente.
    Email: O endereço de e-mail do cliente, usado para comunicação.
    CPF ou CNPJ: O número do documento de identificação do cliente (CPF para pessoa física, CNPJ para pessoa jurídica).
    Endereço: O endereço de correspondência do cliente.
    Telefone: Número de telefone de contato do cliente.
    Data de Nascimento: A data de nascimento do cliente, no caso de pessoa física.
    Limite de Crédito: O limite máximo de crédito concedido ao cliente para fazer compras.
    Histórico de Compras: Uma lista ou referência aos históricos de compras anteriores do cliente.
    Data de Cadastro: A data em que o cliente foi cadastrado no sistema.
    Status de Ativação: Indica se o cliente está ativo ou inativo no sistema.
* */

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.carolinacedro.conversioncambioservice.model.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String address;
    private String phone;
    private String dtborn;
    private BigDecimal limitcredit;

    @OneToMany(mappedBy = "client") // "customer" é o nome do campo na entidade PurchaseHistory que mapeia essa relação
    @JsonIgnore
    private List<PurchaseHistory> purchasehistory;
    private LocalDate dtcreated;

    @Enumerated(EnumType.STRING)
    private Status status;

}
