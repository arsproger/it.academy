package month1;

import java.util.Arrays;
import java.util.Random;

public class Lesson11part4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 0;
        int b = 0;
        double resA = 0;
        double resB = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if(array[i] < 50) {
                a += array[i];
                resA++;
            }
            else if(array[i] >= 50) {
                b += array[i];
                resB++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(a);
        System.out.println(b);
        System.out.println("Результат: " + (a / resA));
        System.out.println("Результат: " + (b / resB));

    }
}
