package month1;

import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int res = 0;
        for(int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        System.out.println("ׁנוהםוו אנטפל : " + (res / array.length));
    }
}
