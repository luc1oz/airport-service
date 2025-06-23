package ru.luc1oz.airport.infrastructure.configuration;

public class Environment {

    public static final String APPLICATION_NAME_VALUE_PATH = "${spring.application.name}";

    public static final String ARTIFACT_VERSION_VALUE_PATH = "${info.application.version}";

    public static final String KEYS_TO_SANITIZE_PATH = "management.endpoint.env.keys-to-sanitize";

}
