package home;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите 2 числа (по возрастанию):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a % 2 == 1 || a % 2 == -1) {
            a++;
        }
        while (a <= b) {
            System.out.print(a + " ");
            a += 2;
        }
    }
}
