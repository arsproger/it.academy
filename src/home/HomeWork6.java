package home;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите число:");
        int n = scanner.nextInt();
        numInfo(n);
    }
    public static void numInfo(int n) {
        String res = String.valueOf(n);
        for (int i = 0; i < res.length(); i++) {
            System.out.println(res.charAt(i));
        }
    }
}
