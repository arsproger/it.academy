package subject.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("����");
        list.add("������");
        list.add("������");
        System.out.println("�� ����������:\n" + list);
        Collections.sort(list);
        System.out.println("����� ����������:\n" + list);

    }
}
