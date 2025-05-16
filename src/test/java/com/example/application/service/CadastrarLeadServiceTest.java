package com.example.application.service;

import com.example.application.port.in.dto.LeadInputPort;
import com.example.application.port.out.KafkaProducerPort;
import com.example.application.port.out.LeadRepositoryPort;
import com.example.domain.model.Lead;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class CadastrarLeadServiceTest {

    @Test
    void deveCadastrarLeadChamandoKafkaERepositorio() {
        LeadRepositoryPort repo = mock(LeadRepositoryPort.class);
        KafkaProducerPort kafka = mock(KafkaProducerPort.class);
        CadastrarLeadService service = new CadastrarLeadService(repo, kafka);

        LeadInputPort input = new LeadInputPort();
        input.nome = "Maria";
        input.cpf = "12345678901";
        input.email = "maria@email.com";

        service.cadastrar(input);

        verify(repo).salvar(any(Lead.class));
        verify(kafka).enviar(any(Lead.class));
    }
}