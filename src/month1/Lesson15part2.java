package month1;

import java.util.Scanner;

public class Lesson15part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите число:");
        int n = scanner.nextInt();
            x2(n);
    }
    static void x2(int number) {
        System.out.println(" вадрат числа " + number + " равен = " + (number * number));
    }
}
