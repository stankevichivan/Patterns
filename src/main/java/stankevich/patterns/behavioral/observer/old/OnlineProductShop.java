package stankevich.patterns.behavioral.observer.old;

import java.util.ArrayList;
import java.util.List;

public class OnlineProductShop implements Observed {
    List<String> products = new ArrayList<>();
    List<Observer> customers = new ArrayList<>();

    public void addProduct(String product) {
        products.add(product);
        notifyCustomers();
    }

    public void removeProduct(String product) {
        products.remove(product);
        notifyCustomers();
    }


    @Override
    public void addCustomer(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void removeCustomer(Observer observer) {
        customers.remove(observer);
    }

    @Override
    public void notifyCustomers() {
        customers.forEach(observer -> observer.handleEvent(products));
    }
}
