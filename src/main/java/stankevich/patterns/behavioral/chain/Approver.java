package stankevich.patterns.behavioral.chain;

abstract class Approver {
    protected Approver nextApprover;

    public void setNext(Approver next) {
        this.nextApprover = next;
    }

    public abstract void processRequest(Purchase purchase);
}
