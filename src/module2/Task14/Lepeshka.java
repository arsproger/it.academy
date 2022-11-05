package module2.Task14;

public class Lepeshka extends Bread{

    public Lepeshka(double weigth, double price) {
        super(weigth, price);
    }

    void createPrice(int price) {
        this.price = price;
    }
    boolean weight—heck() {
        boolean check = false;
        if(this.weigth == 0) { check = true; }
        return check;
    }
}