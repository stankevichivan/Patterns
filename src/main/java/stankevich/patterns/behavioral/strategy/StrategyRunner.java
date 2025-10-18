package stankevich.patterns.behavioral.strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCard = new CreditCardPayment("1234-1234-1234-1234");
        PaymentStrategy payPal = new PayPalPayment("user@example.com");

        System.out.println("--- Попытка оплаты картой ---");
        cart.setPaymentStrategy(creditCard);
        cart.checkout(150.75);

        System.out.println("\n--- Попытка оплаты через PayPal ---");
        cart.setPaymentStrategy(payPal);
        cart.checkout(80.00);
    }
}
