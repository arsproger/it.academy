package month1;

import java.util.Arrays;
import java.util.Random;

public class Lesson11part2 {
    public static void main(String[] args) {
        Random random = new Random();
        int res;
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150, 220);
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Результат: ");
        for (int i = 0; i < array.length; i++) {
            res = array[i];
            if (res >= 170 && res <= 200) {
                System.out.print(res + " ");
            }
        }

    }
}
