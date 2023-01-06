package subject.freeCode;
// –еализовать подсчет факториала использу€ цикл for.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите число:");
        int number = scanner.nextInt();
        int result = 1;
         for (int i = 2; i <= number; i++) {
            if(number > 16) {
                System.out.println("¬ведите число по-меньше!");
                break;
            }
            result *= i;
        }
            if (result >= 1) {
                System.out.println("‘акториал числа " + number + " = " + result);
            }

    }
}
