package com.example.application.port.out;

import com.example.domain.model.Lead;

public interface LeadRepositoryPort {
    void salvar(Lead lead);
}