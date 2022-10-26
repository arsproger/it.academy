package home.HomeWork9;

import java.util.Arrays;

public class Computer {
    private String brand;
    private String color;
    private String videoCard;
    private Display display;
    private Keyboard keyboard;
    private Ram ram;
    private Ssd ssd;
    private UsbPort usbPort;

    public Computer(String brand, String color, String videoCard, Display display, Keyboard keyboard, Ram ram, Ssd ssd, UsbPort usbPort) {
        this.brand = brand;
        this.color = color;
        this.videoCard = videoCard;
        this.display = display;
        this.keyboard = keyboard;
        this.ram = ram;
        this.ssd = ssd;
        this.usbPort = usbPort;
    }

    void info() {
        System.out.println("Brand: " + this.brand + "\nColor: " + this.color + "\nVideo card: " + this.videoCard +
                "\nDiagonal: " + display.getDiagonal() + "\nManufacturer display: " + display.getManufacturer() +
                "\nMatrix type: " + display.getMatrixType() +
                "\nLayout keyboard: " + Arrays.toString(keyboard.getLayoutKeyboard()) +
                "\nAdditionald digits: " + keyboard.isAdditionalDigits() + "\nBack light: " + keyboard.isBacklight() +
                "\nMemory: " + ram.getMemory() + "\nManufacturer ram: " + ram.getManufacturer() +
                "\nAmount disk: " + ssd.amountDisk + "\nMemory size: " + ssd.memorySize +
                "\nId port: " + usbPort.getIdPort() + "\nType port: " + usbPort.getTypePort());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public UsbPort getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(UsbPort usbPort) {
        this.usbPort = usbPort;
    }
}

