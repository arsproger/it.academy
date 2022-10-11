package module1;

public class Lesson19part6Exz1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                count++;
            }
        }
        System.out.println(count);
    }
}
