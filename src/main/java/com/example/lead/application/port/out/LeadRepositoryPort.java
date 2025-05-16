package com.example.lead.application.port.out;

import com.example.lead.domain.Lead;

public interface LeadRepositoryPort {
    void salvar(Lead lead);
}