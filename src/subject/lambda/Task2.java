package subject.lambda;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Arsen");
        list.add("Bob");
        list.add("Charley");
        list.add("Jack");
        list.add("Thomas");
        list.add("Oliver");
        list.add("George");
        list.add("Harry");
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if(s1.length() > s2.length()) return 1;
//                else if(s1.length() < s2.length()) return -1;
//                else return 0;
//            }
//        });

        list.sort((s1, s2) -> {
                if(s1.length() > s2.length()) return 1;
                else if(s1.length() < s2.length()) return -1;
                else return 0;
        });
        System.out.println(list);
    }
}
