package subject.regexp;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String a = "Hello123there456hey";
        System.out.println(Arrays.toString(a.split("\\d+")));

        String b = "Hello123there456hey";
        System.out.println(b.replaceAll("\\d+", "-"));
        System.out.println(b.replaceFirst("\\d+", "-"));
    }
}
