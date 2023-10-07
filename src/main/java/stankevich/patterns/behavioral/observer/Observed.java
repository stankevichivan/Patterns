package stankevich.patterns.behavioral.observer;

public interface Observed {
    void addCustomer(Observer observer);
    void removeCustomer(Observer observer);
    void notifyCustomers();

}
