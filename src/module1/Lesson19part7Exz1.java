package module1;

import java.util.Arrays;
import java.util.Random;

public class Lesson19part7Exz1 {
    public static void main(String[] args) {
        int[][] array = new int[5][10];
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random random = new Random();
                array[i][j] = random.nextInt(100);
                count += array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Среднее арифметическое значение всей матрицы: " + count);
        int[] array2 = new int[5];
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count2 += array[i][j];
            }
                array2[i] = count2;
            count2 = 0;
        }
        System.out.println(Arrays.toString(array2));
    }
}
