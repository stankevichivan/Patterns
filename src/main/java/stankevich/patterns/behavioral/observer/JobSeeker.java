package stankevich.patterns.behavioral.observer;

public class JobSeeker implements Observer {

    private final String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String vacancy) {
        System.out.println("Привет, " + name + "! Появилась новая вакансия: " + vacancy);
    }
}
