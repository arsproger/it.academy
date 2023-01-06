package subject.oop.Task1;

import java.util.Scanner;

public class DepositCount extends BankAccount {

    @Override
    public void withdraw(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько дней назад вы вносили деньги?");
        int day = scanner.nextInt();
        if (day < 30) {
            System.out.println("Вы можете снять деньги только через " + (30 - day) + " дней!");
        } else {
            System.out.println("Деньги были сняты со счета!");
            this.count -= count;
        }
    }
}
