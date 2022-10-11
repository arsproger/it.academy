package practice.FreeCode;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[6][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10,100);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length / 2; j++){
                temp = array[i][j];
                array[i][j] = array[array.length - i - 1][array[i].length - j - 1];
                array[array.length - i - 1][array[i].length - j - 1] = temp;
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
