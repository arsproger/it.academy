package month1;

import java.util.Arrays;
import java.util.Random;

public class Lesson13part4 {
    public static void main(String[] args) {
        Random random = new Random();
        double sum = 0.0;
        int[][] array = new int[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = random.nextInt(1, 20);
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum / 18);
    }
}
