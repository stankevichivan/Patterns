package stankevich.patterns.behavioral.chain;

public class Purchase {
    private final double amount;

    public Purchase(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
