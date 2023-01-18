package month4.Task10;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Arsen");
        linkedList.add("Bob");
        linkedList.add("Nina");
        linkedList.add("Steven");
        linkedList.add("Max");
        linkedList.add("Nancy");
        linkedList.add("Mary");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println("Мы убрали -> " + linkedList.removeLast());
        System.out.println(linkedList);
        System.out.println("Мы убрали -> " + linkedList.removeFirst());
        System.out.println(linkedList);
        System.out.println("Удаление головного элемента -> " + linkedList.poll());
        System.out.println(linkedList);
        linkedList.addFirst("New first element");
        System.out.println(linkedList);
        System.out.println(linkedList.offer("New last element1"));
        System.out.println(linkedList.offer("New last element2"));
        System.out.println(linkedList);

    }
}
