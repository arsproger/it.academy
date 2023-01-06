package subject.oop.Task1;

public class Main {
    public static void main(String[] args) {
       BankAccount bankAccount = new BankAccount();
       bankAccount.append(500);
       bankAccount.infoBallance();
       DepositCount dc = new DepositCount();
//       dc.withdraw(200);
//       dc.infoBallance();
       CardCount cc = new CardCount();
       cc.withdraw(150);
       cc.infoBallance();
       bankAccount.append(253);
       bankAccount.infoBallance();
    }
}
