package com.leal;


public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new ObservadorConsole());
        subject.addObserver(new ObservadorLogger());

        subject.updateEstado();
    }
}

