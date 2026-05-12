package com.duoc.inkumanga.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${jikan.base-url}")
    private String jikanBaseUrl;

    @Bean
    public WebClient jikanWebClient() {
        return WebClient.builder()
                .baseUrl(jikanBaseUrl)
                .defaultHeader("Accept", "application/json")
                .build();
    }
}