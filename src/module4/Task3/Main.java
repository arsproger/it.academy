package module4.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Arsen");
        queue.offer("None");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        Deque<String> deque = new ArrayDeque<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("Arsen");
        list.add("None");
        list.add("Bob");
        System.out.println(list);
        Collections.sort(list);
        System.out.println();
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}