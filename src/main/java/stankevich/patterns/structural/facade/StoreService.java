package stankevich.patterns.structural.facade;

public class StoreService {

    public boolean isAvailable(String productId) {
        System.out.println("Проверка наличия товара " + productId + " на складе.");
        return true;
    }
}
