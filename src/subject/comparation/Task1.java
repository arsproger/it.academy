package subject.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Иван");
        list.add("Сергей");
        list.add("Андрей");
        System.out.println("До сортировки:\n" + list);
        Collections.sort(list);
        System.out.println("После сортировки:\n" + list);

    }
}
