package practice.OOP.Task7;

import java.util.ArrayList;

public class Passenger {
    private String name;
    private int age;

    private static ArrayList<Passenger> passengersList = new ArrayList<>();

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        passengersList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static ArrayList<Passenger> getPassengersList() {
        return passengersList;
    }
}
