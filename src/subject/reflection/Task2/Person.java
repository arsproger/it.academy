package subject.reflection.Task2;

import subject.reflection.Task1.Author;

@Author(name = "Arsen", dateOfCreation = 2022)
public class Person {
    private int id;
    private String name;

    public Person() {
        this.id = -1;
        this.name = "None";
    }

    public void sayHello() {
        System.out.println("Person with id: " + this.id + " and name: " + this.name + " says hello!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
