package month2.Task15;

public class Notebook extends Electronic{
    int ram;
    String cpu;
    String user;

    public Notebook(String model, int price, String createData, int ram, String cpu, String user) {
        super(model, price, createData);
        this.ram = ram;
        this.cpu = cpu;
        this.user = user;
    }

    @Override
    void start() {
        System.out.println("Ноутбук включается!");
    }
    void hello() {
        System.out.println("Welcome " + this.user);
    }
    void download(String name) {
        System.out.println(name + " скачан");
    }
}
