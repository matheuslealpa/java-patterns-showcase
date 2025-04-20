package com.leal;

import com.leal.builder.Usuario;
import com.leal.builder.UsuarioBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UsuarioTest {

    @Test
    public void deveConstruirUsuarioComBuilder() {
        Usuario usuario = new UsuarioBuilder()
                .withNome("Helena")
                .withEmail("helena@email.com")
                .build();

        assertEquals("Helena", usuario.nome());
        assertEquals("helena@email.com", usuario.email());
    }
}
