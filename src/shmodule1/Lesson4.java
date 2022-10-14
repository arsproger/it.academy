package shmodule1;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print number:");
        int n = scanner.nextInt();
        String a = "";
        String b = "";
        for (int i = 0; i < n; i++) {
            a += " ";
                b += "* ";
        }
        for (int i = 0; i < n; i++) {
                if (i == 0 || i == (n-1)) {
                    System.out.println(b);
                }
                else {
                    System.out.println((a));
            }
        }
    }
}
