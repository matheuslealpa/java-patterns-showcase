package com.leal.abstract_factory;

public class ModernCadeira implements Cadeira{
    @Override
    public void sentar() {
        System.out.println("Você está sentando em uma cadeira moderna");
    }
}
