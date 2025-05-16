package com.example.application.port.out;

import com.example.domain.model.Lead;

public interface KafkaProducerPort {
    void enviar(Lead lead);
}