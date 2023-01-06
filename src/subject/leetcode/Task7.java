package subject.leetcode;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(reverse(5080));
    }
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
