package com.leal;

public class ObservadorLogger implements Observer {
    @Override
    public void update(String mensagem) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {
            // ignored
        }
        System.out.println("Logger registrou: " + mensagem);
    }
}
