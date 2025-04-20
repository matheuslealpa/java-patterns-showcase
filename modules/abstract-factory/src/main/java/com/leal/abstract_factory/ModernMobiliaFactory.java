package com.leal.abstract_factory;

public class ModernMobiliaFactory implements MobiliaFactory{
    @Override
    public Cadeira createCadeira() {
        return new ModernCadeira();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
