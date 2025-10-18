package stankevich.patterns.behavioral.template;

public class PdfDataProcessor extends DataProcessor {
    @Override
    protected void extractData() {
        System.out.println("Извлекаем текст и изображения из PDF файла.");
    }

    @Override
    protected void processData() {
        System.out.println("Обрабатываем данные из PDF: анализируем текст.");
    }
}
