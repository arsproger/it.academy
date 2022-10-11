package module1;

public class Lesson19part9Exz1 {
    public static void main(String[] args) {
            int a = 1;
            int b = 1;
            int c = 0;
            System.out.print(a + " " + b + " ");
            for(int i = 3; i < 8; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
        }
    }

