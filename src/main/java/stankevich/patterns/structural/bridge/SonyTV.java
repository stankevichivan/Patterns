package stankevich.patterns.structural.bridge;

public class SonyTV implements Device {

    private boolean on = false;
    private int volume = 20;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Sony TV: Включен");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Sony TV: Выключен");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("Sony TV: Громкость установлена на " + volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Sony TV: Канал переключен на " + channel);
    }
}
