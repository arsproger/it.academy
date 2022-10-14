package shmodule1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        System.out.println("¬ведите размер 5 мерного массива:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int[][][][][] array = new int[a][b][c][d][e];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    for (int l = 0; l < array[k].length; l++) {
                        for (int m = 0; m < array[l].length; m++) {
                            array[i][j][k][l][m] = random.nextInt(1, 100);
                            sum += array[i][j][k][l][m];
                            if(array[i][j][k][l][m] > max) {
                                max = array[i][j][k][l][m];
                            }
                            if(array[i][j][k][l][m] < min) {
                                min = array[i][j][k][l][m];
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + (double) sum / array.length);
    }
}
