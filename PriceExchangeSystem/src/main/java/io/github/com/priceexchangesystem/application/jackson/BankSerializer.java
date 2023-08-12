package io.github.com.priceexchangesystem.application.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.github.com.priceexchangesystem.application.models.BankOrigin;

import java.io.IOException;

public class BankSerializer extends JsonSerializer<BankOrigin> {

    @Override
    public void serialize(BankOrigin bankOrigin, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("name", bankOrigin.getName());
        jsonGenerator.writeStringField("bic", bankOrigin.getBic());
        jsonGenerator.writeStringField("countryCode", bankOrigin.getCountryCode());
        jsonGenerator.writeStringField("address", bankOrigin.getAddress());
        jsonGenerator.writeEndObject();
    }

}
