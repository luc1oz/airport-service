package ru.luc1oz.airport.infrastructure.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ActuatorConfiguration {

    @Bean
    @ConfigurationProperties(prefix = Environment.KEYS_TO_SANITIZE_PATH)
    public List<String> keysToSanitize() {
        return new ArrayList<>();
    }

}

