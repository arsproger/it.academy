package home.HomeWork17;

public class Task2 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException exception) {
            System.out.println("Exception: Нулловая переменная");
        }
    }
}
