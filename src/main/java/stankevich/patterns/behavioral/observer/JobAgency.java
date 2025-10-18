package stankevich.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String vacancy) {
        System.out.println("--- Уведомляем подписчиков о новой вакансии ---");
        for (Observer observer : observers) {
            observer.handleEvent(vacancy);
        }
    }

    public void postNewVacancy(String vacancy) {
        System.out.println("Агентство публикует новую вакансию: " + vacancy);
        notifyObservers(vacancy);
    }
}
