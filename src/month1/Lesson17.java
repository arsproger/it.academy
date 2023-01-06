package month1;

import java.util.Random;

public class Lesson17 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(10);
        }
        sumArray(array);
    }
    public static void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if(sum > 50) {
            System.out.println("Сумма больше 50!");
        }
        else {
            System.out.println("Сумма = " + sum);
        }
    }
}
