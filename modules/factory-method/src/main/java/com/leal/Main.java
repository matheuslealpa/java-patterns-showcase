package com.leal;

import com.leal.service.NotificationService;
import com.leal.type.NotificationType;

public class Main {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(NotificationType.EMAIL, "E-mail enviado!");
        notificationService.sendNotification(NotificationType.SMS, "SMS enviado!");
        notificationService.sendNotification(NotificationType.PUSH, "Push enviado!");
    }
}
