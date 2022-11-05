package module2.Task14;

public class Baget extends Bread{
    public Baget(double weigth, double price) {
        super(weigth, price);
    }
    int length;
    int amountScarring;
    void scarring() {
        System.out.println("Только в экологичный пакет!");
    }
}
