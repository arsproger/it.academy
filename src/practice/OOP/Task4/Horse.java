package practice.OOP.Task4;

public class Horse extends Animal {
    int age;
    String name;
    String color;
    public Horse(int age, String name, String color, String food, String location) {
        this.age = age;
        this.name = name;
        this.color = color;
        super.food = food;
        super.location = location;
    }
    @Override
    void sleep() {
        System.out.println("Horse is sleep");
    }

    @Override
    void eat() {
        System.out.println("Horse is eating");
    }

    void makeNoise() {
        System.out.println("Horse is make noise");
    }

    void info() {
        System.out.println("Horse - " + "Name: " + this.name + " Age: " + this.age + " Color: " + this.color);
    }
}
