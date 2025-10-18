package stankevich.patterns.behavioral.template;

public abstract class DataProcessor {

    // final, чтобы подклассы не могли изменить структуру алгоритма.
    public final void processFile(String filePath) {
        openFile(filePath);
        extractData();
        processData();
        closeFile(filePath);
    }

    private void openFile(String filePath) {
        System.out.println("Открываем файл: " + filePath);
    }

    private void closeFile(String filePath) {
        System.out.println("Закрываем файл: " + filePath);
    }

    protected abstract void extractData();
    protected abstract void processData();
}
