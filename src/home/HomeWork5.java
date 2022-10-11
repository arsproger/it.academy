package home;

import java.util.Arrays;
import java.util.Random;

public class HomeWork5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[6][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10, 100);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > count) {
                    count = array[i][j];
                }
            }
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == count) {
                    array[i][j] = array[i][0];
                    array[i][0] = count;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
