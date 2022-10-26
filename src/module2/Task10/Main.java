package module2.Task10;

public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel", "3", 4);
        OperatingSystem operatingSystem = new OperatingSystem("Windows", 5.0);
        Ram ram = new Ram(256, "Intel");
        Ssd ssd = new Ssd(1024, 500);
        Notebook notebook = new Notebook(cpu, operatingSystem, ram, ssd);
        System.out.println(notebook);
    }
}
