package module1;

import java.util.Scanner;

public class Lesson19Exz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите 2 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a > b) {
            System.out.println(b);
        }
        else if(b > a) {
            System.out.println(a);
        }
    }
}
