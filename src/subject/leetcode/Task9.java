package subject.leetcode;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.println("Print number:");
        String number = scanner.nextLine();
        System.out.println(isPalindrome(number));
    }
    static boolean isPalindrome(String num) {
        for (int i = 0; i < (num.length() / 2); i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
