package com.example.lead.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Lead {
    private UUID id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private LocalDateTime dataCadastro;
    private String origem;

    public Lead(UUID id, String nome, String cpf, String telefone, String email, LocalDateTime dataCadastro, String origem) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.origem = origem;
    }

    public UUID getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public LocalDateTime getDataCadastro() { return dataCadastro; }
    public String getOrigem() { return origem; }
}