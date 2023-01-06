package subject.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArray(array1);
        fillList(list1);

        // map method
        System.out.println("Map method:");
        array1 = Arrays.stream(array1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(Arrays.toString(array1));

        // filter method
        System.out.println("\nFilter method:");
        int[] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArray(array2);
        fillList(list2);

        array2 = Arrays.stream(array2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 1).collect(Collectors.toList());

        System.out.println(Arrays.toString(array2));
        System.out.println(list2);

        // forEach method
        System.out.println("\nForEach method:");
        Arrays.stream(array2).forEach(a -> System.out.print(a + " "));
        System.out.println();
        list2.stream().forEach(System.out::println);

        // reduce
        System.out.println("\nReduce method:");
        int[] array3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArray(array3);
        fillList(list3);

        int sum = Arrays.stream(array3).reduce(Integer::sum).getAsInt();
//        int sum = Arrays.stream(array3).reduce((acc, b) -> acc + b).getAsInt();
//        int sum = Arrays.stream(array3).reduce(0, (acc, b) -> acc + b);
//        int product = list3.stream().reduce(Integer::sum).get();
        int product = list3.stream().reduce((acc, b) -> acc * b).get();
        System.out.println("Sum arrays: " + sum +
                "\nProduct list: " + product);

        // filter method + map method
        System.out.println("\nMix method - filter + map");
        int[] array4 = new int[10];
        fillArray(array4);

        int[] newArray = Arrays.stream(array4).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(newArray));
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
    }
}
