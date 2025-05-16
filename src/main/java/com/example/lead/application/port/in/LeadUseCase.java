package com.example.lead.application.port.in;

import com.example.lead.application.service.LeadDTO;

public interface LeadUseCase {
    void cadastrar(LeadDTO leadDTO);
}