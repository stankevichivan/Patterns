package stankevich.patterns.structural.facade;

public class FRunner {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("product-123", "Иван Петров", "г. Москва, ул. Ленина, д. 1");
    }
}
