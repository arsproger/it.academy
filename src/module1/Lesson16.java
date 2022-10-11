package module1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер двумерного массива:");
        System.out.print("Размер строк: ");
        int aa = scanner.nextInt();
        System.out.print("Размер столбцов: ");
        int bb = scanner.nextInt();
        int[][] a = new int[aa][bb];
        array(a);
        arrayInfo(a);
    }
    public static void array(int[][] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(10,100);
            }
        }
    }
    public static void arrayInfo(int[][] name) {
        for (int i = 0; i < name.length; i++) {
            System.out.println(Arrays.toString(name[i]));
        }
    }

}
