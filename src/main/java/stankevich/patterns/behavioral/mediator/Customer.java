package stankevich.patterns.behavioral.mediator;

public class Customer implements User {
    private final Chat chat;
    private String name;

    public Customer(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name + " Customer get message: " + message);
    }
}
