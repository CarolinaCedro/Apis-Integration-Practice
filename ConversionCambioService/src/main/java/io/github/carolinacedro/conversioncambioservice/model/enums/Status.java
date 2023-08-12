package io.github.carolinacedro.conversioncambioservice.model.enums;

public enum Status {

    ATIVO("ATIVO"),
    INATIVO("INATIVO");


    private String codeName;

    Status(String codeName) {
        this.codeName = codeName;
    }

    public String getCodeName() {
        return codeName;
    }
}
