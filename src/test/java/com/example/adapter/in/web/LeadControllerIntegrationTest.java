package com.example.adapter.in.web;

import com.example.application.port.in.CadastrarLeadUseCase;
import com.example.application.port.in.dto.LeadInputPort;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.mockito.Mockito.*;

@WebMvcTest(LeadController.class)
class LeadControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CadastrarLeadUseCase cadastrarLeadUseCase;

    @Test
    void deveAceitarRequisicaoPostDeCadastro() throws Exception {
        String payload = "{\"nome\":\"Carlos\",\"cpf\":\"22233344455\",\"email\":\"carlos@email.com\"}";

        mockMvc.perform(post("/api/v1/leads")
                .contentType(APPLICATION_JSON)
                .content(payload))
                .andExpect(status().isOk());

        verify(cadastrarLeadUseCase).cadastrar(any(LeadInputPort.class));
    }
}