package subject.freeCode;

import java.util.Arrays;
import java.util.Random;

public class Task28 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 3) break;
            else sum += array[i];
        }
        System.out.println("Сумма до первой 3: " + sum);
        
    }
}
