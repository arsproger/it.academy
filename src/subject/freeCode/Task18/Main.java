package subject.freeCode.Task18;

/* 1. �������� ����� ������� (����. Human). � �������� ������ ���� ���� ����� (����.
name). �� ��� ���� � ������ ������ ���� �����������, get � set ������. �����, �
�������� ������ ���� ����� printInfo(), ������� ������� � ������� ����������
� �������� � �������: ����� ������� � ������ ��ߔ.
�����, �������� ����� ������� (����. Student), ������� ����������� �� ������
�������. � �������� ���� �������������� ��������� ���� - �������� ��� �������
������. ��� ����� ���� ���� ���������� ������� ������ � ������. ����������� �
������ ������� ������ ��������� �� ���� ��� ��������� - ��� � �������� �������
������. ����� printInfo() � ������ ������� ������ ���� ������������� �����
�������, ����� ������ ���������� � ������� ��������� ��� �����:
����� ������� � ������ ��ߔ
����� ������� � ������ ��ߔ
(������ ���������� ������ ��� ������ - ���������� ������������ �������� �����
super)
� �������, � ����� ��������� ������ ���� ��� ���� �������� - �������������
(����. Teacher). ������������� ������ ���� ������������� �� ������ �������. ���
����, � ������������� ���� �������������� ��������� ���� - �������� ��������,
������� ����� ���� �������������. ��� ����� ���� ���������� ������� get � set
������. ����������� � ������ ������������� ������ ��������� �� ���� ���
��������� - ��� ������������� � �������� �������������� ��������. �����
printInfo() � ������ ������������� ������ ���� ������������� ����� �������,
����� ������ ���������� � ������� ��������� ��� �����:
����� ������� � ������ ��ߔ
����� ������������� � ������ ��ߔ.
(������ ���������� ������ ��� ������ - ���������� ������������ �������� �����
super)
�������� � ������ main() ������ Main ������ ������ ������� � ������ ������
�������������. �������� � ������� �������� ������� ������ � �������-�������� �
�������� �������� � �������-�������������. �����, �������� printInfo() ��
�������� � ���������� �� ���������.
 */
public class Main {
    public static void main(String[] args) {
            Student student = new Student("Arsen", "Java");
            Teacher teacher = new Teacher("Marina", "History");
        System.out.println(student.getNameGroup());
        System.out.println(teacher.getNameTask());
        student.printInfo();
        teacher.printInfo();
    }
}