package module1;

public class Lesson15part4 {
    public static void main(String[] args) {
        printStar(5);
    }
    static void printStar(int length) {
        for (int i = 10; i > 0; i--) {
            printStar(i);
            System.out.print("*");
        }

    }

}
