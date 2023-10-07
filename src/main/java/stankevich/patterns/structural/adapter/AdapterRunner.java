package stankevich.patterns.structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        Usb usb = new MemoryCardAdapter();
        usb.connect();
    }
}
