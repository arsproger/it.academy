package module1;

import java.util.Arrays;

public class Lesson19part9Exz1 {
    public static void main(String[] args) {
        int[] array = new int[8];
            int a = 1;
            int b = 1;
            int c = 0;
        array[0] = a;
        array[1] = b;
            for(int i = 3; i < array.length; i++) {
                c = a + b;
                array[i] = c;
                a = b;
                b = c;
            }
        System.out.println(Arrays.toString(array));
        }
    }

