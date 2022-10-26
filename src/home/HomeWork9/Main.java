package home.HomeWork9;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(15.6, "5/5", "IPS");
        Keyboard keyboard = new Keyboard(true, false);
        Ram ram = new Ram(500, "5/5");
        Ssd ssd = new Ssd(1000, 3);
        UsbPort usbPort = new UsbPort(3.0, 123);
        Computer computer = new Computer("Acer", "Black", "Rtx", display, keyboard, ram, ssd, usbPort);
        computer.info();
    }
}
