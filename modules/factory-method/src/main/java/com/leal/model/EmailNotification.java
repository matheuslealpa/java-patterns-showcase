package com.leal.model;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando e-mail: " + message);
    }
}
