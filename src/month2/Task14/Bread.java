package month2.Task14;

public class Bread {
    double weigth;
    double price;
    void patterns() {
        System.out.println("patterns");
    }
    void bake() {
        System.out.println("Bake");
    }
    void wrap() {
        System.out.println("Wrap");
    }
    public Bread(double weigth, double price) {
        this.weigth = weigth;
        this.price = price;
    }
}
