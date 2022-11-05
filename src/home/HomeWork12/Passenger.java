package home.HomeWork12;

public class Passenger {
    private double price;
    private String name;
    private int number;
    public Passenger(double price, String name, int number) {
        this.price = price;
        this.name = name;
        this.number = number;
    }
    public Passenger() {}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

}

