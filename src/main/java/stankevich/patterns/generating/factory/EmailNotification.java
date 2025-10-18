package stankevich.patterns.generating.factory;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Отправка Email: " + message);
    }
}
