package com.example.service;

import com.example.application.port.out.LeadRepositoryPort;
import com.example.application.service.CadastrarLeadService;
import com.example.domain.model.Lead;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class CadastrarLeadServiceTest {

    @Test
    void deveChamarRepositorioComLead() {
        LeadRepositoryPort repo = mock(LeadRepositoryPort.class);
        CadastrarLeadService service = new CadastrarLeadService(repo);
        Lead lead = new Lead("Maria", "12345678901", "maria@email.com");

        service.cadastrar(lead);

        verify(repo).salvar(lead);
    }
}