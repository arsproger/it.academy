package module1;

import java.util.Scanner;

public class Lesson6part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        while (a > 0) {
//            System.out.println("Первое число: " + a + " Второе число: " +b);
            count += b;
            a--;
        }
        System.out.println("\nОтвет: " + count);

    }
}
