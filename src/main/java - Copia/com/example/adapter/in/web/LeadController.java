package com.example.adapter.in.web;

import com.example.application.port.in.CadastrarLeadUseCase;
import com.example.application.port.in.dto.LeadInputPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/leads")
public class LeadController {

    private final CadastrarLeadUseCase useCase;

    public LeadController(CadastrarLeadUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody LeadInputPort leadDto) {
        useCase.cadastrar(leadDto);
        return ResponseEntity.ok().build();
    }
}