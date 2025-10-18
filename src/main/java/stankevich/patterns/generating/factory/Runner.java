package stankevich.patterns.generating.factory;

import java.util.Random;

public class Runner {
    static final Random random = new Random();

    public static void main(String[] args) {
        NotificationType notificationType = getNotificationType();
        NotificationFactory notificationFactory = createNotification(notificationType);
        Notification notification = notificationFactory.createNotification();

        notification.send("hello");
    }

    private static NotificationType getNotificationType() {
        NotificationType[] types = NotificationType.values();

        return types[random.nextInt(types.length)];
    }

    private static NotificationFactory createNotification (NotificationType notificationType) {
        return switch (notificationType) {
            case EMAIL -> new EmailNotificationFactory();
            case SMS -> new SmsNotificationFactory();
        };
    }
}
