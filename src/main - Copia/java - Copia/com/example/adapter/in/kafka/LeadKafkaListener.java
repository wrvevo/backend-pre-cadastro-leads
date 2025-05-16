package com.example.adapter.in.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LeadKafkaListener {

    @KafkaListener(topics = "leads-input", groupId = "lead-group")
    public void processaLead(ConsumerRecord<String, String> record) {
        System.out.println("Recebido do Kafka: " + record.value());
        // lógica de persistência, transformação ou auditoria
    }
}