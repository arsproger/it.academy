package module1;

import java.util.Arrays;
import java.util.Random;

public class Lesson11part3 {
    public static void main(String[] args) {
        Random random = new Random();
        double res = 0.0;
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150, 220);
            res += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Средний рост: " + (res / array.length));

    }
}
