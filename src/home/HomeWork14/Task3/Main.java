package home.HomeWork14.Task3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
        System.out.println(Arrays.toString(array));
        array[0] = 5;
        array[2] = 19;
        array[4] = 2;
        array[6] = 15;
        array[8] = 12;
        System.out.println(Arrays.toString(array));

        int[] array2 = array;
    }
}
