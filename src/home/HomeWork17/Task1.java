package home.HomeWork17;

public class Task1 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
            System.out.println(a);
        } catch (ArithmeticException exception) {
            System.out.println("Exception: На ноль делить нельзя!");
        }
    }
}
