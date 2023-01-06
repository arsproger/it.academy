package month1;

public class Lesson19part8Exz1 {
    public static void main(String[] args) {
        printStar(7);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            printStar(10);
            System.out.println();
        }
    }
    public static void printStar(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }
}
