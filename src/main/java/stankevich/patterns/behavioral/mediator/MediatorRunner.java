package stankevich.patterns.behavioral.mediator;

public class MediatorRunner {
    public static void main(String[] args) {
        SimpleChat chat = new SimpleChat();
        User admin = new Admin(chat, "Jon");
        User customer1 = new Customer(chat, "Grack");
        User customer2 = new Customer(chat, "Ron");
        chat.setAdmin(admin);
        chat.addCustomerToChat(customer1);
        chat.addCustomerToChat(customer2);

        customer1.sendMessage("Message from Grack");
        System.out.println();
        customer2.sendMessage("message from Ron");
        System.out.println();
        admin.sendMessage("Message from admin Jon");
    }
}
