package practice.OOP.extendsss;

public class CardCount extends BankAccount{
    @Override
    public void withdraw(int count) {
        System.out.println("������ ���� ����� �� �����! (�������� 1%)");
        this.count -= (count * 99 / 100);
    }
}

