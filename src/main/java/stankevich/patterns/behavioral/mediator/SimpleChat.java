package stankevich.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleChat implements Chat {
    User admin;
    List<User> customers = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addCustomerToChat(User customer) {
        customers.add(customer);
    }

    @Override
    public void sendMessage(String message, User sender) {
        customers.forEach(user -> {
            if (user != sender) {
                user.getMessage(message);
            }
        });
        admin.getMessage(message);
    }
}
