package freeCode.extendsss;

import java.util.Scanner;

public class CardCount extends BankAccount{
    @Override
    public void withdraw(int count) {
        System.out.println("������ ���� ����� �� �����! (�������� 1%)");
        this.count -= (count * 99 / 100);
    }
}

