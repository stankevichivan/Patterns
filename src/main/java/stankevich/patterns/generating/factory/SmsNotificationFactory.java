package stankevich.patterns.generating.factory;

public class SmsNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
