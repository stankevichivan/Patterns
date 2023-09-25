package stankevich.patterns.generating.prototype;

public class PrintFormFactory {
    PrintForm printForm;

    public PrintFormFactory(PrintForm printForm) {
        this.printForm = printForm;
    }

    PrintForm copyPrintForm() {
        return (PrintForm) printForm.copy();
    }
}
