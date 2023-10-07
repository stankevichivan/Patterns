package stankevich.patterns.behavioral.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        OnlineProductShop productShop = new OnlineProductShop();
        productShop.addProduct("Table");
        productShop.addProduct("knife");


        Observer customerOne = new Customer("Ivan");
        Observer customerTwo = new Customer("Yana");

        productShop.addCustomer(customerOne);
        productShop.addCustomer(customerTwo);
        productShop.addProduct("tomato");

        productShop.removeProduct("Table");

    }
}
