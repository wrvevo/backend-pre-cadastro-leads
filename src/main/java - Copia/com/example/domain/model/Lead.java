package com.example.domain.model;

public class Lead {
    private String nome;
    private String cpf;
    private String email;

    public Lead(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
}