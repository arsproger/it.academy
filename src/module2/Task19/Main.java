package module2.Task19;

/* ��� ��� � �������� ����� ������ ���������� ���������.

������� ? ��������� 1 : ��������� 2
 */
public class Main {
    public static void main(String[] args) {
        Man man = new Man(22);

        String securityAnswer = man.getAge() >= 18 ? "��� � �������, ���������!" : "���� ����� �� �������� ��� ������ ��������!";

        System.out.println(securityAnswer);
    }
}
