package com.example.lead.application.service;

public class LeadDTO {
    public String nome;
    public String cpf;
    public String telefone;
    public String email;
    public String origem;

    public LeadDTO(String nome, String cpf, String telefone, String email, String origem) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.origem = origem;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getOrigem() { return origem; }
}