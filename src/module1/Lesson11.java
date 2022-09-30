package module1;

import java.util.Random;

public class Lesson11 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(5, 10);
        System.out.println(a);
        int b = random.nextInt(50, 60);
        System.out.println(b);


    }
}
