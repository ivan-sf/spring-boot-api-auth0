package com.auth0.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;


/**
 * Main entry point of application.
 */
@SpringBootApplication
@OpenAPIDefinition
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
