package com.leal.factory;

import com.leal.type.NotificationType;
import com.leal.model.EmailNotification;
import com.leal.model.Notification;
import com.leal.model.PushNotification;
import com.leal.model.SmsNotification;

public class NotificationFactory {

    private NotificationFactory() {}

    public static Notification of(NotificationType type) {
        return switch (type) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SmsNotification();
            case PUSH -> new PushNotification();
        };
    }
}
