package com.leal;

public class ObservadorConsole implements Observer {

    @Override
    public void update(String mensagem) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
            // ignored
        }
        System.out.println("Console recebeu: " + mensagem);
    }
}
