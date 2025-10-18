package stankevich.patterns.structural.adapter.old;

import stankevich.patterns.structural.adapter.old.MemoryCardAdapter;
import stankevich.patterns.structural.adapter.old.Usb;

public class AdapterRunner {
    public static void main(String[] args) {
        Usb usb = new MemoryCardAdapter();
        usb.connect();
    }
}
