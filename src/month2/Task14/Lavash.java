package month2.Task14;

public class Lavash extends Bread{
    public Lavash(double weigth, double price) {
        super(weigth, price);
        System.out.println("Я лаваш меня испекли!");
    }
    void wrapUp() {
        System.out.println("Wrap up");
    }

}
