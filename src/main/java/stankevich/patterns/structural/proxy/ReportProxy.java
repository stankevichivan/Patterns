package stankevich.patterns.structural.proxy;

public class ReportProxy implements Report {
    private HeavyReport realReport;

    @Override
    public void generate() {

        if (realReport == null) {
            System.out.println("Proxy is creating the real report object now...");
            realReport = new HeavyReport();
        }

        realReport.generate();
    }
}
