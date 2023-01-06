package month1;

public class Lesson17part2 {
    public static void main(String[] args) {
        System.out.println(findSum(5, 7 , 3));
        System.out.println(findSum(5, 7 , 9, 15));
    }
    public static int findSum(int a, int b, int c) {
        return a + b + c;
    }
    public static int findSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
