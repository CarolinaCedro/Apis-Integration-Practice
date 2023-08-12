package io.github.com.priceexchangesystem.application.models.enums;

public enum CoinsAvailable {
    USD("USD"),
    REAL("REAL"),
    EURO("EURO");

    private String code;

    CoinsAvailable(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
