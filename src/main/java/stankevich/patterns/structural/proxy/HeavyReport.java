package stankevich.patterns.structural.proxy;

public class HeavyReport implements Report {
    private String reportData;

    public HeavyReport() {
        this.reportData = loadReportFromDatabase();
        System.out.println("Report has been loaded.");
    }

    private String loadReportFromDatabase() {
        try {
            Thread.sleep(3000); // Имитация задержки
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "This is a very large and complex report.";
    }

    @Override
    public void generate() {
        System.out.println("Generating report: " + reportData);
    }
}
