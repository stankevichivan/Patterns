package stankevich.patterns.generating.factory;

// Создатель (Creator) с фабричным методом
abstract class NotificationFactory {

    public abstract Notification createNotification(); // Фабричный метод
}
