package io.github.com.priceexchangesystem.application.jackson;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.github.com.priceexchangesystem.application.models.BankOrigin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(customModule());
        return objectMapper;
    }

    private Module customModule() {
        SimpleModule module = new SimpleModule();
        module.addSerializer(BankOrigin.class, new BankSerializer());
        module.addDeserializer(BankOrigin.class, new BankOriginDeserializer());
        return module;
    }
}
