package com.leal;

import com.leal.builder.Carro;
import com.leal.builder.CarroBuilder;

public class Main {
    public static void main(String[] args) {
        Carro carro = new CarroBuilder()
                .withMarca("Toyota")
                .withModelo("Corolla")
                .withAno(2024)
                .withAutomatico(true)
                .withCor("Prata")
                .build();

        System.out.println(carro);
    }
}
