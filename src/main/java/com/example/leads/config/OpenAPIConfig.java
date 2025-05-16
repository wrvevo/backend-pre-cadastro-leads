package com.example.leads.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(info = @Info(
    title = "API de Pré-Cadastro de Leads",
    version = "v1",
    description = "Documentação automática da API de pré-cadastro"
))
@Configuration
public class OpenAPIConfig {}