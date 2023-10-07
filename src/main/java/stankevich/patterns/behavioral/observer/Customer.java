package stankevich.patterns.behavioral.observer;

import java.util.List;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> products) {
        System.out.println("Dear " + name + " we have some changes in our products:\n" + products);
    }
}
