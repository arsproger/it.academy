package month3.Task3;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите 2 числа для деления: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException exception) {
            System.out.println("Делить на ноль нельзя!");
        } finally {
            System.out.println("Конец");
        }
    }
}
