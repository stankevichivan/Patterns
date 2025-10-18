package stankevich.patterns.structural.bridge;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Пульт: выключение звука.");
        device.setVolume(0);
    }
}
