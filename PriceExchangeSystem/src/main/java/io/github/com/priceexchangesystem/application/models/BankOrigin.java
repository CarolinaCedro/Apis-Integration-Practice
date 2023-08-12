package io.github.com.priceexchangesystem.application.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankOrigin {

    private String name;
    private String countryCode;
    private String bic;
    private String address;

}
