package stankevich.patterns.structural.facade;

public class OrderFacade {

    private final StoreService storeService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public OrderFacade() {
        this.storeService = new StoreService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    // публичный метод, который скрывает всю сложность
    public void placeOrder(String productId, String user, String shippingAddress) {
        System.out.println("--- Начинаем обработку заказа ---");

        if (storeService.isAvailable(productId)) {
            paymentService.processPayment(user, 199.99);

            shippingService.shipProduct(productId, shippingAddress);

            System.out.println("--- Заказ успешно оформлен! ---");
        } else {
            System.out.println("--- Товар отсутствует на складе. Заказ отменен. ---");
        }
    }
}
