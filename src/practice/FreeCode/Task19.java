package practice.FreeCode;

/* 1. ������� ������ �����, �������� � ���� 5 ����� �����������, ������� ������ �
�������. �������� � �������� ��� 1 ����������, ������� ����� ������ ����������
�� ������. ����������� ������.
 */
import java.util.ArrayList;
import java.util.List;

public class Task19 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("Bmw");
        list.add("Mercedes");
        list.add("Tesla");
        list.add("Bugatti");
        System.out.println(list);
        list.add(2,"Toyota");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
