package stankevich.patterns.structural.facade;

public abstract class Document {
    protected int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
