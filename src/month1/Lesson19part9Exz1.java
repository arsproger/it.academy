package month1;

import java.util.Arrays;

public class Lesson19part9Exz1 {
    public static void main(String[] args) {
//        int[] array = new int[8];
//            int a = 1;
//            int b = 1;
//            int c = 0;
//        array[0] = a;
//        array[1] = b;
//            for(int i = 3; i < array.length; i++) {
//                c = a + b;
//                array[i] = c;
//                a = b;
//                b = c;
//            }
//        System.out.println(Arrays.toString(array));

        int[] array = new int[20];
        System.out.println(Arrays.toString(fibonachi(array)));
    }

    public static int[] fibonachi(int[] array) {
        for (int i = 0; i < 20; i++) {
            if (i == 0 || i == 1) {
                array[i] = 1;
            } else if (i == 2) {
                array[i] = array[0] + array[1];
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array;
    }
}

