package shmodule1;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("В какую степень:");
        int number2 = scanner.nextInt();
        System.out.println(num(number, number2));
    }
    public static int num(int num, int num2) {
        int res = 1;
        res = num;
        for (int i = 1; i < num2; i++) {
            res *= num;
        }
        return res;
    }
}
