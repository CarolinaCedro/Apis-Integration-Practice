package io.github.com.priceexchangesystem.application.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientOrigin {
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String address;
    private String phone;
    private String dtborn;
    private BigDecimal limitcredit;
    private LocalDate dtcreated;


}
