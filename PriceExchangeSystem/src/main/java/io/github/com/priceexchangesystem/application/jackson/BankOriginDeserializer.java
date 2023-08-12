package io.github.com.priceexchangesystem.application.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.github.com.priceexchangesystem.application.models.BankOrigin;

import java.io.IOException;

public class BankOriginDeserializer extends JsonDeserializer<BankOrigin> {

    @Override
    public BankOrigin deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        BankOrigin bank = new BankOrigin();
        bank.setName(jsonParser.getValueAsString("name"));
        bank.setAddress(jsonParser.getValueAsString("address"));
        bank.setBic(jsonParser.getValueAsString("bic"));
        bank.setCountryCode(jsonParser.getValueAsString("countryCode"));
        return bank;
    }
}
