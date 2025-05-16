package com.example.lead.application.service;

import com.example.lead.application.port.in.LeadUseCase;
import com.example.lead.application.port.out.LeadRepositoryPort;
import com.example.lead.application.port.out.LeadKafkaPort;
import com.example.lead.domain.Lead;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.UUID;

public class CadastrarLeadService implements LeadUseCase {

    private final LeadRepositoryPort repository;
    private final LeadKafkaPort kafka;

    public CadastrarLeadService(LeadRepositoryPort repository, LeadKafkaPort kafka) {
        this.repository = repository;
        this.kafka = kafka;
    }

    @Override
    public void cadastrar(LeadDTO dto) {
        if (!dto.getCpf().matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF inválido");
        }

        Lead lead = new Lead(
            UUID.randomUUID(),
            dto.getNome(),
            Base64.getEncoder().encodeToString(dto.getCpf().getBytes(StandardCharsets.UTF_8)),
            dto.getTelefone(),
            dto.getEmail(),
            LocalDateTime.now(),
            dto.getOrigem()
        );

        repository.salvar(lead);
        kafka.enviar(lead);
    }
}