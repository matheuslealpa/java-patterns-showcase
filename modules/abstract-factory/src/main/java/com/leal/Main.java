package com.leal;

import com.leal.abstract_factory.*;

/**
 * Hello world!
 */
public class Main {

    private final Cadeira cadeira;
    private final Sofa sofa;

    public Main(MobiliaFactory mobiliaFactory) {
        this.cadeira = mobiliaFactory.createCadeira();
        this.sofa = mobiliaFactory.createSofa();
    }

    public void mostrarMobilia() {
        cadeira.sentar();
        sofa.deitar();
    }

    public static void main(String[] args) {
        MobiliaFactory factory = args.length > 0 && args[0].equalsIgnoreCase("moderno")
                ? new ModernMobiliaFactory()
                : new VictorianMobiliaFactory();

        Main shop = new Main(factory);
        shop.mostrarMobilia();

    }
}
