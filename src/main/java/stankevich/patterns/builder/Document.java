package stankevich.patterns.builder;

public class Document {
    private int number;
    private String printForm;
    private Type type;

    @Override
    public String toString() {
        return "Document{" +
                "number=" + number +
                ", printForm='" + printForm + '\'' +
                ", type=" + type +
                '}';
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrintForm(String printForm) {
        this.printForm = printForm;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
