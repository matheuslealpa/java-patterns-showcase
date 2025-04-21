package com.leal.service;

public class CepServiceProxy implements CepService{

    private final CepService realService;

    public CepServiceProxy(CepService realService) {
        this.realService = realService;
    }

    @Override
    public String findByCep(String cep) {
        System.out.println("[Proxy] Consultando CEP: " + cep);
        try {
            String resultado = realService.findByCep(cep);
            System.out.println("[Proxy] Sucesso na chamada");
            return resultado;
        } catch (Exception e) {
            System.out.println("[Proxy] Falha ao consultar parceiro: " + e.getMessage());
            return "[Fallback] Endereço não disponível no momento para CEP: " + cep;
        }
    }

}
