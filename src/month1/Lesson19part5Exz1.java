package month1;

import java.util.Arrays;
import java.util.Random;

public class Lesson19part5Exz1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        double count = 0;
        System.out.print("Числа которые делятся на 3: ");
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(50, 100);
            count += array[i];
            if(array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\nСреднее арифметическое: " + count / array.length);
        System.out.println(Arrays.toString(array));
    }
}
