package practice.OOP.Task3;

/* ������� ����� Person, ������� ��������:
���������� fullName, age;
����� talk(), ������� �� ������� ��������� -"�����-��  Person �������".
�������� ��� ������������  - Person() � Person(fullName, age).
�������� ��� ������� ����� ������. ���� ������ ���������������� ������������� Person(),
������ - Person(fullName, age).
 */
public class Person {
    String fullName;
    int age;
    public Person() {

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        System.out.println("���: " + fullName + "\n�������: " + age + "\n");
    }
    public void talk(Person person) {
        System.out.println(person.fullName + " �������... \n");
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "����";
        person1.age = 20;
        System.out.println("���: " + person1.fullName + "\n�������: " + person1.age + "\n");
        person1.talk(person1);
        Person person2 = new Person("����", 25);
        person2.talk(person2);

    }
}
