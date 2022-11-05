package module2.Task15;

public class Electronic {
    String model;
    int price;
    String createData;

    public Electronic(String model, int price, String createData) {
        this.model = model;
        this.price = price;
        this.createData = createData;
    }

    void start() {
        System.out.println("Start!");
    }
    void off() {
        System.out.println("Off!");
    }

}
