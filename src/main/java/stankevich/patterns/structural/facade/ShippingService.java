package stankevich.patterns.structural.facade;

public class ShippingService {

    public void shipProduct(String productId, String address) {
        System.out.println("Отправка товара " + productId + " по адресу: " + address);
    }
}
