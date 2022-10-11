package practice.OOP.extendsss;

public class CardCount extends BankAccount{
    @Override
    public void withdraw(int count) {
        System.out.println("Деньги были сняты со счета! (комиссия 1%)");
        this.count -= (count * 99 / 100);
    }
}

