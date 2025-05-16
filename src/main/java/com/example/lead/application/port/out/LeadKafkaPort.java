package com.example.lead.application.port.out;

import com.example.lead.domain.Lead;

public interface LeadKafkaPort {
    void enviar(Lead lead);
}