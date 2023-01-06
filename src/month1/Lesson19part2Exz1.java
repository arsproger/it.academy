package month1;

import java.util.Scanner;

public class Lesson19part2Exz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 чисел");
        int a = scanner.nextInt();
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int a5 = scanner.nextInt();
        int a6 = scanner.nextInt();
        int a7 = scanner.nextInt();
        int a8 = scanner.nextInt();
        int a9 = scanner.nextInt();
        int[] num = {a, a1, a2, a3, a4, a5, a6, a7, a8, a9};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] > count) {
                count = num[i];
            }
        }
        System.out.println("Максимальный элемент: " + count);
    }
}
