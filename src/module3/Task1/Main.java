package module3.Task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 2018);
        Car toyota = new Car("Toyota", 2016);
        ArrayList<Car> arrayList = new ArrayList<>();
        HashMap<Integer, Car> hashMap = new HashMap<>();
        hashMap.put(1, bmw);
        System.out.println(hashMap);
        hashMap.put(2, toyota);
        System.out.println(hashMap);
        System.out.println(hashMap.entrySet());

    }
}
class Car {
    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    String name;
    int year;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
