package com.example.lead.adapter.in.web;

import com.example.lead.application.port.in.LeadUseCase;
import com.example.lead.application.service.LeadDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/leads")
public class LeadController {

    private final LeadUseCase leadUseCase;

    public LeadController(LeadUseCase leadUseCase) {
        this.leadUseCase = leadUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarLead(@RequestBody LeadDTO leadDTO) {
        leadUseCase.cadastrar(leadDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}