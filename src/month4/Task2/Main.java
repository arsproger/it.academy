package month4.Task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");
        Car ford = new Car("Ford Mondeo");
        Car fiat = new Car("Fiat Ducato");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        System.out.println(cars);

        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println(cars);
    }
}
class Car {
    String name;
    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
