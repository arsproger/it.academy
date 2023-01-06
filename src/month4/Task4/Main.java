package month4.Task4;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("Arsen", 22));
        treeSet.add(new Person("None", 9));
        treeSet.add(new Person("Bob", 18));
        for(Person person : treeSet) {
            System.out.println(person.age + " " + person.name);
        }
    }
}
class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
//        return this.name.compareTo(o.name);
    }
}
