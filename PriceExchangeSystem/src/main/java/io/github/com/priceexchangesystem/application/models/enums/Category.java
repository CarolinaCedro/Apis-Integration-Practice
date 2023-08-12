package io.github.com.priceexchangesystem.application.models.enums;

//eletrônicos, roupas, alimentos,

public enum Category {
    ELETRONICOS("ELETRONICOS"),
    ROUPAS("ROUPAS"),
    ALIMENTOS("ALIMENTOS");


    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
