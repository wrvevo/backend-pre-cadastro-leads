package com.example.leads.service;

import com.example.leads.model.Lead;
import org.springframework.stereotype.Service;

@Service
public class LeadService {
    public String cadastrar(Lead lead) {
        return "Lead " + lead.getNome() + " cadastrado com sucesso!";
    }
}