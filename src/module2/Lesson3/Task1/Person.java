package module2.Lesson3.Task1;

public class Person {
    String name;
    int age;
//    public void info(Person person) {
//        System.out.println("Name: " + person.name + "\nAge: " + person.age);
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
