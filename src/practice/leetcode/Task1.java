package practice.leetcode;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(5);
        }
        twoSum(number, 5);

    }

    public static int[] twoSum(int[] array, int target) {
        System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if(array[j] == target - array[i]) {
                        return new int[] {i, j};
                }
            }
        }
            throw new IllegalArgumentException("Не соотвествует!");
    }

}
