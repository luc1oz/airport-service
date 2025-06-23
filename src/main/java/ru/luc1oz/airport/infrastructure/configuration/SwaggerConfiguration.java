package ru.luc1oz.airport.infrastructure.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Value(Environment.ARTIFACT_VERSION_VALUE_PATH)
    private String artifactVersion;

    @Value(Environment.APPLICATION_NAME_VALUE_PATH)
    private String applicationName;

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .version(artifactVersion)
                        .title(applicationName));
    }

}
