package shmodule1;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало и конец умножения");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a ; i <= b; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
