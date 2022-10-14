package shmodule1;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print number");
        int n = scanner.nextInt();
        System.out.println(facktorial(5));
    }
    public static int facktorial(int n) {
        if(n == 1) {
            return n;
        }
        return n * facktorial(n-1);
    }
}
