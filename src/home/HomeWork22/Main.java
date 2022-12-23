package home.HomeWork22;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 40; i++) {
            dogs.add(new Dog("Dog" + i, 5 + Math.random() * 10));
        }
        for(Dog dog: dogs) {
            System.out.printf("Меня зовут %s, я вешу %.2f kg\n", dog.getName(), dog.getWeigth());
        }
    }
}
