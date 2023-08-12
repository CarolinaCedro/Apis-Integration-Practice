package io.github.com.priceexchangesystem.application.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.github.com.priceexchangesystem.application.models.BankOrigin;
import io.github.com.priceexchangesystem.application.models.ClientOrigin;

import java.io.IOException;

public class ClientOriginSerializer extends JsonSerializer<ClientOrigin> {
    @Override
    public void serialize(ClientOrigin clientOrigin, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeNumberField("id", clientOrigin.getId());
        jsonGenerator.writeStringField("name", clientOrigin.getName());
        jsonGenerator.writeStringField("email", clientOrigin.getEmail());
        jsonGenerator.writeStringField("cpf", clientOrigin.getCpf());
        jsonGenerator.writeStringField("address", clientOrigin.getAddress());
        jsonGenerator.writeStringField("phone", clientOrigin.getPhone());
        jsonGenerator.writeStringField("dtborn", clientOrigin.getDtborn());
        jsonGenerator.writeNumberField("limitcredit", clientOrigin.getLimitcredit());
        jsonGenerator.writeStringField("dtcreated", clientOrigin.getDtcreated().toString());
        jsonGenerator.writeEndObject();
    }
}
