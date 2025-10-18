package stankevich.patterns.behavioral.chain.old;

public abstract class Validator {
    private Validator next;

    public void setNext(Validator next) {
        this.next = next;
    }

    public void validateAndCallNext() {
        if (validate() && next != null) {
            next.validateAndCallNext();
        }
    }

    protected abstract boolean validate();
}
