package com.example.application.service;

import com.example.application.port.in.CadastrarLeadUseCase;
import com.example.application.port.in.dto.LeadInputPort;
import com.example.application.port.out.KafkaProducerPort;
import com.example.application.port.out.LeadRepositoryPort;
import com.example.domain.model.Lead;
import org.springframework.stereotype.Service;

@Service
public class CadastrarLeadService implements CadastrarLeadUseCase {

    private final LeadRepositoryPort repository;
    private final KafkaProducerPort kafka;

    public CadastrarLeadService(LeadRepositoryPort repository, KafkaProducerPort kafka) {
        this.repository = repository;
        this.kafka = kafka;
    }

    @Override
    public void cadastrar(LeadInputPort input) {
        Lead lead = new Lead(input.nome, input.cpf, input.email);
        repository.salvar(lead);
        kafka.enviar(lead);
    }
}