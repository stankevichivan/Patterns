package stankevich.patterns.builder;

public class Document9Builder extends DocumentBuilder {
    @Override
    void buildNumber() {
        document.setNumber(9);
    }

    @Override
    void buildPrintForm() {
        document.setPrintForm("plt");
    }

    @Override
    void buildType() {
        document.setType(Type.PAYMENT);
    }
}
