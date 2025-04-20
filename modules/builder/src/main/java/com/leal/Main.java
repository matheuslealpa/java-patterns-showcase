package com.leal;

import com.leal.builder.Carro;
import com.leal.builder.CarroBuilder;
import com.leal.builder.Usuario;
import com.leal.builder.UsuarioBuilder;

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

        Usuario usuario = new UsuarioBuilder()
                .withNome("Matheus Leal")
                .withEmail("matheus@leal.com")
                .withTelefone("91 99999-9999")
                .withCpf("000.000.000-00")
                .build();

        System.out.println(usuario);
    }
}
