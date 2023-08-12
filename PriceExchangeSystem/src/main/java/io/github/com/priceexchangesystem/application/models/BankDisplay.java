package io.github.com.priceexchangesystem.application.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDisplay {

    private String name;
    private String countryCode;
    private String msg;
    private Product product;

}
