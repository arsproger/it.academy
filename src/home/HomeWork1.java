package home;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите 3 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + "+" + b + "+" + c + " = " + (a + b + c));
        System.out.println(a + "*" + b + "*" + c + " = " + (a * b * c));
        double res = (double)(a + b + c) / 3;
        System.out.printf("(" + a + "+" + b + "+" + c + ") / 3 = %.3f", res);
    }
}
