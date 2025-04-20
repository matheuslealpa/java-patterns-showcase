package com.leal.builder;

public class Carro {

    private final String marca;
    private final String modelo;
    private final int ano;
    private final boolean automatico;
    private final String cor;

    Carro(CarroBuilder builder) {
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.ano = builder.ano;
        this.automatico = builder.automatico;
        this.cor = builder.cor;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s (%s)", marca, modelo, ano, automatico ? "Automático" : "Manual", cor);
    }
}
