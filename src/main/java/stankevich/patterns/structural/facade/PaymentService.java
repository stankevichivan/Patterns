package stankevich.patterns.structural.facade;

public class PaymentService {

    public void processPayment(String user, double amount) {
        System.out.println("Проведение платежа для пользователя " + user + " на сумму " + amount);
    }
}
