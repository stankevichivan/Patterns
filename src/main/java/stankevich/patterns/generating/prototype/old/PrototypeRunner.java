package stankevich.patterns.generating.prototype.old;

public class PrototypeRunner {
    public static void main(String[] args) {

        PrintForm printForm = new PrintForm("info", 24);
        System.out.println(printForm);

        PrintFormFactory factory = new PrintFormFactory(printForm);
        var copiedPrintForm = factory.copyPrintForm();
        System.out.println(copiedPrintForm);

        System.out.println(copiedPrintForm.equals(printForm));
    }
}
