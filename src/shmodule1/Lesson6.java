package shmodule1;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count = 0;
        do {
            System.out.print("print number: ");
            n = scanner.nextInt();
            count += n;
        } while (n != 0);
        System.out.println("Ñóììà = " + count);
    }
}
