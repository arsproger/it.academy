package module2.Task10;

public class Cpu {
    private String name;
    private String chastota;
    private int amountYader;

    public Cpu(String name, String chastota, int amountYader) {
        this.name = name;
        this.chastota = chastota;
        this.amountYader = amountYader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChastota() {
        return chastota;
    }

    public void setChastota(String chastota) {
        this.chastota = chastota;
    }

    public int getAmountYader() {
        return amountYader;
    }

    public void setAmountYader(int amountYader) {
        this.amountYader = amountYader;
    }

    @Override
    public String toString() {
        return "Процессор{" +
                "Имя='" + name + '\'' +
                ", Частота='" + chastota + '\'' +
                ", Колво ядер=" + amountYader +
                '}';
    }
}
