package subject.oop.Task1;

public class BankAccount {
        static int count;

        public void withdraw(int count) {
            this.count -= count;
            System.out.println("������ ���� ����� �� �����!");
        }
        public void append(int count) {
            this.count += count;
            System.out.println("������ ��������!");
        }
        public void infoBallance() {
            System.out.println("������� ������: " + count);
        }
}
