package stankevich.patterns.behavioral.template;

public class TRunner {
    public static void main(String[] args) {
        System.out.println("--- Обработка CSV файла ---");
        DataProcessor csvProcessor = new CsvDataProcessor();
        csvProcessor.processFile("data.csv");

        System.out.println("\n--- Обработка PDF файла ---");
        DataProcessor pdfProcessor = new PdfDataProcessor();
        pdfProcessor.processFile("document.pdf");
    }
}
