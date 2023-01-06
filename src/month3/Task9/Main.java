package month3.Task9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        StringBuffer stringBuffer = new StringBuffer("Ja");
        stringBuffer.append("va");
        System.out.println(stringBuffer);
        StringBuilder stringBuilder = new StringBuilder("ja");
        stringBuilder.append("va");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
        stringBuilder.ensureCapacity(50);
        System.out.println(stringBuilder.capacity());
        char[] chars = new char[2];
        stringBuilder.getChars(1, 3, chars, 0);
        System.out.println(Arrays.toString(chars));

    }
}
