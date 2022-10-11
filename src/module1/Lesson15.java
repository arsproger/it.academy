package module1;

import java.util.Scanner;

public class Lesson15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите что нибудь");
        String info = scanner.nextLine();
        print(info);
    }
    static void print(String n) {
        System.out.println("\n" + n);
    }
}
