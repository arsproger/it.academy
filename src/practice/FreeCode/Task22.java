package practice.FreeCode;

import java.util.Arrays;
import java.util.Random;

public class Task22 {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1, 10);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
        arraysss(array);
    }
    public static void arraysss(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 2; k <= array[i][j]; k++) {
                    if(array[i][j] % k == 0) {
                        count++;
                }
            }
                array[i][j] = count;
                count = 0;
            }
            System.out.println(Arrays.toString(array[i]));
       }
    }
}
