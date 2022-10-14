package home;

import java.util.Arrays;
import java.util.Random;

public class HomeWork7 {
    public static void main(String[] args) {
        Random random = new Random();
         int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));
        repeatNumber(array);
    }
    public static void repeatNumber(int[] array) {
        int count = 0;
        int count2 = 0;
        String res = "В массиве нет одинаковых чисел!";
        for (int i = 0; i < array.length; i++) {
            count = array[i];
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    break;
                }
                count2 = array[j];
                if(count == count2)
                    res = "В массиве есть одинаковые числа!";
            }
        }
        System.out.println(res);
    }
}
