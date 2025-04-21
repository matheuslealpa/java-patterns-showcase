package com.leal.service;

public class DocumentoProxy implements Documento{

    private final DocumentoReal documentoReal;
    private final String usuario;

    public DocumentoProxy(DocumentoReal documentoReal, String usuario) {
        this.documentoReal = documentoReal;
        this.usuario = usuario;
    }

    @Override
    public void exibir() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
            //ignored
        }

        if ("admin".equals(usuario)) {
            documentoReal.exibir();
        }else System.out.println("Acesso negado para o usuário " + usuario);
    }
}
