package com.leal.abstract_factory;

public class VictorianCadeira implements Cadeira {
    @Override
    public void sentar() {
        System.out.println("Você está sentado em uma cadeira vitoriana elegante.");
    }
}
