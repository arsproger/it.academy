package home.HomeWork9;

public class Ssd {
    double memorySize;
    int amountDisk;

    public Ssd(double memorySize, int amountDisk) {
        this.memorySize = memorySize;
        this.amountDisk = amountDisk;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public int getAmountDisk() {
        return amountDisk;
    }

    public void setAmountDisk(int amountDisk) {
        this.amountDisk = amountDisk;
    }
}
