package com.leal.model;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando Push Notification: " + message);
    }
}
