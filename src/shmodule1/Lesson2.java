package shmodule1;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите число:");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
