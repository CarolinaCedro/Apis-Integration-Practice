package io.github.carolinacedro.conversioncambioservice.model.enums;

public enum CoinsAvailable {

    USD("USD"),
    REAL("REAL"),
    EURO("EURO");

    private String coin;

    CoinsAvailable(String coin) {
        this.coin = coin;
    }

    public String getCoin() {
        return coin;
    }
}
