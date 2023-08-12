package io.github.com.priceexchangesystem.application.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.github.com.priceexchangesystem.application.models.ClientOrigin;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ClientOriginDeserializer extends JsonDeserializer<ClientOrigin> {

    @Override
    public ClientOrigin deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ClientOrigin clientOrigin = new ClientOrigin();

        clientOrigin.setId(jsonParser.getLongValue());
        clientOrigin.setName(jsonParser.nextTextValue());
        clientOrigin.setEmail(jsonParser.nextTextValue());
        clientOrigin.setCpf(jsonParser.nextTextValue());
        clientOrigin.setAddress(jsonParser.nextTextValue());
        clientOrigin.setPhone(jsonParser.nextTextValue());
        clientOrigin.setDtborn(jsonParser.nextTextValue());
        clientOrigin.setLimitcredit(new BigDecimal(jsonParser.nextTextValue()));
        clientOrigin.setDtcreated(LocalDate.parse(jsonParser.nextTextValue()));

        return clientOrigin;
    }
}
