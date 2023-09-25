package stankevich.patterns.generating.builder;

public class Document700Builder extends DocumentBuilder {
    @Override
    void buildNumber() {
        document.setNumber(700);
    }

    @Override
    void buildPrintForm() {
        document.setPrintForm("info");
    }

    @Override
    void buildType() {
        document.setType(Type.INFO);
    }
}
