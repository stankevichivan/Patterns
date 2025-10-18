package stankevich.patterns.behavioral.observer;

public class ORunner {
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Observer ivan = new JobSeeker("Иван");
        Observer yana = new JobSeeker("Яна");

        jobAgency.addObserver(ivan);
        jobAgency.addObserver(yana);

        jobAgency.postNewVacancy("Java Developer");

        System.out.println("\n--- Яна нашла работу и отписалась ---");
        jobAgency.removeObserver(yana);

        jobAgency.postNewVacancy("Python Developer");
    }
}
