package home.HomeWork21;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nArrayList testing:\n");
        ArrayList<Cat> arrayListCat = new ArrayList<>();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayListCat.add(arrayListCat.size() / 2, new Cat("Cat" + i));
        }
        long time2 = System.currentTimeMillis();
        System.out.printf("Для добавления 100.000 в середину ArrayList ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayListCat.add(i, new Cat("Cat" + i));
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля добавления 1.000 в начало ArrayList ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayListCat.add(new Cat("Cat" + i));
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля добавления 1.000 в конец ArrayList ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = arrayListCat.size() / 2; i < arrayListCat.size() / 2 + 1000; i++) {
            arrayListCat.get(i);
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля получения 1.000 строк начиная с середины ArrayList ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = arrayListCat.size() - 1; i > arrayListCat.size() - 1000 ; i--) {
            arrayListCat.get(i);
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля получения 1.000 строк начиная с конца ArrayList ушло: %d милисекунд", (time2 - time1));
        
        time1 = System.currentTimeMillis();
        for (int i = arrayListCat.size() / 2; i < arrayListCat.size() / 2 + 1000 ; i++) {
            arrayListCat.remove(i);
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля удаления 1.000 строк начиная с середины ArrayList ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = arrayListCat.size() - 1000; i < arrayListCat.size(); i++) {
            arrayListCat.remove(i);
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля удаления 1.000 строк начиная с конца ArrayList ушло: %d милисекунд", (time2 - time1));



        System.out.println("\nLinkedList testing:\n");
        LinkedList<Cat> linkedListCat = new LinkedList<>();
        time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedListCat.add(linkedListCat.size() / 2, new Cat("Cat" + i));
        }
        time2 = System.currentTimeMillis();
        System.out.printf("Для добавления 100.000 в середину LinkedList ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedListCat.add(i, new Cat("Cat" + i));
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля добавления 1.000 в начало LinkedList ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedListCat.add(new Cat("Cat" + i));
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля добавления 1.000 в конец LinkedList ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = linkedListCat.size() / 2; i < linkedListCat.size() / 2 + 1000; i++) {
            linkedListCat.get(i);
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля получения 1.000 строк начиная с середины LinkedList ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = linkedListCat.size() - 1; i > linkedListCat.size() - 1000 ; i--) {
            linkedListCat.get(i);
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля получения 1.000 строк начиная с конца Linked list ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = linkedListCat.size() / 2; i < linkedListCat.size() / 2 + 1000 ; i++) {
            linkedListCat.remove(i);
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля удаления 1.000 строк начиная с середины LinkedList ушло: %d милисекунд", (time2 - time1));

        time1 = System.currentTimeMillis();
        for (int i = linkedListCat.size() - 1000; i < linkedListCat.size(); i++) {
            linkedListCat.remove(i);
        }
        time2 = System.currentTimeMillis();
        System.out.printf("\nДля удаления 1.000 строк начиная с конца Linked list ушло: %d милисекунд", (time2 - time1));

    }
}
