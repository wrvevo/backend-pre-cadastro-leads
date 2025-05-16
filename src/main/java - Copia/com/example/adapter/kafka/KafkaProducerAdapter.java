package com.example.adapter.out.kafka;

import com.example.application.port.out.KafkaProducerPort;
import com.example.domain.model.Lead;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerAdapter implements KafkaProducerPort {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaProducerAdapter(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void enviar(Lead lead) {
        kafkaTemplate.send("cadastro.leads.recebidos", lead);
    }
}