package stankevich.patterns.behavioral.command;

public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        System.out.println("Нажата кнопка на пульте...");
        command.execute();
    }
}
