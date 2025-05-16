package com.example.leads.service;

import com.example.leads.model.Lead;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeadServiceTest {

    @Test
    void deveCadastrarLeadComSucesso() {
        LeadService service = new LeadService();
        Lead lead = new Lead();
        lead.setNome("Maria");

        String resultado = service.cadastrar(lead);

        assertEquals("Lead Maria cadastrado com sucesso!", resultado);
    }
}