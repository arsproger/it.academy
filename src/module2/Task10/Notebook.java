package module2.Task10;

public class Notebook {
    private Cpu cpu;
    private OperatingSystem operatingSystem;
    private Ram ram;
    private Ssd ssd;

    public Notebook(Cpu cpu, OperatingSystem operatingSystem, Ram ram, Ssd ssd) {
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.ssd = ssd;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
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

    @Override
    public String toString() {
        return "Notebook{" +
                "cpu=" + cpu +
                ", operatingSystem=" + operatingSystem +
                ", ram=" + ram +
                ", ssd=" + ssd +
                '}';
    }
}
