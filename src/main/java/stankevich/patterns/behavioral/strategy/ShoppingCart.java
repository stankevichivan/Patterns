package stankevich.patterns.behavioral.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double total) {
        if (paymentStrategy == null) {
            System.out.println("Способ оплаты не выбран!");
            return;
        }

        paymentStrategy.pay(total);
    }
}
