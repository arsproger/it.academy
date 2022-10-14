package shmodule1;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print number");
        int n = scanner.nextInt();
        System.out.println(tf(n));
    }
    public static boolean tf(int n) {
         return n % 2 == 0;
    }
}
