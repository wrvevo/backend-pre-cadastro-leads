package com.example.adapter.in.web;

import com.example.application.port.in.CadastrarLeadUseCase;
import com.example.domain.model.Lead;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/leads")
public class LeadController {

    private final CadastrarLeadUseCase useCase;

    public LeadController(CadastrarLeadUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public void cadastrar(@RequestBody Lead lead) {
        useCase.cadastrar(lead);
    }
}