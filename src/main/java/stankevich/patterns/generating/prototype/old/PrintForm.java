package stankevich.patterns.generating.prototype.old;

public class PrintForm implements Copyable {

    private final String name;
    private final int size;

    public PrintForm(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public Object copy() {
        return new PrintForm(name, size);
    }

    @Override
    public String toString() {
        return "PrintForm{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
