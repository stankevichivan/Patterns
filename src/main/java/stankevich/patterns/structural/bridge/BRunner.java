package stankevich.patterns.structural.bridge;

public class BRunner {
    public static void main(String[] args) {
        System.out.println("--- Тестируем простой пульт с телевизором Sony ---");
        Device sony = new SonyTV();
        RemoteControl simpleRemote = new RemoteControl(sony);
        simpleRemote.togglePower();
        simpleRemote.volumeUp();
        simpleRemote.togglePower();

        System.out.println("\n--- Тестируем продвинутый пульт с телевизором Samsung ---");
        Device samsung = new SamsungTV();
        AdvancedRemote advancedRemote = new AdvancedRemote(samsung);
        advancedRemote.togglePower();
        advancedRemote.mute();

        System.out.println("\n--- Тестируем продвинутый пульт с телевизором Sony ---");
        AdvancedRemote advancedRemote1 = new AdvancedRemote(sony);
        advancedRemote1.togglePower();
        advancedRemote1.volumeUp();
        advancedRemote1.mute();
    }
}
