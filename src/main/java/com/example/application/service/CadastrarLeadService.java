package com.example.application.service;

import com.example.application.port.in.CadastrarLeadUseCase;
import com.example.application.port.out.LeadRepositoryPort;
import com.example.domain.model.Lead;
import org.springframework.stereotype.Service;

@Service
public class CadastrarLeadService implements CadastrarLeadUseCase {

    private final LeadRepositoryPort repository;

    public CadastrarLeadService(LeadRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrar(Lead lead) {
        repository.salvar(lead);
    }
}