package month5.Task2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 2;
        a[1] = 3;
        a[2] = 1;
        a[3] = 7;
        a[4] = 5;
        System.out.println(Arrays.toString(a));
        a = Arrays.stream(a).map(b -> b * 3).toArray();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Arrays.stream(a).filter(b -> b % 2 == 0).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(a).reduce((val, b) -> val + b).stream().toArray()));
        System.out.println(Arrays.toString(Arrays.stream(a).reduce(Integer::max).stream().toArray()));
    }
}
