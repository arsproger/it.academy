package month5.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list = list.stream().map(a -> a * 2).toList();
        System.out.println(list);
//
        System.out.println(list.stream().filter(a -> a % 2 == 0).toList());
        System.out.println(list.stream().reduce(Integer::max).get());
        System.out.println(list.stream().reduce(Integer::min).get());
//        System.out.println(list.stream().reduce(Integer::sum).get());
        System.out.println(list.stream().reduce((val, a) -> val + a).get());

    }
}
