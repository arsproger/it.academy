package practice.OOP.Task4;

public class Cat extends Animal {
    int age;
    String name;
    String color;
    public Cat(int age, String name, String color, String food, String location) {
        this.age = age;
        this.name = name;
        this.color = color;
        super.food = food;
        super.location = location;
    }
    @Override
    void sleep() {
        System.out.println("Cat is sleep");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    void makeNoise() {
        System.out.println("Cat is make noise");
    }

    void info() {
        System.out.println("Cat - " + "Name: " + this.name + " Age: " + this.age + " Color: " + this.color);
    }
}
