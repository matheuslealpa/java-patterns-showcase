package com.leal.builder;

public class CarroBuilder {

    String marca;
    String modelo;
    int ano;
    boolean automatico;
    String cor;

    public CarroBuilder withMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public CarroBuilder withModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroBuilder withAno(int ano) {
        this.ano = ano;
        return this;
    }

    public CarroBuilder withAutomatico(boolean automatico) {
        this.automatico = automatico;
        return this;
    }

    public CarroBuilder withCor(String cor) {
        this.cor = cor;
        return this;
    }

    public Carro build() {
        // Validação mínima
        if (marca == null || modelo == null || cor == null) {
            throw new IllegalArgumentException("Marca, modelo e cor são obrigatórios");
        }
        return new Carro(this);
    }


}
