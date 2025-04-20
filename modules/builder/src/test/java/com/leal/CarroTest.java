package com.leal;

import com.leal.builder.Carro;
import com.leal.builder.CarroBuilder;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarroTest {

    @Test
    public void deveConstruirCarroComSucesso() {
        Carro carro = new CarroBuilder()
                .withMarca("Honda")
                .withModelo("Civic")
                .withAno(2023)
                .withAutomatico(false)
                .withCor("Preto")
                .build();

        assertNotNull(carro);
        assertEquals("Honda Civic 2023 Manual (Preto)", carro.toString());
    }

    @Test
    public void deveLancarExcecaoQuandoFaltarCamposObrigatorios() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new CarroBuilder()
                    .withModelo("Civic") // falta marca e cor
                    .build();
        });

        assertEquals("Marca, modelo e cor são obrigatórios", exception.getMessage());
    }
}
