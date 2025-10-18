package stankevich.patterns.behavioral.chain;

public class Director extends Approver{

    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() <= 5000) {
            System.out.println("Директор утвердил закупку на сумму: " + purchase.getAmount());
        } else if (nextApprover != null) {
            System.out.println("Директор не может утвердить. Передача ген. директору...");
            nextApprover.processRequest(purchase);
        }
    }
}
