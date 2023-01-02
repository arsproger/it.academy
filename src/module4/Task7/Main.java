package module4.Task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Elephant");
        list.add("Lion");
        list.add("Frog");
        list.add("Horse");
        Collections.sort(list, new StringLengthComparator());
        System.out.println(list);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()) return 1;
        else if(o1.length() < o2.length()) return -1;
        else return 0;
    }
}
