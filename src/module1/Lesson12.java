package module1;

import java.util.Arrays;
import java.util.Random;

public class Lesson12 {
    public static void main(String[] args) {
        Random random = new Random();
        int maxElement = 0;
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if(array[i] > maxElement)
                maxElement = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max element: " + maxElement);

    }
}