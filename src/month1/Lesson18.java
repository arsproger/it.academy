package month1;

public class Lesson18 {
    public static void main(String[] args) {
//            double a = 0;
//            a = Math.sqrt(64);        Корень числа
//        System.out.println(a);
        System.out.println(cylinder());
    }
    public static double squareRectangle(int a, int b) {
        return a * b;
    }
    public static double squareCircle(int radius) {
        return 2 * 3.14 * radius;
    }
    public static double cylinder() {
        double res = squareRectangle(5, 4) + squareCircle(7);
        return res;
    }
}
