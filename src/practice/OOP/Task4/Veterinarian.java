package practice.OOP.Task4;

public class Veterinarian extends Animal {
    void treatAnimal(Animal animal) {
        System.out.println("Location: " + animal.location + " Food: " + animal.food);
    }
}
