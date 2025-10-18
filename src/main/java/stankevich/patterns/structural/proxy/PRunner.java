package stankevich.patterns.structural.proxy;

public class PRunner {
    public static void main(String[] args) {
        System.out.println("Initializing proxy...");
        Report report = new ReportProxy();

        System.out.println("Proxy initialized. Real report is not created yet.");

        System.out.println("Calling generate() for the first time...");
        report.generate();

        System.out.println("\nCalling generate() for the second time...");
        report.generate();
    }
}
