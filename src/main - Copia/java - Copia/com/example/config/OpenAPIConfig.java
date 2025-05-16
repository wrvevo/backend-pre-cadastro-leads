package com.example.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(info = @Info(title = "API de Leads", version = "1.0", description = "API de pré-cadastro de leads"))
@Configuration
public class OpenAPIConfig {}