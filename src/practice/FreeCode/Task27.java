package practice.FreeCode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        double avg = 0;
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10,100);
//            avg += array[i];
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Среднее арифм: " + (avg / array.length));

        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.print("surname: ");
        String surname = scanner.nextLine();
        if(name.equals("Илон") && surname.equals("Маск")) {
            System.out.println("Greetings Mr Musk");
        }

    }
}
