package com.example.application.port.in;

import com.example.domain.model.Lead;
import com.example.application.port.in.dto.LeadInputPort;

public interface CadastrarLeadUseCase {
    void cadastrar(LeadInputPort lead);
}