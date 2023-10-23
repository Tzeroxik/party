package com.shroomander.party.web.api.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.shroomander.party.configuration")
@EnableJpaRepositories(basePackages = "com.shroomander.party.persistence")
public class PartyConfiguration {

}
