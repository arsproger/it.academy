package home.HomeWork12;

import java.util.ArrayList;

public class Bus {
    private int numberOfSeats;
    private static int amountPassenger;
    private static ArrayList<Passenger> arrayList = new ArrayList<>();

    public Bus(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public Bus() {}
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public int getAmountPassenger() {
        return amountPassenger;
    }

    public static void passengerList() {
        for (Passenger passenger : arrayList) {
            System.out.println(passenger);
        }
    }
    public String addPassenger(Passenger passenger) {
        if(amountPassenger >= numberOfSeats) return "Нету мест!";
        else {
            arrayList.add(passenger);
            amountPassenger++;
            return "Пассажир добавлен!";
        }
    }
    public static void searchPassenger(String name) {
         for (Passenger passenger : arrayList) {
             if(passenger.getName().equals(name))
                 System.out.println(passenger);
         }
    }
    public static void salaryPerFlight() {
        double salary = 0;
        for (Passenger passenger : arrayList) {
            salary += passenger.getPrice();
        }
        System.out.println("Заработок за рейс: " + salary);
    }

}
