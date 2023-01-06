package month1;

import java.util.Arrays;

public class Lesson9part2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        for(int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}
