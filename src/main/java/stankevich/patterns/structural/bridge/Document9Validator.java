package stankevich.patterns.structural.bridge;

public class Document9Validator implements DocumentValidator{
    @Override
    public void validate() {
        System.out.println("validate document 9");
    }
}
