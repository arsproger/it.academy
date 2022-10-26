package practice.OOP.Task3;

/* Создать класс Person, который содержит:
переменные fullName, age;
метод talk(), вывести на консоль сообщение -"Такой-то  Person говорит".
Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
другой - Person(fullName, age).
 */
public class Person {
    String fullName;
    int age;
    public Person() {

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        System.out.println("Имя: " + fullName + "\nВозраст: " + age + "\n");
    }
    public void talk(Person person) {
        System.out.println(person.fullName + " говорит... \n");
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Макс";
        person1.age = 20;
        System.out.println("Имя: " + person1.fullName + "\nВозраст: " + person1.age + "\n");
        person1.talk(person1);
        Person person2 = new Person("Дима", 25);
        person2.talk(person2);

    }
}
