package com.leal.service;

public class DocumentoReal implements Documento{

    private final String conteudo;

    public DocumentoReal(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void exibir() {


        System.out.println("Conteudo do documento " + conteudo);
    }
}
