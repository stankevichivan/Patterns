package stankevich.patterns.generating.factory;

public class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Отправка SMS: " + message);
    }
}
