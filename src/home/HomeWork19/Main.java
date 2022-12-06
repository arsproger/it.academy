package home.HomeWork19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(String.join(" ", "Hello World", "Java"));
        String title = "Java";
        System.out.println(title.compareTo("Java"));
        System.out.println(title.compareTo("Python"));
        System.out.println(title.charAt(1));
        char[] chars = new char[4];
        title.getChars(0, 4, chars, 0);
        System.out.println(Arrays.toString(chars));
        System.out.println(title.equals("Java"));
        System.out.println(title.equalsIgnoreCase("java"));
        System.out.println(title.regionMatches(1, "ava", 0, 3));
        System.out.println(title.indexOf('a'));
        System.out.println(title.lastIndexOf('a'));
        System.out.println(title.endsWith("a"));
        System.out.println(title.replace("J", "C"));
        title = "   Java   ";
        System.out.println(title.trim());
        System.out.println(title.substring(5));
        System.out.println(title.toLowerCase());
        System.out.println(title.toUpperCase());
    }
}
