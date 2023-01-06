package subject.oop.Task1;

public class BankAccount {
        static int count;

        public void withdraw(int count) {
            this.count -= count;
            System.out.println("Деньги были сняты со счета!");
        }
        public void append(int count) {
            this.count += count;
            System.out.println("Баланс пополнен!");
        }
        public void infoBallance() {
            System.out.println("Текущий баланс: " + count);
        }
}
