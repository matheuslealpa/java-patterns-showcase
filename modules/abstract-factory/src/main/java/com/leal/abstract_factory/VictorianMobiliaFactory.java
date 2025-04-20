package com.leal.abstract_factory;

public class VictorianMobiliaFactory implements MobiliaFactory{
    @Override
    public Cadeira createCadeira() {
        return new VictorianCadeira();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

