package com.leal.service;

public class CepServiceImpl implements CepService {

    @Override
    public String findByCep(String cep) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
            //ignored
        }

        if ("00000-000".equals(cep)) {
            throw new RuntimeException("Erro na API do parceiro");
        }

        return "Rua Exemplo, Número 123 - CEP " + cep;
    }
}
