package subject.oop.Task1;

import java.util.Scanner;

public class DepositCount extends BankAccount {

    @Override
    public void withdraw(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ����� �� ������� ������?");
        int day = scanner.nextInt();
        if (day < 30) {
            System.out.println("�� ������ ����� ������ ������ ����� " + (30 - day) + " ����!");
        } else {
            System.out.println("������ ���� ����� �� �����!");
            this.count -= count;
        }
    }
}
