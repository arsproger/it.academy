package practice.FreeCode;

import java.util.Arrays;
import java.util.Random;

/* 2. Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы for вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random random = new Random();
        int max = 0;
        int min = 10000;
        int a = 0;
        int sumA = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            if(array[i] > max)
                max = array[i];
            if(array[i] < min)
                min = array[i];
            if(array[i] % 10 == 0) {
                sumA += array[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + a);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumA);
    }
}
