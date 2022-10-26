package home.HomeWork9;

public class Ram {
    private double memory;
    private String manufacturer;

    public Ram(double memory, String manufacturer) {
        this.memory = memory;
        this.manufacturer = manufacturer;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
