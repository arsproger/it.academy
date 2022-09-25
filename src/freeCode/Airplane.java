package freeCode;

public class Airplane {
    private String producer;
    private int year, length;
    private double weight, fuel;

    public Airplane(String producer, int year, int length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void info() {
        System.out.println("Изготовитель: " + producer +
                "\nГод выпуска: " + year +
                "\nДлина: " + length + " метров" +
                "\nВес: " + weight + " тонн" +
                "\nКоличество топлива в баке: " + fuel + " литров");
    }
    public void fuelUp(int fuel) {
        this.fuel += fuel;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(int length) {
        this.length = length;
    }
}
