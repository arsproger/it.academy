package practice.OOP.Task4;

public class Dog extends Animal {
    int age;
    String name;
    String color;
    public Dog(int age, String name, String color, String food, String location) {
        this.age = age;
        this.name = name;
        this.color = color;
        super.food = food;
        super.location = location;
    }


    @Override
    void sleep() {
        System.out.println("Dog is sleep");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    void makeNoise() {
        System.out.println("Dog is make noise");
    }

    void info() {
        System.out.println("Dog - " + "Name: " + this.name + " Age: " + this.age + " Color: " + this.color);
    }
}
