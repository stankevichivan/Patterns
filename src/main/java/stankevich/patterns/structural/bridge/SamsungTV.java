package stankevich.patterns.structural.bridge;

public class SamsungTV implements Device {

    private boolean on = false;
    private int volume = 15;
    private int channel = 9;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Samsung TV: Power On");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Samsung TV: Power Off");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("Samsung TV: Volume is " + volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Samsung TV: Channel is " + channel);
    }
}
