package stankevich.patterns.structural.adapter;

public class MemoryCardAdapter extends MemoryCard implements Usb {
    @Override
    public void connect() {
        insert();
        copy();
    }
}
