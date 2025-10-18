package stankevich.patterns.behavioral.chain;

public class Manager extends Approver {

    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() <= 1000) {
            System.out.println("Менеджер утвердил закупку на сумму: " + purchase.getAmount());
        } else if (nextApprover != null) {
            System.out.println("Менеджер не может утвердить. Передача директору...");
            nextApprover.processRequest(purchase);
        }
    }
}
