package module1;

import java.util.Random;

public class Lesson14part2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += array[j][i];
            }
            System.out.println("Ñףללא " + i + " סעמכבצא = " + sum);
        }
    }
}
