package subject.oop.Task1;

public class CardCount extends BankAccount{
    @Override
    public void withdraw(int count) {
        System.out.println("Деньги были сняты со счета! (комиссия 1%)");
        this.count -= (count * 99 / 100);
    }
}

