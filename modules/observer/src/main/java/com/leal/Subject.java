package com.leal;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarAll(String mensagem) {
        for (Observer observer : observers) {
            observer.update(mensagem);
        }
    }

    public void updateEstado() {
        // faz alguma coisa e notifica os observadores
        System.out.println("Estado alterado no Subject!");
        notificarAll("Estado foi alterado.");
    }
}
