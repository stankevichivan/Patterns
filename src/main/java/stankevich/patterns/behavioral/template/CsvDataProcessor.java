package stankevich.patterns.behavioral.template;

public class CsvDataProcessor extends DataProcessor {
    @Override
    protected void extractData() {
        System.out.println("Извлекаем данные из CSV файла, разделяя их по запятой.");
    }

    @Override
    protected void processData() {
        System.out.println("Обрабатываем данные из CSV: строим таблицы.");
    }
}
