package shmodule1;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print 2 num:");
        int n = scanner.nextInt();
        int n2 = scanner.nextInt();
        int sum = 0;
        for (int i = n; i <= n2; i++) {
                sum += i;
        }
        if(n > n2) {
            System.out.println("Ошибка");
        }
        else {
            System.out.println("Сумма = " + sum);
        }
    }
}
