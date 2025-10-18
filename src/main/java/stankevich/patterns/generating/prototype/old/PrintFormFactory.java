package stankevich.patterns.generating.prototype.old;

public class PrintFormFactory {
    PrintForm printForm;

    public PrintFormFactory(PrintForm printForm) {
        this.printForm = printForm;
    }

    PrintForm copyPrintForm() {
        return (PrintForm) printForm.copy();
    }
}
