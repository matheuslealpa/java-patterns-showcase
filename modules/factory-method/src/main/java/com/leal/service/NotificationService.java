package com.leal.service;

import com.leal.factory.NotificationFactory;
import com.leal.model.Notification;
import com.leal.type.NotificationType;

public class NotificationService {

    public void sendNotification(NotificationType type, String message) {
        Notification notification = NotificationFactory.of(type);
        notification.send(message);
    }

}
