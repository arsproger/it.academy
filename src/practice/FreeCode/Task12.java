package practice.FreeCode;

// Сортировка пузырьком
import java.util.Arrays;
import java.util.Random;


public class Task12 {
    public static void main(String[] args) {
       int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array) + "\n");

       boolean sort = false;
       int count = 0;
       while (!sort) {
           sort = true;
           for (int i = 0; i < array.length - 1; i++) {
               if(array[i] > array[i + 1]) {
                   sort = false;
                   count = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = count;
               }
           }
       }
        System.out.println(Arrays.toString(array));
    }
}