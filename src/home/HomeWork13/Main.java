package home.HomeWork13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NewYork newYork = new NewYork("���� �����");
        LosAngeles losAngeles = new LosAngeles("���� ��������");
        Houston houston = new Houston("��������� ������");
        Pokrovka pokrovka = new Pokrovka("���� ������");
        Sosnovka sosnovka = new Sosnovka("������ ������");

        System.out.println(Arrays.toString(newYork.boro));
        System.out.println(Arrays.toString(losAngeles.boro));  // ����� ������� � �������� ����� ������
        System.out.println(Arrays.toString(houston.boro));

        InhabitedLocality.searchSupervisor("��������� ������"); // ����� �� ����� ������������,
                                                                     // ����� ������� �����/���� ������� �� ���������.
    }
}
