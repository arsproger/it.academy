package subject.oop.Task1;

public class CardCount extends BankAccount{
    @Override
    public void withdraw(int count) {
        System.out.println("������ ���� ����� �� �����! (�������� 1%)");
        this.count -= (count * 99 / 100);
    }
}

