package subject.freeCode;

import java.util.Arrays;
import java.util.Random;

public class Taks23 {
    public static void main(String[] args) {
        int[][] array = new int[3][10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(2, 101);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
        numbersPrime(array);

    }
    public static void numbersPrime(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 2; k < array[i][j]; k++) {
                    if(array[i][j] == 2) {
                        System.out.print(array[i][j] + " ");
                        break;
                    }
                        else if(array[i][j] % k == 0) {
                            count++;
                        }
                }
                if(count == 0)
                    System.out.print(array[i][j] + " ");
                count = 0;
            }
        }
    }
}
