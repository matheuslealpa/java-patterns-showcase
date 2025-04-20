package com.leal.builder;

public class UsuarioBuilder {
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    public UsuarioBuilder withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public UsuarioBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UsuarioBuilder withTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public UsuarioBuilder withCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public Usuario build() {
        if (nome == null || email == null) {
            throw new IllegalArgumentException("Nome e email são obrigatórios");
        }
        return new Usuario(nome, email, telefone, cpf);
    }
}
