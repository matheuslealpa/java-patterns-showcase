package com.leal;

import com.leal.service.*;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {

        CepService real = new CepServiceImpl();
        CepService proxy = new CepServiceProxy(real);

        System.out.println(proxy.findByCep("66000-000"));
        System.out.println(proxy.findByCep("00000-000"));

        //
        Documento doc1 = new DocumentoProxy(new DocumentoReal("SECRETS"), "admin");
        doc1.exibir();
        Documento doc2 = new DocumentoProxy(new DocumentoReal("SECRETS"), "convidado");
        doc2.exibir();

    }
}
