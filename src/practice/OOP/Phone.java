package practice.OOP;

public class Phone {
    int number;
    String model;
    double weight;
    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {

    }
    public void receiveCall(String nameCall) {
        System.out.println("Звонит " + nameCall);
    }
    public int getNumber(int number) {
        return number;
    }
    public static void main(String[] args) {
        Phone apple = new Phone();
        Phone xiaomi = new Phone();
        Phone samsung = new Phone();
        apple.receiveCall("Арсен");
        System.out.println(apple.getNumber(71001));
        xiaomi.receiveCall("Сергей");
        System.out.println(xiaomi.getNumber(71002));
        samsung.receiveCall("Максим");
        System.out.println(samsung.getNumber(71003));
    }
}
