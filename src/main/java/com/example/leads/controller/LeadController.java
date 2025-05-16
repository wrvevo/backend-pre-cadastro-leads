package com.example.leads.controller;

import com.example.leads.model.Lead;
import com.example.leads.service.LeadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/leads")
public class LeadController {

    private final LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }

    @PostMapping
    public ResponseEntity<String> cadastrar(@RequestBody Lead lead) {
        return ResponseEntity.ok(leadService.cadastrar(lead));
    }
}