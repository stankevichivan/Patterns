package stankevich.patterns.behavioral.chain;

public class CEO extends Approver {

    @Override
    public void processRequest(Purchase purchase) {
        System.out.println("Генеральный директор утвердил закупку на сумму: " + purchase.getAmount());
    }
}
