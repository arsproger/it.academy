package home;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7:");
        int num = scanner.nextInt();
        switch(num) {
                case 1, 3, 5, 7:
                    System.out.println("Число нечетное");
                    break;
                case 2, 4, 6:
                    System.out.println("Число четное");
                    break;
        }
    }
}
