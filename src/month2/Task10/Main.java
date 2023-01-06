package month2.Task10;

public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel", "3", 4);
        OperatingSystem operatingSystem = new OperatingSystem("Windows", 5.0);
        Ram ram = new Ram(256, "Intel");
        Ssd ssd = new Ssd(1024, 500);
        Notebook notebook = new Notebook(cpu, operatingSystem, ram, ssd);
        System.out.println(cpu);
        System.out.println(operatingSystem);
        System.out.println(ram);
        System.out.println(ssd);
        System.out.println(notebook);
    }
}
